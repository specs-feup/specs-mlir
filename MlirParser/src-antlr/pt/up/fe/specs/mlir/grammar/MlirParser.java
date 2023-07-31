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
		RANKED_DIMENSION=32, UNRANKED_DIMENSION=33, DECIMAL_LITERAL=34, FLOAT_PRECISION=35, 
		VALUE_ID=36, CARET_ID=37, SYMBOL_REF_ELEMENT=38, SIGNED_INT_TYPE=39, UNSIGNED_INT_TYPE=40, 
		SIGNLESS_INT_TYPE=41, BARE_ID=42, WS=43, LINE_COMMENT=44, HEX_LITERAL=45, 
		STRING_LITERAL=46;
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
		RULE_tensorType = 48, RULE_strideList = 49, RULE_stridedLayout = 50, RULE_rankedMemrefType = 51, 
		RULE_unrankedMemrefType = 52, RULE_memrefType = 53, RULE_type = 54;
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
		"unrankedTensorType", "rankedTensorType", "tensorType", "strideList", 
		"stridedLayout", "rankedMemrefType", "unrankedMemrefType", "memrefType", 
		"type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "','", "'::'", "'#'", "'<'", "'>'", "'{'", 
		"'}'", "'='", "'('", "')'", "':'", "'['", "']'", "'loc'", "'unknown'", 
		"'?'", "'none'", "'index'", "'f16'", "'bf16'", "'f32'", "'f64'", "'complex'", 
		"'tuple'", "'->'", "'tensor'", "'offset:'", "'strides:'", "'memref'", 
		null, "'*x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "RANKED_DIMENSION", "UNRANKED_DIMENSION", 
		"DECIMAL_LITERAL", "FLOAT_PRECISION", "VALUE_ID", "CARET_ID", "SYMBOL_REF_ELEMENT", 
		"SIGNED_INT_TYPE", "UNSIGNED_INT_TYPE", "SIGNLESS_INT_TYPE", "BARE_ID", 
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_ID || _la==STRING_LITERAL) {
				{
				{
				setState(110);
				operation();
				}
				}
				setState(115);
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
			setState(116);
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
			setState(121);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
			setState(123);
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
			setState(125);
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
			setState(127);
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
			setState(129);
			((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
				}
				}
				setState(136);
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
			setState(137);
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
			setState(139);
			((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
			((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(140);
				match(T__3);
				setState(141);
				((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
				((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
				}
				}
				setState(146);
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
			setState(147);
			((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
			((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(148);
				match(T__2);
				setState(149);
				((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
				((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
				}
				}
				setState(154);
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
			setState(155);
			((ValueUseContext)_localctx).value = match(VALUE_ID);
			setState(158);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(156);
				match(T__4);
				setState(157);
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
			setState(160);
			((ValueUseListContext)_localctx).valueUse = valueUse();
			((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(161);
				match(T__2);
				setState(162);
				((ValueUseListContext)_localctx).valueUse = valueUse();
				((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
				}
				}
				setState(167);
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
			setState(168);
			match(T__5);
			setState(169);
			dictionaryAttribute();
			setState(170);
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
			setState(172);
			match(T__7);
			setState(181);
			_la = _input.LA(1);
			if (_la==BARE_ID) {
				{
				setState(173);
				attributesEntry();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(174);
					match(T__2);
					setState(175);
					attributesEntry();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(183);
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
			setState(185);
			attributesProperty();
			setState(186);
			match(T__9);
			setState(191);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				{
				setState(187);
				integerLiteral();
				}
				break;
			case FLOAT_PRECISION:
				{
				setState(188);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				{
				setState(189);
				stringLiteral();
				}
				break;
			case T__0:
			case T__1:
				{
				setState(190);
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
			setState(193);
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
			setState(195);
			match(T__7);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				operation();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE_ID || _la==STRING_LITERAL );
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET_ID) {
				{
				{
				setState(201);
				block();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
			setState(209);
			match(T__10);
			setState(210);
			region();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(211);
				match(T__2);
				setState(212);
				region();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
			setState(221);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(220);
				opResultList();
				}
			}

			setState(223);
			genericOperation();
			setState(225);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(224);
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
			setState(227);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(228);
			match(T__10);
			setState(230);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(229);
				valueUseList();
				}
			}

			setState(232);
			match(T__11);
			setState(234);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(233);
				successorList();
				}
			}

			setState(237);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(236);
				dictionaryProperties();
				}
			}

			setState(240);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(239);
				regionList();
				}
			}

			setState(243);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(242);
				dictionaryAttribute();
				}
			}

			setState(245);
			match(T__12);
			setState(246);
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
			setState(248);
			match(T__13);
			setState(249);
			successor();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(250);
				match(T__2);
				setState(251);
				successor();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
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
			setState(259);
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
			setState(261);
			((OpResultContext)_localctx).value = match(VALUE_ID);
			setState(264);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(262);
				match(T__12);
				setState(263);
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
			setState(266);
			opResult();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(267);
				match(T__2);
				setState(268);
				opResult();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
			setState(276);
			match(T__15);
			setState(277);
			match(T__10);
			setState(278);
			location();
			setState(279);
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
			setState(287);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new KnownLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(281);
				((KnownLocationContext)_localctx).file = match(STRING_LITERAL);
				setState(282);
				match(T__12);
				setState(283);
				((KnownLocationContext)_localctx).line = match(DECIMAL_LITERAL);
				setState(284);
				match(T__12);
				setState(285);
				((KnownLocationContext)_localctx).col = match(DECIMAL_LITERAL);
				}
				}
				break;
			case T__16:
				_localctx = new UnknownLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
			setState(289);
			((ValueIdAndTypeContext)_localctx).valueId = match(VALUE_ID);
			setState(290);
			match(T__12);
			setState(291);
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
			setState(293);
			((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
			((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(294);
				match(T__2);
				setState(295);
				((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
				((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
				}
				}
				setState(300);
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
			setState(301);
			match(T__10);
			setState(303);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(302);
				((BlockArgListContext)_localctx).args = valueIdAndTypeList();
				}
			}

			setState(305);
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
			setState(307);
			((BlockLabelContext)_localctx).blockId = match(CARET_ID);
			setState(309);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(308);
				blockArgList();
				}
			}

			setState(311);
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
			setState(313);
			blockLabel();
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314);
				operation();
				}
				}
				setState(317); 
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
			setState(321);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				decimalLiteral();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
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
		public Token RANKED_DIMENSION;
		public List<Token> value = new ArrayList<Token>();
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
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(323);
				((DimensionListRankedContext)_localctx).RANKED_DIMENSION = match(RANKED_DIMENSION);
				((DimensionListRankedContext)_localctx).value.add(((DimensionListRankedContext)_localctx).RANKED_DIMENSION);
				}
				}
				setState(328);
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
			setState(329);
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
			setState(331);
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
			setState(333);
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
			setState(335);
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
			setState(337);
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
			setState(339);
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
			setState(341);
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
			setState(346);
			switch (_input.LA(1)) {
			case SIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				signedIntegerType();
				}
				break;
			case UNSIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				unsignedIntegerType();
				}
				break;
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
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
			setState(348);
			match(T__24);
			setState(349);
			match(T__5);
			setState(350);
			type();
			setState(351);
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
			setState(353);
			match(T__25);
			setState(354);
			match(T__5);
			setState(355);
			type();
			setState(356);
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
			setState(360);
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
				setState(358);
				type();
				}
				break;
			case T__10:
				{
				setState(359);
				typeListParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(362);
			match(T__26);
			setState(365);
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
				setState(363);
				type();
				}
				break;
			case T__10:
				{
				setState(364);
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
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(T__10);
				setState(368);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(T__10);
				{
				setState(370);
				((TypeListParensContext)_localctx).type = type();
				((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(371);
					match(T__2);
					setState(372);
					((TypeListParensContext)_localctx).type = type();
					((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(378);
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
			setState(384);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
			setState(386);
			match(T__27);
			setState(387);
			match(T__5);
			setState(388);
			dimensionListUnranked();
			setState(389);
			tensorMemrefElementType();
			setState(390);
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
			setState(392);
			match(T__27);
			setState(393);
			match(T__5);
			setState(394);
			dimensionListRanked();
			setState(395);
			tensorMemrefElementType();
			setState(396);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				unrankedTensorType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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
		enterRule(_localctx, 98, RULE_strideList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__13);
			setState(411);
			_la = _input.LA(1);
			if (_la==T__17 || _la==DECIMAL_LITERAL) {
				{
				setState(403);
				dimension();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(404);
					match(T__2);
					setState(405);
					dimension();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(413);
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
		enterRule(_localctx, 100, RULE_stridedLayout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__28);
			setState(416);
			dimension();
			setState(417);
			match(T__2);
			setState(418);
			match(T__29);
			setState(419);
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
		enterRule(_localctx, 102, RULE_rankedMemrefType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__30);
			setState(422);
			match(T__5);
			setState(423);
			dimensionListRanked();
			setState(424);
			tensorMemrefElementType();
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(425);
				match(T__2);
				setState(426);
				stridedLayout();
				}
				break;
			}
			setState(431);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(429);
				match(T__2);
				setState(430);
				integerLiteral();
				}
			}

			setState(433);
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
		enterRule(_localctx, 104, RULE_unrankedMemrefType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__30);
			setState(436);
			match(T__5);
			setState(437);
			dimensionListUnranked();
			setState(438);
			tensorMemrefElementType();
			setState(441);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(439);
				match(T__2);
				setState(440);
				integerLiteral();
				}
			}

			setState(443);
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
		enterRule(_localctx, 106, RULE_memrefType);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				unrankedMemrefType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
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
		enterRule(_localctx, 108, RULE_type);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				noneType();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				indexType();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				integerType();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				complexType();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				tupleType();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u01cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\3\3\3\3\4\3\4\3\4\5\4|\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b\u0087"+
		"\n\b\f\b\16\b\u008a\13\b\3\t\3\t\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094"+
		"\13\n\3\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f\3\f\3"+
		"\f\5\f\u00a1\n\f\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13"+
		"\17\5\17\u00b8\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c2"+
		"\n\20\3\21\3\21\3\22\3\22\6\22\u00c8\n\22\r\22\16\22\u00c9\3\22\7\22\u00cd"+
		"\n\22\f\22\16\22\u00d0\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00d8"+
		"\n\23\f\23\16\23\u00db\13\23\3\23\3\23\3\24\5\24\u00e0\n\24\3\24\3\24"+
		"\5\24\u00e4\n\24\3\25\3\25\3\25\5\25\u00e9\n\25\3\25\3\25\5\25\u00ed\n"+
		"\25\3\25\5\25\u00f0\n\25\3\25\5\25\u00f3\n\25\3\25\5\25\u00f6\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00ff\n\26\f\26\16\26\u0102\13\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u010b\n\30\3\31\3\31\3\31\7\31"+
		"\u0110\n\31\f\31\16\31\u0113\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0122\n\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u012b\n\35\f\35\16\35\u012e\13\35\3\36\3\36\5\36\u0132"+
		"\n\36\3\36\3\36\3\37\3\37\5\37\u0138\n\37\3\37\3\37\3 \3 \6 \u013e\n "+
		"\r \16 \u013f\3!\3!\5!\u0144\n!\3\"\7\"\u0147\n\"\f\"\16\"\u014a\13\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\5*\u015d\n*\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\5-\u016b\n-\3-\3-\3-\5-\u0170\n-\3.\3"+
		".\3.\3.\3.\3.\7.\u0178\n.\f.\16.\u017b\13.\3.\3.\5.\u017f\n.\3/\3/\5/"+
		"\u0183\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\5\62\u0193\n\62\3\63\3\63\3\63\3\63\7\63\u0199\n\63\f\63\16"+
		"\63\u019c\13\63\5\63\u019e\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01ae\n\65\3\65\3\65\5\65\u01b2\n"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01bc\n\66\3\66\3\66"+
		"\3\67\3\67\5\67\u01c2\n\67\38\38\38\38\38\38\38\58\u01cb\n8\38\2\29\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjln\2\4\3\2\3\4\3\2\27\32\u01c9\2s\3\2\2\2\4v\3\2\2\2\6"+
		"{\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2\16\u0083\3\2\2\2\20"+
		"\u008b\3\2\2\2\22\u008d\3\2\2\2\24\u0095\3\2\2\2\26\u009d\3\2\2\2\30\u00a2"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00ae\3\2\2\2\36\u00bb\3\2\2\2 \u00c3\3\2"+
		"\2\2\"\u00c5\3\2\2\2$\u00d3\3\2\2\2&\u00df\3\2\2\2(\u00e5\3\2\2\2*\u00fa"+
		"\3\2\2\2,\u0105\3\2\2\2.\u0107\3\2\2\2\60\u010c\3\2\2\2\62\u0116\3\2\2"+
		"\2\64\u0121\3\2\2\2\66\u0123\3\2\2\28\u0127\3\2\2\2:\u012f\3\2\2\2<\u0135"+
		"\3\2\2\2>\u013b\3\2\2\2@\u0143\3\2\2\2B\u0148\3\2\2\2D\u014b\3\2\2\2F"+
		"\u014d\3\2\2\2H\u014f\3\2\2\2J\u0151\3\2\2\2L\u0153\3\2\2\2N\u0155\3\2"+
		"\2\2P\u0157\3\2\2\2R\u015c\3\2\2\2T\u015e\3\2\2\2V\u0163\3\2\2\2X\u016a"+
		"\3\2\2\2Z\u017e\3\2\2\2\\\u0182\3\2\2\2^\u0184\3\2\2\2`\u018a\3\2\2\2"+
		"b\u0192\3\2\2\2d\u0194\3\2\2\2f\u01a1\3\2\2\2h\u01a7\3\2\2\2j\u01b5\3"+
		"\2\2\2l\u01c1\3\2\2\2n\u01ca\3\2\2\2pr\5&\24\2qp\3\2\2\2ru\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2t\3\3\2\2\2us\3\2\2\2vw\7$\2\2w\5\3\2\2\2x|\7$\2\2yz\7"+
		"/\2\2z|\b\4\1\2{x\3\2\2\2{y\3\2\2\2|\7\3\2\2\2}~\7%\2\2~\t\3\2\2\2\177"+
		"\u0080\7\60\2\2\u0080\13\3\2\2\2\u0081\u0082\t\2\2\2\u0082\r\3\2\2\2\u0083"+
		"\u0088\7,\2\2\u0084\u0085\7\5\2\2\u0085\u0087\7,\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\17"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c\21\3\2\2\2\u008d"+
		"\u0092\7(\2\2\u008e\u008f\7\6\2\2\u008f\u0091\7(\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009a\7&\2\2\u0096\u0097\7\5\2\2\u0097"+
		"\u0099\7&\2\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0"+
		"\7&\2\2\u009e\u009f\7\7\2\2\u009f\u00a1\7$\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a7\5\26\f\2\u00a3\u00a4\7\5\2"+
		"\2\u00a4\u00a6\5\26\f\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\t\2\2\u00ad"+
		"\33\3\2\2\2\u00ae\u00b7\7\n\2\2\u00af\u00b4\5\36\20\2\u00b0\u00b1\7\5"+
		"\2\2\u00b1\u00b3\5\36\20\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7\13\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\5 \21\2\u00bc\u00c1\7\f\2"+
		"\2\u00bd\u00c2\5\6\4\2\u00be\u00c2\5\b\5\2\u00bf\u00c2\5\n\6\2\u00c0\u00c2"+
		"\5\f\7\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4!\3\2\2\2\u00c5"+
		"\u00c7\7\n\2\2\u00c6\u00c8\5&\24\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb"+
		"\u00cd\5> \2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\7\13\2\2\u00d2#\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d9\5\"\22\2\u00d5"+
		"\u00d6\7\5\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd%\3\2\2\2\u00de\u00e0\5\60\31"+
		"\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3"+
		"\5(\25\2\u00e2\u00e4\5\62\32\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e4\'\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6\u00e8\7\r\2\2\u00e7\u00e9"+
		"\5\30\r\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2"+
		"\u00ea\u00ec\7\16\2\2\u00eb\u00ed\5*\26\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\5\32\16\2\u00ef\u00ee\3\2\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\5$\23\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\34\17\2"+
		"\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\7\17\2\2\u00f8\u00f9\5X-\2\u00f9)\3\2\2\2\u00fa\u00fb\7\20\2\2\u00fb"+
		"\u0100\5,\27\2\u00fc\u00fd\7\5\2\2\u00fd\u00ff\5,\27\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\21\2\2\u0104+\3\2\2\2"+
		"\u0105\u0106\7\'\2\2\u0106-\3\2\2\2\u0107\u010a\7&\2\2\u0108\u0109\7\17"+
		"\2\2\u0109\u010b\5\6\4\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"/\3\2\2\2\u010c\u0111\5.\30\2\u010d\u010e\7\5\2\2\u010e\u0110\5.\30\2"+
		"\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\f\2\2\u0115"+
		"\61\3\2\2\2\u0116\u0117\7\22\2\2\u0117\u0118\7\r\2\2\u0118\u0119\5\64"+
		"\33\2\u0119\u011a\7\16\2\2\u011a\63\3\2\2\2\u011b\u011c\7\60\2\2\u011c"+
		"\u011d\7\17\2\2\u011d\u011e\7$\2\2\u011e\u011f\7\17\2\2\u011f\u0122\7"+
		"$\2\2\u0120\u0122\7\23\2\2\u0121\u011b\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\65\3\2\2\2\u0123\u0124\7&\2\2\u0124\u0125\7\17\2\2\u0125\u0126\5n8\2"+
		"\u0126\67\3\2\2\2\u0127\u012c\5\66\34\2\u0128\u0129\7\5\2\2\u0129\u012b"+
		"\5\66\34\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d9\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\7"+
		"\r\2\2\u0130\u0132\58\35\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\7\16\2\2\u0134;\3\2\2\2\u0135\u0137\7\'\2\2"+
		"\u0136\u0138\5:\36\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013a\7\17\2\2\u013a=\3\2\2\2\u013b\u013d\5<\37\2\u013c"+
		"\u013e\5&\24\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140?\3\2\2\2\u0141\u0144\5\4\3\2\u0142\u0144"+
		"\7\24\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144A\3\2\2\2\u0145"+
		"\u0147\7\"\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149C\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\7#\2\2\u014cE\3\2\2\2\u014d\u014e\7\25\2\2\u014eG\3\2\2\2\u014f\u0150"+
		"\7\26\2\2\u0150I\3\2\2\2\u0151\u0152\t\3\2\2\u0152K\3\2\2\2\u0153\u0154"+
		"\7)\2\2\u0154M\3\2\2\2\u0155\u0156\7*\2\2\u0156O\3\2\2\2\u0157\u0158\7"+
		"+\2\2\u0158Q\3\2\2\2\u0159\u015d\5L\'\2\u015a\u015d\5N(\2\u015b\u015d"+
		"\5P)\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d"+
		"S\3\2\2\2\u015e\u015f\7\33\2\2\u015f\u0160\7\b\2\2\u0160\u0161\5n8\2\u0161"+
		"\u0162\7\t\2\2\u0162U\3\2\2\2\u0163\u0164\7\34\2\2\u0164\u0165\7\b\2\2"+
		"\u0165\u0166\5n8\2\u0166\u0167\7\t\2\2\u0167W\3\2\2\2\u0168\u016b\5n8"+
		"\2\u0169\u016b\5Z.\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016f\7\35\2\2\u016d\u0170\5n8\2\u016e\u0170\5Z.\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170Y\3\2\2\2\u0171\u0172\7\r\2\2"+
		"\u0172\u017f\7\16\2\2\u0173\u0174\7\r\2\2\u0174\u0179\5n8\2\u0175\u0176"+
		"\7\5\2\2\u0176\u0178\5n8\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017c\u017d\7\16\2\2\u017d\u017f\3\2\2\2\u017e\u0171\3\2\2\2\u017e"+
		"\u0173\3\2\2\2\u017f[\3\2\2\2\u0180\u0183\5J&\2\u0181\u0183\5R*\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183]\3\2\2\2\u0184\u0185\7\36\2\2"+
		"\u0185\u0186\7\b\2\2\u0186\u0187\5D#\2\u0187\u0188\5\\/\2\u0188\u0189"+
		"\7\t\2\2\u0189_\3\2\2\2\u018a\u018b\7\36\2\2\u018b\u018c\7\b\2\2\u018c"+
		"\u018d\5B\"\2\u018d\u018e\5\\/\2\u018e\u018f\7\t\2\2\u018fa\3\2\2\2\u0190"+
		"\u0193\5^\60\2\u0191\u0193\5`\61\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2"+
		"\2\2\u0193c\3\2\2\2\u0194\u019d\7\20\2\2\u0195\u019a\5@!\2\u0196\u0197"+
		"\7\5\2\2\u0197\u0199\5@!\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u0195\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\21\2\2\u01a0e\3\2\2\2\u01a1\u01a2\7\37\2\2\u01a2\u01a3\5@!\2"+
		"\u01a3\u01a4\7\5\2\2\u01a4\u01a5\7 \2\2\u01a5\u01a6\5d\63\2\u01a6g\3\2"+
		"\2\2\u01a7\u01a8\7!\2\2\u01a8\u01a9\7\b\2\2\u01a9\u01aa\5B\"\2\u01aa\u01ad"+
		"\5\\/\2\u01ab\u01ac\7\5\2\2\u01ac\u01ae\5f\64\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01b0\7\5\2\2\u01b0\u01b2\5\6"+
		"\4\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7\t\2\2\u01b4i\3\2\2\2\u01b5\u01b6\7!\2\2\u01b6\u01b7\7\b\2\2\u01b7"+
		"\u01b8\5D#\2\u01b8\u01bb\5\\/\2\u01b9\u01ba\7\5\2\2\u01ba\u01bc\5\6\4"+
		"\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\7\t\2\2\u01bek\3\2\2\2\u01bf\u01c2\5j\66\2\u01c0\u01c2\5h\65\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2m\3\2\2\2\u01c3\u01cb\5F$\2\u01c4"+
		"\u01cb\5H%\2\u01c5\u01cb\5J&\2\u01c6\u01cb\5R*\2\u01c7\u01cb\5T+\2\u01c8"+
		"\u01cb\5V,\2\u01c9\u01cb\5b\62\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2"+
		"\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbo\3\2\2\2.s{\u0088\u0092\u009a\u00a0"+
		"\u00a7\u00b4\u00b7\u00c1\u00c9\u00ce\u00d9\u00df\u00e3\u00e8\u00ec\u00ef"+
		"\u00f2\u00f5\u0100\u010a\u0111\u0121\u012c\u0131\u0137\u013f\u0143\u0148"+
		"\u015c\u016a\u016f\u0179\u017e\u0182\u0192\u019a\u019d\u01ad\u01b1\u01bb"+
		"\u01c1\u01ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}