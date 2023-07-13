// Generated from D:/Vou trabalhar na Nuuvem/Java/japaiton/src\japaiton.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link japaitonParser}.
 */
public interface japaitonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link japaitonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(japaitonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(japaitonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(japaitonParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(japaitonParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(japaitonParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(japaitonParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(japaitonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(japaitonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(japaitonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(japaitonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(japaitonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(japaitonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(japaitonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(japaitonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(japaitonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(japaitonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(japaitonParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(japaitonParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(japaitonParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(japaitonParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(japaitonParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(japaitonParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(japaitonParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(japaitonParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#multipleVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMultipleVariableAssignment(japaitonParser.MultipleVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#multipleVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMultipleVariableAssignment(japaitonParser.MultipleVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(japaitonParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(japaitonParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(japaitonParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(japaitonParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#constantAssignment}.
	 * @param ctx the parse tree
	 */
	void enterConstantAssignment(japaitonParser.ConstantAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#constantAssignment}.
	 * @param ctx the parse tree
	 */
	void exitConstantAssignment(japaitonParser.ConstantAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#constantValue}.
	 * @param ctx the parse tree
	 */
	void enterConstantValue(japaitonParser.ConstantValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#constantValue}.
	 * @param ctx the parse tree
	 */
	void exitConstantValue(japaitonParser.ConstantValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(japaitonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(japaitonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(japaitonParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(japaitonParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(japaitonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(japaitonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(japaitonParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(japaitonParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(japaitonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(japaitonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(japaitonParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(japaitonParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(japaitonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(japaitonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(japaitonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(japaitonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(japaitonParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(japaitonParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicOperator(japaitonParser.LogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicOperator(japaitonParser.LogicOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(japaitonParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(japaitonParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(japaitonParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(japaitonParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(japaitonParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(japaitonParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(japaitonParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(japaitonParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(japaitonParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(japaitonParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(japaitonParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(japaitonParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(japaitonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(japaitonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(japaitonParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(japaitonParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(japaitonParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(japaitonParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(japaitonParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(japaitonParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(japaitonParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(japaitonParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(japaitonParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(japaitonParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(japaitonParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(japaitonParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(japaitonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(japaitonParser.TypeContext ctx);
}