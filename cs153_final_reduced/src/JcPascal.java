import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class JcPascal
{
    public static void main(String[] args) throws Exception 
    {
        String inputFile = null;
        
        if (args.length > 0) inputFile = args[0];
        InputStream is = (inputFile != null)
                                ? new FileInputStream(inputFile)
                                : System.in;
        
        ANTLRInputStream input = new ANTLRInputStream(is);
        JcPascalLexer lexer = new JcPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JcPascalParser parser = new JcPascalParser(tokens);
        ParseTree tree = parser.program();
        
        JcPascalPass1Visitor pass1 = new JcPascalPass1Visitor();
        pass1.visit(tree);
        
        PrintWriter jFile = pass1.getAssemblyFile();

        //function and procedure
        JcPascalPass2Visitor pass2 = new JcPascalPass2Visitor(jFile);
        pass2.visit(tree);
        
        //Main function
        JcPascalPass3Visitor pass3 = new JcPascalPass3Visitor(pass2.getAssemblyFile());
        pass3.visit(tree);
    }
}
