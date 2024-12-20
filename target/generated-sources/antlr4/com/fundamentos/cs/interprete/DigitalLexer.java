// Generated from com\fundamentos\cs\interprete\Digital.g4 by ANTLR 4.9.2
package com.fundamentos.cs.interprete;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DigitalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, WHILE=6, FOR=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, MOD=12, AND=13, OR=14, NOT=15, GT=16, LT=17, GEQ=18, 
		LEQ=19, EQ=20, NEQ=21, ASSIGN=22, BRACKET_OP=23, BRACKET_CLOSE=24, PAR_OPEN=25, 
		PAR_CLOSE=26, SEMICOLON=27, BOOLEAN=28, ID=29, STRING=30, FLOAT=31, NUMBER=32, 
		WS=33, COMMENT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "WHILE", "FOR", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", 
			"NEQ", "ASSIGN", "BRACKET_OP", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
			"SEMICOLON", "BOOLEAN", "ID", "STRING", "FLOAT", "NUMBER", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'digimon'", "'digital'", "'digitalk'", "'digivolution_if'", "'digivolution_else'", 
			"'training'", "'fight'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", "'}'", 
			"'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "WHILE", "FOR", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "GT", "LT", "GEQ", 
			"LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OP", "BRACKET_CLOSE", "PAR_OPEN", 
			"PAR_CLOSE", "SEMICOLON", "BOOLEAN", "ID", "STRING", "FLOAT", "NUMBER", 
			"WS", "COMMENT"
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


	public DigitalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Digital.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u00c9\n\35\3\36\7\36\u00cc\n\36\f\36\16\36\u00cf"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\7\36\u00d6\n\36\f\36\16\36\u00d9\13\36"+
		"\3\37\3\37\7\37\u00dd\n\37\f\37\16\37\u00e0\13\37\3\37\3\37\3 \6 \u00e5"+
		"\n \r \16 \u00e6\3 \3 \7 \u00eb\n \f \16 \u00ee\13 \3 \3 \6 \u00f2\n "+
		"\r \16 \u00f3\5 \u00f6\n \3!\6!\u00f9\n!\r!\16!\u00fa\3\"\6\"\u00fe\n"+
		"\"\r\"\16\"\u00ff\3\"\3\"\3#\3#\3#\3#\7#\u0108\n#\f#\16#\u010b\13#\3#"+
		"\3#\3\u00de\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$\3\2\6\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\2\u0118\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\3G\3\2\2\2\5O\3\2\2\2\7W\3\2\2\2\t`\3\2\2\2\13p\3\2\2"+
		"\2\r\u0082\3\2\2\2\17\u008b\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2"+
		"\25\u0095\3\2\2\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009b\3\2\2\2\35"+
		"\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3"+
		"\2\2\2\'\u00aa\3\2\2\2)\u00ad\3\2\2\2+\u00b0\3\2\2\2-\u00b3\3\2\2\2/\u00b5"+
		"\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3"+
		"\2\2\29\u00c8\3\2\2\2;\u00cd\3\2\2\2=\u00da\3\2\2\2?\u00f5\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u00fd\3\2\2\2E\u0103\3\2\2\2GH\7f\2\2HI\7k\2\2IJ\7i\2\2JK\7"+
		"k\2\2KL\7o\2\2LM\7q\2\2MN\7p\2\2N\4\3\2\2\2OP\7f\2\2PQ\7k\2\2QR\7i\2\2"+
		"RS\7k\2\2ST\7v\2\2TU\7c\2\2UV\7n\2\2V\6\3\2\2\2WX\7f\2\2XY\7k\2\2YZ\7"+
		"i\2\2Z[\7k\2\2[\\\7v\2\2\\]\7c\2\2]^\7n\2\2^_\7m\2\2_\b\3\2\2\2`a\7f\2"+
		"\2ab\7k\2\2bc\7i\2\2cd\7k\2\2de\7x\2\2ef\7q\2\2fg\7n\2\2gh\7w\2\2hi\7"+
		"v\2\2ij\7k\2\2jk\7q\2\2kl\7p\2\2lm\7a\2\2mn\7k\2\2no\7h\2\2o\n\3\2\2\2"+
		"pq\7f\2\2qr\7k\2\2rs\7i\2\2st\7k\2\2tu\7x\2\2uv\7q\2\2vw\7n\2\2wx\7w\2"+
		"\2xy\7v\2\2yz\7k\2\2z{\7q\2\2{|\7p\2\2|}\7a\2\2}~\7g\2\2~\177\7n\2\2\177"+
		"\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\f\3\2\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7i\2\2\u008a\16\3\2"+
		"\2\2\u008b\u008c\7h\2\2\u008c\u008d\7k\2\2\u008d\u008e\7i\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7v\2\2\u0090\20\3\2\2\2\u0091\u0092\7-\2\2\u0092\22"+
		"\3\2\2\2\u0093\u0094\7/\2\2\u0094\24\3\2\2\2\u0095\u0096\7,\2\2\u0096"+
		"\26\3\2\2\2\u0097\u0098\7\61\2\2\u0098\30\3\2\2\2\u0099\u009a\7\'\2\2"+
		"\u009a\32\3\2\2\2\u009b\u009c\7(\2\2\u009c\u009d\7(\2\2\u009d\34\3\2\2"+
		"\2\u009e\u009f\7~\2\2\u009f\u00a0\7~\2\2\u00a0\36\3\2\2\2\u00a1\u00a2"+
		"\7#\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\"\3\2\2\2\u00a5\u00a6"+
		"\7>\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9&\3"+
		"\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\u00af\7?\2\2\u00af*\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7"+
		"}\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7\177\2\2\u00b8\62\3\2\2\2\u00b9\u00ba"+
		"\7*\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7=\2\2\u00be8\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7w\2\2\u00c2\u00c9\7g\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c9\7g\2\2\u00c8\u00bf\3\2\2"+
		"\2\u00c8\u00c3\3\2\2\2\u00c9:\3\2\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7q\2"+
		"\2\u00d2\u00d3\7p\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"<\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\7$\2\2\u00db\u00dd\13\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2"+
		">\3\2\2\2\u00e3\u00e5\t\3\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec"+
		"\7\60\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f6\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f1\7\60\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6@\3\2\2\2\u00f7"+
		"\u00f9\t\3\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fbB\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\b\"\2\2\u0102D\3\2\2\2\u0103\u0104\7\61\2\2"+
		"\u0104\u0105\7\61\2\2\u0105\u0109\3\2\2\2\u0106\u0108\n\5\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\b#\2\2\u010dF\3\2\2\2\16"+
		"\2\u00c8\u00cd\u00d7\u00de\u00e6\u00ec\u00f3\u00f5\u00fa\u00ff\u0109\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}