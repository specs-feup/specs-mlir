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
		DECIMAL_LITERAL=25, FLOAT_PRECISION=26, BARE_ID=27, INTTYPE_WIDTH=28, 
		RANKED_DIMENSION=29, LOCATION=30, WS=31, LINE_COMMENT=32, HEX_LITERAL=33, 
		STRING_LITERAL=34;
	public static final int
		RULE_root = 0, RULE_integerLiteral = 1, RULE_floatLiteral = 2, RULE_stringLiteral = 3, 
		RULE_bareId = 4, RULE_bareIdList = 5, RULE_aliasName = 6, RULE_idSsa = 7, 
		RULE_dimensionListRanked = 8, RULE_noneType = 9, RULE_indexType = 10, 
		RULE_floatType = 11, RULE_signedIntegerType = 12, RULE_unsignedIntegerType = 13, 
		RULE_signlessIntegerType = 14, RULE_integerType = 15, RULE_complexType = 16, 
		RULE_tupleType = 17, RULE_tensorType = 18, RULE_type = 19, RULE_operand = 20, 
		RULE_operandList = 21, RULE_operandTypeList = 22, RULE_attributesProperty = 23, 
		RULE_attributesValue = 24, RULE_attributesEntry = 25, RULE_attributes = 26, 
		RULE_trailingLocation = 27, RULE_opResult = 28, RULE_opAttributes = 29, 
		RULE_opReturnType = 30, RULE_operation = 31, RULE_genericOperation = 32, 
		RULE_customOperation = 33;
	public static final String[] ruleNames = {
		"root", "integerLiteral", "floatLiteral", "stringLiteral", "bareId", "bareIdList", 
		"aliasName", "idSsa", "dimensionListRanked", "noneType", "indexType", 
		"floatType", "signedIntegerType", "unsignedIntegerType", "signlessIntegerType", 
		"integerType", "complexType", "tupleType", "tensorType", "type", "operand", 
		"operandList", "operandTypeList", "attributesProperty", "attributesValue", 
		"attributesEntry", "attributes", "trailingLocation", "opResult", "opAttributes", 
		"opReturnType", "operation", "genericOperation", "customOperation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'%'", "'none'", "'index'", "'f16'", "'bf16'", "'f32'", "'f64'", 
		"'si'", "'ui'", "'i'", "'complex'", "'<'", "'>'", "'tuple'", "'tensor'", 
		"'('", "')'", "'='", "'{'", "'}'", "'loc'", "':'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "DECIMAL_LITERAL", "FLOAT_PRECISION", "BARE_ID", "INTTYPE_WIDTH", 
		"RANKED_DIMENSION", "LOCATION", "WS", "LINE_COMMENT", "HEX_LITERAL", "STRING_LITERAL"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BARE_ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(68);
				operation();
				}
				}
				setState(73);
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
			setState(77);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((IntegerLiteralContext)_localctx).value = match(DECIMAL_LITERAL);
				}
				break;
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
			setState(79);
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
			setState(81);
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

	public static class BareIdContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BARE_ID() { return getToken(MlirParser.BARE_ID, 0); }
		public BareIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBareId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBareId(this);
		}
	}

	public final BareIdContext bareId() throws RecognitionException {
		BareIdContext _localctx = new BareIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bareId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((BareIdContext)_localctx).value = match(BARE_ID);
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
		public BareIdContext bareId;
		public List<BareIdContext> values = new ArrayList<BareIdContext>();
		public List<BareIdContext> bareId() {
			return getRuleContexts(BareIdContext.class);
		}
		public BareIdContext bareId(int i) {
			return getRuleContext(BareIdContext.class,i);
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
			setState(85);
			((BareIdListContext)_localctx).bareId = bareId();
			((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).bareId);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(86);
				match(T__0);
				setState(87);
				((BareIdListContext)_localctx).bareId = bareId();
				((BareIdListContext)_localctx).values.add(((BareIdListContext)_localctx).bareId);
				}
				}
				setState(92);
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
		public BareIdContext bareId() {
			return getRuleContext(BareIdContext.class,0);
		}
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
			setState(93);
			bareId();
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
		enterRule(_localctx, 14, RULE_idSsa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
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
		enterRule(_localctx, 16, RULE_dimensionListRanked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(98);
				match(RANKED_DIMENSION);
				}
				}
				setState(103);
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
		enterRule(_localctx, 18, RULE_noneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
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
		enterRule(_localctx, 20, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
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
		enterRule(_localctx, 22, RULE_floatType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_signedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(111);
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
		enterRule(_localctx, 26, RULE_unsignedIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__9);
			setState(114);
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
		enterRule(_localctx, 28, RULE_signlessIntegerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__10);
			setState(117);
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
		enterRule(_localctx, 30, RULE_integerType);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				signedIntegerType();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				unsignedIntegerType();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
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
		enterRule(_localctx, 32, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			setState(125);
			match(T__12);
			setState(126);
			type();
			setState(127);
			match(T__13);
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
		enterRule(_localctx, 34, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__14);
			setState(130);
			match(T__12);
			setState(131);
			type();
			setState(132);
			match(T__13);
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
		enterRule(_localctx, 36, RULE_tensorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__15);
			setState(135);
			match(T__12);
			setState(136);
			dimensionListRanked();
			setState(137);
			floatType();
			setState(138);
			match(T__13);
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
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				noneType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				indexType();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				floatType();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				integerType();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				complexType();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				tupleType();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
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
		enterRule(_localctx, 40, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 42, RULE_operandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__16);
			setState(152);
			operand();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(153);
				match(T__0);
				setState(154);
				operand();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__17);
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
		enterRule(_localctx, 44, RULE_operandTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__16);
			setState(163);
			type();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(164);
				match(T__0);
				setState(165);
				type();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__17);
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
		enterRule(_localctx, 46, RULE_attributesProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 48, RULE_attributesValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 50, RULE_attributesEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			attributesProperty();
			setState(178);
			match(T__18);
			setState(179);
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
		enterRule(_localctx, 52, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__19);
			setState(182);
			attributesEntry();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(183);
				match(T__0);
				setState(184);
				attributesEntry();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
		enterRule(_localctx, 54, RULE_trailingLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__21);
			setState(193);
			match(T__16);
			setState(194);
			match(LOCATION);
			setState(195);
			match(T__17);
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
		enterRule(_localctx, 56, RULE_opResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			idSsa();
			setState(198);
			match(T__18);
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
		enterRule(_localctx, 58, RULE_opAttributes);
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
		enterRule(_localctx, 60, RULE_opReturnType);
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
		enterRule(_localctx, 62, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(204);
				opResult();
				}
			}

			setState(209);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(207);
				genericOperation();
				}
				break;
			case BARE_ID:
				{
				setState(208);
				customOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(211);
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
		enterRule(_localctx, 64, RULE_genericOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((GenericOperationContext)_localctx).name = match(STRING_LITERAL);
			setState(215);
			operandList();
			setState(216);
			opAttributes();
			setState(217);
			match(T__22);
			setState(218);
			operandTypeList();
			setState(219);
			match(T__23);
			setState(220);
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
		enterRule(_localctx, 66, RULE_customOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\5\3P\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\7\nf\n\n\f\n\16\ni\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21}\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0096\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\7\27\u009e\n\27\f\27\16\27\u00a1\13\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00a9\n\30\f\30\16\30\u00ac\13\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00bc\n\34\f\34"+
		"\16\34\u00bf\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\5!\u00d0\n!\3!\3!\5!\u00d4\n!\3!\5!\u00d7\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2\7\n\u00d2\2I\3\2\2\2\4O\3\2"+
		"\2\2\6Q\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16_\3\2\2\2\20a\3\2\2"+
		"\2\22g\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34s\3\2"+
		"\2\2\36v\3\2\2\2 |\3\2\2\2\"~\3\2\2\2$\u0083\3\2\2\2&\u0088\3\2\2\2(\u0095"+
		"\3\2\2\2*\u0097\3\2\2\2,\u0099\3\2\2\2.\u00a4\3\2\2\2\60\u00af\3\2\2\2"+
		"\62\u00b1\3\2\2\2\64\u00b3\3\2\2\2\66\u00b7\3\2\2\28\u00c2\3\2\2\2:\u00c7"+
		"\3\2\2\2<\u00ca\3\2\2\2>\u00cc\3\2\2\2@\u00cf\3\2\2\2B\u00d8\3\2\2\2D"+
		"\u00e0\3\2\2\2FH\5@!\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3\2"+
		"\2\2KI\3\2\2\2LP\7\33\2\2MN\7#\2\2NP\b\3\1\2OL\3\2\2\2OM\3\2\2\2P\5\3"+
		"\2\2\2QR\7\34\2\2R\7\3\2\2\2ST\7$\2\2T\t\3\2\2\2UV\7\35\2\2V\13\3\2\2"+
		"\2W\\\5\n\6\2XY\7\3\2\2Y[\5\n\6\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]\r\3\2\2\2^\\\3\2\2\2_`\5\n\6\2`\17\3\2\2\2ab\7\4\2\2bc\7\35\2"+
		"\2c\21\3\2\2\2df\7\37\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\23"+
		"\3\2\2\2ig\3\2\2\2jk\7\5\2\2k\25\3\2\2\2lm\7\6\2\2m\27\3\2\2\2no\t\2\2"+
		"\2o\31\3\2\2\2pq\7\13\2\2qr\7\36\2\2r\33\3\2\2\2st\7\f\2\2tu\7\36\2\2"+
		"u\35\3\2\2\2vw\7\r\2\2wx\7\36\2\2x\37\3\2\2\2y}\5\32\16\2z}\5\34\17\2"+
		"{}\5\36\20\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}!\3\2\2\2~\177\7\16\2\2\177"+
		"\u0080\7\17\2\2\u0080\u0081\5(\25\2\u0081\u0082\7\20\2\2\u0082#\3\2\2"+
		"\2\u0083\u0084\7\21\2\2\u0084\u0085\7\17\2\2\u0085\u0086\5(\25\2\u0086"+
		"\u0087\7\20\2\2\u0087%\3\2\2\2\u0088\u0089\7\22\2\2\u0089\u008a\7\17\2"+
		"\2\u008a\u008b\5\22\n\2\u008b\u008c\5\30\r\2\u008c\u008d\7\20\2\2\u008d"+
		"\'\3\2\2\2\u008e\u0096\5\24\13\2\u008f\u0096\5\26\f\2\u0090\u0096\5\30"+
		"\r\2\u0091\u0096\5 \21\2\u0092\u0096\5\"\22\2\u0093\u0096\5$\23\2\u0094"+
		"\u0096\5&\24\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096)\3\2\2\2\u0097\u0098\5\20\t\2\u0098+\3\2\2\2\u0099"+
		"\u009a\7\23\2\2\u009a\u009f\5*\26\2\u009b\u009c\7\3\2\2\u009c\u009e\5"+
		"*\26\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\24"+
		"\2\2\u00a3-\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00aa\5(\25\2\u00a6\u00a7"+
		"\7\3\2\2\u00a7\u00a9\5(\25\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\24\2\2\u00ae/\3\2\2\2\u00af\u00b0\7\35\2\2\u00b0\61"+
		"\3\2\2\2\u00b1\u00b2\7\33\2\2\u00b2\63\3\2\2\2\u00b3\u00b4\5\60\31\2\u00b4"+
		"\u00b5\7\25\2\2\u00b5\u00b6\5\62\32\2\u00b6\65\3\2\2\2\u00b7\u00b8\7\26"+
		"\2\2\u00b8\u00bd\5\64\33\2\u00b9\u00ba\7\3\2\2\u00ba\u00bc\5\64\33\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\27\2\2\u00c1"+
		"\67\3\2\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\7\23\2\2\u00c4\u00c5\7 \2"+
		"\2\u00c5\u00c6\7\24\2\2\u00c69\3\2\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00c9"+
		"\7\25\2\2\u00c9;\3\2\2\2\u00ca\u00cb\5\66\34\2\u00cb=\3\2\2\2\u00cc\u00cd"+
		"\5(\25\2\u00cd?\3\2\2\2\u00ce\u00d0\5:\36\2\u00cf\u00ce\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d4\5B\"\2\u00d2\u00d4\5D#"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7"+
		"\58\35\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7A\3\2\2\2\u00d8"+
		"\u00d9\7$\2\2\u00d9\u00da\5,\27\2\u00da\u00db\5<\37\2\u00db\u00dc\7\31"+
		"\2\2\u00dc\u00dd\5.\30\2\u00dd\u00de\7\32\2\2\u00de\u00df\5> \2\u00df"+
		"C\3\2\2\2\u00e0\u00e1\7\35\2\2\u00e1E\3\2\2\2\16IO\\g|\u0095\u009f\u00aa"+
		"\u00bd\u00cf\u00d3\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}