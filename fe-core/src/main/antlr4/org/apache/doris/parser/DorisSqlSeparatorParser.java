// Generated from org/apache/doris/parser/DorisSqlSeparator.g4 by ANTLR 4.9.3
package org.apache.doris.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DorisSqlSeparatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHITESPACE=3, SINGLE_QUOTE_STRING=4, DOUBLE_QUOTE_STRING=5, 
		TRADITIONAL_COMMENT=6, END_OF_LINE_COMMENT=7, NON_SEPARATOR=8, SEPARATOR=9;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_quoteIdentifier = 2, RULE_string = 3, 
		RULE_comment = 4, RULE_ws = 5, RULE_someText = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "quoteIdentifier", "string", "comment", "ws", 
			"someText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'`'", "'``'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WHITESPACE", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", 
			"TRADITIONAL_COMMENT", "END_OF_LINE_COMMENT", "NON_SEPARATOR", "SEPARATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DorisSqlSeparator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DorisSqlSeparatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(DorisSqlSeparatorParser.EOF, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(DorisSqlSeparatorParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(DorisSqlSeparatorParser.SEPARATOR, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			statement();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(15);
				match(SEPARATOR);
				setState(16);
				statement();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<QuoteIdentifierContext> quoteIdentifier() {
			return getRuleContexts(QuoteIdentifierContext.class);
		}
		public QuoteIdentifierContext quoteIdentifier(int i) {
			return getRuleContext(QuoteIdentifierContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<SomeTextContext> someText() {
			return getRuleContexts(SomeTextContext.class);
		}
		public SomeTextContext someText(int i) {
			return getRuleContext(SomeTextContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case WHITESPACE:
			case SINGLE_QUOTE_STRING:
			case DOUBLE_QUOTE_STRING:
			case TRADITIONAL_COMMENT:
			case END_OF_LINE_COMMENT:
			case NON_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(29);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRADITIONAL_COMMENT:
					case END_OF_LINE_COMMENT:
						{
						setState(24);
						comment();
						}
						break;
					case SINGLE_QUOTE_STRING:
					case DOUBLE_QUOTE_STRING:
						{
						setState(25);
						string();
						}
						break;
					case T__0:
						{
						setState(26);
						quoteIdentifier();
						}
						break;
					case WHITESPACE:
						{
						setState(27);
						ws();
						}
						break;
					case NON_SEPARATOR:
						{
						setState(28);
						someText();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << WHITESPACE) | (1L << SINGLE_QUOTE_STRING) | (1L << DOUBLE_QUOTE_STRING) | (1L << TRADITIONAL_COMMENT) | (1L << END_OF_LINE_COMMENT) | (1L << NON_SEPARATOR))) != 0) );
				}
				break;
			case EOF:
			case SEPARATOR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteIdentifierContext extends ParserRuleContext {
		public QuoteIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoteIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterQuoteIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitQuoteIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitQuoteIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteIdentifierContext quoteIdentifier() throws RecognitionException {
		QuoteIdentifierContext _localctx = new QuoteIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quoteIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << WHITESPACE) | (1L << SINGLE_QUOTE_STRING) | (1L << DOUBLE_QUOTE_STRING) | (1L << TRADITIONAL_COMMENT) | (1L << END_OF_LINE_COMMENT) | (1L << NON_SEPARATOR) | (1L << SEPARATOR))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(37);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(38);
					match(T__1);
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(DorisSqlSeparatorParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(DorisSqlSeparatorParser.DOUBLE_QUOTE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==DOUBLE_QUOTE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode TRADITIONAL_COMMENT() { return getToken(DorisSqlSeparatorParser.TRADITIONAL_COMMENT, 0); }
		public TerminalNode END_OF_LINE_COMMENT() { return getToken(DorisSqlSeparatorParser.END_OF_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==TRADITIONAL_COMMENT || _la==END_OF_LINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(DorisSqlSeparatorParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(DorisSqlSeparatorParser.WHITESPACE, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					match(WHITESPACE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeTextContext extends ParserRuleContext {
		public List<TerminalNode> NON_SEPARATOR() { return getTokens(DorisSqlSeparatorParser.NON_SEPARATOR); }
		public TerminalNode NON_SEPARATOR(int i) {
			return getToken(DorisSqlSeparatorParser.NON_SEPARATOR, i);
		}
		public SomeTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).enterSomeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DorisSqlSeparatorListener ) ((DorisSqlSeparatorListener)listener).exitSomeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DorisSqlSeparatorVisitor ) return ((DorisSqlSeparatorVisitor<? extends T>)visitor).visitSomeText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeTextContext someText() throws RecognitionException {
		SomeTextContext _localctx = new SomeTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_someText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(55);
					match(NON_SEPARATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\5\3%"+
		"\n\3\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6"+
		"\7\66\n\7\r\7\16\7\67\3\b\6\b;\n\b\r\b\16\b<\3\b\2\2\t\2\4\6\b\n\f\16"+
		"\2\5\3\2\3\3\3\2\6\7\3\2\b\t\2B\2\20\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\60"+
		"\3\2\2\2\n\62\3\2\2\2\f\65\3\2\2\2\16:\3\2\2\2\20\25\5\4\3\2\21\22\7\13"+
		"\2\2\22\24\5\4\3\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32 \5\n\6"+
		"\2\33 \5\b\5\2\34 \5\6\4\2\35 \5\f\7\2\36 \5\16\b\2\37\32\3\2\2\2\37\33"+
		"\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2"+
		"\2!\"\3\2\2\2\"%\3\2\2\2#%\3\2\2\2$\37\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&+"+
		"\7\3\2\2\'*\n\2\2\2(*\7\4\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\3\2\2/\7\3\2\2\2\60\61\t\3\2\2\61\t"+
		"\3\2\2\2\62\63\t\4\2\2\63\13\3\2\2\2\64\66\7\5\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\r\3\2\2\29;\7\n\2\2:9\3\2\2\2;<\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\17\3\2\2\2\n\25\37!$)+\67<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}