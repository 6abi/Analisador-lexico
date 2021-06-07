// Generated from MiniPascal.g4 by ANTLR 4.7.2

package analisador_lexico.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#myStartingRule}.
	 * @param ctx the parse tree
	 */
	void enterMyStartingRule(MiniPascalParser.MyStartingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#myStartingRule}.
	 * @param ctx the parse tree
	 */
	void exitMyStartingRule(MiniPascalParser.MyStartingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(MiniPascalParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(MiniPascalParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void enterWritestatement(MiniPascalParser.WritestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void exitWritestatement(MiniPascalParser.WritestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void enterReadstatement(MiniPascalParser.ReadstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void exitReadstatement(MiniPascalParser.ReadstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintstatement(MiniPascalParser.PrintstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#printstatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintstatement(MiniPascalParser.PrintstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#relationop}.
	 * @param ctx the parse tree
	 */
	void enterRelationop(MiniPascalParser.RelationopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relationop}.
	 * @param ctx the parse tree
	 */
	void exitRelationop(MiniPascalParser.RelationopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#ariExpression}.
	 * @param ctx the parse tree
	 */
	void enterAriExpression(MiniPascalParser.AriExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#ariExpression}.
	 * @param ctx the parse tree
	 */
	void exitAriExpression(MiniPascalParser.AriExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#termAri}.
	 * @param ctx the parse tree
	 */
	void enterTermAri(MiniPascalParser.TermAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#termAri}.
	 * @param ctx the parse tree
	 */
	void exitTermAri(MiniPascalParser.TermAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factorAri}.
	 * @param ctx the parse tree
	 */
	void enterFactorAri(MiniPascalParser.FactorAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factorAri}.
	 * @param ctx the parse tree
	 */
	void exitFactorAri(MiniPascalParser.FactorAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MiniPascalParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MiniPascalParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#multop}.
	 * @param ctx the parse tree
	 */
	void enterMultop(MiniPascalParser.MultopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#multop}.
	 * @param ctx the parse tree
	 */
	void exitMultop(MiniPascalParser.MultopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(MiniPascalParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(MiniPascalParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniPascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#relationals}.
	 * @param ctx the parse tree
	 */
	void enterRelationals(MiniPascalParser.RelationalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relationals}.
	 * @param ctx the parse tree
	 */
	void exitRelationals(MiniPascalParser.RelationalsContext ctx);
}