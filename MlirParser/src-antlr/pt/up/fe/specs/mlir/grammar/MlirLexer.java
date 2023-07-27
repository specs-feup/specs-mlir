// Generated from pt\u005Cup\fe\specs\mlir\grammar\Mlir.g4 by ANTLR 4.5.3

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		DECIMAL_LITERAL=32, FLOAT_PRECISION=33, BARE_ID=34, VALUE_ID=35, CARET_ID=36, 
		SYMBOL_REF_ELEMENT=37, INTTYPE_WIDTH=38, RANKED_DIMENSION=39, WS=40, LINE_COMMENT=41, 
		HEX_LITERAL=42, STRING_LITERAL=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "DIGIT", "HEX_DIGIT", 
		"LETTER", "ID_PUNCT", "ESCAPED_CHAR", "ID_SUFFIX", "DECIMAL_LITERAL", 
		"FLOAT_PRECISION", "BARE_ID", "VALUE_ID", "CARET_ID", "SYMBOL_REF_ELEMENT", 
		"INTTYPE_WIDTH", "RANKED_DIMENSION", "WS", "LINE_COMMENT", "HEX_LITERAL", 
		"STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "','", "'::'", "'#'", "'('", "')'", "':'", 
		"'['", "']'", "'='", "'loc'", "'unknown'", "'%'", "'none'", "'index'", 
		"'f16'", "'bf16'", "'f32'", "'f64'", "'si'", "'ui'", "'i'", "'complex'", 
		"'<'", "'>'", "'tuple'", "'tensor'", "'->'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DECIMAL_LITERAL", "FLOAT_PRECISION", 
		"BARE_ID", "VALUE_ID", "CARET_ID", "SYMBOL_REF_ELEMENT", "INTTYPE_WIDTH", 
		"RANKED_DIMENSION", "WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u015e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u00e6\n%\3&\6&\u00e9\n&\r&\16&\u00ea\3&\3&\5&\u00ef\n&\3&\3&\3&\7&\u00f4"+
		"\n&\f&\16&\u00f7\13&\5&\u00f9\n&\3\'\6\'\u00fc\n\'\r\'\16\'\u00fd\3(\5"+
		"(\u0101\n(\3(\6(\u0104\n(\r(\16(\u0105\3(\3(\7(\u010a\n(\f(\16(\u010d"+
		"\13(\3(\3(\5(\u0111\n(\3(\6(\u0114\n(\r(\16(\u0115\5(\u0118\n(\3)\3)\5"+
		")\u011c\n)\3)\3)\3)\7)\u0121\n)\f)\16)\u0124\13)\3*\3*\3*\3+\3+\3+\3,"+
		"\3,\3,\3,\5,\u0130\n,\3-\3-\7-\u0134\n-\f-\16-\u0137\13-\3.\3.\3.\3/\6"+
		"/\u013d\n/\r/\16/\u013e\3/\3/\3\60\3\60\3\60\3\60\7\60\u0147\n\60\f\60"+
		"\16\60\u014a\13\60\3\60\3\60\3\61\3\61\3\61\3\61\6\61\u0152\n\61\r\61"+
		"\16\61\u0153\3\62\3\62\7\62\u0158\n\62\f\62\16\62\u015b\13\62\3\62\3\62"+
		"\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\2C\2E\2G\2I\2K\2M\"O#Q$S%U&W\'Y([)]*_+a,c-\3\2\20\3\2\62"+
		";\5\2\62;CHch\4\2C\\c|\5\2&&/\60aa\n\2$$\61\61^^ddhhppttvv\4\2--//\3\2"+
		"\60\60\4\2GGgg\3\2aa\5\2&&\60\60aa\3\2\63;\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\6\2\f\f\16\17$$``\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2"+
		"\2\7p\3\2\2\2\tr\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2"+
		"\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0087"+
		"\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0096\3\2\2\2#\u009c\3\2\2"+
		"\2%\u00a0\3\2\2\2\'\u00a5\3\2\2\2)\u00a9\3\2\2\2+\u00ad\3\2\2\2-\u00b0"+
		"\3\2\2\2/\u00b3\3\2\2\2\61\u00b5\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2"+
		"\2\2\67\u00c1\3\2\2\29\u00c7\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2?\u00d3"+
		"\3\2\2\2A\u00d5\3\2\2\2C\u00d7\3\2\2\2E\u00d9\3\2\2\2G\u00db\3\2\2\2I"+
		"\u00dd\3\2\2\2K\u00f8\3\2\2\2M\u00fb\3\2\2\2O\u0100\3\2\2\2Q\u011b\3\2"+
		"\2\2S\u0125\3\2\2\2U\u0128\3\2\2\2W\u012f\3\2\2\2Y\u0131\3\2\2\2[\u0138"+
		"\3\2\2\2]\u013c\3\2\2\2_\u0142\3\2\2\2a\u014d\3\2\2\2c\u0155\3\2\2\2e"+
		"f\7v\2\2fg\7t\2\2gh\7w\2\2hi\7g\2\2i\4\3\2\2\2jk\7h\2\2kl\7c\2\2lm\7n"+
		"\2\2mn\7u\2\2no\7g\2\2o\6\3\2\2\2pq\7.\2\2q\b\3\2\2\2rs\7<\2\2st\7<\2"+
		"\2t\n\3\2\2\2uv\7%\2\2v\f\3\2\2\2wx\7*\2\2x\16\3\2\2\2yz\7+\2\2z\20\3"+
		"\2\2\2{|\7<\2\2|\22\3\2\2\2}~\7]\2\2~\24\3\2\2\2\177\u0080\7_\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\7?\2\2\u0082\30\3\2\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7e\2\2\u0086\32\3\2\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7m\2\2\u008a\u008b\7p\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7y\2\2\u008d\u008e\7p\2\2\u008e\34\3\2\2\2\u008f\u0090\7"+
		"\'\2\2\u0090\36\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7g\2\2\u0095 \3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7f\2\2\u0099\u009a\7g\2\2\u009a\u009b\7z\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7\63\2\2\u009e\u009f\78\2\2"+
		"\u009f$\3\2\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7\63"+
		"\2\2\u00a3\u00a4\78\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7"+
		"\7\65\2\2\u00a7\u00a8\7\64\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\78\2\2\u00ab\u00ac\7\66\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7k\2\2\u00af,\3\2\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		".\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7n\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7z\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7"+
		">\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\66\3\2\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c68\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2"+
		"\u00cd:\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf\u00d0\7@\2\2\u00d0<\3\2\2\2\u00d1"+
		"\u00d2\7}\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7\177\2\2\u00d4@\3\2\2\2\u00d5"+
		"\u00d6\t\2\2\2\u00d6B\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8D\3\2\2\2\u00d9"+
		"\u00da\t\4\2\2\u00daF\3\2\2\2\u00db\u00dc\t\5\2\2\u00dcH\3\2\2\2\u00dd"+
		"\u00e5\7^\2\2\u00de\u00e6\t\6\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\5C\""+
		"\2\u00e1\u00e2\5C\"\2\u00e2\u00e3\5C\"\2\u00e3\u00e4\5C\"\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e6J\3\2\2\2\u00e7"+
		"\u00e9\5A!\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2"+
		"\2\u00ea\u00eb\3\2\2\2\u00eb\u00f9\3\2\2\2\u00ec\u00ef\5E#\2\u00ed\u00ef"+
		"\5G$\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f5\3\2\2\2\u00f0"+
		"\u00f4\5E#\2\u00f1\u00f4\5G$\2\u00f2\u00f4\5A!\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00e8\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f9L\3\2\2\2\u00fa\u00fc\5A!\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00feN\3\2\2\2\u00ff\u0101\t\7\2\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\t\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u010b\t\b\2\2\u0108\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0117\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0110\t\t\2\2\u010f\u0111\t\7\2\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\t\2"+
		"\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118P\3\2\2\2\u0119\u011c\5E#\2\u011a\u011c\t\n\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u0122\3\2\2\2\u011d\u0121\5E#\2\u011e"+
		"\u0121\5A!\2\u011f\u0121\t\13\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123R\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\'\2\2"+
		"\u0126\u0127\5K&\2\u0127T\3\2\2\2\u0128\u0129\7`\2\2\u0129\u012a\5K&\2"+
		"\u012aV\3\2\2\2\u012b\u012c\7B\2\2\u012c\u0130\5K&\2\u012d\u012e\7B\2"+
		"\2\u012e\u0130\5c\62\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130X"+
		"\3\2\2\2\u0131\u0135\t\f\2\2\u0132\u0134\t\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136Z\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0138\u0139\t\2\2\2\u0139\u013a\7z\2\2\u013a\\\3"+
		"\2\2\2\u013b\u013d\t\r\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b/"+
		"\2\2\u0141^\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7\61\2\2\u0144\u0148"+
		"\3\2\2\2\u0145\u0147\n\16\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\b\60\2\2\u014c`\3\2\2\2\u014d\u014e\7\62\2\2\u014e"+
		"\u014f\7z\2\2\u014f\u0151\3\2\2\2\u0150\u0152\5C\"\2\u0151\u0150\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154b"+
		"\3\2\2\2\u0155\u0159\7$\2\2\u0156\u0158\n\17\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7$\2\2\u015dd\3\2\2\2\31\2\u00e5"+
		"\u00ea\u00ee\u00f3\u00f5\u00f8\u00fd\u0100\u0105\u010b\u0110\u0115\u0117"+
		"\u011b\u0120\u0122\u012f\u0135\u013e\u0148\u0153\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}