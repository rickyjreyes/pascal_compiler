// Generated from JcPascal.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JcPascalParser}.
 */
public interface JcPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JcPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JcPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(JcPascalParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(JcPascalParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(JcPascalParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(JcPascalParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JcPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JcPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(JcPascalParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(JcPascalParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(JcPascalParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(JcPascalParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(JcPascalParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(JcPascalParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(JcPascalParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(JcPascalParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(JcPascalParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(JcPascalParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(JcPascalParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(JcPascalParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(JcPascalParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(JcPascalParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#paramId}.
	 * @param ctx the parse tree
	 */
	void enterParamId(JcPascalParser.ParamIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#paramId}.
	 * @param ctx the parse tree
	 */
	void exitParamId(JcPascalParser.ParamIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#funcTypeId}.
	 * @param ctx the parse tree
	 */
	void enterFuncTypeId(JcPascalParser.FuncTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#funcTypeId}.
	 * @param ctx the parse tree
	 */
	void exitFuncTypeId(JcPascalParser.FuncTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#procedureFunctionDEF}.
	 * @param ctx the parse tree
	 */
	void enterProcedureFunctionDEF(JcPascalParser.ProcedureFunctionDEFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#procedureFunctionDEF}.
	 * @param ctx the parse tree
	 */
	void exitProcedureFunctionDEF(JcPascalParser.ProcedureFunctionDEFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JcPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JcPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(JcPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(JcPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JcPascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JcPascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(JcPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(JcPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(JcPascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(JcPascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(JcPascalParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(JcPascalParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JcPascalParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JcPascalParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(JcPascalParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(JcPascalParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(JcPascalParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(JcPascalParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(JcPascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(JcPascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JcPascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JcPascalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(JcPascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(JcPascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JcPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JcPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JcPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JcPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(JcPascalParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(JcPascalParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(JcPascalParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(JcPascalParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(JcPascalParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(JcPascalParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhenStatement(JcPascalParser.WhenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#whenStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhenStatement(JcPascalParser.WhenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#whenListElement}.
	 * @param ctx the parse tree
	 */
	void enterWhenListElement(JcPascalParser.WhenListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#whenListElement}.
	 * @param ctx the parse tree
	 */
	void exitWhenListElement(JcPascalParser.WhenListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(JcPascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(JcPascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JcPascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JcPascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(JcPascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(JcPascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(JcPascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(JcPascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(JcPascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(JcPascalParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JcPascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JcPascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JcPascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JcPascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(JcPascalParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(JcPascalParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link JcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(JcPascalParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link JcPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(JcPascalParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link JcPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(JcPascalParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link JcPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(JcPascalParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link JcPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(JcPascalParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link JcPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(JcPascalParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link JcPascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(JcPascalParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link JcPascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(JcPascalParser.SignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(JcPascalParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(JcPascalParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(JcPascalParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(JcPascalParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsignedConstantExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstantExp(JcPascalParser.UnsignedConstantExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsignedConstantExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstantExp(JcPascalParser.UnsignedConstantExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExp(JcPascalParser.FunctionCallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExp(JcPascalParser.FunctionCallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link JcPascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumberExpr(JcPascalParser.UnsignedNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link JcPascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumberExpr(JcPascalParser.UnsignedNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JcPascalParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JcPascalParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(JcPascalParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(JcPascalParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(JcPascalParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(JcPascalParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(JcPascalParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#compareOp}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(JcPascalParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JcPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(JcPascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JcPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(JcPascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConst(JcPascalParser.IntegerConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConst(JcPascalParser.IntegerConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(JcPascalParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(JcPascalParser.FloatConstContext ctx);
}