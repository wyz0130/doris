// Generated from org/apache/doris/parser/DorisSqlSeparator.g4 by ANTLR 4.9.3
package org.apache.doris.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DorisSqlSeparatorParser}.
 */
public interface DorisSqlSeparatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DorisSqlSeparatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DorisSqlSeparatorParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DorisSqlSeparatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DorisSqlSeparatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#quoteIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuoteIdentifier(DorisSqlSeparatorParser.QuoteIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#quoteIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuoteIdentifier(DorisSqlSeparatorParser.QuoteIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(DorisSqlSeparatorParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(DorisSqlSeparatorParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(DorisSqlSeparatorParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(DorisSqlSeparatorParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(DorisSqlSeparatorParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(DorisSqlSeparatorParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DorisSqlSeparatorParser#someText}.
	 * @param ctx the parse tree
	 */
	void enterSomeText(DorisSqlSeparatorParser.SomeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DorisSqlSeparatorParser#someText}.
	 * @param ctx the parse tree
	 */
	void exitSomeText(DorisSqlSeparatorParser.SomeTextContext ctx);
}