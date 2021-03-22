// Generated from AnLexer.g4 by ANTLR 4.7.2

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
public class AnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PalavraChave=1, NumInt=2, NumReal=3, Variavel=4, Cadeia=5, Comentario=6, 
		WS=7, OpRelacional=8, OPAritmetico=9, Delimitador=10, AbrePar=11, FechaPar=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PalavraChave", "NumInt", "NumReal", "Variavel", "Cadeia", "ESC_SEQ", 
			"Comentario", "WS", "OpRelacional", "OPAritmetico", "Delimitador", "AbrePar", 
			"FechaPar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PalavraChave", "NumInt", "NumReal", "Variavel", "Cadeia", "Comentario", 
			"WS", "OpRelacional", "OPAritmetico", "Delimitador", "AbrePar", "FechaPar"
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


	public AnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			Comentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comentario_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"l\n\2\3\3\5\3o\n\3\3\3\6\3r\n\3\r\3\16\3s\3\4\5\4w\n\4\3\4\6\4z\n\4\r"+
		"\4\16\4{\3\4\3\4\6\4\u0080\n\4\r\4\16\4\u0081\5\4\u0084\n\4\3\5\3\5\7"+
		"\5\u0088\n\5\f\5\16\5\u008b\13\5\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3"+
		"\b\5\b\u00a2\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17\3\3\5"+
		"\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\33\16\3\2\t\4\2--/"+
		"/\4\2C\\c|\5\2\62;C\\c|\4\2))^^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2,"+
		"-//\61\61\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3k\3\2\2\2\5n\3\2\2\2\7v\3\2\2\2\t\u0085"+
		"\3\2\2\2\13\u008c\3\2\2\2\r\u0096\3\2\2\2\17\u0099\3\2\2\2\21\u00a6\3"+
		"\2\2\2\23\u00b2\3\2\2\2\25\u00b4\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2"+
		"\2\2\33\u00ba\3\2\2\2\35\36\7F\2\2\36\37\7G\2\2\37 \7E\2\2 !\7N\2\2!\""+
		"\7C\2\2\"#\7T\2\2#$\7C\2\2$%\7E\2\2%&\7Q\2\2&\'\7G\2\2\'l\7U\2\2()\7C"+
		"\2\2)*\7N\2\2*+\7I\2\2+,\7Q\2\2,-\7T\2\2-.\7K\2\2./\7V\2\2/\60\7O\2\2"+
		"\60l\7Q\2\2\61\62\7K\2\2\62\63\7P\2\2\63l\7V\2\2\64\65\7T\2\2\65\66\7"+
		"G\2\2\66\67\7C\2\2\67l\7N\2\289\7E\2\29:\7J\2\2:;\7C\2\2;l\7T\2\2<=\7"+
		"C\2\2=>\7V\2\2>?\7T\2\2?@\7K\2\2@A\7D\2\2AB\7W\2\2BC\7K\2\2Cl\7T\2\2D"+
		"l\7C\2\2EF\7N\2\2FG\7G\2\2Gl\7T\2\2HI\7K\2\2IJ\7O\2\2JK\7R\2\2KL\7T\2"+
		"\2LM\7K\2\2MN\7O\2\2NO\7K\2\2Ol\7T\2\2PQ\7U\2\2Ql\7G\2\2RS\7G\2\2ST\7"+
		"P\2\2TU\7V\2\2UV\7C\2\2Vl\7Q\2\2WX\7G\2\2XY\7P\2\2YZ\7S\2\2Z[\7W\2\2["+
		"\\\7C\2\2\\]\7P\2\2]^\7V\2\2^l\7Q\2\2_`\7K\2\2`a\7P\2\2ab\7K\2\2bc\7E"+
		"\2\2cd\7K\2\2dl\7Q\2\2ef\7H\2\2fg\7K\2\2gl\7O\2\2hl\7G\2\2ij\7Q\2\2jl"+
		"\7W\2\2k\35\3\2\2\2k(\3\2\2\2k\61\3\2\2\2k\64\3\2\2\2k8\3\2\2\2k<\3\2"+
		"\2\2kD\3\2\2\2kE\3\2\2\2kH\3\2\2\2kP\3\2\2\2kR\3\2\2\2kW\3\2\2\2k_\3\2"+
		"\2\2ke\3\2\2\2kh\3\2\2\2ki\3\2\2\2l\4\3\2\2\2mo\t\2\2\2nm\3\2\2\2no\3"+
		"\2\2\2oq\3\2\2\2pr\4\62;\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\6"+
		"\3\2\2\2uw\t\2\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\4\62;\2yx\3\2\2\2z"+
		"{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0083\3\2\2\2}\177\7\60\2\2~\u0080\4\62"+
		";\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0084\3\2\2\2\u0083}\3\2\2\2\u0083\u0084\3\2\2\2\u0084\b\3"+
		"\2\2\2\u0085\u0089\t\3\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\n\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u0091\7)\2\2\u008d\u0090\5\r\7\2\u008e\u0090"+
		"\n\5\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\7)\2\2\u0095\f\3\2\2\2\u0096\u0097\7^\2\2\u0097\u0098"+
		"\7)\2\2\u0098\16\3\2\2\2\u0099\u009d\7\'\2\2\u009a\u009c\n\6\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f"+
		"\2\2\u00a4\u00a5\b\b\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\t\7\2\2\u00a7\u00a8"+
		"\b\t\3\2\u00a8\22\3\2\2\2\u00a9\u00b3\7@\2\2\u00aa\u00ab\7@\2\2\u00ab"+
		"\u00b3\7?\2\2\u00ac\u00b3\7>\2\2\u00ad\u00ae\7>\2\2\u00ae\u00b3\7?\2\2"+
		"\u00af\u00b0\7>\2\2\u00b0\u00b3\7@\2\2\u00b1\u00b3\7?\2\2\u00b2\u00a9"+
		"\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\t\b\2"+
		"\2\u00b5\26\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7"+
		"*\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb\34\3\2\2\2\20\2knsv{\u0081"+
		"\u0083\u0089\u008f\u0091\u009d\u00a1\u00b2\4\3\b\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}