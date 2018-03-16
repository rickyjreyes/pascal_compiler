import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;

public class JcPascalPass1Visitor extends JcPascalBaseVisitor<Integer> 
{
    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;    
    private PrintWriter jFile;
    
    private String procedureName;    
    
    public JcPascalPass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
        
        procedureName = "";
    }
    
    public PrintWriter getAssemblyFile() { return jFile; }
    
    @Override 
    public Integer visitProgram(JcPascalParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symTabStack);
        
        return value;
    }
    
    @Override 
    public Integer visitHeader(JcPascalParser.HeaderContext ctx) 
    { 
        String programName = ctx.IDENTIFIER().toString();
        
        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        symTabStack.setProgramId(programId);
        
        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        
        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");
        
        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
       
        return visitChildren(ctx);
    }

    @Override 
    public Integer visitDeclarations(JcPascalParser.DeclarationsContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        
        // Emit the class constructor.
        jFile.println();
        jFile.println(".method public <init>()V");
        jFile.println();
        jFile.println("\taload_0");
        jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 1");
        jFile.println(".limit stack 1");
        jFile.println(".end method");
        
        return value;
    }

    @Override 
    public Integer visitDecl(JcPascalParser.DeclContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitVarList(JcPascalParser.VarListContext ctx) 
    { 
        variableIdList = new ArrayList<SymTabEntry>();
        return visitChildren(ctx);         
    }
    
    @Override 
    public Integer visitProcedureFunctionDEF(JcPascalParser.ProcedureFunctionDEFContext ctx) 
    { 
        return visitChildren(ctx);         
    }    
    
    @Override 
    public Integer visitFunctionDeclaration(JcPascalParser.FunctionDeclarationContext ctx) 
    { 
    	variableIdList = new ArrayList<SymTabEntry>();
    	
        String functionName = ctx.IDENTIFIER().toString();
        procedureName = functionName;
                       
        SymTabEntry functionId = symTabStack.enterLocal(functionName);
        functionId.setDefinition(FUNCTION);
        variableIdList.add(functionId);
    	
        Integer value;
        value = visit(ctx.formalParameterList());
                
        //function type
        String typeName = ctx.typeId().IDENTIFIER().toString();        
        TypeSpec type;
                
        if (typeName.equalsIgnoreCase("integer")) {
            type = Predefined.integerType;            
        }
        else if (typeName.equalsIgnoreCase("real")) {
            type = Predefined.realType;            
        }
        else {
            type = null;            
        }        
        functionId.setTypeSpec(type);
                
        //Clear procedure
        procedureName = "";
        
        return value;
    }     
    
    @Override 
    public Integer visitVarId(JcPascalParser.VarIdContext ctx) 
    {  
	        String variableName = ctx.IDENTIFIER().toString();
	        
	       //Procedure definition
	        if(procedureName != "") 
	        	variableName = procedureName + "_" + variableName;
	        
	        SymTabEntry variableId = symTabStack.enterLocal(variableName);
	        variableId.setDefinition(VARIABLE);
	        variableIdList.add(variableId);
	        	       	        
	        return visitChildren(ctx);
    }
    
    @Override 
    public Integer visitTypeId(JcPascalParser.TypeIdContext ctx) 
    { 
        String typeName = ctx.IDENTIFIER().toString();
        
        TypeSpec type;
        String   typeIndicator;
        
        if (typeName.equalsIgnoreCase("integer")) {
            type = Predefined.integerType;
            typeIndicator = "I";
        }
        else if (typeName.equalsIgnoreCase("real")) {
            type = Predefined.realType;
            typeIndicator = "F";
        }
        else {
            type = null;
            typeIndicator = "?";
        }
         
        int varCount = 0;
        for (SymTabEntry id : variableIdList) {
            id.setTypeSpec(type);
            
            //Set slot number
            id.setAttribute(SLOT, varCount++);
            
            //if(id.getDefinition() == VARIABLE)
            if(procedureName == "" && id.getDefinition() == VARIABLE) 
            {            
	            // Emit a field declaration.
	            jFile.println(".field private static " +
	                               id.getName() + " " + typeIndicator);
            }
        }
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitSimpleExpr(JcPascalParser.SimpleExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.simpleExpression().type;
        return value;
    }
    
    @Override 
    public Integer visitAddSubExpr(JcPascalParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.term(0).type;
                
        boolean integerMode =    (type1 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               null;
        
        ctx.type = type;
        
        return value; 
    }

    @Override 
    public Integer visitMulDivExpr(JcPascalParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
                              
        TypeSpec type1 = ctx.signedFactor(0).type;
                
        boolean integerMode =    (type1 == Predefined.integerType);        
        boolean realMode    =    (type1 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               Predefined.integerType;
        ctx.type = type;
        
        return value; 
    }
    
    @Override 
    public Integer visitVariableExpr(JcPascalParser.VariableExprContext ctx)
    {
        String variableName = ctx.variable().IDENTIFIER().toString();
        
        //Procedure definition
        if(procedureName != "") 
        	variableName = procedureName + "_" + variableName;
        
        SymTabEntry variableId = symTabStack.lookup(variableName);
        
        ctx.type = variableId.getTypeSpec();
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitSignedNumber(JcPascalParser.SignedNumberContext ctx)
    {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.factor().type;
        return value;
    }

    @Override 
    public Integer visitFunctionCall(JcPascalParser.FunctionCallContext ctx)
    {
        Integer value = visitChildren(ctx);
        ctx.type = Predefined.integerType;
        return value;
    }
    
    @Override 
    public Integer visitUnsignedConstantExp(JcPascalParser.UnsignedConstantExpContext ctx)
    {
        Integer value = visit(ctx.unsignedConstant());
        ctx.type = ctx.unsignedConstant().type;
        return value;
    }
    
    @Override 
    public Integer visitUnsignedNumberExpr(JcPascalParser.UnsignedNumberExprContext ctx)
    {
        Integer value = visit(ctx.number());
        ctx.type = ctx.number().type;
        return value;
    }

    @Override 
    public Integer visitIntegerConst(JcPascalParser.IntegerConstContext ctx)
    {
        ctx.type = Predefined.integerType;
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(JcPascalParser.FloatConstContext ctx)
    {
        ctx.type = Predefined.realType;
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitParenExpr(JcPascalParser.ParenExprContext ctx)
    {
        Integer value = visitChildren(ctx); 
        ctx.type = ctx.expr().type;
        return value;
    }
}