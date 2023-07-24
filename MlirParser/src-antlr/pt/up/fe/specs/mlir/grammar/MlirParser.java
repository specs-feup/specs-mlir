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
		T__24=25, T__25=26, DIGIT=27, HEX_DIGIT=28, INTTYPE_WIDTH=29, LETTER=30, 
		RANKED_DIMENSION=31, FLOAT_PRECISION=32, ID=33, LOCATION=34, WS=35;
	public static final int
		RULE_root = 0, RULE_decimal_literal = 1, RULE_hexadecimal_literal = 2, 
		RULE_integer_literal = 3, RULE_float_literal = 4, RULE_string_literal = 5, 
		RULE_id_ssa = 6, RULE_dimension_list_ranked = 7, RULE_none_type = 8, RULE_index_type = 9, 
		RULE_float_type = 10, RULE_signed_integer_type = 11, RULE_unsigned_integer_type = 12, 
		RULE_signless_integer_type = 13, RULE_integer_type = 14, RULE_complex_type = 15, 
		RULE_tuple_type = 16, RULE_tensor_type = 17, RULE_type = 18, RULE_operand = 19, 
		RULE_operand_list = 20, RULE_operand_type_list = 21, RULE_attributes_property = 22, 
		RULE_attributes_value = 23, RULE_attributes_entry = 24, RULE_attributes = 25, 
		RULE_trailing_location = 26, RULE_op_result = 27, RULE_op_name = 28, RULE_op_attributes = 29, 
		RULE_op_return_type = 30, RULE_operation = 31;
	public static final String[] ruleNames = {
		"root", "decimal_literal", "hexadecimal_literal", "integer_literal", "float_literal", 
		"string_literal", "id_ssa", "dimension_list_ranked", "none_type", "index_type", 
		"float_type", "signed_integer_type", "unsigned_integer_type", "signless_integer_type", 
		"integer_type", "complex_type", "tuple_type", "tensor_type", "type", "operand", 
		"operand_list", "operand_type_list", "attributes_property", "attributes_value", 
		"attributes_entry", "attributes", "trailing_location", "op_result", "op_name", 
		"op_attributes", "op_return_type", "operation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0x'", "'\"'", "'%'", "'none'", "'index'", "'f16'", "'bf16'", "'f32'", 
		"'f64'", "'si'", "'ui'", "'i'", "'complex'", "'<'", "'>'", "'tuple'", 
		"'tensor'", "'('", "','", "')'", "'='", "'{'", "'}'", "'loc'", "':'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "DIGIT", "HEX_DIGIT", "INTTYPE_WIDTH", "LETTER", "RANKED_DIMENSION", 
		"FLOAT_PRECISION", "ID", "LOCATION", "WS"
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
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			operation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_literalContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MlirParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MlirParser.DIGIT, i);
		}
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDecimal_literal(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decimal_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(DIGIT);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hexadecimal_literalContext extends ParserRuleContext {
		public List<TerminalNode> HEX_DIGIT() { return getTokens(MlirParser.HEX_DIGIT); }
		public TerminalNode HEX_DIGIT(int i) {
			return getToken(MlirParser.HEX_DIGIT, i);
		}
		public Hexadecimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterHexadecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitHexadecimal_literal(this);
		}
	}

	public final Hexadecimal_literalContext hexadecimal_literal() throws RecognitionException {
		Hexadecimal_literalContext _localctx = new Hexadecimal_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hexadecimal_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				match(HEX_DIGIT);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEX_DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Hexadecimal_literalContext hexadecimal_literal() {
			return getRuleContext(Hexadecimal_literalContext.class,0);
		}
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integer_literal);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				decimal_literal();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				hexadecimal_literal();
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

	public static class Float_literalContext extends ParserRuleContext {
		public TerminalNode FLOAT_PRECISION() { return getToken(MlirParser.FLOAT_PRECISION, 0); }
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFloat_literal(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(FLOAT_PRECISION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(MlirParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(MlirParser.LETTER, i);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(LETTER);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
			setState(89);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_ssaContext extends ParserRuleContext {
		public Id_ssaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_ssa; }
	 
		public Id_ssaContext() { }
		public void copyFrom(Id_ssaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueIDContext extends Id_ssaContext {
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
		public ValueIDContext(Id_ssaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterValueID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitValueID(this);
		}
	}

	public final Id_ssaContext id_ssa() throws RecognitionException {
		Id_ssaContext _localctx = new Id_ssaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_ssa);
		try {
			_localctx = new ValueIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dimension_list_rankedContext extends ParserRuleContext {
		public Dimension_list_rankedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_list_ranked; }
	 
		public Dimension_list_rankedContext() { }
		public void copyFrom(Dimension_list_rankedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RankedDimensionListContext extends Dimension_list_rankedContext {
		public List<TerminalNode> RANKED_DIMENSION() { return getTokens(MlirParser.RANKED_DIMENSION); }
		public TerminalNode RANKED_DIMENSION(int i) {
			return getToken(MlirParser.RANKED_DIMENSION, i);
		}
		public RankedDimensionListContext(Dimension_list_rankedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRankedDimensionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRankedDimensionList(this);
		}
	}

	public final Dimension_list_rankedContext dimension_list_ranked() throws RecognitionException {
		Dimension_list_rankedContext _localctx = new Dimension_list_rankedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimension_list_ranked);
		int _la;
		try {
			_localctx = new RankedDimensionListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(94);
				match(RANKED_DIMENSION);
				}
				}
				setState(99);
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

	public static class None_typeContext extends ParserRuleContext {
		public None_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_none_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterNone_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitNone_type(this);
		}
	}

	public final None_typeContext none_type() throws RecognitionException {
		None_typeContext _localctx = new None_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_none_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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

	public static class Index_typeContext extends ParserRuleContext {
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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

	public static class Float_typeContext extends ParserRuleContext {
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFloat_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFloat_type(this);
		}
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_float_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class Signed_integer_typeContext extends ParserRuleContext {
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
		public Signed_integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSigned_integer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSigned_integer_type(this);
		}
	}

	public final Signed_integer_typeContext signed_integer_type() throws RecognitionException {
		Signed_integer_typeContext _localctx = new Signed_integer_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signed_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__9);
			setState(107);
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

	public static class Unsigned_integer_typeContext extends ParserRuleContext {
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
		public Unsigned_integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterUnsigned_integer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitUnsigned_integer_type(this);
		}
	}

	public final Unsigned_integer_typeContext unsigned_integer_type() throws RecognitionException {
		Unsigned_integer_typeContext _localctx = new Unsigned_integer_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsigned_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
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

	public static class Signless_integer_typeContext extends ParserRuleContext {
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
		public Signless_integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signless_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSignless_integer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSignless_integer_type(this);
		}
	}

	public final Signless_integer_typeContext signless_integer_type() throws RecognitionException {
		Signless_integer_typeContext _localctx = new Signless_integer_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_signless_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__11);
			setState(113);
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

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_integer_typeContext signed_integer_type() {
			return getRuleContext(Signed_integer_typeContext.class,0);
		}
		public Unsigned_integer_typeContext unsigned_integer_type() {
			return getRuleContext(Unsigned_integer_typeContext.class,0);
		}
		public Signless_integer_typeContext signless_integer_type() {
			return getRuleContext(Signless_integer_typeContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitInteger_type(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integer_type);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				signed_integer_type();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				unsigned_integer_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				signless_integer_type();
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

	public static class Complex_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterComplex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitComplex_type(this);
		}
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_complex_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__12);
			setState(121);
			match(T__13);
			setState(122);
			type();
			setState(123);
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTuple_type(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tuple_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__15);
			setState(126);
			match(T__13);
			setState(127);
			type();
			setState(128);
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

	public static class Tensor_typeContext extends ParserRuleContext {
		public Tensor_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor_type; }
	 
		public Tensor_typeContext() { }
		public void copyFrom(Tensor_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TensorTypeContext extends Tensor_typeContext {
		public Dimension_list_rankedContext dimension_list_ranked() {
			return getRuleContext(Dimension_list_rankedContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public TensorTypeContext(Tensor_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTensorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTensorType(this);
		}
	}

	public final Tensor_typeContext tensor_type() throws RecognitionException {
		Tensor_typeContext _localctx = new Tensor_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tensor_type);
		try {
			_localctx = new TensorTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__16);
			setState(131);
			match(T__13);
			setState(132);
			dimension_list_ranked();
			setState(133);
			float_type();
			setState(134);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerTypeContext extends TypeContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public IntegerTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIntegerType(this);
		}
	}
	public static class TupleTypeContext extends TypeContext {
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public TupleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTupleType(this);
		}
	}
	public static class NoneTypeContext extends TypeContext {
		public None_typeContext none_type() {
			return getRuleContext(None_typeContext.class,0);
		}
		public NoneTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterNoneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitNoneType(this);
		}
	}
	public static class IndexTypeContext extends TypeContext {
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public IndexTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitIndexType(this);
		}
	}
	public static class ComplexTypeContext extends TypeContext {
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public ComplexTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitComplexType(this);
		}
	}
	public static class TypeDeclarationContext extends TypeContext {
		public Tensor_typeContext tensor_type() {
			return getRuleContext(Tensor_typeContext.class,0);
		}
		public TypeDeclarationContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTypeDeclaration(this);
		}
	}
	public static class FloatTypeContext extends TypeContext {
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public FloatTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitFloatType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new NoneTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				none_type();
				}
				break;
			case T__4:
				_localctx = new IndexTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				index_type();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				float_type();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				integer_type();
				}
				break;
			case T__12:
				_localctx = new ComplexTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				complex_type();
				}
				break;
			case T__15:
				_localctx = new TupleTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				tuple_type();
				}
				break;
			case T__16:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				tensor_type();
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
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputOperandContext extends OperandContext {
		public Id_ssaContext id_ssa() {
			return getRuleContext(Id_ssaContext.class,0);
		}
		public InputOperandContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterInputOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitInputOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operand);
		try {
			_localctx = new InputOperandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			id_ssa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operand_listContext extends ParserRuleContext {
		public Operand_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand_list; }
	 
		public Operand_listContext() { }
		public void copyFrom(Operand_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperandListContext extends Operand_listContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperandListContext(Operand_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperandList(this);
		}
	}

	public final Operand_listContext operand_list() throws RecognitionException {
		Operand_listContext _localctx = new Operand_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operand_list);
		int _la;
		try {
			_localctx = new OperandListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__17);
			setState(148);
			operand();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(149);
				match(T__18);
				setState(150);
				operand();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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

	public static class Operand_type_listContext extends ParserRuleContext {
		public Operand_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand_type_list; }
	 
		public Operand_type_listContext() { }
		public void copyFrom(Operand_type_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperandTypeListContext extends Operand_type_listContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public OperandTypeListContext(Operand_type_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperandTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperandTypeList(this);
		}
	}

	public final Operand_type_listContext operand_type_list() throws RecognitionException {
		Operand_type_listContext _localctx = new Operand_type_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operand_type_list);
		int _la;
		try {
			_localctx = new OperandTypeListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__17);
			setState(159);
			type();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(160);
				match(T__18);
				setState(161);
				type();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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

	public static class Attributes_propertyContext extends ParserRuleContext {
		public Attributes_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_property; }
	 
		public Attributes_propertyContext() { }
		public void copyFrom(Attributes_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributePropetyContext extends Attributes_propertyContext {
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
		public AttributePropetyContext(Attributes_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributePropety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributePropety(this);
		}
	}

	public final Attributes_propertyContext attributes_property() throws RecognitionException {
		Attributes_propertyContext _localctx = new Attributes_propertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributes_property);
		try {
			_localctx = new AttributePropetyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attributes_valueContext extends ParserRuleContext {
		public Attributes_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_value; }
	 
		public Attributes_valueContext() { }
		public void copyFrom(Attributes_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeValueContext extends Attributes_valueContext {
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
		public TerminalNode DIGIT() { return getToken(MlirParser.DIGIT, 0); }
		public AttributeValueContext(Attributes_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributeValue(this);
		}
	}

	public final Attributes_valueContext attributes_value() throws RecognitionException {
		Attributes_valueContext _localctx = new Attributes_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributes_value);
		int _la;
		try {
			_localctx = new AttributeValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==ID) ) {
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

	public static class Attributes_entryContext extends ParserRuleContext {
		public Attributes_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_entry; }
	 
		public Attributes_entryContext() { }
		public void copyFrom(Attributes_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeEntryContext extends Attributes_entryContext {
		public Attributes_propertyContext attributes_property() {
			return getRuleContext(Attributes_propertyContext.class,0);
		}
		public Attributes_valueContext attributes_value() {
			return getRuleContext(Attributes_valueContext.class,0);
		}
		public AttributeEntryContext(Attributes_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributeEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributeEntry(this);
		}
	}

	public final Attributes_entryContext attributes_entry() throws RecognitionException {
		Attributes_entryContext _localctx = new Attributes_entryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attributes_entry);
		try {
			_localctx = new AttributeEntryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			attributes_property();
			setState(174);
			match(T__20);
			setState(175);
			attributes_value();
			}
		}
		catch (RecognitionException re) {
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
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	 
		public AttributesContext() { }
		public void copyFrom(AttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeDictionaryContext extends AttributesContext {
		public List<Attributes_entryContext> attributes_entry() {
			return getRuleContexts(Attributes_entryContext.class);
		}
		public Attributes_entryContext attributes_entry(int i) {
			return getRuleContext(Attributes_entryContext.class,i);
		}
		public AttributeDictionaryContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributeDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributeDictionary(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attributes);
		int _la;
		try {
			_localctx = new AttributeDictionaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__21);
			setState(178);
			attributes_entry();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(179);
				match(T__18);
				setState(180);
				attributes_entry();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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

	public static class Trailing_locationContext extends ParserRuleContext {
		public Trailing_locationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_location; }
	 
		public Trailing_locationContext() { }
		public void copyFrom(Trailing_locationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrailingLocationContext extends Trailing_locationContext {
		public TerminalNode LOCATION() { return getToken(MlirParser.LOCATION, 0); }
		public TrailingLocationContext(Trailing_locationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterTrailingLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitTrailingLocation(this);
		}
	}

	public final Trailing_locationContext trailing_location() throws RecognitionException {
		Trailing_locationContext _localctx = new Trailing_locationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trailing_location);
		try {
			_localctx = new TrailingLocationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__23);
			setState(189);
			match(T__17);
			setState(190);
			match(LOCATION);
			setState(191);
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

	public static class Op_resultContext extends ParserRuleContext {
		public Op_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_result; }
	 
		public Op_resultContext() { }
		public void copyFrom(Op_resultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationResultContext extends Op_resultContext {
		public Id_ssaContext id_ssa() {
			return getRuleContext(Id_ssaContext.class,0);
		}
		public OperationResultContext(Op_resultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperationResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperationResult(this);
		}
	}

	public final Op_resultContext op_result() throws RecognitionException {
		Op_resultContext _localctx = new Op_resultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_result);
		try {
			_localctx = new OperationResultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			id_ssa();
			setState(194);
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

	public static class Op_nameContext extends ParserRuleContext {
		public Op_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_name; }
	 
		public Op_nameContext() { }
		public void copyFrom(Op_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationNameContext extends Op_nameContext {
		public List<TerminalNode> ID() { return getTokens(MlirParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MlirParser.ID, i);
		}
		public OperationNameContext(Op_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperationName(this);
		}
	}

	public final Op_nameContext op_name() throws RecognitionException {
		Op_nameContext _localctx = new Op_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_name);
		int _la;
		try {
			_localctx = new OperationNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__1);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(ID);
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(202);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_attributesContext extends ParserRuleContext {
		public Op_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_attributes; }
	 
		public Op_attributesContext() { }
		public void copyFrom(Op_attributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationAttributesContext extends Op_attributesContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public OperationAttributesContext(Op_attributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperationAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperationAttributes(this);
		}
	}

	public final Op_attributesContext op_attributes() throws RecognitionException {
		Op_attributesContext _localctx = new Op_attributesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_attributes);
		try {
			_localctx = new OperationAttributesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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

	public static class Op_return_typeContext extends ParserRuleContext {
		public Op_return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_return_type; }
	 
		public Op_return_typeContext() { }
		public void copyFrom(Op_return_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationReturnTypeListContext extends Op_return_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OperationReturnTypeListContext(Op_return_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperationReturnTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperationReturnTypeList(this);
		}
	}

	public final Op_return_typeContext op_return_type() throws RecognitionException {
		Op_return_typeContext _localctx = new Op_return_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_return_type);
		try {
			_localctx = new OperationReturnTypeListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		public Op_nameContext op_name() {
			return getRuleContext(Op_nameContext.class,0);
		}
		public Operand_listContext operand_list() {
			return getRuleContext(Operand_listContext.class,0);
		}
		public Op_attributesContext op_attributes() {
			return getRuleContext(Op_attributesContext.class,0);
		}
		public Operand_type_listContext operand_type_list() {
			return getRuleContext(Operand_type_listContext.class,0);
		}
		public Op_return_typeContext op_return_type() {
			return getRuleContext(Op_return_typeContext.class,0);
		}
		public Trailing_locationContext trailing_location() {
			return getRuleContext(Trailing_locationContext.class,0);
		}
		public Op_resultContext op_result() {
			return getRuleContext(Op_resultContext.class,0);
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
			setState(209);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(208);
				op_result();
				}
			}

			setState(211);
			op_name();
			setState(212);
			operand_list();
			setState(213);
			op_attributes();
			setState(214);
			match(T__24);
			setState(215);
			operand_type_list();
			setState(216);
			match(T__25);
			setState(217);
			op_return_type();
			setState(218);
			trailing_location();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\6\4L\n\4\r\4\16\4M\3\5\3\5"+
		"\5\5R\n\5\3\6\3\6\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\7\3\7\3\b\3\b\3\b\3\t\7"+
		"\tb\n\t\f\t\16\te\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0092\n\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u009a\n\26\f\26\16\26\u009d\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00a5\n\27\f\27\16\27\u00a8\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00b8\n\33\f\33\16\33\u00bb\13"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\6\36\u00c9"+
		"\n\36\r\36\16\36\u00ca\3\36\3\36\3\37\3\37\3 \3 \3!\5!\u00d4\n!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\4\3\2\b\13\4\2\35\35##\u00d0\2B\3\2\2\2\4"+
		"E\3\2\2\2\6I\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16]\3\2\2\2\20c"+
		"\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30l\3\2\2\2\32o\3\2\2\2\34"+
		"r\3\2\2\2\36x\3\2\2\2 z\3\2\2\2\"\177\3\2\2\2$\u0084\3\2\2\2&\u0091\3"+
		"\2\2\2(\u0093\3\2\2\2*\u0095\3\2\2\2,\u00a0\3\2\2\2.\u00ab\3\2\2\2\60"+
		"\u00ad\3\2\2\2\62\u00af\3\2\2\2\64\u00b3\3\2\2\2\66\u00be\3\2\2\28\u00c3"+
		"\3\2\2\2:\u00c6\3\2\2\2<\u00ce\3\2\2\2>\u00d0\3\2\2\2@\u00d3\3\2\2\2B"+
		"C\5@!\2C\3\3\2\2\2DF\7\35\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"H\5\3\2\2\2IK\7\3\2\2JL\7\36\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\7\3\2\2\2OR\5\4\3\2PR\5\6\4\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\7\""+
		"\2\2T\13\3\2\2\2UW\7\4\2\2VX\7 \2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z[\3\2\2\2[\\\7\4\2\2\\\r\3\2\2\2]^\7\5\2\2^_\7#\2\2_\17\3\2\2\2"+
		"`b\7!\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\21\3\2\2\2ec\3\2\2"+
		"\2fg\7\6\2\2g\23\3\2\2\2hi\7\7\2\2i\25\3\2\2\2jk\t\2\2\2k\27\3\2\2\2l"+
		"m\7\f\2\2mn\7\37\2\2n\31\3\2\2\2op\7\r\2\2pq\7\37\2\2q\33\3\2\2\2rs\7"+
		"\16\2\2st\7\37\2\2t\35\3\2\2\2uy\5\30\r\2vy\5\32\16\2wy\5\34\17\2xu\3"+
		"\2\2\2xv\3\2\2\2xw\3\2\2\2y\37\3\2\2\2z{\7\17\2\2{|\7\20\2\2|}\5&\24\2"+
		"}~\7\21\2\2~!\3\2\2\2\177\u0080\7\22\2\2\u0080\u0081\7\20\2\2\u0081\u0082"+
		"\5&\24\2\u0082\u0083\7\21\2\2\u0083#\3\2\2\2\u0084\u0085\7\23\2\2\u0085"+
		"\u0086\7\20\2\2\u0086\u0087\5\20\t\2\u0087\u0088\5\26\f\2\u0088\u0089"+
		"\7\21\2\2\u0089%\3\2\2\2\u008a\u0092\5\22\n\2\u008b\u0092\5\24\13\2\u008c"+
		"\u0092\5\26\f\2\u008d\u0092\5\36\20\2\u008e\u0092\5 \21\2\u008f\u0092"+
		"\5\"\22\2\u0090\u0092\5$\23\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2"+
		"\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\'\3\2\2\2\u0093\u0094\5\16\b\2\u0094"+
		")\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u009b\5(\25\2\u0097\u0098\7\25\2"+
		"\2\u0098\u009a\5(\25\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\26\2\2\u009f+\3\2\2\2\u00a0\u00a1\7\24\2\2\u00a1\u00a6\5&\24"+
		"\2\u00a2\u00a3\7\25\2\2\u00a3\u00a5\5&\24\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\26\2\2\u00aa-\3\2\2\2\u00ab\u00ac"+
		"\7#\2\2\u00ac/\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\61\3\2\2\2\u00af\u00b0"+
		"\5.\30\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2\5\60\31\2\u00b2\63\3\2\2\2\u00b3"+
		"\u00b4\7\30\2\2\u00b4\u00b9\5\62\32\2\u00b5\u00b6\7\25\2\2\u00b6\u00b8"+
		"\5\62\32\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7\31\2\2\u00bd\65\3\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7\24\2\2\u00c0"+
		"\u00c1\7$\2\2\u00c1\u00c2\7\26\2\2\u00c2\67\3\2\2\2\u00c3\u00c4\5\16\b"+
		"\2\u00c4\u00c5\7\27\2\2\u00c59\3\2\2\2\u00c6\u00c8\7\4\2\2\u00c7\u00c9"+
		"\7#\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd;\3\2\2\2"+
		"\u00ce\u00cf\5\64\33\2\u00cf=\3\2\2\2\u00d0\u00d1\5&\24\2\u00d1?\3\2\2"+
		"\2\u00d2\u00d4\58\35\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\5:\36\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\5<\37\2\u00d8"+
		"\u00d9\7\33\2\2\u00d9\u00da\5,\27\2\u00da\u00db\7\34\2\2\u00db\u00dc\5"+
		"> \2\u00dc\u00dd\5\66\34\2\u00ddA\3\2\2\2\16GMQYcx\u0091\u009b\u00a6\u00b9"+
		"\u00ca\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}