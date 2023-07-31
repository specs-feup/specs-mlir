// Generated from pt/up/fe/specs/mlir/grammar/Mlir.g4 by ANTLR 4.5.3

    package pt.up.fe.specs.mlir.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MlirParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, RANKED_DIMENSION=33, UNRANKED_DIMENSION=34, DECIMAL_LITERAL=35, 
		FLOAT_PRECISION=36, VALUE_ID=37, CARET_ID=38, SYMBOL_REF_ELEMENT=39, SIGNED_INT_TYPE=40, 
		UNSIGNED_INT_TYPE=41, SIGNLESS_INT_TYPE=42, BARE_ID=43, WS=44, LINE_COMMENT=45, 
		HEX_LITERAL=46, STRING_LITERAL=47;
	public static final int
		RULE_root = 0, RULE_decimalLiteral = 1, RULE_integerLiteral = 2, RULE_floatLiteral = 3, 
		RULE_stringLiteral = 4, RULE_booleanLiteral = 5, RULE_bareIdList = 6, 
		RULE_aliasName = 7, RULE_symbolRefId = 8, RULE_valueIdList = 9, RULE_valueUse = 10, 
		RULE_valueUseList = 11, RULE_dictionaryProperties = 12, RULE_dictionaryAttribute = 13, 
		RULE_attributesEntry = 14, RULE_attributesProperty = 15, RULE_region = 16, 
		RULE_regionList = 17, RULE_operation = 18, RULE_genericOperation = 19, 
		RULE_successorList = 20, RULE_successor = 21, RULE_opResult = 22, RULE_opResultList = 23, 
		RULE_trailingLocation = 24, RULE_location = 25, RULE_valueIdAndType = 26, 
		RULE_valueIdAndTypeList = 27, RULE_blockArgList = 28, RULE_blockLabel = 29, 
		RULE_block = 30, RULE_dimension = 31, RULE_dimensionListRanked = 32, RULE_dimensionListUnranked = 33, 
		RULE_noneType = 34, RULE_indexType = 35, RULE_floatType = 36, RULE_signedIntegerType = 37, 
		RULE_unsignedIntegerType = 38, RULE_signlessIntegerType = 39, RULE_integerType = 40, 
		RULE_complexType = 41, RULE_tupleType = 42, RULE_functionType = 43, RULE_typeListParens = 44, 
		RULE_tensorMemrefElementType = 45, RULE_unrankedTensorType = 46, RULE_rankedTensorType = 47, 
		RULE_tensorType = 48, RULE_vectorType = 49, RULE_strideList = 50, RULE_stridedLayout = 51, 
		RULE_rankedMemrefType = 52, RULE_unrankedMemrefType = 53, RULE_memrefType = 54, 
		RULE_type = 55;
	public static final String[] ruleNames = {
		"root", "decimalLiteral", "integerLiteral", "floatLiteral", "stringLiteral", 
		"booleanLiteral", "bareIdList", "aliasName", "symbolRefId", "valueIdList", 
		"valueUse", "valueUseList", "dictionaryProperties", "dictionaryAttribute", 
		"attributesEntry", "attributesProperty", "region", "regionList", "operation", 
		"genericOperation", "successorList", "successor", "opResult", "opResultList", 
		"trailingLocation", "location", "valueIdAndType", "valueIdAndTypeList", 
		"blockArgList", "blockLabel", "block", "dimension", "dimensionListRanked", 
		"dimensionListUnranked", "noneType", "indexType", "floatType", "signedIntegerType", 
		"unsignedIntegerType", "signlessIntegerType", "integerType", "complexType", 
		"tupleType", "functionType", "typeListParens", "tensorMemrefElementType", 
		"unrankedTensorType", "rankedTensorType", "tensorType", "vectorType", 
		"strideList", "stridedLayout", "rankedMemrefType", "unrankedMemrefType", 
		"memrefType", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "','", "'::'", "'#'", "'<'", "'>'", "'{'", 
		"'}'", "'='", "'('", "')'", "':'", "'['", "']'", "'loc'", "'unknown'", 
		"'?'", "'none'", "'index'", "'f16'", "'bf16'", "'f32'", "'f64'", "'complex'", 
		"'tuple'", "'->'", "'tensor'", "'vector'", "'offset:'", "'strides:'", 
		"'memref'", null, "'*x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "RANKED_DIMENSION", 
		"UNRANKED_DIMENSION", "DECIMAL_LITERAL", "FLOAT_PRECISION", "VALUE_ID", 
		"CARET_ID", "SYMBOL_REF_ELEMENT", "SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", 
		"SIGNLESS_INT_TYPE", "BARE_ID", "WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
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

	@Override
	public String getGrammarFileName() { return "Mlir.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MlirParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_ID || _la==STRING_LITERAL) {
				{
				{
				setState(112);
				operation();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DecimalLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode DECIMAL_LITERAL() { return getToken(MlirParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDecimalLiteral(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((DecimalLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public boolean isHexadecimal = false;
		public Token value;
		public TerminalNode DECIMAL_LITERAL() { return getToken(MlirParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(MlirParser.HEX_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integerLiteral);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((IntegerLiteralContext)_localctx).value = match(HEX_LITERAL);
				((IntegerLiteralContext)_localctx).isHexadecimal =  true;
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode FLOAT_PRECISION() { return getToken(MlirParser.FLOAT_PRECISION, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((FloatLiteralContext)_localctx).value = match(FLOAT_PRECISION);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING_LITERAL() { return getToken(MlirParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((StringLiteralContext)_localctx).value = match(STRING_LITERAL);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BareIdListContext extends ParserRuleContext {
		public Token BARE_ID;
		public List<Token> values = new ArrayList<Token>();
		public List<TerminalNode> BARE_ID() { return getTokens(MlirParser.BARE_ID); }
		public TerminalNode BARE_ID(int i) {
			return getToken(MlirParser.BARE_ID, i);
		}
		public BareIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBareIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBareIdList(this);
		}
	}

	public final BareIdListContext bareIdList() throws RecognitionException {
		BareIdListContext _localctx = new BareIdListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bareIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AliasNameContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BARE_ID() { return getToken(MlirParser.BARE_ID, 0); }
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAliasName(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((AliasNameContext)_localctx).value = match(BARE_ID);
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

	public static class SymbolRefIdContext extends ParserRuleContext {
		public Token SYMBOL_REF_ELEMENT;
		public List<Token> values = new ArrayList<Token>();
		public List<TerminalNode> SYMBOL_REF_ELEMENT() { return getTokens(MlirParser.SYMBOL_REF_ELEMENT); }
		public TerminalNode SYMBOL_REF_ELEMENT(int i) {
			return getToken(MlirParser.SYMBOL_REF_ELEMENT, i);
		}
		public SymbolRefIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolRefId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSymbolRefId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSymbolRefId(this);
		}
	}

	public final SymbolRefIdContext symbolRefId() throws RecognitionException {
		SymbolRefIdContext _localctx = new SymbolRefIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_symbolRefId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
			((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(142);
				match(T__3);
				setState(143);
				((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
				((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValueIdListContext extends ParserRuleContext {
		public Token VALUE_ID;
		public List<Token> values = new ArrayList<Token>();
		public List<TerminalNode> VALUE_ID() { return getTokens(MlirParser.VALUE_ID); }
		public TerminalNode VALUE_ID(int i) {
			return getToken(MlirParser.VALUE_ID, i);
		}
		public ValueIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueIdList(this);
		}
	}

	public final ValueIdListContext valueIdList() throws RecognitionException {
		ValueIdListContext _localctx = new ValueIdListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
			((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(150);
				match(T__2);
				setState(151);
				((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
				((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ValueUseContext extends ParserRuleContext {
		public Token value;
		public Token number;
		public TerminalNode VALUE_ID() { return getToken(MlirParser.VALUE_ID, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(MlirParser.DECIMAL_LITERAL, 0); }
		public ValueUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueUse(this);
		}
	}

	public final ValueUseContext valueUse() throws RecognitionException {
		ValueUseContext _localctx = new ValueUseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((ValueUseContext)_localctx).value = match(VALUE_ID);
			setState(160);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(158);
				match(T__4);
				setState(159);
				((ValueUseContext)_localctx).number = match(DECIMAL_LITERAL);
				}
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

	public static class ValueUseListContext extends ParserRuleContext {
		public ValueUseContext valueUse;
		public List<ValueUseContext> values = new ArrayList<ValueUseContext>();
		public List<ValueUseContext> valueUse() {
			return getRuleContexts(ValueUseContext.class);
		}
		public ValueUseContext valueUse(int i) {
			return getRuleContext(ValueUseContext.class,i);
		}
		public ValueUseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueUseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueUseList(this);
		}
	}

	public final ValueUseListContext valueUseList() throws RecognitionException {
		ValueUseListContext _localctx = new ValueUseListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valueUseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((ValueUseListContext)_localctx).valueUse = valueUse();
			((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(163);
				match(T__2);
				setState(164);
				((ValueUseListContext)_localctx).valueUse = valueUse();
				((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DictionaryPropertiesContext extends ParserRuleContext {
		public DictionaryAttributeContext dictionaryAttribute() {
			return getRuleContext(DictionaryAttributeContext.class,0);
		}
		public DictionaryPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDictionaryProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDictionaryProperties(this);
		}
	}

	public final DictionaryPropertiesContext dictionaryProperties() throws RecognitionException {
		DictionaryPropertiesContext _localctx = new DictionaryPropertiesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dictionaryProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__5);
			setState(171);
			dictionaryAttribute();
			setState(172);
			match(T__6);
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

	public static class DictionaryAttributeContext extends ParserRuleContext {
		public List<AttributesEntryContext> attributesEntry() {
			return getRuleContexts(AttributesEntryContext.class);
		}
		public AttributesEntryContext attributesEntry(int i) {
			return getRuleContext(AttributesEntryContext.class,i);
		}
		public DictionaryAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDictionaryAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDictionaryAttribute(this);
		}
	}

	public final DictionaryAttributeContext dictionaryAttribute() throws RecognitionException {
		DictionaryAttributeContext _localctx = new DictionaryAttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictionaryAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__7);
			setState(183);
			_la = _input.LA(1);
			if (_la==BARE_ID) {
				{
				setState(175);
				attributesEntry();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(176);
					match(T__2);
					setState(177);
					attributesEntry();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185);
			match(T__8);
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

	public static class AttributesEntryContext extends ParserRuleContext {
		public AttributesPropertyContext attributesProperty() {
			return getRuleContext(AttributesPropertyContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public AttributesEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributesEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributesEntry(this);
		}
	}

	public final AttributesEntryContext attributesEntry() throws RecognitionException {
		AttributesEntryContext _localctx = new AttributesEntryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			attributesProperty();
			setState(188);
			match(T__9);
			setState(193);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				{
				setState(189);
				integerLiteral();
				}
				break;
			case FLOAT_PRECISION:
				{
				setState(190);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				{
				setState(191);
				stringLiteral();
				}
				break;
			case T__0:
			case T__1:
				{
				setState(192);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AttributesPropertyContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BARE_ID() { return getToken(MlirParser.BARE_ID, 0); }
		public AttributesPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributesProperty(this);
		}
	}

	public final AttributesPropertyContext attributesProperty() throws RecognitionException {
		AttributesPropertyContext _localctx = new AttributesPropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((AttributesPropertyContext)_localctx).value = match(BARE_ID);
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

	public static class RegionContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public RegionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_region; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRegion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRegion(this);
		}
	}

	public final RegionContext region() throws RecognitionException {
		RegionContext _localctx = new RegionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_region);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__7);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				operation();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE_ID || _la==STRING_LITERAL );
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET_ID) {
				{
				{
				setState(203);
				block();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__8);
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

	public static class RegionListContext extends ParserRuleContext {
		public List<RegionContext> region() {
			return getRuleContexts(RegionContext.class);
		}
		public RegionContext region(int i) {
			return getRuleContext(RegionContext.class,i);
		}
		public RegionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRegionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRegionList(this);
		}
	}

	public final RegionListContext regionList() throws RecognitionException {
		RegionListContext _localctx = new RegionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__10);
			setState(212);
			region();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(213);
				match(T__2);
				setState(214);
				region();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__11);
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

	public static class OperationContext extends ParserRuleContext {
		public GenericOperationContext genericOperation() {
			return getRuleContext(GenericOperationContext.class,0);
		}
		public OpResultListContext opResultList() {
			return getRuleContext(OpResultListContext.class,0);
		}
		public TrailingLocationContext trailingLocation() {
			return getRuleContext(TrailingLocationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(222);
				opResultList();
				}
			}

			setState(225);
			genericOperation();
			setState(227);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(226);
				trailingLocation();
				}
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

	public static class GenericOperationContext extends ParserRuleContext {
		public Token name;
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MlirParser.STRING_LITERAL, 0); }
		public ValueUseListContext valueUseList() {
			return getRuleContext(ValueUseListContext.class,0);
		}
		public SuccessorListContext successorList() {
			return getRuleContext(SuccessorListContext.class,0);
		}
		public DictionaryPropertiesContext dictionaryProperties() {
			return getRuleContext(DictionaryPropertiesContext.class,0);
		}
		public RegionListContext regionList() {
			return getRuleContext(RegionListContext.class,0);
		}
		public DictionaryAttributeContext dictionaryAttribute() {
			return getRuleContext(DictionaryAttributeContext.class,0);
		}
		public GenericOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterGenericOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitGenericOperation(this);
		}
	}

	public final GenericOperationContext genericOperation() throws RecognitionException {
		GenericOperationContext _localctx = new GenericOperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(230);
			match(T__10);
			setState(232);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(231);
				valueUseList();
				}
			}

			setState(234);
			match(T__11);
			setState(236);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(235);
				successorList();
				}
			}

			setState(239);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(238);
				dictionaryProperties();
				}
			}

			setState(242);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(241);
				regionList();
				}
			}

			setState(245);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(244);
				dictionaryAttribute();
				}
			}

			setState(247);
			match(T__12);
			setState(248);
			functionType();
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

	public static class SuccessorListContext extends ParserRuleContext {
		public List<SuccessorContext> successor() {
			return getRuleContexts(SuccessorContext.class);
		}
		public SuccessorContext successor(int i) {
			return getRuleContext(SuccessorContext.class,i);
		}
		public SuccessorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_successorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSuccessorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSuccessorList(this);
		}
	}

	public final SuccessorListContext successorList() throws RecognitionException {
		SuccessorListContext _localctx = new SuccessorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_successorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__13);
			setState(251);
			successor();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(252);
				match(T__2);
				setState(253);
				successor();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__14);
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

	public static class SuccessorContext extends ParserRuleContext {
		public Token value;
		public TerminalNode CARET_ID() { return getToken(MlirParser.CARET_ID, 0); }
		public SuccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_successor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSuccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSuccessor(this);
		}
	}

	public final SuccessorContext successor() throws RecognitionException {
		SuccessorContext _localctx = new SuccessorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_successor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((SuccessorContext)_localctx).value = match(CARET_ID);
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

	public static class OpResultContext extends ParserRuleContext {
		public Token value;
		public TerminalNode VALUE_ID() { return getToken(MlirParser.VALUE_ID, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public OpResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOpResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOpResult(this);
		}
	}

	public final OpResultContext opResult() throws RecognitionException {
		OpResultContext _localctx = new OpResultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((OpResultContext)_localctx).value = match(VALUE_ID);
			setState(266);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(264);
				match(T__12);
				setState(265);
				integerLiteral();
				}
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

	public static class OpResultListContext extends ParserRuleContext {
		public List<OpResultContext> opResult() {
			return getRuleContexts(OpResultContext.class);
		}
		public OpResultContext opResult(int i) {
			return getRuleContext(OpResultContext.class,i);
		}
		public OpResultListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opResultList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOpResultList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOpResultList(this);
		}
	}

	public final OpResultListContext opResultList() throws RecognitionException {
		OpResultListContext _localctx = new OpResultListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opResultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			opResult();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(269);
				match(T__2);
				setState(270);
				opResult();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(T__9);
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

	public static class TrailingLocationContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TrailingLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTrailingLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTrailingLocation(this);
		}
	}

	public final TrailingLocationContext trailingLocation() throws RecognitionException {
		TrailingLocationContext _localctx = new TrailingLocationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trailingLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__15);
			setState(279);
			match(T__10);
			setState(280);
			location();
			setState(281);
			match(T__11);
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

	public static class LocationContext extends ParserRuleContext {
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnknownLocationContext extends LocationContext {
		public UnknownLocationContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterUnknownLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitUnknownLocation(this);
		}
	}
	public static class KnownLocationContext extends LocationContext {
		public Token file;
		public Token line;
		public Token col;
		public TerminalNode STRING_LITERAL() { return getToken(MlirParser.STRING_LITERAL, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(MlirParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(MlirParser.DECIMAL_LITERAL, i);
		}
		public KnownLocationContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterKnownLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitKnownLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_location);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new KnownLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(283);
				((KnownLocationContext)_localctx).file = match(STRING_LITERAL);
				setState(284);
				match(T__12);
				setState(285);
				((KnownLocationContext)_localctx).line = match(DECIMAL_LITERAL);
				setState(286);
				match(T__12);
				setState(287);
				((KnownLocationContext)_localctx).col = match(DECIMAL_LITERAL);
				}
				}
				break;
			case T__16:
				_localctx = new UnknownLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__16);
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

	public static class ValueIdAndTypeContext extends ParserRuleContext {
		public Token valueId;
		public TypeContext valueType;
		public TerminalNode VALUE_ID() { return getToken(MlirParser.VALUE_ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueIdAndTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueIdAndType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueIdAndType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueIdAndType(this);
		}
	}

	public final ValueIdAndTypeContext valueIdAndType() throws RecognitionException {
		ValueIdAndTypeContext _localctx = new ValueIdAndTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valueIdAndType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((ValueIdAndTypeContext)_localctx).valueId = match(VALUE_ID);
			setState(292);
			match(T__12);
			setState(293);
			((ValueIdAndTypeContext)_localctx).valueType = type();
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

	public static class ValueIdAndTypeListContext extends ParserRuleContext {
		public ValueIdAndTypeContext valueIdAndType;
		public List<ValueIdAndTypeContext> values = new ArrayList<ValueIdAndTypeContext>();
		public List<ValueIdAndTypeContext> valueIdAndType() {
			return getRuleContexts(ValueIdAndTypeContext.class);
		}
		public ValueIdAndTypeContext valueIdAndType(int i) {
			return getRuleContext(ValueIdAndTypeContext.class,i);
		}
		public ValueIdAndTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueIdAndTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueIdAndTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueIdAndTypeList(this);
		}
	}

	public final ValueIdAndTypeListContext valueIdAndTypeList() throws RecognitionException {
		ValueIdAndTypeListContext _localctx = new ValueIdAndTypeListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valueIdAndTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
			((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(296);
				match(T__2);
				setState(297);
				((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
				((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockArgListContext extends ParserRuleContext {
		public ValueIdAndTypeListContext args;
		public ValueIdAndTypeListContext valueIdAndTypeList() {
			return getRuleContext(ValueIdAndTypeListContext.class,0);
		}
		public BlockArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBlockArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBlockArgList(this);
		}
	}

	public final BlockArgListContext blockArgList() throws RecognitionException {
		BlockArgListContext _localctx = new BlockArgListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blockArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__10);
			setState(305);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(304);
				((BlockArgListContext)_localctx).args = valueIdAndTypeList();
				}
			}

			setState(307);
			match(T__11);
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

	public static class BlockLabelContext extends ParserRuleContext {
		public Token blockId;
		public TerminalNode CARET_ID() { return getToken(MlirParser.CARET_ID, 0); }
		public BlockArgListContext blockArgList() {
			return getRuleContext(BlockArgListContext.class,0);
		}
		public BlockLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBlockLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBlockLabel(this);
		}
	}

	public final BlockLabelContext blockLabel() throws RecognitionException {
		BlockLabelContext _localctx = new BlockLabelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((BlockLabelContext)_localctx).blockId = match(CARET_ID);
			setState(311);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(310);
				blockArgList();
				}
			}

			setState(313);
			match(T__12);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockLabelContext blockLabel() {
			return getRuleContext(BlockLabelContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			blockLabel();
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				operation();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE_ID || _la==STRING_LITERAL );
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

	public static class DimensionContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dimension);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				decimalLiteral();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__17);
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

	public static class DimensionListRankedContext extends ParserRuleContext {
		public Token value;
		public List<TerminalNode> RANKED_DIMENSION() { return getTokens(MlirParser.RANKED_DIMENSION); }
		public TerminalNode RANKED_DIMENSION(int i) {
			return getToken(MlirParser.RANKED_DIMENSION, i);
		}
		public DimensionListRankedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionListRanked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimensionListRanked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimensionListRanked(this);
		}
	}

	public final DimensionListRankedContext dimensionListRanked() throws RecognitionException {
		DimensionListRankedContext _localctx = new DimensionListRankedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dimensionListRanked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(325);
				((DimensionListRankedContext)_localctx).value = match(RANKED_DIMENSION);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DimensionListUnrankedContext extends ParserRuleContext {
		public Token value;
		public TerminalNode UNRANKED_DIMENSION() { return getToken(MlirParser.UNRANKED_DIMENSION, 0); }
		public DimensionListUnrankedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionListUnranked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimensionListUnranked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimensionListUnranked(this);
		}
	}

	public final DimensionListUnrankedContext dimensionListUnranked() throws RecognitionException {
		DimensionListUnrankedContext _localctx = new DimensionListUnrankedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dimensionListUnranked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((DimensionListUnrankedContext)_localctx).value = match(UNRANKED_DIMENSION);
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

	public static class NoneTypeContext extends ParserRuleContext {
		public Token value;
		public NoneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noneType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterNoneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitNoneType(this);
		}
	}

	public final NoneTypeContext noneType() throws RecognitionException {
		NoneTypeContext _localctx = new NoneTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_noneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((NoneTypeContext)_localctx).value = match(T__18);
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

	public static class IndexTypeContext extends ParserRuleContext {
		public Token value;
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIndexType(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((IndexTypeContext)_localctx).value = match(T__19);
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

	public static class FloatTypeContext extends ParserRuleContext {
		public Token value;
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFloatType(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((FloatTypeContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
				((FloatTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			} else {
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

	public static class SignedIntegerTypeContext extends ParserRuleContext {
		public Token value;
		public TerminalNode SIGNED_INT_TYPE() { return getToken(MlirParser.SIGNED_INT_TYPE, 0); }
		public SignedIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSignedIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSignedIntegerType(this);
		}
	}

	public final SignedIntegerTypeContext signedIntegerType() throws RecognitionException {
		SignedIntegerTypeContext _localctx = new SignedIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_signedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((SignedIntegerTypeContext)_localctx).value = match(SIGNED_INT_TYPE);
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

	public static class UnsignedIntegerTypeContext extends ParserRuleContext {
		public Token value;
		public TerminalNode UNSIGNED_INT_TYPE() { return getToken(MlirParser.UNSIGNED_INT_TYPE, 0); }
		public UnsignedIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterUnsignedIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitUnsignedIntegerType(this);
		}
	}

	public final UnsignedIntegerTypeContext unsignedIntegerType() throws RecognitionException {
		UnsignedIntegerTypeContext _localctx = new UnsignedIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unsignedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			((UnsignedIntegerTypeContext)_localctx).value = match(UNSIGNED_INT_TYPE);
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

	public static class SignlessIntegerTypeContext extends ParserRuleContext {
		public Token value;
		public TerminalNode SIGNLESS_INT_TYPE() { return getToken(MlirParser.SIGNLESS_INT_TYPE, 0); }
		public SignlessIntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signlessIntegerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSignlessIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSignlessIntegerType(this);
		}
	}

	public final SignlessIntegerTypeContext signlessIntegerType() throws RecognitionException {
		SignlessIntegerTypeContext _localctx = new SignlessIntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_signlessIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((SignlessIntegerTypeContext)_localctx).value = match(SIGNLESS_INT_TYPE);
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public SignedIntegerTypeContext signedIntegerType() {
			return getRuleContext(SignedIntegerTypeContext.class,0);
		}
		public UnsignedIntegerTypeContext unsignedIntegerType() {
			return getRuleContext(UnsignedIntegerTypeContext.class,0);
		}
		public SignlessIntegerTypeContext signlessIntegerType() {
			return getRuleContext(SignlessIntegerTypeContext.class,0);
		}
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIntegerType(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_integerType);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case SIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				signedIntegerType();
				}
				break;
			case UNSIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				unsignedIntegerType();
				}
				break;
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				signlessIntegerType();
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitComplexType(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__24);
			setState(351);
			match(T__5);
			setState(352);
			type();
			setState(353);
			match(T__6);
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

	public static class TupleTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__25);
			setState(356);
			match(T__5);
			setState(357);
			type();
			setState(358);
			match(T__6);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeListParensContext> typeListParens() {
			return getRuleContexts(TypeListParensContext.class);
		}
		public TypeListParensContext typeListParens(int i) {
			return getRuleContext(TypeListParensContext.class,i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				{
				setState(360);
				type();
				}
				break;
			case T__10:
				{
				setState(361);
				typeListParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			match(T__26);
			setState(367);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				{
				setState(365);
				type();
				}
				break;
			case T__10:
				{
				setState(366);
				typeListParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeListParensContext extends ParserRuleContext {
		public TypeContext type;
		public List<TypeContext> values = new ArrayList<TypeContext>();
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeListParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTypeListParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTypeListParens(this);
		}
	}

	public final TypeListParensContext typeListParens() throws RecognitionException {
		TypeListParensContext _localctx = new TypeListParensContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeListParens);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__10);
				setState(370);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(T__10);
				{
				setState(372);
				((TypeListParensContext)_localctx).type = type();
				((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(373);
					match(T__2);
					setState(374);
					((TypeListParensContext)_localctx).type = type();
					((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(380);
				match(T__11);
				}
				break;
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

	public static class TensorMemrefElementTypeContext extends ParserRuleContext {
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public TensorMemrefElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensorMemrefElementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTensorMemrefElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTensorMemrefElementType(this);
		}
	}

	public final TensorMemrefElementTypeContext tensorMemrefElementType() throws RecognitionException {
		TensorMemrefElementTypeContext _localctx = new TensorMemrefElementTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tensorMemrefElementType);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				integerType();
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

	public static class UnrankedTensorTypeContext extends ParserRuleContext {
		public DimensionListUnrankedContext dimensionListUnranked() {
			return getRuleContext(DimensionListUnrankedContext.class,0);
		}
		public TensorMemrefElementTypeContext tensorMemrefElementType() {
			return getRuleContext(TensorMemrefElementTypeContext.class,0);
		}
		public UnrankedTensorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrankedTensorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterUnrankedTensorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitUnrankedTensorType(this);
		}
	}

	public final UnrankedTensorTypeContext unrankedTensorType() throws RecognitionException {
		UnrankedTensorTypeContext _localctx = new UnrankedTensorTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unrankedTensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__27);
			setState(389);
			match(T__5);
			setState(390);
			dimensionListUnranked();
			setState(391);
			tensorMemrefElementType();
			setState(392);
			match(T__6);
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

	public static class RankedTensorTypeContext extends ParserRuleContext {
		public DimensionListRankedContext dimensionListRanked() {
			return getRuleContext(DimensionListRankedContext.class,0);
		}
		public TensorMemrefElementTypeContext tensorMemrefElementType() {
			return getRuleContext(TensorMemrefElementTypeContext.class,0);
		}
		public RankedTensorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankedTensorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRankedTensorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRankedTensorType(this);
		}
	}

	public final RankedTensorTypeContext rankedTensorType() throws RecognitionException {
		RankedTensorTypeContext _localctx = new RankedTensorTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_rankedTensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__27);
			setState(395);
			match(T__5);
			setState(396);
			dimensionListRanked();
			setState(397);
			tensorMemrefElementType();
			setState(398);
			match(T__6);
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

	public static class TensorTypeContext extends ParserRuleContext {
		public UnrankedTensorTypeContext unrankedTensorType() {
			return getRuleContext(UnrankedTensorTypeContext.class,0);
		}
		public RankedTensorTypeContext rankedTensorType() {
			return getRuleContext(RankedTensorTypeContext.class,0);
		}
		public TensorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTensorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTensorType(this);
		}
	}

	public final TensorTypeContext tensorType() throws RecognitionException {
		TensorTypeContext _localctx = new TensorTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tensorType);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				unrankedTensorType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				rankedTensorType();
				}
				break;
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

	public static class VectorTypeContext extends ParserRuleContext {
		public DimensionListRankedContext dimensionListRanked() {
			return getRuleContext(DimensionListRankedContext.class,0);
		}
		public TensorMemrefElementTypeContext tensorMemrefElementType() {
			return getRuleContext(TensorMemrefElementTypeContext.class,0);
		}
		public VectorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterVectorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitVectorType(this);
		}
	}

	public final VectorTypeContext vectorType() throws RecognitionException {
		VectorTypeContext _localctx = new VectorTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_vectorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__28);
			setState(405);
			match(T__5);
			setState(406);
			dimensionListRanked();
			setState(407);
			tensorMemrefElementType();
			setState(408);
			match(T__6);
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

	public static class StrideListContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public StrideListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strideList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStrideList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStrideList(this);
		}
	}

	public final StrideListContext strideList() throws RecognitionException {
		StrideListContext _localctx = new StrideListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_strideList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__13);
			setState(419);
			_la = _input.LA(1);
			if (_la==T__17 || _la==DECIMAL_LITERAL) {
				{
				setState(411);
				dimension();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(412);
					match(T__2);
					setState(413);
					dimension();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(421);
			match(T__14);
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

	public static class StridedLayoutContext extends ParserRuleContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public StrideListContext strideList() {
			return getRuleContext(StrideListContext.class,0);
		}
		public StridedLayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stridedLayout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStridedLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStridedLayout(this);
		}
	}

	public final StridedLayoutContext stridedLayout() throws RecognitionException {
		StridedLayoutContext _localctx = new StridedLayoutContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stridedLayout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__29);
			setState(424);
			dimension();
			setState(425);
			match(T__2);
			setState(426);
			match(T__30);
			setState(427);
			strideList();
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

	public static class RankedMemrefTypeContext extends ParserRuleContext {
		public DimensionListRankedContext dimensionListRanked() {
			return getRuleContext(DimensionListRankedContext.class,0);
		}
		public TensorMemrefElementTypeContext tensorMemrefElementType() {
			return getRuleContext(TensorMemrefElementTypeContext.class,0);
		}
		public StridedLayoutContext stridedLayout() {
			return getRuleContext(StridedLayoutContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public RankedMemrefTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankedMemrefType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRankedMemrefType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRankedMemrefType(this);
		}
	}

	public final RankedMemrefTypeContext rankedMemrefType() throws RecognitionException {
		RankedMemrefTypeContext _localctx = new RankedMemrefTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_rankedMemrefType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__31);
			setState(430);
			match(T__5);
			setState(431);
			dimensionListRanked();
			setState(432);
			tensorMemrefElementType();
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(433);
				match(T__2);
				setState(434);
				stridedLayout();
				}
				break;
			}
			setState(439);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(437);
				match(T__2);
				setState(438);
				integerLiteral();
				}
			}

			setState(441);
			match(T__6);
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

	public static class UnrankedMemrefTypeContext extends ParserRuleContext {
		public DimensionListUnrankedContext dimensionListUnranked() {
			return getRuleContext(DimensionListUnrankedContext.class,0);
		}
		public TensorMemrefElementTypeContext tensorMemrefElementType() {
			return getRuleContext(TensorMemrefElementTypeContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public UnrankedMemrefTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrankedMemrefType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterUnrankedMemrefType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitUnrankedMemrefType(this);
		}
	}

	public final UnrankedMemrefTypeContext unrankedMemrefType() throws RecognitionException {
		UnrankedMemrefTypeContext _localctx = new UnrankedMemrefTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unrankedMemrefType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__31);
			setState(444);
			match(T__5);
			setState(445);
			dimensionListUnranked();
			setState(446);
			tensorMemrefElementType();
			setState(449);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(447);
				match(T__2);
				setState(448);
				integerLiteral();
				}
			}

			setState(451);
			match(T__6);
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

	public static class MemrefTypeContext extends ParserRuleContext {
		public UnrankedMemrefTypeContext unrankedMemrefType() {
			return getRuleContext(UnrankedMemrefTypeContext.class,0);
		}
		public RankedMemrefTypeContext rankedMemrefType() {
			return getRuleContext(RankedMemrefTypeContext.class,0);
		}
		public MemrefTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memrefType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterMemrefType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitMemrefType(this);
		}
	}

	public final MemrefTypeContext memrefType() throws RecognitionException {
		MemrefTypeContext _localctx = new MemrefTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_memrefType);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				unrankedMemrefType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				rankedMemrefType();
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public NoneTypeContext noneType() {
			return getRuleContext(NoneTypeContext.class,0);
		}
		public IndexTypeContext indexType() {
			return getRuleContext(IndexTypeContext.class,0);
		}
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public TensorTypeContext tensorType() {
			return getRuleContext(TensorTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			setState(464);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				noneType();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				indexType();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				integerType();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				complexType();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				tupleType();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				tensorType();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u01d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\3\3\3\3\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7"+
		"\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\n\3\n\3\n\7\n\u0093\n\n\f\n"+
		"\16\n\u0096\13\n\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13"+
		"\3\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b5\n\17\f\17\16\17"+
		"\u00b8\13\17\5\17\u00ba\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00c4\n\20\3\21\3\21\3\22\3\22\6\22\u00ca\n\22\r\22\16\22\u00cb\3"+
		"\22\7\22\u00cf\n\22\f\22\16\22\u00d2\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\7\23\u00da\n\23\f\23\16\23\u00dd\13\23\3\23\3\23\3\24\5\24\u00e2\n"+
		"\24\3\24\3\24\5\24\u00e6\n\24\3\25\3\25\3\25\5\25\u00eb\n\25\3\25\3\25"+
		"\5\25\u00ef\n\25\3\25\5\25\u00f2\n\25\3\25\5\25\u00f5\n\25\3\25\5\25\u00f8"+
		"\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104"+
		"\13\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u010d\n\30\3\31\3\31\3"+
		"\31\7\31\u0112\n\31\f\31\16\31\u0115\13\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0124\n\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\7\35\u012d\n\35\f\35\16\35\u0130\13\35\3\36\3\36"+
		"\5\36\u0134\n\36\3\36\3\36\3\37\3\37\5\37\u013a\n\37\3\37\3\37\3 \3 \6"+
		" \u0140\n \r \16 \u0141\3!\3!\5!\u0146\n!\3\"\7\"\u0149\n\"\f\"\16\"\u014c"+
		"\13\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\5*\u015f\n"+
		"*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\5-\u016d\n-\3-\3-\3-\5-\u0172\n"+
		"-\3.\3.\3.\3.\3.\3.\7.\u017a\n.\f.\16.\u017d\13.\3.\3.\5.\u0181\n.\3/"+
		"\3/\5/\u0185\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\5\62\u0195\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\7\64\u01a1\n\64\f\64\16\64\u01a4\13\64\5\64\u01a6\n\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u01b6\n\66\3\66\3\66\5\66\u01ba\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u01c4\n\67\3\67\3\67\38\38\58\u01ca\n8\39\39\39\39\39\3"+
		"9\39\59\u01d3\n9\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\4\3\2\3\4\3\2\27\32\u01d0"+
		"\2u\3\2\2\2\4x\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u0085\3\2\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u0097\3"+
		"\2\2\2\26\u009f\3\2\2\2\30\u00a4\3\2\2\2\32\u00ac\3\2\2\2\34\u00b0\3\2"+
		"\2\2\36\u00bd\3\2\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00d5\3\2\2\2&\u00e1"+
		"\3\2\2\2(\u00e7\3\2\2\2*\u00fc\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u010e\3\2\2\2\62\u0118\3\2\2\2\64\u0123\3\2\2\2\66\u0125\3\2\2\28\u0129"+
		"\3\2\2\2:\u0131\3\2\2\2<\u0137\3\2\2\2>\u013d\3\2\2\2@\u0145\3\2\2\2B"+
		"\u014a\3\2\2\2D\u014d\3\2\2\2F\u014f\3\2\2\2H\u0151\3\2\2\2J\u0153\3\2"+
		"\2\2L\u0155\3\2\2\2N\u0157\3\2\2\2P\u0159\3\2\2\2R\u015e\3\2\2\2T\u0160"+
		"\3\2\2\2V\u0165\3\2\2\2X\u016c\3\2\2\2Z\u0180\3\2\2\2\\\u0184\3\2\2\2"+
		"^\u0186\3\2\2\2`\u018c\3\2\2\2b\u0194\3\2\2\2d\u0196\3\2\2\2f\u019c\3"+
		"\2\2\2h\u01a9\3\2\2\2j\u01af\3\2\2\2l\u01bd\3\2\2\2n\u01c9\3\2\2\2p\u01d2"+
		"\3\2\2\2rt\5&\24\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\3\3\2\2\2"+
		"wu\3\2\2\2xy\7%\2\2y\5\3\2\2\2z~\7%\2\2{|\7\60\2\2|~\b\4\1\2}z\3\2\2\2"+
		"}{\3\2\2\2~\7\3\2\2\2\177\u0080\7&\2\2\u0080\t\3\2\2\2\u0081\u0082\7\61"+
		"\2\2\u0082\13\3\2\2\2\u0083\u0084\t\2\2\2\u0084\r\3\2\2\2\u0085\u008a"+
		"\7-\2\2\u0086\u0087\7\5\2\2\u0087\u0089\7-\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u008e\7-\2\2\u008e\21\3\2\2\2\u008f\u0094"+
		"\7)\2\2\u0090\u0091\7\6\2\2\u0091\u0093\7)\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0094\3\2\2\2\u0097\u009c\7\'\2\2\u0098\u0099\7\5\2\2\u0099\u009b"+
		"\7\'\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\7\'\2"+
		"\2\u00a0\u00a1\7\7\2\2\u00a1\u00a3\7%\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a9\5\26\f\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7\b\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\7\t\2\2\u00af\33\3\2"+
		"\2\2\u00b0\u00b9\7\n\2\2\u00b1\u00b6\5\36\20\2\u00b2\u00b3\7\5\2\2\u00b3"+
		"\u00b5\5\36\20\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\13"+
		"\2\2\u00bc\35\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00c3\7\f\2\2\u00bf\u00c4"+
		"\5\6\4\2\u00c0\u00c4\5\b\5\2\u00c1\u00c4\5\n\6\2\u00c2\u00c4\5\f\7\2\u00c3"+
		"\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6!\3\2\2\2\u00c7\u00c9\7"+
		"\n\2\2\u00c8\u00ca\5&\24\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\5>"+
		" \2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\13"+
		"\2\2\u00d4#\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00db\5\"\22\2\u00d7\u00d8"+
		"\7\5\2\2\u00d8\u00da\5\"\22\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\7\16\2\2\u00df%\3\2\2\2\u00e0\u00e2\5\60\31\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5("+
		"\25\2\u00e4\u00e6\5\62\32\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\'\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ea\7\r\2\2\u00e9\u00eb\5\30\r"+
		"\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\7\16\2\2\u00ed\u00ef\5*\26\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5\32\16\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\17\2\2\u00fa"+
		"\u00fb\5X-\2\u00fb)\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd\u0102\5,\27\2\u00fe"+
		"\u00ff\7\5\2\2\u00ff\u0101\5,\27\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0106\7\21\2\2\u0106+\3\2\2\2\u0107\u0108\7(\2\2"+
		"\u0108-\3\2\2\2\u0109\u010c\7\'\2\2\u010a\u010b\7\17\2\2\u010b\u010d\5"+
		"\6\4\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d/\3\2\2\2\u010e\u0113"+
		"\5.\30\2\u010f\u0110\7\5\2\2\u0110\u0112\5.\30\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\f\2\2\u0117\61\3\2\2\2\u0118\u0119"+
		"\7\22\2\2\u0119\u011a\7\r\2\2\u011a\u011b\5\64\33\2\u011b\u011c\7\16\2"+
		"\2\u011c\63\3\2\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7\17\2\2\u011f\u0120"+
		"\7%\2\2\u0120\u0121\7\17\2\2\u0121\u0124\7%\2\2\u0122\u0124\7\23\2\2\u0123"+
		"\u011d\3\2\2\2\u0123\u0122\3\2\2\2\u0124\65\3\2\2\2\u0125\u0126\7\'\2"+
		"\2\u0126\u0127\7\17\2\2\u0127\u0128\5p9\2\u0128\67\3\2\2\2\u0129\u012e"+
		"\5\66\34\2\u012a\u012b\7\5\2\2\u012b\u012d\5\66\34\2\u012c\u012a\3\2\2"+
		"\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f9"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\7\r\2\2\u0132\u0134\58\35\2\u0133"+
		"\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\16"+
		"\2\2\u0136;\3\2\2\2\u0137\u0139\7(\2\2\u0138\u013a\5:\36\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\17\2\2"+
		"\u013c=\3\2\2\2\u013d\u013f\5<\37\2\u013e\u0140\5&\24\2\u013f\u013e\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"?\3\2\2\2\u0143\u0146\5\4\3\2\u0144\u0146\7\24\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0144\3\2\2\2\u0146A\3\2\2\2\u0147\u0149\7#\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"C\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7$\2\2\u014eE\3\2\2\2\u014f"+
		"\u0150\7\25\2\2\u0150G\3\2\2\2\u0151\u0152\7\26\2\2\u0152I\3\2\2\2\u0153"+
		"\u0154\t\3\2\2\u0154K\3\2\2\2\u0155\u0156\7*\2\2\u0156M\3\2\2\2\u0157"+
		"\u0158\7+\2\2\u0158O\3\2\2\2\u0159\u015a\7,\2\2\u015aQ\3\2\2\2\u015b\u015f"+
		"\5L\'\2\u015c\u015f\5N(\2\u015d\u015f\5P)\2\u015e\u015b\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fS\3\2\2\2\u0160\u0161\7\33\2\2"+
		"\u0161\u0162\7\b\2\2\u0162\u0163\5p9\2\u0163\u0164\7\t\2\2\u0164U\3\2"+
		"\2\2\u0165\u0166\7\34\2\2\u0166\u0167\7\b\2\2\u0167\u0168\5p9\2\u0168"+
		"\u0169\7\t\2\2\u0169W\3\2\2\2\u016a\u016d\5p9\2\u016b\u016d\5Z.\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\7\35"+
		"\2\2\u016f\u0172\5p9\2\u0170\u0172\5Z.\2\u0171\u016f\3\2\2\2\u0171\u0170"+
		"\3\2\2\2\u0172Y\3\2\2\2\u0173\u0174\7\r\2\2\u0174\u0181\7\16\2\2\u0175"+
		"\u0176\7\r\2\2\u0176\u017b\5p9\2\u0177\u0178\7\5\2\2\u0178\u017a\5p9\2"+
		"\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\16\2\2"+
		"\u017f\u0181\3\2\2\2\u0180\u0173\3\2\2\2\u0180\u0175\3\2\2\2\u0181[\3"+
		"\2\2\2\u0182\u0185\5J&\2\u0183\u0185\5R*\2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185]\3\2\2\2\u0186\u0187\7\36\2\2\u0187\u0188\7\b\2\2\u0188"+
		"\u0189\5D#\2\u0189\u018a\5\\/\2\u018a\u018b\7\t\2\2\u018b_\3\2\2\2\u018c"+
		"\u018d\7\36\2\2\u018d\u018e\7\b\2\2\u018e\u018f\5B\"\2\u018f\u0190\5\\"+
		"/\2\u0190\u0191\7\t\2\2\u0191a\3\2\2\2\u0192\u0195\5^\60\2\u0193\u0195"+
		"\5`\61\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195c\3\2\2\2\u0196"+
		"\u0197\7\37\2\2\u0197\u0198\7\b\2\2\u0198\u0199\5B\"\2\u0199\u019a\5\\"+
		"/\2\u019a\u019b\7\t\2\2\u019be\3\2\2\2\u019c\u01a5\7\20\2\2\u019d\u01a2"+
		"\5@!\2\u019e\u019f\7\5\2\2\u019f\u01a1\5@!\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\7\21\2\2\u01a8g\3\2\2\2\u01a9\u01aa\7 \2\2"+
		"\u01aa\u01ab\5@!\2\u01ab\u01ac\7\5\2\2\u01ac\u01ad\7!\2\2\u01ad\u01ae"+
		"\5f\64\2\u01aei\3\2\2\2\u01af\u01b0\7\"\2\2\u01b0\u01b1\7\b\2\2\u01b1"+
		"\u01b2\5B\"\2\u01b2\u01b5\5\\/\2\u01b3\u01b4\7\5\2\2\u01b4\u01b6\5h\65"+
		"\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b8"+
		"\7\5\2\2\u01b8\u01ba\5\6\4\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\7\t\2\2\u01bck\3\2\2\2\u01bd\u01be\7\"\2\2"+
		"\u01be\u01bf\7\b\2\2\u01bf\u01c0\5D#\2\u01c0\u01c3\5\\/\2\u01c1\u01c2"+
		"\7\5\2\2\u01c2\u01c4\5\6\4\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7\t\2\2\u01c6m\3\2\2\2\u01c7\u01ca\5l\67\2"+
		"\u01c8\u01ca\5j\66\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01cao\3"+
		"\2\2\2\u01cb\u01d3\5F$\2\u01cc\u01d3\5H%\2\u01cd\u01d3\5J&\2\u01ce\u01d3"+
		"\5R*\2\u01cf\u01d3\5T+\2\u01d0\u01d3\5V,\2\u01d1\u01d3\5b\62\2\u01d2\u01cb"+
		"\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3q\3\2\2\2"+
		".u}\u008a\u0094\u009c\u00a2\u00a9\u00b6\u00b9\u00c3\u00cb\u00d0\u00db"+
		"\u00e1\u00e5\u00ea\u00ee\u00f1\u00f4\u00f7\u0102\u010c\u0113\u0123\u012e"+
		"\u0133\u0139\u0141\u0145\u014a\u015e\u016c\u0171\u017b\u0180\u0184\u0194"+
		"\u01a2\u01a5\u01b5\u01b9\u01c3\u01c9\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}