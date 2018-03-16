// Generated from JcPascal.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JcPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JcPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JcPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(JcPascalParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(JcPascalParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JcPascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(JcPascalParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(JcPascalParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(JcPascalParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(JcPascalParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(JcPascalParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(JcPascalParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(JcPascalParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#paramId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamId(JcPascalParser.ParamIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#funcTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTypeId(JcPascalParser.FuncTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#procedureFunctionDEF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureFunctionDEF(JcPascalParser.ProcedureFunctionDEFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JcPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(JcPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JcPascalParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(JcPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(JcPascalParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(JcPascalParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JcPascalParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(JcPascalParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(JcPascalParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(JcPascalParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JcPascalParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(JcPascalParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JcPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JcPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(JcPascalParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(JcPascalParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(JcPascalParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#whenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatement(JcPascalParser.WhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#whenListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenListElement(JcPascalParser.WhenListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(JcPascalParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JcPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(JcPascalParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(JcPascalParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(JcPascalParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JcPascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JcPascalParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(JcPascalParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpr}
	 * labeled alternative in {@link JcPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(JcPascalParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link JcPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(JcPascalParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link JcPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(JcPascalParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedNumber}
	 * labeled alternative in {@link JcPascalParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(JcPascalParser.SignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(JcPascalParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(JcPascalParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedConstantExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstantExp(JcPascalParser.UnsignedConstantExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link JcPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExp(JcPascalParser.FunctionCallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link JcPascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumberExpr(JcPascalParser.UnsignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JcPascalParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(JcPascalParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(JcPascalParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#compareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(JcPascalParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JcPascalParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(JcPascalParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(JcPascalParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link JcPascalParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(JcPascalParser.FloatConstContext ctx);
}