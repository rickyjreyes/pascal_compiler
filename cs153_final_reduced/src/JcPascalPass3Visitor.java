import static wci.intermediate.symtabimpl.DefinitionImpl.FUNCTION;

import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class JcPascalPass3Visitor extends JcPascalBaseVisitor<Integer> 
{
	private int labelCount;
    String programName;
    private PrintWriter jFile;
    
    private String procedureName;
    private Boolean loadProcedureParam = false;
 
    public JcPascalPass3Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
        this.labelCount = 1;
        this.procedureName = "";
    }
    
    @Override 
    public Integer visitProgram(JcPascalParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        jFile.close();
        return value;
    }
    
    @Override 
    public Integer visitHeader(JcPascalParser.HeaderContext ctx) 
    { 
        programName = ctx.IDENTIFIER().toString();       
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitMainBlock(JcPascalParser.MainBlockContext ctx) 
    { 
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
    
        Integer value = visitChildren(ctx);
        
        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");
        
        return value;
    }

    @Override 
    public Integer visitStmt(JcPascalParser.StmtContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitProcedureFunctionDEF(JcPascalParser.ProcedureFunctionDEFContext ctx) 
    { 
    	//don't take care of procedure here
        return null;         
    } 
    
    @Override 
    public Integer visitFunctionDeclaration(JcPascalParser.FunctionDeclarationContext ctx) 
    { 
    	jFile.println("\n; " + ctx.getText() + "\n");
    	
        String functionName = ctx.IDENTIFIER().toString();
        procedureName = functionName;
                       
        Integer value = visitChildren(ctx);       

        //Clear procedure
        procedureName = "";
        
        return value;
    }       
    
    @Override 
    public Integer visitAssignmentStmt(JcPascalParser.AssignmentStmtContext ctx)
    {
        Integer value = visit(ctx.expr());
        
        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                             : (ctx.expr().type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " " + typeIndicator);

        jFile.println("\n; DEBUG: PRINT VALUE");
        jFile.println("getstatic    java/lang/System/out Ljava/io/PrintStream;");
        if (typeIndicator == "I")
        	jFile.println("ldc          \"" + ctx.variable().IDENTIFIER().toString() + " = %d\\n\"");
        else if (typeIndicator == "F")
        	jFile.println("ldc          \"" + ctx.variable().IDENTIFIER().toString() + " = %f\\n\"");
        jFile.println("iconst_1");
        jFile.println("anewarray    java/lang/Object");
        jFile.println("dup");
        jFile.println("iconst_0");
        jFile.println("getstatic     sample/"+ ctx.variable().IDENTIFIER().toString() + " " + typeIndicator);        
        if (typeIndicator == "I")
        	jFile.println("invokestatic  java/lang/Integer.valueOf(I)Ljava/lang/Integer;");
        else if (typeIndicator == "F")
        	jFile.println("invokestatic  java/lang/Float.valueOf(F)Ljava/lang/Float;");        
        jFile.println("aastore");
        jFile.println("invokestatic  java/lang/String.format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;");
        jFile.println("invokevirtual java/io/PrintStream.print(Ljava/lang/String;)V");
        jFile.println();
        
        return value; 
    }
    
    @Override 
    public Integer visitIfStatement(JcPascalParser.IfStatementContext ctx)
    {
    	Integer value;
    	int currentLabelCount = this.labelCount++;
    	
        if(ctx.stmt().size() == 1)  //only if
        {
            value = visit(ctx.compareExpr());
            
            jFile.println("ifeq	L" + currentLabelCount);
            
            value = visit(ctx.stmt(0));
            
            jFile.println("L" + currentLabelCount + ":");
        }
        else //with else statement
        {
            value = visit(ctx.compareExpr());
                        
            int elseLevel = this.labelCount++;
            
            jFile.println("ifeq	L" + elseLevel);
            
            value = visit(ctx.stmt(0));
            
            jFile.println("goto L" + currentLabelCount);
            
            jFile.println("L" + elseLevel + ":");
            
            value = visit(ctx.stmt(1));
            
            jFile.println("L" + currentLabelCount + ":");
            
        }
 
        return value;
    }
    
    @Override 
    public Integer visitWhileStatement(JcPascalParser.WhileStatementContext ctx)
    {
    	Integer value;
    	int loopLabel = this.labelCount++;
    	int nextLabel = this.labelCount++;
    	    	
    	//loop label
    	jFile.println("L" + loopLabel + ":");
    	
    	//compare statement
        value = visit(ctx.compareExpr());
        
        //statement
        jFile.println("ifeq	L" + nextLabel);        
        value = visit(ctx.stmt());        
        jFile.println("goto L" + loopLabel);
        
        //next label
        jFile.println("L" + nextLabel + ":");
            	       
        return value;
    }
    
    @Override
    public Integer visitForStatement(JcPascalParser.ForStatementContext ctx)
    {
        Integer value;
        int loopLabel = this.labelCount++;
        int nextLabel = this.labelCount++;
        int nextnextLabel = this.labelCount++;
        int nextnextnextLabel = this.labelCount++;
        
        //Code for statements before the test
        //Code to evaluate the boolean test expression

        value = visit(ctx.forList().initialValue());
        jFile.println("\tputstatic    " + programName +"/"+ ctx.IDENTIFIER() + " I ");
        
        //loop label
        jFile.println("L" + loopLabel + ":");
        jFile.println("\tgetstatic    " + programName +"/"+ ctx.IDENTIFIER() + " I ");
        value=visit(ctx.forList().finalValue());
        jFile.println("\tif_icmpgt L"+ nextnextLabel);
        jFile.println("\ticonst_0");
        //goto nextnextnextlabel
        jFile.println("\tgoto L" + nextnextnextLabel);
        
        //nextnextlabel
        jFile.println("L" + nextnextLabel + ":");
        jFile.println("\ticonst_1");
        
        //nextnextnext label
        jFile.println("L" + nextnextnextLabel + ":");
        //ifne next-label
        jFile.println("\tifne L" + nextLabel);
        //Code for statements after the test
        value = visit(ctx.stmt());
        
        jFile.println("\tgetstatic    " + programName +"/"+ ctx.IDENTIFIER() + " I ");
        jFile.println("\ticonst_1");
        jFile.println("\tiadd");
        jFile.println("\tputstatic    " + programName +"/"+ ctx.IDENTIFIER() + " I ");

        //goto loop-label
        jFile.println("\tgoto L" + loopLabel);
          
        //next label
        jFile.println("L" + nextLabel + ":");

        return value;
    }        
  
    @Override
    public Integer visitRepeatStatement(JcPascalParser.RepeatStatementContext ctx)
    {
        Integer value;
        int loopLabel = this.labelCount++;
        int nextLabel = this.labelCount++;

        //loop label
        jFile.println("L" + loopLabel + ":");
 
        value = visit(ctx.stmt());        
        
        //compare statement

        value = visit(ctx.compareExpr());

        //statement
        jFile.println("ifeq    L" + loopLabel);

        jFile.println("goto L" + nextLabel);

        //next label
        jFile.println("L" + nextLabel + ":");

        return value;
    }    
    
    @Override
   public Integer visitCaseStatement(JcPascalParser.CaseStatementContext ctx)
   {
       Integer value=0;
       int branchLabel[]= new int[99];

       // Code to evaluate the SELECT expression
       value=visit(ctx.expr());
       // lookupswitch
       jFile.println("\tlookupswitch");
       
       // For each SELECT value
       for(int i=0; i<ctx.caseListElement().size();i++) {
           jFile.print("\t"+ctx.caseListElement(i).constList().getText()+":    ");
           // Increment Branch
           branchLabel[i]=this.labelCount++;
           jFile.println("L" + branchLabel[i]);
       }
       // Default
       jFile.println("\tdefault: "+"L" + 99);
       
       // For each branch-label
       for(int i=0; i<ctx.caseListElement().size();i++) {
           // Code for the jth statement
           jFile.println("L" + branchLabel[i] + ":");
           value=visit(ctx.caseListElement(i).stmt());
           jFile.println("\tgoto L" + 99);
           
       }
       
       //next label
       jFile.println("L" + 99 + ":");

       return value;
   }   
    
    @Override 
    public Integer visitCompareExpr(JcPascalParser.CompareExprContext ctx)
    {
    	 Integer value = visitChildren(ctx);
         
         TypeSpec type1 = ctx.simpleExpression(0).type;
         TypeSpec type2 = ctx.simpleExpression(1).type;
         
         boolean integerMode =    (type1 == Predefined.integerType)
                               && (type2 == Predefined.integerType);
         boolean realMode    =    (type1 == Predefined.realType)
                               && (type2 == Predefined.realType);
         
         String op = ctx.compareOp().getText();
         String opcode;

         if (op.equals("<>")) {
             opcode = integerMode ? "if_icmpne"
                    : realMode    ? "if_icmpne"
                    :               "????";
         } else if (op.equals("=")) {
             opcode = integerMode ? "if_icmpeq"
                     : realMode    ? "if_icmpeq"
                     :               "????";
         } else if (op.equals("<")) {
             opcode = integerMode ? "if_icmplt"
                     : realMode    ? "if_icmplt"
                     :               "????";
         } else if (op.equals("<=")) {
             opcode = integerMode ? "if_icmple"
                    : realMode    ? "if_icmple"
                    :               "????";
         } else if (op.equals(">=")) {
	        opcode = integerMode ? "if_icmpge"
	               : realMode    ? "if_icmpge"
	               :               "????";
	     } else {
             opcode = integerMode ? "if_icmpgt"
                    : realMode    ? "if_icmpgt"
                    :               "????";
         }
         
         int currentLabel = this.labelCount++;
         int nextLabel = this.labelCount++;
         
         // Emit an add or subtract instruction.                 
         jFile.println("\t" + opcode + " " + "L" + currentLabel);
         jFile.println("\ticonst_0");
         jFile.println("\tgoto L" + (nextLabel));
         
         jFile.println("L" + currentLabel + ":");
         jFile.println("\ticonst_1");
         
         jFile.println("L"+ nextLabel +":");
                          
         return value;     	
    }

    @Override 
    public Integer visitAddSubExpr(JcPascalParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        
        // Verify the first term for now
        TypeSpec type1 = ctx.term(0).type;
        boolean integerMode =    (type1 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType);
                                
        for(int i = 0; i < ctx.addSubOp().size(); i++)
        {
            String op = ctx.addSubOp(i).getText();
            String opcode;

            if (op.equals("+")) {
                opcode = integerMode ? "iadd"
                       : realMode    ? "fadd"
                       :               "????";
            }
            else {
                opcode = integerMode ? "isub"
                       : realMode    ? "fsub"
                       :               "????";
            }
            
            // Emit an add or subtract instruction.
            jFile.println("\t" + opcode);

        }
                                           
        return value; 
    }

    @Override 
    public Integer visitMulDivExpr(JcPascalParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                                 
        // Verify the first term for now
        TypeSpec type1 = ctx.signedFactor(0).type;
        boolean integerMode =    (type1 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType);
        
        for(int i = 0; i < ctx.mulDivOp().size(); i++)
        {        
	        String op = ctx.mulDivOp(i).getText();
	        String opcode;
	
	        if (op.equals("*")) {
	            opcode = integerMode ? "imul"
	                   : realMode    ? "fmul"
	                   :               "f???";
	        }
	        else {
	            opcode = integerMode ? "idiv"
	                   : realMode    ? "fdiv"
	                   :               "????";
	        }
	        
	        // Emit a multiply or divide instruction.
	        jFile.println("\t" + opcode);
        }
        
        return value; 
    }

    
    @Override 
    public Integer visitFunctionCall(JcPascalParser.FunctionCallContext ctx)
    {
        String functionName = ctx.identifier().IDENTIFIER().getText();
      
        Integer value;
        
        //Loading Parameter List
        loadProcedureParam = true;
        value = visit(ctx.parameterList());
        
        // Emit a field get instruction.
        jFile.print("\t" + "invokestatic " + programName + "." + functionName + "(I)I\n");
        
        return value; 
    }
    
    @Override 
    public Integer visitProcedureStatement(JcPascalParser.ProcedureStatementContext ctx)
    {
        String functionName = ctx.identifier().IDENTIFIER().getText();
      
        Integer value = null;
        
        loadProcedureParam = true;
        value = visit(ctx.parameterList());
        
        // Emit a field get instruction.
        jFile.print(";\t" + "invokestatic " + programName + "." + functionName + "(I)I\n");
       
        return value;
    }    
    
    
    @Override 
    public Integer visitVariableExpr(JcPascalParser.VariableExprContext ctx)
    {
        String variableName = ctx.variable().IDENTIFIER().toString();
        TypeSpec type = ctx.type;
        
        String typeIndicator = (type == Predefined.integerType) ? "I"
                             : (type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                      "/" + variableName + " " + typeIndicator);
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitSignedNumber(JcPascalParser.SignedNumberContext ctx)
    {
        Integer value = visitChildren(ctx);         
        TypeSpec type = ctx.factor().type;
        
        if(ctx.sign() != null)
        {
	        if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
	            String opcode = (type == Predefined.integerType) ? "ineg"
	                          : (type == Predefined.realType)    ? "fneg"
	                          :                                    "?neg";
	            
	            // Emit a negate instruction.
	            jFile.println("\t" + opcode);
	        }
        }
        
        return value;
    }

    @Override 
    public Integer visitIntegerConst(JcPascalParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(JcPascalParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }
}