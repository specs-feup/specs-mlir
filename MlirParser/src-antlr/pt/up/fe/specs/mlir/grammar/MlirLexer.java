// Generated from pt/up/fe/specs/mlir/grammar/Mlir.g4 by ANTLR 4.5.3

    package pt.up.fe.specs.mlir.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MlirLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DIGIT=18, RANKED_DIMENSION=19, ID=20, PATH=21, TRUE=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"DIGIT", "RANKED_DIMENSION", "ID", "PATH", "TRUE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'f16'", "'f32'", "'f64'", "'tensor'", "'<'", "'>'", "'('", 
		"','", "')'", "'='", "'{'", "'}'", "'loc'", "'\"'", "':'", "'->'", null, 
		null, null, null, "'true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "DIGIT", "RANKED_DIMENSION", "ID", 
		"PATH", "TRUE", "WS"
	};
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


	public MlirLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mlir.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\7\25i\n\25\f\25\16\25l\13\25\3\26\3\26\6"+
		"\26p\n\26\r\26\16\26q\3\26\3\26\3\26\6\26w\n\26\r\26\16\26x\3\26\3\26"+
		"\6\26}\n\26\r\26\16\26~\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u0087\n\30"+
		"\r\30\16\30\u0088\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\6\3\2\62;\6\2&&C\\aac|\6\2\61;C\\aac|\5\2\13\f\17\17\"\"\u0090"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13?\3\2\2\2\rF\3"+
		"\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31"+
		"R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37Z\3\2\2\2!\\\3\2\2\2#^\3\2\2\2%a\3"+
		"\2\2\2\'c\3\2\2\2)f\3\2\2\2+m\3\2\2\2-\u0080\3\2\2\2/\u0086\3\2\2\2\61"+
		"\62\7\'\2\2\62\4\3\2\2\2\63\64\7h\2\2\64\65\7\63\2\2\65\66\78\2\2\66\6"+
		"\3\2\2\2\678\7h\2\289\7\65\2\29:\7\64\2\2:\b\3\2\2\2;<\7h\2\2<=\78\2\2"+
		"=>\7\66\2\2>\n\3\2\2\2?@\7v\2\2@A\7g\2\2AB\7p\2\2BC\7u\2\2CD\7q\2\2DE"+
		"\7t\2\2E\f\3\2\2\2FG\7>\2\2G\16\3\2\2\2HI\7@\2\2I\20\3\2\2\2JK\7*\2\2"+
		"K\22\3\2\2\2LM\7.\2\2M\24\3\2\2\2NO\7+\2\2O\26\3\2\2\2PQ\7?\2\2Q\30\3"+
		"\2\2\2RS\7}\2\2S\32\3\2\2\2TU\7\177\2\2U\34\3\2\2\2VW\7n\2\2WX\7q\2\2"+
		"XY\7e\2\2Y\36\3\2\2\2Z[\7$\2\2[ \3\2\2\2\\]\7<\2\2]\"\3\2\2\2^_\7/\2\2"+
		"_`\7@\2\2`$\3\2\2\2ab\t\2\2\2b&\3\2\2\2cd\t\2\2\2de\7z\2\2e(\3\2\2\2f"+
		"j\t\3\2\2gi\t\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k*\3\2\2\2"+
		"lj\3\2\2\2mo\7$\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2st\7$\2\2tv\7<\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2x"+
		"y\3\2\2\2yz\3\2\2\2z|\7<\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177,\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0084\7g\2\2\u0084.\3\2\2\2\u0085\u0087\t\5\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\30\2\2\u008b\60\3\2\2\2\b\2jqx"+
		"~\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}