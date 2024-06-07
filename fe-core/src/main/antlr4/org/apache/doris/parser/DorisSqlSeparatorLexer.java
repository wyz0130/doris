// Generated from org/apache/doris/parser/DorisSqlSeparator.g4 by ANTLR 4.9.3
package org.apache.doris.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DorisSqlSeparatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WHITESPACE=3, SINGLE_QUOTE_STRING=4, DOUBLE_QUOTE_STRING=5, 
		TRADITIONAL_COMMENT=6, END_OF_LINE_COMMENT=7, NON_SEPARATOR=8, SEPARATOR=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WHITESPACE", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", 
			"TRADITIONAL_COMMENT", "END_OF_LINE_COMMENT", "NON_SEPARATOR", "SEPARATOR", 
			"LINE_TERMINATOR"
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


	public DorisSqlSeparatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DorisSqlSeparator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\7\5%\n\5\f"+
		"\5\16\5(\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\bG\n\b\f\b\16\bJ\13\b\3\b\5\bM\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\5\13V\n\13\3<\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\3\2\7"+
		"\5\2\13\13\16\16\"\"\4\2))^^\4\2$$^^\4\2\f\f\17\17\3\2==\2^\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\36\3\2\2"+
		"\2\t \3\2\2\2\13+\3\2\2\2\r\66\3\2\2\2\17B\3\2\2\2\21N\3\2\2\2\23P\3\2"+
		"\2\2\25U\3\2\2\2\27\30\7b\2\2\30\4\3\2\2\2\31\32\7b\2\2\32\33\7b\2\2\33"+
		"\6\3\2\2\2\34\37\t\2\2\2\35\37\5\25\13\2\36\34\3\2\2\2\36\35\3\2\2\2\37"+
		"\b\3\2\2\2 &\7)\2\2!%\n\3\2\2\"#\7^\2\2#%\13\2\2\2$!\3\2\2\2$\"\3\2\2"+
		"\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7)\2\2*\n\3\2"+
		"\2\2+\61\7$\2\2,\60\n\4\2\2-.\7^\2\2.\60\13\2\2\2/,\3\2\2\2/-\3\2\2\2"+
		"\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64"+
		"\65\7$\2\2\65\f\3\2\2\2\66\67\7\61\2\2\678\7,\2\28<\3\2\2\29;\13\2\2\2"+
		":9\3\2\2\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7,\2\2"+
		"@A\7\61\2\2A\16\3\2\2\2BC\7/\2\2CD\7/\2\2DH\3\2\2\2EG\n\5\2\2FE\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5\25\13\2LK\3\2"+
		"\2\2LM\3\2\2\2M\20\3\2\2\2NO\n\6\2\2O\22\3\2\2\2PQ\7=\2\2Q\24\3\2\2\2"+
		"RV\t\5\2\2ST\7\17\2\2TV\7\f\2\2UR\3\2\2\2US\3\2\2\2V\26\3\2\2\2\f\2\36"+
		"$&/\61<HLU\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}