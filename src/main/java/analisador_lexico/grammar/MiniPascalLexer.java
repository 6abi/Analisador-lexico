// Generated from MiniPascal.g4 by ANTLR 4.7.2

package analisador_lexico.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PROGRAM=3, BEGIN=4, END=5, BEGIN_BLOCK=6, END_BLOCK=7, 
		DO=8, WRITE=9, READ=10, PRINT=11, WHILE=12, FOR=13, IF=14, THEN=15, ELSE=16, 
		OR=17, NOT=18, AND=19, TRUE=20, FALSE=21, VAR=22, FLOAT=23, BOOLEAN=24, 
		STRING=25, INTEGER=26, OPERATORS=27, STR=28, DIGIT=29, ID=30, PLUS=31, 
		MINUS=32, MULT=33, EQUALS=34, DIV=35, RT=36, LT=37, LE=38, RE=39, LR=40, 
		EQ=41, SMCOLON=42, OP=43, CP=44, ATTRIB=45, DOT=46, COMMA=47, COLON=48, 
		DBDOT=49, SPECCHARS=50, COMMENTS=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PROGRAM", "BEGIN", "END", "BEGIN_BLOCK", "END_BLOCK", 
			"DO", "WRITE", "READ", "PRINT", "WHILE", "FOR", "IF", "THEN", "ELSE", 
			"OR", "NOT", "AND", "TRUE", "FALSE", "VAR", "FLOAT", "BOOLEAN", "STRING", 
			"INTEGER", "OPERATORS", "STR", "DIGIT", "ID", "PLUS", "MINUS", "MULT", 
			"EQUALS", "DIV", "RT", "LT", "LE", "RE", "LR", "EQ", "SMCOLON", "OP", 
			"CP", "ATTRIB", "DOT", "COMMA", "COLON", "DBDOT", "SPECCHARS", "COMMENTS", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", 
			"'do'", "'write'", "'read'", "'print'", "'while'", "'for'", "'if'", "'then'", 
			"'else'", "'or'", "'not'", "'and'", "'True'", "'False'", "'var'", "'float'", 
			"'boolean'", "'string'", "'integer'", null, null, null, null, "'+'", 
			"'-'", "'*'", "'='", "'/'", "'>'", "'<'", "'<='", "'>='", "'<>'", "'=='", 
			"';'", "'('", "')'", "':='", "'.'", "','", "':'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PROGRAM", "BEGIN", "END", "BEGIN_BLOCK", "END_BLOCK", 
			"DO", "WRITE", "READ", "PRINT", "WHILE", "FOR", "IF", "THEN", "ELSE", 
			"OR", "NOT", "AND", "TRUE", "FALSE", "VAR", "FLOAT", "BOOLEAN", "STRING", 
			"INTEGER", "OPERATORS", "STR", "DIGIT", "ID", "PLUS", "MINUS", "MULT", 
			"EQUALS", "DIV", "RT", "LT", "LE", "RE", "LR", "EQ", "SMCOLON", "OP", 
			"CP", "ATTRIB", "DOT", "COMMA", "COLON", "DBDOT", "SPECCHARS", "COMMENTS", 
			"WS"
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


	public MiniPascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\5\34\u00f3\n\34\3\35\3\35\7\35\u00f7\n\35\f\35\16\35\u00fa\13"+
		"\35\3\35\3\35\3\36\5\36\u00ff\n\36\3\36\6\36\u0102\n\36\r\36\16\36\u0103"+
		"\3\37\3\37\7\37\u0108\n\37\f\37\16\37\u010b\13\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\5\64\u0140\n\64\3\65\6\65\u0143\n\65\r\65"+
		"\16\65\u0144\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66\3\2\b\7\2\13\13\"\"\62;C\\c|\5\2--//~~\3\2\62;\4"+
		"\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tw\3\2\2"+
		"\2\13}\3\2\2\2\r\u0082\3\2\2\2\17\u0088\3\2\2\2\21\u008c\3\2\2\2\23\u008f"+
		"\3\2\2\2\25\u0095\3\2\2\2\27\u009a\3\2\2\2\31\u00a0\3\2\2\2\33\u00a6\3"+
		"\2\2\2\35\u00aa\3\2\2\2\37\u00ad\3\2\2\2!\u00b2\3\2\2\2#\u00b7\3\2\2\2"+
		"%\u00ba\3\2\2\2\'\u00be\3\2\2\2)\u00c2\3\2\2\2+\u00c7\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00d1\3\2\2\2\61\u00d7\3\2\2\2\63\u00df\3\2\2\2\65\u00e6\3\2\2"+
		"\2\67\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00fe\3\2\2\2=\u0105\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I"+
		"\u0116\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2\2\2O\u011d\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0123\3\2\2\2U\u0126\3\2\2\2W\u0128\3\2\2\2Y\u012a\3\2\2\2[\u012c"+
		"\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0133\3\2\2\2c\u0135\3\2\2\2e"+
		"\u0138\3\2\2\2g\u013f\3\2\2\2i\u0142\3\2\2\2kl\7]\2\2l\4\3\2\2\2mn\7_"+
		"\2\2n\6\3\2\2\2op\7R\2\2pq\7t\2\2qr\7q\2\2rs\7i\2\2st\7t\2\2tu\7c\2\2"+
		"uv\7o\2\2v\b\3\2\2\2wx\7D\2\2xy\7g\2\2yz\7i\2\2z{\7k\2\2{|\7p\2\2|\n\3"+
		"\2\2\2}~\7G\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\u0081\7\60\2\2\u0081"+
		"\f\3\2\2\2\u0082\u0083\7d\2\2\u0083\u0084\7g\2\2\u0084\u0085\7i\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\16\3\2\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b\20\3\2\2\2\u008c\u008d\7f\2\2\u008d"+
		"\u008e\7q\2\2\u008e\22\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\24\3\2\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2\u0098\u0099\7f\2\2"+
		"\u0099\26\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7"+
		"k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\30\3\2\2\2\u00a0\u00a1"+
		"\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\36\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1 \3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd&\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7V\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7H\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc,\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7t\2"+
		"\2\u00d0.\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7"+
		"q\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7v\2\2\u00d6\60\3\2\2\2\u00d7\u00d8"+
		"\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\62\3\2\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4\u00e5\7i\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7"+
		"k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7i\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed\66\3\2\2\2\u00ee\u00f3"+
		"\5A!\2\u00ef\u00f3\5? \2\u00f0\u00f3\5C\"\2\u00f1\u00f3\5G$\2\u00f2\u00ee"+
		"\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"8\3\2\2\2\u00f4\u00f8\7$\2\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7$\2\2\u00fc:\3\2\2\2\u00fd\u00ff"+
		"\t\3\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u0102\t\4\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104<\3\2\2\2\u0105\u0109\t\5\2\2\u0106\u0108"+
		"\t\6\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a>\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7-\2\2\u010d"+
		"@\3\2\2\2\u010e\u010f\7/\2\2\u010fB\3\2\2\2\u0110\u0111\7,\2\2\u0111D"+
		"\3\2\2\2\u0112\u0113\7?\2\2\u0113F\3\2\2\2\u0114\u0115\7\61\2\2\u0115"+
		"H\3\2\2\2\u0116\u0117\7@\2\2\u0117J\3\2\2\2\u0118\u0119\7>\2\2\u0119L"+
		"\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7?\2\2\u011cN\3\2\2\2\u011d\u011e"+
		"\7@\2\2\u011e\u011f\7?\2\2\u011fP\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122"+
		"\7@\2\2\u0122R\3\2\2\2\u0123\u0124\7?\2\2\u0124\u0125\7?\2\2\u0125T\3"+
		"\2\2\2\u0126\u0127\7=\2\2\u0127V\3\2\2\2\u0128\u0129\7*\2\2\u0129X\3\2"+
		"\2\2\u012a\u012b\7+\2\2\u012bZ\3\2\2\2\u012c\u012d\7<\2\2\u012d\u012e"+
		"\7?\2\2\u012e\\\3\2\2\2\u012f\u0130\7\60\2\2\u0130^\3\2\2\2\u0131\u0132"+
		"\7.\2\2\u0132`\3\2\2\2\u0133\u0134\7<\2\2\u0134b\3\2\2\2\u0135\u0136\7"+
		"\60\2\2\u0136\u0137\7\60\2\2\u0137d\3\2\2\2\u0138\u0139\4*+\2\u0139f\3"+
		"\2\2\2\u013a\u0140\7^\2\2\u013b\u013c\7\61\2\2\u013c\u0140\7,\2\2\u013d"+
		"\u013e\7,\2\2\u013e\u0140\7\61\2\2\u013f\u013a\3\2\2\2\u013f\u013b\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140h\3\2\2\2\u0141\u0143\t\7\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\b\65\2\2\u0147j\3\2\2\2\n\2\u00f2\u00f8\u00fe"+
		"\u0103\u0109\u013f\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}