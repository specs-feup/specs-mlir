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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, DECIMAL_LITERAL=28, FLOAT_PRECISION=29, 
		VALUE_ID=30, CARET_ID=31, SYMBOL_REF_ELEMENT=32, SIGNED_INT_TYPE=33, UNSIGNED_INT_TYPE=34, 
		SIGNLESS_INT_TYPE=35, BARE_ID=36, RANKED_DIMENSION=37, UNRANKED_DIMENSION=38, 
		WS=39, LINE_COMMENT=40, HEX_LITERAL=41, STRING_LITERAL=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "DIGIT", "HEX_DIGIT", "LETTER", "ID_PUNCT", "ESCAPED_CHAR", 
		"ID_SUFFIX", "DECIMAL_LITERAL", "FLOAT_PRECISION", "VALUE_ID", "CARET_ID", 
		"SYMBOL_REF_ELEMENT", "INTTYPE_WIDTH", "SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", 
		"SIGNLESS_INT_TYPE", "BARE_ID", "RANKED_DIMENSION", "UNRANKED_DIMENSION", 
		"WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "','", "'::'", "'#'", "'<'", "'>'", "'{'", 
		"'}'", "'='", "'('", "')'", "':'", "'['", "']'", "'loc'", "'unknown'", 
		"'none'", "'index'", "'f16'", "'bf16'", "'f32'", "'f64'", "'complex'", 
		"'tuple'", "'->'", "'tensor'", null, null, null, null, null, null, null, 
		null, null, null, "'*x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "DECIMAL_LITERAL", "FLOAT_PRECISION", "VALUE_ID", 
		"CARET_ID", "SYMBOL_REF_ELEMENT", "SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", 
		"SIGNLESS_INT_TYPE", "BARE_ID", "RANKED_DIMENSION", "UNRANKED_DIMENSION", 
		"WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u00dc\n!\3\"\6\"\u00df\n\"\r\"\16"+
		"\"\u00e0\3\"\3\"\5\"\u00e5\n\"\3\"\3\"\3\"\7\"\u00ea\n\"\f\"\16\"\u00ed"+
		"\13\"\5\"\u00ef\n\"\3#\6#\u00f2\n#\r#\16#\u00f3\3$\5$\u00f7\n$\3$\6$\u00fa"+
		"\n$\r$\16$\u00fb\3$\3$\7$\u0100\n$\f$\16$\u0103\13$\3$\3$\5$\u0107\n$"+
		"\3$\6$\u010a\n$\r$\16$\u010b\5$\u010e\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\5\'\u011a\n\'\3(\3(\7(\u011e\n(\f(\16(\u0121\13(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3,\3,\5,\u0132\n,\3,\3,\3,\7,\u0137\n,\f,\16,\u013a"+
		"\13,\3-\3-\3-\3.\3.\3.\3/\6/\u0143\n/\r/\16/\u0144\3/\3/\3\60\3\60\3\60"+
		"\3\60\7\60\u014d\n\60\f\60\16\60\u0150\13\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\6\61\u0158\n\61\r\61\16\61\u0159\3\62\3\62\7\62\u015e\n\62\f\62"+
		"\16\62\u0161\13\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\2;\2=\2?\2A\2C\2E\36G\37I K!M\"O\2Q#S$U"+
		"%W&Y\'[(])_*a+c,\3\2\20\3\2\62;\5\2\62;CHch\4\2C\\c|\5\2&&/\60aa\n\2$"+
		"$\61\61^^ddhhppttvv\4\2--//\3\2\60\60\4\2GGgg\3\2\63;\3\2aa\5\2&&\60\60"+
		"aa\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2\f\f\16\17$$``\u0174\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3"+
		"e\3\2\2\2\5j\3\2\2\2\7p\3\2\2\2\tr\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y"+
		"\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083"+
		"\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2"+
		"\2\2#\u008f\3\2\2\2%\u0097\3\2\2\2\'\u009c\3\2\2\2)\u00a2\3\2\2\2+\u00a6"+
		"\3\2\2\2-\u00ab\3\2\2\2/\u00af\3\2\2\2\61\u00b3\3\2\2\2\63\u00bb\3\2\2"+
		"\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf"+
		"\3\2\2\2?\u00d1\3\2\2\2A\u00d3\3\2\2\2C\u00ee\3\2\2\2E\u00f1\3\2\2\2G"+
		"\u00f6\3\2\2\2I\u010f\3\2\2\2K\u0112\3\2\2\2M\u0119\3\2\2\2O\u011b\3\2"+
		"\2\2Q\u0122\3\2\2\2S\u0127\3\2\2\2U\u012c\3\2\2\2W\u0131\3\2\2\2Y\u013b"+
		"\3\2\2\2[\u013e\3\2\2\2]\u0142\3\2\2\2_\u0148\3\2\2\2a\u0153\3\2\2\2c"+
		"\u015b\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2hi\7g\2\2i\4\3\2\2\2jk\7h\2\2"+
		"kl\7c\2\2lm\7n\2\2mn\7u\2\2no\7g\2\2o\6\3\2\2\2pq\7.\2\2q\b\3\2\2\2rs"+
		"\7<\2\2st\7<\2\2t\n\3\2\2\2uv\7%\2\2v\f\3\2\2\2wx\7>\2\2x\16\3\2\2\2y"+
		"z\7@\2\2z\20\3\2\2\2{|\7}\2\2|\22\3\2\2\2}~\7\177\2\2~\24\3\2\2\2\177"+
		"\u0080\7?\2\2\u0080\26\3\2\2\2\u0081\u0082\7*\2\2\u0082\30\3\2\2\2\u0083"+
		"\u0084\7+\2\2\u0084\32\3\2\2\2\u0085\u0086\7<\2\2\u0086\34\3\2\2\2\u0087"+
		"\u0088\7]\2\2\u0088\36\3\2\2\2\u0089\u008a\7_\2\2\u008a \3\2\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7q\2\2\u008d\u008e\7e\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7p\2\2\u0091\u0092\7m\2\2\u0092\u0093\7p\2\2"+
		"\u0093\u0094\7q\2\2\u0094\u0095\7y\2\2\u0095\u0096\7p\2\2\u0096$\3\2\2"+
		"\2\u0097\u0098\7p\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7g\2\2\u009b&\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7z\2\2\u00a1(\3\2\2\2\u00a2\u00a3"+
		"\7h\2\2\u00a3\u00a4\7\63\2\2\u00a4\u00a5\78\2\2\u00a5*\3\2\2\2\u00a6\u00a7"+
		"\7d\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7\63\2\2\u00a9\u00aa\78\2\2\u00aa"+
		",\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7\65\2\2\u00ad\u00ae\7\64\2\2"+
		"\u00ae.\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\78\2\2\u00b1\u00b2\7\66"+
		"\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7o\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7z\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7r\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\64\3\2\2\2\u00c1"+
		"\u00c2\7/\2\2\u00c2\u00c3\7@\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7q\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca8\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc:\3\2\2\2"+
		"\u00cd\u00ce\t\3\2\2\u00ce<\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0>\3\2\2\2"+
		"\u00d1\u00d2\t\5\2\2\u00d2@\3\2\2\2\u00d3\u00db\7^\2\2\u00d4\u00dc\t\6"+
		"\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\5;\36\2\u00d7\u00d8\5;\36\2\u00d8"+
		"\u00d9\5;\36\2\u00d9\u00da\5;\36\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00dcB\3\2\2\2\u00dd\u00df\59\35\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00ef\3\2\2\2\u00e2\u00e5\5=\37\2\u00e3\u00e5\5? \2\u00e4\u00e2\3\2\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00eb\3\2\2\2\u00e6\u00ea\5=\37\2\u00e7\u00ea"+
		"\5? \2\u00e8\u00ea\59\35\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee"+
		"\u00e4\3\2\2\2\u00efD\3\2\2\2\u00f0\u00f2\59\35\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4F\3"+
		"\2\2\2\u00f5\u00f7\t\7\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0101\t\b\2\2\u00fe\u0100\t\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u010d\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0106\t\t\2\2\u0105\u0107\t\7\2\2\u0106\u0105\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\t\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"H\3\2\2\2\u010f\u0110\7\'\2\2\u0110\u0111\5C\"\2\u0111J\3\2\2\2\u0112"+
		"\u0113\7`\2\2\u0113\u0114\5C\"\2\u0114L\3\2\2\2\u0115\u0116\7B\2\2\u0116"+
		"\u011a\5C\"\2\u0117\u0118\7B\2\2\u0118\u011a\5c\62\2\u0119\u0115\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u011aN\3\2\2\2\u011b\u011f\t\n\2\2\u011c\u011e"+
		"\t\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120P\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7u\2\2\u0123"+
		"\u0124\7k\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5O(\2\u0126R\3\2\2\2\u0127"+
		"\u0128\7w\2\2\u0128\u0129\7k\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5O(\2"+
		"\u012bT\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\5O(\2\u012eV\3\2\2\2\u012f"+
		"\u0132\5=\37\2\u0130\u0132\t\13\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\u0138\3\2\2\2\u0133\u0137\5=\37\2\u0134\u0137\59\35\2\u0135"+
		"\u0137\t\f\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"X\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\t\2\2\2\u013c\u013d\7z\2\2\u013d"+
		"Z\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0140\7z\2\2\u0140\\\3\2\2\2\u0141"+
		"\u0143\t\r\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b/\2\2\u0147"+
		"^\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7\61\2\2\u014a\u014e\3\2\2"+
		"\2\u014b\u014d\n\16\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0152\b\60\2\2\u0152`\3\2\2\2\u0153\u0154\7\62\2\2\u0154\u0155"+
		"\7z\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5;\36\2\u0157\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015ab\3\2\2\2"+
		"\u015b\u015f\7$\2\2\u015c\u015e\n\17\2\2\u015d\u015c\3\2\2\2\u015e\u0161"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\7$\2\2\u0163d\3\2\2\2\31\2\u00db\u00e0\u00e4"+
		"\u00e9\u00eb\u00ee\u00f3\u00f6\u00fb\u0101\u0106\u010b\u010d\u0119\u011f"+
		"\u0131\u0136\u0138\u0144\u014e\u0159\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}