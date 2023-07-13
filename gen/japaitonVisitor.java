// Generated from D:/Vou trabalhar na Nuuvem/Java/japaiton/src\japaiton.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link japaitonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface japaitonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link japaitonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(japaitonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(japaitonParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(japaitonParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(japaitonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(japaitonParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(japaitonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(japaitonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(japaitonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(japaitonParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(japaitonParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(japaitonParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(japaitonParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#multipleVariableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleVariableAssignment(japaitonParser.MultipleVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(japaitonParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(japaitonParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#constantAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantAssignment(japaitonParser.ConstantAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#constantValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(japaitonParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(japaitonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(japaitonParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(japaitonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(japaitonParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(japaitonParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(japaitonParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(japaitonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(japaitonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(japaitonParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#logicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOperator(japaitonParser.LogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(japaitonParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(japaitonParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(japaitonParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(japaitonParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(japaitonParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(japaitonParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(japaitonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(japaitonParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(japaitonParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(japaitonParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(japaitonParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(japaitonParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(japaitonParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(japaitonParser.TypeContext ctx);
}