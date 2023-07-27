// Generated from pt\u005Cup\fe\specs\mlir\grammar\Mlir.g4 by ANTLR 4.5.3

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
		T__24=25, T__25=26, DECIMAL_LITERAL=27, FLOAT_PRECISION=28, BARE_ID=29, 
		VALUE_ID=30, CARET_ID=31, SYMBOL_REF_ELEMENT=32, INTTYPE_WIDTH=33, RANKED_DIMENSION=34, 
		LOCATION=35, WS=36, LINE_COMMENT=37, HEX_LITERAL=38, STRING_LITERAL=39;
	public static final int
		RULE_root = 0, RULE_integerLiteral = 1, RULE_floatLiteral = 2, RULE_stringLiteral = 3, 
		RULE_bareIdList = 4, RULE_aliasName = 5, RULE_symbolRefId = 6, RULE_valueIdList = 7, 
		RULE_valueUse = 8, RULE_valueUseList = 9, RULE_idSsa = 10, RULE_dimensionListRanked = 11, 
		RULE_noneType = 12, RULE_indexType = 13, RULE_floatType = 14, RULE_signedIntegerType = 15, 
		RULE_unsignedIntegerType = 16, RULE_signlessIntegerType = 17, RULE_integerType = 18, 
		RULE_complexType = 19, RULE_tupleType = 20, RULE_tensorType = 21, RULE_type = 22, 
		RULE_operand = 23, RULE_operandList = 24, RULE_operandTypeList = 25, RULE_attributesProperty = 26, 
		RULE_attributesValue = 27, RULE_attributesEntry = 28, RULE_attributes = 29, 
		RULE_trailingLocation = 30, RULE_opResult = 31, RULE_opAttributes = 32, 
		RULE_opReturnType = 33, RULE_operation = 34, RULE_genericOperation = 35, 
		RULE_customOperation = 36;
	public static final String[] ruleNames = {
		"root", "integerLiteral", "floatLiteral", "stringLiteral", "bareIdList", 
		"aliasName", "symbolRefId", "valueIdList", "valueUse", "valueUseList", 
		"idSsa", "dimensionListRanked", "noneType", "indexType", "floatType", 
		"signedIntegerType", "unsignedIntegerType", "signlessIntegerType", "integerType", 
		"complexType", "tupleType", "tensorType", "type", "operand", "operandList", 
		"operandTypeList", "attributesProperty", "attributesValue", "attributesEntry", 
		"attributes", "trailingLocation", "opResult", "opAttributes", "opReturnType", 
		"operation", "genericOperation", "customOperation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'::'", "'#'", "'%'", "'none'", "'index'", "'f16'", "'bf16'", 
		"'f32'", "'f64'", "'si'", "'ui'", "'i'", "'complex'", "'<'", "'>'", "'tuple'", 
		"'tensor'", "'('", "')'", "'='", "'{'", "'}'", "'loc'", "':'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "DECIMAL_LITERAL", "FLOAT_PRECISION", "BARE_ID", "VALUE_ID", 
		"CARET_ID", "SYMBOL_REF_ELEMENT", "INTTYPE_WIDTH", "RANKED_DIMENSION", 
		"LOCATION", "WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << BARE_ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(74);
				operation();
				}
				}
				setState(79);
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
			setState(83);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
			setState(85);
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
			setState(87);
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
		enterRule(_localctx, 8, RULE_bareIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(90);
				match(T__0);
				setState(91);
				((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
				}
				}
				setState(96);
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
		enterRule(_localctx, 10, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 12, RULE_symbolRefId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
			((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(100);
				match(T__1);
				setState(101);
				((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
				((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
				}
				}
				setState(106);
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
		enterRule(_localctx, 14, RULE_valueIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
			((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(108);
				match(T__0);
				setState(109);
				((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
				((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
				}
				}
				setState(114);
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
		enterRule(_localctx, 16, RULE_valueUse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((ValueUseContext)_localctx).value = match(VALUE_ID);
			setState(118);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(116);
				match(T__2);
				setState(117);
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
		enterRule(_localctx, 18, RULE_valueUseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ValueUseListContext)_localctx).valueUse = valueUse();
			((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(121);
				match(T__0);
				setState(122);
				((ValueUseListContext)_localctx).valueUse = valueUse();
				((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
				}
				}
				setState(127);
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

	public static class IdSsaContext extends ParserRuleContext {
		public TerminalNode BARE_ID() { return getToken(MlirParser.BARE_ID, 0); }
		public IdSsaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSsa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIdSsa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIdSsa(this);
		}
	}

	public final IdSsaContext idSsa() throws RecognitionException {
		IdSsaContext _localctx = new IdSsaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_idSsa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__3);
			setState(129);
			match(BARE_ID);
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
		enterRule(_localctx, 22, RULE_dimensionListRanked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(131);
				match(RANKED_DIMENSION);
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

	public static class NoneTypeContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_noneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__4);
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
		enterRule(_localctx, 26, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__5);
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
		enterRule(_localctx, 28, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class SignedIntegerTypeContext extends ParserRuleContext {
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
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
		enterRule(_localctx, 30, RULE_signedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__10);
			setState(144);
			match(INTTYPE_WIDTH);
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
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
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
		enterRule(_localctx, 32, RULE_unsignedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__11);
			setState(147);
			match(INTTYPE_WIDTH);
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
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
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
		enterRule(_localctx, 34, RULE_signlessIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(150);
			match(INTTYPE_WIDTH);
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
		enterRule(_localctx, 36, RULE_integerType);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				signedIntegerType();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				unsignedIntegerType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		enterRule(_localctx, 38, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__13);
			setState(158);
			match(T__14);
			setState(159);
			type();
			setState(160);
			match(T__15);
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
		enterRule(_localctx, 40, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__16);
			setState(163);
			match(T__14);
			setState(164);
			type();
			setState(165);
			match(T__15);
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
		public DimensionListRankedContext dimensionListRanked() {
			return getRuleContext(DimensionListRankedContext.class,0);
		}
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
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
		enterRule(_localctx, 42, RULE_tensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__17);
			setState(168);
			match(T__14);
			setState(169);
			dimensionListRanked();
			setState(170);
			floatType();
			setState(171);
			match(T__15);
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
		enterRule(_localctx, 44, RULE_type);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				noneType();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				indexType();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				floatType();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				integerType();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				complexType();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				tupleType();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
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

	public static class OperandContext extends ParserRuleContext {
		public IdSsaContext idSsa() {
			return getRuleContext(IdSsaContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			idSsa();
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

	public static class OperandListContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperandList(this);
		}
	}

	public final OperandListContext operandList() throws RecognitionException {
		OperandListContext _localctx = new OperandListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__18);
			setState(185);
			operand();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(186);
				match(T__0);
				setState(187);
				operand();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__19);
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

	public static class OperandTypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public OperandTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperandTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperandTypeList(this);
		}
	}

	public final OperandTypeListContext operandTypeList() throws RecognitionException {
		OperandTypeListContext _localctx = new OperandTypeListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operandTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__18);
			setState(196);
			type();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(197);
				match(T__0);
				setState(198);
				type();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(T__19);
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
		enterRule(_localctx, 52, RULE_attributesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(BARE_ID);
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

	public static class AttributesValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(MlirParser.DECIMAL_LITERAL, 0); }
		public AttributesValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributesValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributesValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributesValue(this);
		}
	}

	public final AttributesValueContext attributesValue() throws RecognitionException {
		AttributesValueContext _localctx = new AttributesValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributesValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DECIMAL_LITERAL);
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
		public AttributesValueContext attributesValue() {
			return getRuleContext(AttributesValueContext.class,0);
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
		enterRule(_localctx, 56, RULE_attributesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			attributesProperty();
			setState(211);
			match(T__20);
			setState(212);
			attributesValue();
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributesEntryContext> attributesEntry() {
			return getRuleContexts(AttributesEntryContext.class);
		}
		public AttributesEntryContext attributesEntry(int i) {
			return getRuleContext(AttributesEntryContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__21);
			setState(215);
			attributesEntry();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(216);
				match(T__0);
				setState(217);
				attributesEntry();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__22);
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
		public TerminalNode LOCATION() { return getToken(MlirParser.LOCATION, 0); }
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
		enterRule(_localctx, 60, RULE_trailingLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__23);
			setState(226);
			match(T__18);
			setState(227);
			match(LOCATION);
			setState(228);
			match(T__19);
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
		public IdSsaContext idSsa() {
			return getRuleContext(IdSsaContext.class,0);
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
		enterRule(_localctx, 62, RULE_opResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			idSsa();
			setState(231);
			match(T__20);
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

	public static class OpAttributesContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public OpAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOpAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOpAttributes(this);
		}
	}

	public final OpAttributesContext opAttributes() throws RecognitionException {
		OpAttributesContext _localctx = new OpAttributesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_opAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			attributes();
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

	public static class OpReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OpReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOpReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOpReturnType(this);
		}
	}

	public final OpReturnTypeContext opReturnType() throws RecognitionException {
		OpReturnTypeContext _localctx = new OpReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			type();
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
		public CustomOperationContext customOperation() {
			return getRuleContext(CustomOperationContext.class,0);
		}
		public OpResultContext opResult() {
			return getRuleContext(OpResultContext.class,0);
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
		enterRule(_localctx, 68, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(237);
				opResult();
				}
			}

			setState(242);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(240);
				genericOperation();
				}
				break;
			case BARE_ID:
				{
				setState(241);
				customOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(244);
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
		public OperandListContext operandList() {
			return getRuleContext(OperandListContext.class,0);
		}
		public OpAttributesContext opAttributes() {
			return getRuleContext(OpAttributesContext.class,0);
		}
		public OperandTypeListContext operandTypeList() {
			return getRuleContext(OperandTypeListContext.class,0);
		}
		public OpReturnTypeContext opReturnType() {
			return getRuleContext(OpReturnTypeContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MlirParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 70, RULE_genericOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(248);
			operandList();
			setState(249);
			opAttributes();
			setState(250);
			match(T__24);
			setState(251);
			operandTypeList();
			setState(252);
			match(T__25);
			setState(253);
			opReturnType();
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

	public static class CustomOperationContext extends ParserRuleContext {
		public TerminalNode BARE_ID() { return getToken(MlirParser.BARE_ID, 0); }
		public CustomOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterCustomOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitCustomOperation(this);
		}
	}

	public final CustomOperationContext customOperation() throws RecognitionException {
		CustomOperationContext _localctx = new CustomOperationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_customOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BARE_ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3"+
		"\3\3\3\5\3V\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3"+
		"\7\3\7\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\7\tq\n\t\f\t\16"+
		"\tt\13\t\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081"+
		"\13\13\3\f\3\f\3\f\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\5\24\u009e\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00b7\n\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00bf\n\32\f\32\16\32\u00c2"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00ca\n\33\f\33\16\33\u00cd"+
		"\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\7\37\u00dd\n\37\f\37\16\37\u00e0\13\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3#\3#\3$\5$\u00f1\n$\3$\3$\5$\u00f5\n$\3$\5$\u00f8\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3\3\2\t\f\u00f4\2O\3\2\2\2"+
		"\4U\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20"+
		"m\3\2\2\2\22u\3\2\2\2\24z\3\2\2\2\26\u0082\3\2\2\2\30\u0088\3\2\2\2\32"+
		"\u008b\3\2\2\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 \u0091\3\2\2\2\"\u0094"+
		"\3\2\2\2$\u0097\3\2\2\2&\u009d\3\2\2\2(\u009f\3\2\2\2*\u00a4\3\2\2\2,"+
		"\u00a9\3\2\2\2.\u00b6\3\2\2\2\60\u00b8\3\2\2\2\62\u00ba\3\2\2\2\64\u00c5"+
		"\3\2\2\2\66\u00d0\3\2\2\28\u00d2\3\2\2\2:\u00d4\3\2\2\2<\u00d8\3\2\2\2"+
		">\u00e3\3\2\2\2@\u00e8\3\2\2\2B\u00eb\3\2\2\2D\u00ed\3\2\2\2F\u00f0\3"+
		"\2\2\2H\u00f9\3\2\2\2J\u0101\3\2\2\2LN\5F$\2ML\3\2\2\2NQ\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2P\3\3\2\2\2QO\3\2\2\2RV\7\35\2\2ST\7(\2\2TV\b\3\1\2UR\3"+
		"\2\2\2US\3\2\2\2V\5\3\2\2\2WX\7\36\2\2X\7\3\2\2\2YZ\7)\2\2Z\t\3\2\2\2"+
		"[`\7\37\2\2\\]\7\3\2\2]_\7\37\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2a\13\3\2\2\2b`\3\2\2\2cd\7\37\2\2d\r\3\2\2\2ej\7\"\2\2fg\7\4\2\2g"+
		"i\7\"\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2"+
		"\2mr\7 \2\2no\7\3\2\2oq\7 \2\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"s\21\3\2\2\2tr\3\2\2\2ux\7 \2\2vw\7\5\2\2wy\7\35\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y\23\3\2\2\2z\177\5\22\n\2{|\7\3\2\2|~\5\22\n\2}{\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\25\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0083\7\6\2\2\u0083\u0084\7\37\2\2\u0084\27\3\2\2\2\u0085\u0087"+
		"\7$\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\31\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\7\2"+
		"\2\u008c\33\3\2\2\2\u008d\u008e\7\b\2\2\u008e\35\3\2\2\2\u008f\u0090\t"+
		"\2\2\2\u0090\37\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7#\2\2\u0093!"+
		"\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\7#\2\2\u0096#\3\2\2\2\u0097"+
		"\u0098\7\17\2\2\u0098\u0099\7#\2\2\u0099%\3\2\2\2\u009a\u009e\5 \21\2"+
		"\u009b\u009e\5\"\22\2\u009c\u009e\5$\23\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\'\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0"+
		"\u00a1\7\21\2\2\u00a1\u00a2\5.\30\2\u00a2\u00a3\7\22\2\2\u00a3)\3\2\2"+
		"\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5.\30\2\u00a7"+
		"\u00a8\7\22\2\2\u00a8+\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7\21\2"+
		"\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7\22\2\2\u00ae"+
		"-\3\2\2\2\u00af\u00b7\5\32\16\2\u00b0\u00b7\5\34\17\2\u00b1\u00b7\5\36"+
		"\20\2\u00b2\u00b7\5&\24\2\u00b3\u00b7\5(\25\2\u00b4\u00b7\5*\26\2\u00b5"+
		"\u00b7\5,\27\2\u00b6\u00af\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2"+
		"\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7/\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\61\3\2\2\2\u00ba"+
		"\u00bb\7\25\2\2\u00bb\u00c0\5\60\31\2\u00bc\u00bd\7\3\2\2\u00bd\u00bf"+
		"\5\60\31\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4"+
		"\7\26\2\2\u00c4\63\3\2\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00cb\5.\30\2\u00c7"+
		"\u00c8\7\3\2\2\u00c8\u00ca\5.\30\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\26\2\2\u00cf\65\3\2\2\2\u00d0\u00d1\7\37"+
		"\2\2\u00d1\67\3\2\2\2\u00d2\u00d3\7\35\2\2\u00d39\3\2\2\2\u00d4\u00d5"+
		"\5\66\34\2\u00d5\u00d6\7\27\2\2\u00d6\u00d7\58\35\2\u00d7;\3\2\2\2\u00d8"+
		"\u00d9\7\30\2\2\u00d9\u00de\5:\36\2\u00da\u00db\7\3\2\2\u00db\u00dd\5"+
		":\36\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\31"+
		"\2\2\u00e2=\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6"+
		"\7%\2\2\u00e6\u00e7\7\26\2\2\u00e7?\3\2\2\2\u00e8\u00e9\5\26\f\2\u00e9"+
		"\u00ea\7\27\2\2\u00eaA\3\2\2\2\u00eb\u00ec\5<\37\2\u00ecC\3\2\2\2\u00ed"+
		"\u00ee\5.\30\2\u00eeE\3\2\2\2\u00ef\u00f1\5@!\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f5\5H%\2\u00f3\u00f5\5J&\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8"+
		"\5> \2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8G\3\2\2\2\u00f9\u00fa"+
		"\7)\2\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\5B\"\2\u00fc\u00fd\7\33\2\2"+
		"\u00fd\u00fe\5\64\33\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\5D#\2\u0100I\3"+
		"\2\2\2\u0101\u0102\7\37\2\2\u0102K\3\2\2\2\22OU`jrx\177\u0088\u009d\u00b6"+
		"\u00c0\u00cb\u00de\u00f0\u00f4\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}