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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		DECIMAL_LITERAL=32, FLOAT_PRECISION=33, BARE_ID=34, VALUE_ID=35, CARET_ID=36, 
		SYMBOL_REF_ELEMENT=37, INTTYPE_WIDTH=38, RANKED_DIMENSION=39, WS=40, LINE_COMMENT=41, 
		HEX_LITERAL=42, STRING_LITERAL=43;
	public static final int
		RULE_root = 0, RULE_integerLiteral = 1, RULE_floatLiteral = 2, RULE_stringLiteral = 3, 
		RULE_booleanLiteral = 4, RULE_bareIdList = 5, RULE_aliasName = 6, RULE_symbolRefId = 7, 
		RULE_valueIdList = 8, RULE_valueUse = 9, RULE_valueUseList = 10, RULE_operation = 11, 
		RULE_genericOperation = 12, RULE_successorList = 13, RULE_successor = 14, 
		RULE_opResult = 15, RULE_opResultList = 16, RULE_trailingLocation = 17, 
		RULE_location = 18, RULE_opAttributes = 19, RULE_opReturnType = 20, RULE_idSsa = 21, 
		RULE_dimensionListRanked = 22, RULE_noneType = 23, RULE_indexType = 24, 
		RULE_floatType = 25, RULE_signedIntegerType = 26, RULE_unsignedIntegerType = 27, 
		RULE_signlessIntegerType = 28, RULE_integerType = 29, RULE_complexType = 30, 
		RULE_tupleType = 31, RULE_tensorType = 32, RULE_type = 33, RULE_functionType = 34, 
		RULE_typeListParens = 35, RULE_operand = 36, RULE_operandList = 37, RULE_operandTypeList = 38, 
		RULE_attributesProperty = 39, RULE_attributesEntry = 40, RULE_attributes = 41;
	public static final String[] ruleNames = {
		"root", "integerLiteral", "floatLiteral", "stringLiteral", "booleanLiteral", 
		"bareIdList", "aliasName", "symbolRefId", "valueIdList", "valueUse", "valueUseList", 
		"operation", "genericOperation", "successorList", "successor", "opResult", 
		"opResultList", "trailingLocation", "location", "opAttributes", "opReturnType", 
		"idSsa", "dimensionListRanked", "noneType", "indexType", "floatType", 
		"signedIntegerType", "unsignedIntegerType", "signlessIntegerType", "integerType", 
		"complexType", "tupleType", "tensorType", "type", "functionType", "typeListParens", 
		"operand", "operandList", "operandTypeList", "attributesProperty", "attributesEntry", 
		"attributes"
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALUE_ID || _la==STRING_LITERAL) {
				{
				{
				setState(84);
				operation();
				}
				}
				setState(89);
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
			setState(93);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
			setState(95);
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
			setState(97);
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
			setState(99);
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
			setState(101);
			((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(102);
				match(T__2);
				setState(103);
				((BareIdListContext)_localctx).BARE_ID = match(BARE_ID);
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).BARE_ID);
				}
				}
				setState(108);
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
			setState(109);
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
			setState(111);
			((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
			((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(112);
				match(T__3);
				setState(113);
				((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT = match(SYMBOL_REF_ELEMENT);
				((SymbolRefIdContext)_localctx).values.add(((SymbolRefIdContext)_localctx).SYMBOL_REF_ELEMENT);
				}
				}
				setState(118);
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
			setState(119);
			((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
			((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(120);
				match(T__2);
				setState(121);
				((ValueIdListContext)_localctx).VALUE_ID = match(VALUE_ID);
				((ValueIdListContext)_localctx).values.add(((ValueIdListContext)_localctx).VALUE_ID);
				}
				}
				setState(126);
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
			setState(127);
			((ValueUseContext)_localctx).value = match(VALUE_ID);
			setState(130);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(128);
				match(T__4);
				setState(129);
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
			setState(132);
			((ValueUseListContext)_localctx).valueUse = valueUse();
			((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(133);
				match(T__2);
				setState(134);
				((ValueUseListContext)_localctx).valueUse = valueUse();
				((ValueUseListContext)_localctx).values.add(((ValueUseListContext)_localctx).valueUse);
				}
				}
				setState(139);
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
		enterRule(_localctx, 22, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(140);
				opResultList();
				}
			}

			setState(143);
			genericOperation();
			setState(145);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(144);
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
		enterRule(_localctx, 24, RULE_genericOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(148);
			match(T__5);
			setState(150);
			_la = _input.LA(1);
			if (_la==VALUE_ID) {
				{
				setState(149);
				valueUseList();
				}
			}

			setState(152);
			match(T__6);
			setState(154);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(153);
				successorList();
				}
			}

			setState(156);
			match(T__7);
			setState(157);
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
		enterRule(_localctx, 26, RULE_successorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__8);
			setState(160);
			successor();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(161);
				match(T__2);
				setState(162);
				successor();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
		enterRule(_localctx, 28, RULE_successor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		enterRule(_localctx, 30, RULE_opResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((OpResultContext)_localctx).value = match(VALUE_ID);
			setState(175);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(173);
				match(T__7);
				setState(174);
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
		enterRule(_localctx, 32, RULE_opResultList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			opResult();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(178);
				match(T__2);
				setState(179);
				opResult();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(T__10);
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
		enterRule(_localctx, 34, RULE_trailingLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__11);
			setState(188);
			match(T__5);
			setState(189);
			location();
			setState(190);
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
		enterRule(_localctx, 36, RULE_location);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				_localctx = new KnownLocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(192);
				((KnownLocationContext)_localctx).file = match(STRING_LITERAL);
				setState(193);
				match(T__7);
				setState(194);
				((KnownLocationContext)_localctx).line = match(DECIMAL_LITERAL);
				setState(195);
				match(T__7);
				setState(196);
				((KnownLocationContext)_localctx).col = match(DECIMAL_LITERAL);
				}
				}
				break;
			case T__12:
				_localctx = new UnknownLocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__12);
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
		enterRule(_localctx, 38, RULE_opAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 40, RULE_opReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 42, RULE_idSsa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__13);
			setState(205);
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
		enterRule(_localctx, 44, RULE_dimensionListRanked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(207);
				match(RANKED_DIMENSION);
				}
				}
				setState(212);
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
		enterRule(_localctx, 46, RULE_noneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 48, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 50, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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
		public Token width;
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
		enterRule(_localctx, 52, RULE_signedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__20);
			setState(220);
			((SignedIntegerTypeContext)_localctx).width = match(INTTYPE_WIDTH);
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
		public Token width;
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
		enterRule(_localctx, 54, RULE_unsignedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__21);
			setState(223);
			((UnsignedIntegerTypeContext)_localctx).width = match(INTTYPE_WIDTH);
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
		public Token width;
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
		enterRule(_localctx, 56, RULE_signlessIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__22);
			setState(226);
			((SignlessIntegerTypeContext)_localctx).width = match(INTTYPE_WIDTH);
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
		enterRule(_localctx, 58, RULE_integerType);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				signedIntegerType();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				unsignedIntegerType();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
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
		enterRule(_localctx, 60, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__23);
			setState(234);
			match(T__24);
			setState(235);
			type();
			setState(236);
			match(T__25);
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
		enterRule(_localctx, 62, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__26);
			setState(239);
			match(T__24);
			setState(240);
			type();
			setState(241);
			match(T__25);
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
		enterRule(_localctx, 64, RULE_tensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__27);
			setState(244);
			match(T__24);
			setState(245);
			dimensionListRanked();
			setState(246);
			floatType();
			setState(247);
			match(T__25);
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
		enterRule(_localctx, 66, RULE_type);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				noneType();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				indexType();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				floatType();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				integerType();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				complexType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				tupleType();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
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
		enterRule(_localctx, 68, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__27:
				{
				setState(258);
				type();
				}
				break;
			case T__5:
				{
				setState(259);
				typeListParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(T__28);
			setState(265);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__27:
				{
				setState(263);
				type();
				}
				break;
			case T__5:
				{
				setState(264);
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
		enterRule(_localctx, 70, RULE_typeListParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__5);
			{
			setState(268);
			type();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(269);
				match(T__2);
				setState(270);
				type();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(276);
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
		enterRule(_localctx, 72, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 74, RULE_operandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__5);
			setState(281);
			operand();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(282);
				match(T__2);
				setState(283);
				operand();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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
		enterRule(_localctx, 76, RULE_operandTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__5);
			setState(292);
			type();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(293);
				match(T__2);
				setState(294);
				type();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
		enterRule(_localctx, 78, RULE_attributesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 80, RULE_attributesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			attributesProperty();
			setState(305);
			match(T__10);
			setState(310);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
				{
				setState(306);
				integerLiteral();
				}
				break;
			case FLOAT_PRECISION:
				{
				setState(307);
				floatLiteral();
				}
				break;
			case STRING_LITERAL:
				{
				setState(308);
				stringLiteral();
				}
				break;
			case T__0:
			case T__1:
				{
				setState(309);
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
		enterRule(_localctx, 82, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__29);
			setState(313);
			attributesEntry();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(314);
				match(T__2);
				setState(315);
				attributesEntry();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(T__30);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\b\3\b\3\t\3\t\3\t\7\tu\n\t\f"+
		"\t\16\tx\13\t\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\13"+
		"\5\13\u0085\n\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r\5\r"+
		"\u0090\n\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\5\16\u0099\n\16\3\16\3"+
		"\16\5\16\u009d\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00a6\n\17"+
		"\f\17\16\17\u00a9\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u00b2"+
		"\n\21\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c9\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\7\30\u00d3\n\30\f\30\16\30\u00d6"+
		"\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\5\37\u00ea\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u0103\n#\3$\3$\5$\u0107"+
		"\n$\3$\3$\3$\5$\u010c\n$\3%\3%\3%\3%\7%\u0112\n%\f%\16%\u0115\13%\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\3\'\7\'\u011f\n\'\f\'\16\'\u0122\13\'\3\'\3\'\3(\3"+
		"(\3(\3(\7(\u012a\n(\f(\16(\u012d\13(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*"+
		"\u0139\n*\3+\3+\3+\3+\7+\u013f\n+\f+\16+\u0142\13+\3+\3+\3+\2\2,\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"\2\4\3\2\3\4\3\2\23\26\u013c\2Y\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bc\3\2\2"+
		"\2\ne\3\2\2\2\fg\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22y\3\2\2\2\24\u0081"+
		"\3\2\2\2\26\u0086\3\2\2\2\30\u008f\3\2\2\2\32\u0095\3\2\2\2\34\u00a1\3"+
		"\2\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00b3\3\2\2\2$\u00bd\3\2\2\2"+
		"&\u00c8\3\2\2\2(\u00ca\3\2\2\2*\u00cc\3\2\2\2,\u00ce\3\2\2\2.\u00d4\3"+
		"\2\2\2\60\u00d7\3\2\2\2\62\u00d9\3\2\2\2\64\u00db\3\2\2\2\66\u00dd\3\2"+
		"\2\28\u00e0\3\2\2\2:\u00e3\3\2\2\2<\u00e9\3\2\2\2>\u00eb\3\2\2\2@\u00f0"+
		"\3\2\2\2B\u00f5\3\2\2\2D\u0102\3\2\2\2F\u0106\3\2\2\2H\u010d\3\2\2\2J"+
		"\u0118\3\2\2\2L\u011a\3\2\2\2N\u0125\3\2\2\2P\u0130\3\2\2\2R\u0132\3\2"+
		"\2\2T\u013a\3\2\2\2VX\5\30\r\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\3\3\2\2\2[Y\3\2\2\2\\`\7\"\2\2]^\7,\2\2^`\b\3\1\2_\\\3\2\2\2_]\3\2\2"+
		"\2`\5\3\2\2\2ab\7#\2\2b\7\3\2\2\2cd\7-\2\2d\t\3\2\2\2ef\t\2\2\2f\13\3"+
		"\2\2\2gl\7$\2\2hi\7\5\2\2ik\7$\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\r\3\2\2\2nl\3\2\2\2op\7$\2\2p\17\3\2\2\2qv\7\'\2\2rs\7\6\2\2su\7"+
		"\'\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y"+
		"~\7%\2\2z{\7\5\2\2{}\7%\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\7%\2\2\u0082\u0083\7"+
		"\7\2\2\u0083\u0085\7\"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\25\3\2\2\2\u0086\u008b\5\24\13\2\u0087\u0088\7\5\2\2\u0088\u008a\5\24"+
		"\13\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\"\22"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\5\32\16\2\u0092\u0094\5$\23\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\31\3\2\2\2\u0095\u0096\7-\2\2\u0096\u0098\7\b\2\2\u0097\u0099\5"+
		"\26\f\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\7\t\2\2\u009b\u009d\5\34\17\2\u009c\u009b\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a0\5F$\2\u00a0"+
		"\33\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a7\5\36\20\2\u00a3\u00a4\7\5"+
		"\2\2\u00a4\u00a6\5\36\20\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ab\7\f\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\7&\2\2\u00ad\37"+
		"\3\2\2\2\u00ae\u00b1\7%\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b2\5\4\3\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2!\3\2\2\2\u00b3\u00b8\5 \21\2"+
		"\u00b4\u00b5\7\5\2\2\u00b5\u00b7\5 \21\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\r\2\2\u00bc#\3\2\2\2\u00bd\u00be\7\16\2\2"+
		"\u00be\u00bf\7\b\2\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\7\t\2\2\u00c1%\3"+
		"\2\2\2\u00c2\u00c3\7-\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\7\"\2\2\u00c5"+
		"\u00c6\7\n\2\2\u00c6\u00c9\7\"\2\2\u00c7\u00c9\7\17\2\2\u00c8\u00c2\3"+
		"\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\'\3\2\2\2\u00ca\u00cb\5T+\2\u00cb)\3"+
		"\2\2\2\u00cc\u00cd\5D#\2\u00cd+\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0-\3\2\2\2\u00d1\u00d3\7)\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5/\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7\21\2\2\u00d8\61\3\2\2\2\u00d9\u00da\7\22"+
		"\2\2\u00da\63\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc\65\3\2\2\2\u00dd\u00de"+
		"\7\27\2\2\u00de\u00df\7(\2\2\u00df\67\3\2\2\2\u00e0\u00e1\7\30\2\2\u00e1"+
		"\u00e2\7(\2\2\u00e29\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e5\7(\2\2\u00e5"+
		";\3\2\2\2\u00e6\u00ea\5\66\34\2\u00e7\u00ea\58\35\2\u00e8\u00ea\5:\36"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea="+
		"\3\2\2\2\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\5D#\2\u00ee"+
		"\u00ef\7\34\2\2\u00ef?\3\2\2\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\7\33\2"+
		"\2\u00f2\u00f3\5D#\2\u00f3\u00f4\7\34\2\2\u00f4A\3\2\2\2\u00f5\u00f6\7"+
		"\36\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\5\64\33\2"+
		"\u00f9\u00fa\7\34\2\2\u00faC\3\2\2\2\u00fb\u0103\5\60\31\2\u00fc\u0103"+
		"\5\62\32\2\u00fd\u0103\5\64\33\2\u00fe\u0103\5<\37\2\u00ff\u0103\5> \2"+
		"\u0100\u0103\5@!\2\u0101\u0103\5B\"\2\u0102\u00fb\3\2\2\2\u0102\u00fc"+
		"\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103E\3\2\2\2\u0104\u0107\5D#\2\u0105"+
		"\u0107\5H%\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2"+
		"\2\u0108\u010b\7\37\2\2\u0109\u010c\5D#\2\u010a\u010c\5H%\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010cG\3\2\2\2\u010d\u010e\7\b\2\2\u010e"+
		"\u0113\5D#\2\u010f\u0110\7\5\2\2\u0110\u0112\5D#\2\u0111\u010f\3\2\2\2"+
		"\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\t\2\2\u0117I\3\2\2\2\u0118"+
		"\u0119\5,\27\2\u0119K\3\2\2\2\u011a\u011b\7\b\2\2\u011b\u0120\5J&\2\u011c"+
		"\u011d\7\5\2\2\u011d\u011f\5J&\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2"+
		"\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\7\t\2\2\u0124M\3\2\2\2\u0125\u0126\7\b\2\2\u0126"+
		"\u012b\5D#\2\u0127\u0128\7\5\2\2\u0128\u012a\5D#\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\t\2\2\u012fO\3\2\2\2\u0130"+
		"\u0131\7$\2\2\u0131Q\3\2\2\2\u0132\u0133\5P)\2\u0133\u0138\7\r\2\2\u0134"+
		"\u0139\5\4\3\2\u0135\u0139\5\6\4\2\u0136\u0139\5\b\5\2\u0137\u0139\5\n"+
		"\6\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139S\3\2\2\2\u013a\u013b\7 \2\2\u013b\u0140\5R*\2\u013c"+
		"\u013d\7\5\2\2\u013d\u013f\5R*\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0144\7!\2\2\u0144U\3\2\2\2\33Y_lv~\u0084\u008b\u008f\u0093"+
		"\u0098\u009c\u00a7\u00b1\u00b8\u00c8\u00d4\u00e9\u0102\u0106\u010b\u0113"+
		"\u0120\u012b\u0138\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}