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
		SIGNLESS_INT_TYPE=35, BARE_ID=36, RANKED_DIMENSION=37, WS=38, LINE_COMMENT=39, 
		HEX_LITERAL=40, STRING_LITERAL=41;
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
		"SIGNLESS_INT_TYPE", "BARE_ID", "RANKED_DIMENSION", "WS", "LINE_COMMENT", 
		"HEX_LITERAL", "STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "','", "'::'", "'#'", "'<'", "'>'", "'{'", 
		"'}'", "'='", "'('", "')'", "':'", "'['", "']'", "'loc'", "'unknown'", 
		"'none'", "'index'", "'f16'", "'bf16'", "'f32'", "'f64'", "'complex'", 
		"'tuple'", "'tensor'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "DECIMAL_LITERAL", "FLOAT_PRECISION", "VALUE_ID", 
		"CARET_ID", "SYMBOL_REF_ELEMENT", "SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", 
		"SIGNLESS_INT_TYPE", "BARE_ID", "RANKED_DIMENSION", "WS", "LINE_COMMENT", 
		"HEX_LITERAL", "STRING_LITERAL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00da\n!\3\"\6\"\u00dd\n\"\r\"\16\"\u00de"+
		"\3\"\3\"\5\"\u00e3\n\"\3\"\3\"\3\"\7\"\u00e8\n\"\f\"\16\"\u00eb\13\"\5"+
		"\"\u00ed\n\"\3#\6#\u00f0\n#\r#\16#\u00f1\3$\5$\u00f5\n$\3$\6$\u00f8\n"+
		"$\r$\16$\u00f9\3$\3$\7$\u00fe\n$\f$\16$\u0101\13$\3$\3$\5$\u0105\n$\3"+
		"$\6$\u0108\n$\r$\16$\u0109\5$\u010c\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\5\'\u0118\n\'\3(\3(\7(\u011c\n(\f(\16(\u011f\13(\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3,\3,\5,\u0130\n,\3,\3,\3,\7,\u0135\n,\f,\16,\u0138"+
		"\13,\3-\3-\3-\3.\6.\u013e\n.\r.\16.\u013f\3.\3.\3/\3/\3/\3/\7/\u0148\n"+
		"/\f/\16/\u014b\13/\3/\3/\3\60\3\60\3\60\3\60\6\60\u0153\n\60\r\60\16\60"+
		"\u0154\3\61\3\61\7\61\u0159\n\61\f\61\16\61\u015c\13\61\3\61\3\61\2\2"+
		"\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2"+
		";\2=\2?\2A\2C\2E\36G\37I K!M\"O\2Q#S$U%W&Y\'[(])_*a+\3\2\20\3\2\62;\5"+
		"\2\62;CHch\4\2C\\c|\5\2&&/\60aa\n\2$$\61\61^^ddhhppttvv\4\2--//\3\2\60"+
		"\60\4\2GGgg\3\2\63;\3\2aa\5\2&&\60\60aa\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\6\2\f\f\16\17$$``\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5h\3\2\2\2\7n\3\2\2\2\tp\3\2\2\2"+
		"\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2"+
		"\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37"+
		"\u0087\3\2\2\2!\u0089\3\2\2\2#\u008d\3\2\2\2%\u0095\3\2\2\2\'\u009a\3"+
		"\2\2\2)\u00a0\3\2\2\2+\u00a4\3\2\2\2-\u00a9\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00b1\3\2\2\2\63\u00b9\3\2\2\2\65\u00bf\3\2\2\2\67\u00c6\3\2\2\29\u00c9"+
		"\3\2\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00cf\3\2\2\2A\u00d1\3\2\2\2C"+
		"\u00ec\3\2\2\2E\u00ef\3\2\2\2G\u00f4\3\2\2\2I\u010d\3\2\2\2K\u0110\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u0120\3\2\2\2S\u0125\3\2\2\2U\u012a"+
		"\3\2\2\2W\u012f\3\2\2\2Y\u0139\3\2\2\2[\u013d\3\2\2\2]\u0143\3\2\2\2_"+
		"\u014e\3\2\2\2a\u0156\3\2\2\2cd\7v\2\2de\7t\2\2ef\7w\2\2fg\7g\2\2g\4\3"+
		"\2\2\2hi\7h\2\2ij\7c\2\2jk\7n\2\2kl\7u\2\2lm\7g\2\2m\6\3\2\2\2no\7.\2"+
		"\2o\b\3\2\2\2pq\7<\2\2qr\7<\2\2r\n\3\2\2\2st\7%\2\2t\f\3\2\2\2uv\7>\2"+
		"\2v\16\3\2\2\2wx\7@\2\2x\20\3\2\2\2yz\7}\2\2z\22\3\2\2\2{|\7\177\2\2|"+
		"\24\3\2\2\2}~\7?\2\2~\26\3\2\2\2\177\u0080\7*\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7+\2\2\u0082\32\3\2\2\2\u0083\u0084\7<\2\2\u0084\34\3\2\2\2\u0085"+
		"\u0086\7]\2\2\u0086\36\3\2\2\2\u0087\u0088\7_\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7e\2\2\u008c\"\3\2\2\2\u008d"+
		"\u008e\7w\2\2\u008e\u008f\7p\2\2\u008f\u0090\7m\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0093\7y\2\2\u0093\u0094\7p\2\2\u0094$\3\2\2"+
		"\2\u0095\u0096\7p\2\2\u0096\u0097\7q\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7g\2\2\u0099&\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7f\2\2\u009d\u009e\7g\2\2\u009e\u009f\7z\2\2\u009f(\3\2\2\2\u00a0\u00a1"+
		"\7h\2\2\u00a1\u00a2\7\63\2\2\u00a2\u00a3\78\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7d\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7\63\2\2\u00a7\u00a8\78\2\2\u00a8"+
		",\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\7\64\2\2"+
		"\u00ac.\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\78\2\2\u00af\u00b0\7\66"+
		"\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7o\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7z\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be\64\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2"+
		"\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5\66\3\2\2\2\u00c6\u00c7\7"+
		"/\2\2\u00c7\u00c8\7@\2\2\u00c88\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca:\3\2"+
		"\2\2\u00cb\u00cc\t\3\2\2\u00cc<\3\2\2\2\u00cd\u00ce\t\4\2\2\u00ce>\3\2"+
		"\2\2\u00cf\u00d0\t\5\2\2\u00d0@\3\2\2\2\u00d1\u00d9\7^\2\2\u00d2\u00da"+
		"\t\6\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\5;\36\2\u00d5\u00d6\5;\36\2\u00d6"+
		"\u00d7\5;\36\2\u00d7\u00d8\5;\36\2\u00d8\u00da\3\2\2\2\u00d9\u00d2\3\2"+
		"\2\2\u00d9\u00d3\3\2\2\2\u00daB\3\2\2\2\u00db\u00dd\59\35\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00ed\3\2\2\2\u00e0\u00e3\5=\37\2\u00e1\u00e3\5? \2\u00e2\u00e0\3\2\2"+
		"\2\u00e2\u00e1\3\2\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e8\5=\37\2\u00e5\u00e8"+
		"\5? \2\u00e6\u00e8\59\35\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec"+
		"\u00e2\3\2\2\2\u00edD\3\2\2\2\u00ee\u00f0\59\35\2\u00ef\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2F\3"+
		"\2\2\2\u00f3\u00f5\t\7\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00ff\t\b\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u010b\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0104\t\t\2\2\u0103\u0105\t\7\2\2\u0104\u0103\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\t\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"H\3\2\2\2\u010d\u010e\7\'\2\2\u010e\u010f\5C\"\2\u010fJ\3\2\2\2\u0110"+
		"\u0111\7`\2\2\u0111\u0112\5C\"\2\u0112L\3\2\2\2\u0113\u0114\7B\2\2\u0114"+
		"\u0118\5C\"\2\u0115\u0116\7B\2\2\u0116\u0118\5a\61\2\u0117\u0113\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0118N\3\2\2\2\u0119\u011d\t\n\2\2\u011a\u011c"+
		"\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7u\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5O(\2\u0124R\3\2\2\2\u0125"+
		"\u0126\7w\2\2\u0126\u0127\7k\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5O(\2"+
		"\u0129T\3\2\2\2\u012a\u012b\7k\2\2\u012b\u012c\5O(\2\u012cV\3\2\2\2\u012d"+
		"\u0130\5=\37\2\u012e\u0130\t\13\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3"+
		"\2\2\2\u0130\u0136\3\2\2\2\u0131\u0135\5=\37\2\u0132\u0135\59\35\2\u0133"+
		"\u0135\t\f\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"X\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\t\2\2\2\u013a\u013b\7z\2\2\u013b"+
		"Z\3\2\2\2\u013c\u013e\t\r\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\b.\2\2\u0142\\\3\2\2\2\u0143\u0144\7\61\2\2\u0144\u0145\7\61\2\2\u0145"+
		"\u0149\3\2\2\2\u0146\u0148\n\16\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\b/\2\2\u014d^\3\2\2\2\u014e\u014f\7\62\2\2"+
		"\u014f\u0150\7z\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5;\36\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"`\3\2\2\2\u0156\u015a\7$\2\2\u0157\u0159\n\17\2\2\u0158\u0157\3\2\2\2"+
		"\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7$\2\2\u015eb\3\2\2\2\31\2\u00d9"+
		"\u00de\u00e2\u00e7\u00e9\u00ec\u00f1\u00f4\u00f9\u00ff\u0104\u0109\u010b"+
		"\u0117\u011d\u012f\u0134\u0136\u013f\u0149\u0154\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}