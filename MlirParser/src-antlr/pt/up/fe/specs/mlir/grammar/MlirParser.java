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
		T__24=25, T__25=26, T__26=27, DECIMAL_LITERAL=28, FLOAT_PRECISION=29, 
		VALUE_ID=30, CARET_ID=31, SYMBOL_REF_ELEMENT=32, SIGNED_INT_TYPE=33, UNSIGNED_INT_TYPE=34, 
		SIGNLESS_INT_TYPE=35, BARE_ID=36, RANKED_DIMENSION=37, UNRANKED_DIMENSION=38, 
		WS=39, LINE_COMMENT=40, HEX_LITERAL=41, STRING_LITERAL=42;
	public static final int
		RULE_root = 0, RULE_integerLiteral = 1, RULE_floatLiteral = 2, RULE_stringLiteral = 3, 
		RULE_booleanLiteral = 4, RULE_bareIdList = 5, RULE_aliasName = 6, RULE_symbolRefId = 7, 
		RULE_valueIdList = 8, RULE_valueUse = 9, RULE_valueUseList = 10, RULE_dictionaryProperties = 11, 
		RULE_dictionaryAttribute = 12, RULE_attributesEntry = 13, RULE_attributesProperty = 14, 
		RULE_region = 15, RULE_regionList = 16, RULE_operation = 17, RULE_genericOperation = 18, 
		RULE_successorList = 19, RULE_successor = 20, RULE_opResult = 21, RULE_opResultList = 22, 
		RULE_trailingLocation = 23, RULE_location = 24, RULE_valueIdAndType = 25, 
		RULE_valueIdAndTypeList = 26, RULE_blockArgList = 27, RULE_blockLabel = 28, 
		RULE_block = 29, RULE_dimensionListRanked = 30, RULE_dimensionListUnranked = 31, 
		RULE_noneType = 32, RULE_indexType = 33, RULE_floatType = 34, RULE_signedIntegerType = 35, 
		RULE_unsignedIntegerType = 36, RULE_signlessIntegerType = 37, RULE_integerType = 38, 
		RULE_complexType = 39, RULE_tupleType = 40, RULE_functionType = 41, RULE_typeListParens = 42, 
		RULE_tensorElementType = 43, RULE_unrankedTensorType = 44, RULE_rankedTensorType = 45, 
		RULE_tensorType = 46, RULE_type = 47;
	public static final String[] ruleNames = {
		"root", "integerLiteral", "floatLiteral", "stringLiteral", "booleanLiteral", 
		"bareIdList", "aliasName", "symbolRefId", "valueIdList", "valueUse", "valueUseList", 
		"dictionaryProperties", "dictionaryAttribute", "attributesEntry", "attributesProperty", 
		"region", "regionList", "operation", "genericOperation", "successorList", 
		"successor", "opResult", "opResultList", "trailingLocation", "location", 
		"valueIdAndType", "valueIdAndTypeList", "blockArgList", "blockLabel", 
		"block", "dimensionListRanked", "dimensionListUnranked", "noneType", "indexType", 
		"floatType", "signedIntegerType", "unsignedIntegerType", "signlessIntegerType", 
		"integerType", "complexType", "tupleType", "functionType", "typeListParens", 
		"tensorElementType", "unrankedTensorType", "rankedTensorType", "tensorType", 
		"type"
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_ID || _la==STRING_LITERAL) {
				{
				{
				setState(96);
				operation();
				}
				}
				setState(101);
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
		enterRule(_localctx, 2, RULE_integerLiteral);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
		enterRule(_localctx, 4, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 6, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 8, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		enterRule(_localctx, 10, RULE_bareIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(114);
				match(T__2);
				setState(115);
				((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
				}
				}
				setState(120);
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
		enterRule(_localctx, 12, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 14, RULE_symbolRefId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
			((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(124);
				match(T__3);
				setState(125);
				((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
				((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
				}
				}
				setState(130);
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
		enterRule(_localctx, 16, RULE_valueIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
			((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
				((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
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
		enterRule(_localctx, 18, RULE_valueUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((ValueUseContext)_localctx).value = match(VALUE_ID);
			setState(142);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(140);
				match(T__4);
				setState(141);
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
		enterRule(_localctx, 20, RULE_valueUseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ValueUseListContext)_localctx).valueUse = valueUse();
			((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(145);
				match(T__2);
				setState(146);
				((ValueUseListContext)_localctx).valueUse = valueUse();
				((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
				}
				}
				setState(151);
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
		enterRule(_localctx, 22, RULE_dictionaryProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__5);
			setState(153);
			dictionaryAttribute();
			setState(154);
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
		enterRule(_localctx, 24, RULE_dictionaryAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__7);
			setState(165);
			_la = _input.LA(1);
			if (_la==BARE_ID) {
				{
				setState(157);
				attributesEntry();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(158);
					match(T__2);
					setState(159);
					attributesEntry();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
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
		enterRule(_localctx, 26, RULE_attributesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			attributesProperty();
			setState(170);
			match(T__9);
			setState(175);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				{
				setState(171);
				integerLiteral();
				}
				break;
			case FLOAT_PRECISION:
				{
				setState(172);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				{
				setState(173);
				stringLiteral();
				}
				break;
			case T__0:
			case T__1:
				{
				setState(174);
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
		enterRule(_localctx, 28, RULE_attributesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 30, RULE_region);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__7);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				operation();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE_ID || _la==STRING_LITERAL );
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET_ID) {
				{
				{
				setState(185);
				block();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		enterRule(_localctx, 32, RULE_regionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__10);
			setState(194);
			region();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(195);
				match(T__2);
				setState(196);
				region();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
		enterRule(_localctx, 34, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(204);
				opResultList();
				}
			}

			setState(207);
			genericOperation();
			setState(209);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(208);
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
		enterRule(_localctx, 36, RULE_genericOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(212);
			match(T__10);
			setState(214);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(213);
				valueUseList();
				}
			}

			setState(216);
			match(T__11);
			setState(218);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(217);
				successorList();
				}
			}

			setState(221);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(220);
				dictionaryProperties();
				}
			}

			setState(224);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(223);
				regionList();
				}
			}

			setState(227);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(226);
				dictionaryAttribute();
				}
			}

			setState(229);
			match(T__12);
			setState(230);
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
		enterRule(_localctx, 38, RULE_successorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__13);
			setState(233);
			successor();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(234);
				match(T__2);
				setState(235);
				successor();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		enterRule(_localctx, 40, RULE_successor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 42, RULE_opResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((OpResultContext)_localctx).value = match(VALUE_ID);
			setState(248);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(246);
				match(T__12);
				setState(247);
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
		enterRule(_localctx, 44, RULE_opResultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			opResult();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(251);
				match(T__2);
				setState(252);
				opResult();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
		enterRule(_localctx, 46, RULE_trailingLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__15);
			setState(261);
			match(T__10);
			setState(262);
			location();
			setState(263);
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
		enterRule(_localctx, 48, RULE_location);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new KnownLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(265);
				((KnownLocationContext)_localctx).file = match(STRING_LITERAL);
				setState(266);
				match(T__12);
				setState(267);
				((KnownLocationContext)_localctx).line = match(DECIMAL_LITERAL);
				setState(268);
				match(T__12);
				setState(269);
				((KnownLocationContext)_localctx).col = match(DECIMAL_LITERAL);
				}
				}
				break;
			case T__16:
				_localctx = new UnknownLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
		enterRule(_localctx, 50, RULE_valueIdAndType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((ValueIdAndTypeContext)_localctx).valueId = match(VALUE_ID);
			setState(274);
			match(T__12);
			setState(275);
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
		enterRule(_localctx, 52, RULE_valueIdAndTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
			((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(278);
				match(T__2);
				setState(279);
				((ValueIdAndTypeListContext)_localctx).valueIdAndType = valueIdAndType();
				((ValueIdAndTypeListContext)_localctx).values.add(((ValueIdAndTypeListContext)_localctx).valueIdAndType);
				}
				}
				setState(284);
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
		enterRule(_localctx, 54, RULE_blockArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__10);
			setState(287);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(286);
				((BlockArgListContext)_localctx).args = valueIdAndTypeList();
				}
			}

			setState(289);
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
		enterRule(_localctx, 56, RULE_blockLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((BlockLabelContext)_localctx).blockId = match(CARET_ID);
			setState(293);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(292);
				blockArgList();
				}
			}

			setState(295);
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
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			blockLabel();
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				operation();
				}
				}
				setState(301); 
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

	public static class DimensionListRankedContext extends ParserRuleContext {
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
		enterRule(_localctx, 60, RULE_dimensionListRanked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(303);
				match(RANKED_DIMENSION);
				}
				}
				setState(308);
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
		enterRule(_localctx, 62, RULE_dimensionListUnranked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(UNRANKED_DIMENSION);
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
		enterRule(_localctx, 64, RULE_noneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((NoneTypeContext)_localctx).value = match(T__17);
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
		enterRule(_localctx, 66, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((IndexTypeContext)_localctx).value = match(T__18);
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
		enterRule(_localctx, 68, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((FloatTypeContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_signedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 72, RULE_unsignedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 74, RULE_signlessIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 76, RULE_integerType);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case SIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				signedIntegerType();
				}
				break;
			case UNSIGNED_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				unsignedIntegerType();
				}
				break;
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
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
		enterRule(_localctx, 78, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__23);
			setState(329);
			match(T__5);
			setState(330);
			type();
			setState(331);
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
		enterRule(_localctx, 80, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__24);
			setState(334);
			match(T__5);
			setState(335);
			type();
			setState(336);
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
		enterRule(_localctx, 82, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				{
				setState(338);
				type();
				}
				break;
			case T__10:
				{
				setState(339);
				typeListParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			match(T__25);
			setState(345);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				{
				setState(343);
				type();
				}
				break;
			case T__10:
				{
				setState(344);
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
		enterRule(_localctx, 84, RULE_typeListParens);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(T__10);
				setState(348);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(T__10);
				{
				setState(350);
				((TypeListParensContext)_localctx).type = type();
				((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(351);
					match(T__2);
					setState(352);
					((TypeListParensContext)_localctx).type = type();
					((TypeListParensContext)_localctx).values.add(((TypeListParensContext)_localctx).type);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(358);
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

	public static class TensorElementTypeContext extends ParserRuleContext {
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public TensorElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensorElementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTensorElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTensorElementType(this);
		}
	}

	public final TensorElementTypeContext tensorElementType() throws RecognitionException {
		TensorElementTypeContext _localctx = new TensorElementTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tensorElementType);
		try {
			setState(364);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
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
		public TensorElementTypeContext tensorElementType() {
			return getRuleContext(TensorElementTypeContext.class,0);
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
		enterRule(_localctx, 88, RULE_unrankedTensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__26);
			setState(367);
			match(T__5);
			setState(368);
			dimensionListUnranked();
			setState(369);
			tensorElementType();
			setState(370);
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
		public TensorElementTypeContext tensorElementType() {
			return getRuleContext(TensorElementTypeContext.class,0);
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
		enterRule(_localctx, 90, RULE_rankedTensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__26);
			setState(373);
			match(T__5);
			setState(374);
			dimensionListRanked();
			setState(375);
			tensorElementType();
			setState(376);
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
		enterRule(_localctx, 92, RULE_tensorType);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				unrankedTensorType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
		enterRule(_localctx, 94, RULE_type);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				noneType();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				indexType();
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				floatType();
				}
				break;
			case SIGNED_INT_TYPE:
			case UNSIGNED_INT_TYPE:
			case SIGNLESS_INT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				integerType();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				complexType();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				tupleType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u018a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7w\n\7\f\7"+
		"\16\7z\13\7\3\b\3\b\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084\13\t\3\n"+
		"\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\3\13\5\13\u0091\n"+
		"\13\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\5\16\u00a8\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\21"+
		"\3\21\6\21\u00b8\n\21\r\21\16\21\u00b9\3\21\7\21\u00bd\n\21\f\21\16\21"+
		"\u00c0\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c8\n\22\f\22\16\22"+
		"\u00cb\13\22\3\22\3\22\3\23\5\23\u00d0\n\23\3\23\3\23\5\23\u00d4\n\23"+
		"\3\24\3\24\3\24\5\24\u00d9\n\24\3\24\3\24\5\24\u00dd\n\24\3\24\5\24\u00e0"+
		"\n\24\3\24\5\24\u00e3\n\24\3\24\5\24\u00e6\n\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\7\25\u00ef\n\25\f\25\16\25\u00f2\13\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\7\30\u0100\n\30\f\30"+
		"\16\30\u0103\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34"+
		"\u011b\n\34\f\34\16\34\u011e\13\34\3\35\3\35\5\35\u0122\n\35\3\35\3\35"+
		"\3\36\3\36\5\36\u0128\n\36\3\36\3\36\3\37\3\37\6\37\u012e\n\37\r\37\16"+
		"\37\u012f\3 \7 \u0133\n \f \16 \u0136\13 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3(\5(\u0149\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3+\3+\5+\u0157\n+\3+\3+\3+\5+\u015c\n+\3,\3,\3,\3,\3,\3,\7,\u0164\n,"+
		"\f,\16,\u0167\13,\3,\3,\5,\u016b\n,\3-\3-\5-\u016f\n-\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3\60\3\60\5\60\u017f\n\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0188\n\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\4\3\2\3\4\3\2\26\31"+
		"\u0186\2e\3\2\2\2\4k\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\nq\3\2\2\2\fs\3\2\2"+
		"\2\16{\3\2\2\2\20}\3\2\2\2\22\u0085\3\2\2\2\24\u008d\3\2\2\2\26\u0092"+
		"\3\2\2\2\30\u009a\3\2\2\2\32\u009e\3\2\2\2\34\u00ab\3\2\2\2\36\u00b3\3"+
		"\2\2\2 \u00b5\3\2\2\2\"\u00c3\3\2\2\2$\u00cf\3\2\2\2&\u00d5\3\2\2\2(\u00ea"+
		"\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2.\u00fc\3\2\2\2\60\u0106\3\2\2\2"+
		"\62\u0111\3\2\2\2\64\u0113\3\2\2\2\66\u0117\3\2\2\28\u011f\3\2\2\2:\u0125"+
		"\3\2\2\2<\u012b\3\2\2\2>\u0134\3\2\2\2@\u0137\3\2\2\2B\u0139\3\2\2\2D"+
		"\u013b\3\2\2\2F\u013d\3\2\2\2H\u013f\3\2\2\2J\u0141\3\2\2\2L\u0143\3\2"+
		"\2\2N\u0148\3\2\2\2P\u014a\3\2\2\2R\u014f\3\2\2\2T\u0156\3\2\2\2V\u016a"+
		"\3\2\2\2X\u016e\3\2\2\2Z\u0170\3\2\2\2\\\u0176\3\2\2\2^\u017e\3\2\2\2"+
		"`\u0187\3\2\2\2bd\5$\23\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\3\3"+
		"\2\2\2ge\3\2\2\2hl\7\36\2\2ij\7+\2\2jl\b\3\1\2kh\3\2\2\2ki\3\2\2\2l\5"+
		"\3\2\2\2mn\7\37\2\2n\7\3\2\2\2op\7,\2\2p\t\3\2\2\2qr\t\2\2\2r\13\3\2\2"+
		"\2sx\7&\2\2tu\7\5\2\2uw\7&\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y\r\3\2\2\2zx\3\2\2\2{|\7&\2\2|\17\3\2\2\2}\u0082\7\"\2\2~\177\7\6\2\2"+
		"\177\u0081\7\"\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a"+
		"\7 \2\2\u0086\u0087\7\5\2\2\u0087\u0089\7 \2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u0090\7 \2\2\u008e\u008f\7\7\2\2\u008f\u0091"+
		"\7\36\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092"+
		"\u0097\5\24\13\2\u0093\u0094\7\5\2\2\u0094\u0096\5\24\13\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\27\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\32\16"+
		"\2\u009c\u009d\7\t\2\2\u009d\31\3\2\2\2\u009e\u00a7\7\n\2\2\u009f\u00a4"+
		"\5\34\17\2\u00a0\u00a1\7\5\2\2\u00a1\u00a3\5\34\17\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\5\36"+
		"\20\2\u00ac\u00b1\7\f\2\2\u00ad\u00b2\5\4\3\2\u00ae\u00b2\5\6\4\2\u00af"+
		"\u00b2\5\b\5\2\u00b0\u00b2\5\n\6\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\35\3\2\2\2\u00b3\u00b4"+
		"\7&\2\2\u00b4\37\3\2\2\2\u00b5\u00b7\7\n\2\2\u00b6\u00b8\5$\23\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\5<\37\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2!\3\2\2\2\u00c3\u00c4"+
		"\7\r\2\2\u00c4\u00c9\5 \21\2\u00c5\u00c6\7\5\2\2\u00c6\u00c8\5 \21\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\16\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00d0\5.\30\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5&\24\2\u00d2\u00d4\5\60\31\2\u00d3\u00d2"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d8"+
		"\7\r\2\2\u00d7\u00d9\5\26\f\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00dc\7\16\2\2\u00db\u00dd\5(\25\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5\30\r\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3"+
		"\5\"\22\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2"+
		"\u00e4\u00e6\5\32\16\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00e9\5T+\2\u00e9\'\3\2\2\2\u00ea"+
		"\u00eb\7\20\2\2\u00eb\u00f0\5*\26\2\u00ec\u00ed\7\5\2\2\u00ed\u00ef\5"+
		"*\26\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\21"+
		"\2\2\u00f4)\3\2\2\2\u00f5\u00f6\7!\2\2\u00f6+\3\2\2\2\u00f7\u00fa\7 \2"+
		"\2\u00f8\u00f9\7\17\2\2\u00f9\u00fb\5\4\3\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb-\3\2\2\2\u00fc\u0101\5,\27\2\u00fd\u00fe\7\5\2\2"+
		"\u00fe\u0100\5,\27\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\7\f\2\2\u0105/\3\2\2\2\u0106\u0107\7\22\2\2\u0107\u0108\7\r\2\2"+
		"\u0108\u0109\5\62\32\2\u0109\u010a\7\16\2\2\u010a\61\3\2\2\2\u010b\u010c"+
		"\7,\2\2\u010c\u010d\7\17\2\2\u010d\u010e\7\36\2\2\u010e\u010f\7\17\2\2"+
		"\u010f\u0112\7\36\2\2\u0110\u0112\7\23\2\2\u0111\u010b\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\63\3\2\2\2\u0113\u0114\7 \2\2\u0114\u0115\7\17\2\2\u0115"+
		"\u0116\5`\61\2\u0116\65\3\2\2\2\u0117\u011c\5\64\33\2\u0118\u0119\7\5"+
		"\2\2\u0119\u011b\5\64\33\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\67\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011f\u0121\7\r\2\2\u0120\u0122\5\66\34\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\16\2\2\u01249\3\2\2\2"+
		"\u0125\u0127\7!\2\2\u0126\u0128\58\35\2\u0127\u0126\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\17\2\2\u012a;\3\2\2\2\u012b"+
		"\u012d\5:\36\2\u012c\u012e\5$\23\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130=\3\2\2\2\u0131\u0133"+
		"\7\'\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135?\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7(\2\2\u0138"+
		"A\3\2\2\2\u0139\u013a\7\24\2\2\u013aC\3\2\2\2\u013b\u013c\7\25\2\2\u013c"+
		"E\3\2\2\2\u013d\u013e\t\3\2\2\u013eG\3\2\2\2\u013f\u0140\7#\2\2\u0140"+
		"I\3\2\2\2\u0141\u0142\7$\2\2\u0142K\3\2\2\2\u0143\u0144\7%\2\2\u0144M"+
		"\3\2\2\2\u0145\u0149\5H%\2\u0146\u0149\5J&\2\u0147\u0149\5L\'\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149O\3\2\2\2"+
		"\u014a\u014b\7\32\2\2\u014b\u014c\7\b\2\2\u014c\u014d\5`\61\2\u014d\u014e"+
		"\7\t\2\2\u014eQ\3\2\2\2\u014f\u0150\7\33\2\2\u0150\u0151\7\b\2\2\u0151"+
		"\u0152\5`\61\2\u0152\u0153\7\t\2\2\u0153S\3\2\2\2\u0154\u0157\5`\61\2"+
		"\u0155\u0157\5V,\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015b\7\34\2\2\u0159\u015c\5`\61\2\u015a\u015c\5V,\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015cU\3\2\2\2\u015d\u015e\7\r\2\2"+
		"\u015e\u016b\7\16\2\2\u015f\u0160\7\r\2\2\u0160\u0165\5`\61\2\u0161\u0162"+
		"\7\5\2\2\u0162\u0164\5`\61\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0169\7\16\2\2\u0169\u016b\3\2\2\2\u016a\u015d\3\2\2\2\u016a"+
		"\u015f\3\2\2\2\u016bW\3\2\2\2\u016c\u016f\5F$\2\u016d\u016f\5N(\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fY\3\2\2\2\u0170\u0171\7\35\2\2"+
		"\u0171\u0172\7\b\2\2\u0172\u0173\5@!\2\u0173\u0174\5X-\2\u0174\u0175\7"+
		"\t\2\2\u0175[\3\2\2\2\u0176\u0177\7\35\2\2\u0177\u0178\7\b\2\2\u0178\u0179"+
		"\5> \2\u0179\u017a\5X-\2\u017a\u017b\7\t\2\2\u017b]\3\2\2\2\u017c\u017f"+
		"\5Z.\2\u017d\u017f\5\\/\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f"+
		"_\3\2\2\2\u0180\u0188\5B\"\2\u0181\u0188\5D#\2\u0182\u0188\5F$\2\u0183"+
		"\u0188\5N(\2\u0184\u0188\5P)\2\u0185\u0188\5R*\2\u0186\u0188\5^\60\2\u0187"+
		"\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2"+
		"\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"a\3\2\2\2\'ekx\u0082\u008a\u0090\u0097\u00a4\u00a7\u00b1\u00b9\u00be\u00c9"+
		"\u00cf\u00d3\u00d8\u00dc\u00df\u00e2\u00e5\u00f0\u00fa\u0101\u0111\u011c"+
		"\u0121\u0127\u012f\u0134\u0148\u0156\u015b\u0165\u016a\u016e\u017e\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}