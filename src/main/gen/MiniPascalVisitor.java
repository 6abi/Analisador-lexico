// Generated from C:/analisador_lexico/src/main/antlr\MiniPascal.g4 by ANTLR 4.9.1

package analisador_lexico.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#myStartingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStartingRule(MiniPascalParser.MyStartingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(MiniPascalParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestatement(MiniPascalParser.WritestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#readstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstatement(MiniPascalParser.ReadstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#relationop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationop(MiniPascalParser.RelationopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MiniPascalParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#multop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultop(MiniPascalParser.MultopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(MiniPascalParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniPascalParser.TypeContext ctx);
}