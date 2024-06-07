// Generated from org/apache/doris/parser/DorisSqlSeparator.g4 by ANTLR 4.9.3
package org.apache.doris.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DorisSqlSeparatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DorisSqlSeparatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(DorisSqlSeparatorParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DorisSqlSeparatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#quoteIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteIdentifier(DorisSqlSeparatorParser.QuoteIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DorisSqlSeparatorParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(DorisSqlSeparatorParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(DorisSqlSeparatorParser.WsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DorisSqlSeparatorParser#someText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeText(DorisSqlSeparatorParser.SomeTextContext ctx);
}