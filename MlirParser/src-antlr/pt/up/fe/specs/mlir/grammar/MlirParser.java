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
		DIGIT=32, HEX_DIGIT=33, RANKED_DIMENSION=34, INTTYPE_WIDTH=35, FLOAT_PRECISION=36, 
		ID=37, PATH=38, LETTER=39, UNDERSCORE=40, ID_CHARS=41, WS=42;
	public static final int
		RULE_root = 0, RULE_bool_literal = 1, RULE_decimal_literal = 2, RULE_hexadecimal_literal = 3, 
		RULE_integer_literal = 4, RULE_negated_integer_literal = 5, RULE_posneg_integer_literal = 6, 
		RULE_float_literal = 7, RULE_string_literal = 8, RULE_constant_literal = 9, 
		RULE_bare_id = 10, RULE_suffix_id = 11, RULE_dimension = 12, RULE_static_dimension_list = 13, 
		RULE_dimension_list_ranked = 14, RULE_dimension_list_unranked = 15, RULE_dimension_list = 16, 
		RULE_ssa_id = 17, RULE_symbol_ref_id = 18, RULE_block_id = 19, RULE_type_alias = 20, 
		RULE_map_or_set_id = 21, RULE_attribute_alias = 22, RULE_ssa_id_list = 23, 
		RULE_none_type = 24, RULE_float_type = 25, RULE_index_type = 26, RULE_inttype_width = 27, 
		RULE_signed_integer_type = 28, RULE_unsigned_integer_type = 29, RULE_signless_integer_type = 30, 
		RULE_integer_type = 31, RULE_simple_type = 32, RULE_stride_list = 33, 
		RULE_strided_layout = 34, RULE_ranked_memref_type = 35, RULE_memref_type = 36;
	public static final String[] ruleNames = {
		"root", "bool_literal", "decimal_literal", "hexadecimal_literal", "integer_literal", 
		"negated_integer_literal", "posneg_integer_literal", "float_literal", 
		"string_literal", "constant_literal", "bare_id", "suffix_id", "dimension", 
		"static_dimension_list", "dimension_list_ranked", "dimension_list_unranked", 
		"dimension_list", "ssa_id", "symbol_ref_id", "block_id", "type_alias", 
		"map_or_set_id", "attribute_alias", "ssa_id_list", "none_type", "float_type", 
		"index_type", "inttype_width", "signed_integer_type", "unsigned_integer_type", 
		"signless_integer_type", "integer_type", "simple_type", "stride_list", 
		"strided_layout", "ranked_memref_type", "memref_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'0x'", "'-'", "'\"'", "'?'", "'x'", "'?x'", 
		"'*'", "'%'", "'#'", "'@'", "'^'", "'!'", "','", "'none'", "'f16'", "'bf16'", 
		"'f32'", "'f64'", "'index'", "'si'", "'ui'", "'i'", "'['", "']'", "'offset:'", 
		"'strides: '", "'memref'", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DIGIT", "HEX_DIGIT", 
		"RANKED_DIMENSION", "INTTYPE_WIDTH", "FLOAT_PRECISION", "ID", "PATH", 
		"LETTER", "UNDERSCORE", "ID_CHARS", "WS"
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
		public Memref_typeContext memref_type() {
			return getRuleContext(Memref_typeContext.class,0);
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
			setState(74);
			memref_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		enterRule(_localctx, 4, RULE_decimal_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				match(DIGIT);
				}
				}
				setState(81); 
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
		enterRule(_localctx, 6, RULE_hexadecimal_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__2);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(HEX_DIGIT);
				}
				}
				setState(87); 
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
		enterRule(_localctx, 8, RULE_integer_literal);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				decimal_literal();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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

	public static class Negated_integer_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negated_integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negated_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterNegated_integer_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitNegated_integer_literal(this);
		}
	}

	public final Negated_integer_literalContext negated_integer_literal() throws RecognitionException {
		Negated_integer_literalContext _localctx = new Negated_integer_literalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_negated_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__3);
			setState(94);
			integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Posneg_integer_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negated_integer_literalContext negated_integer_literal() {
			return getRuleContext(Negated_integer_literalContext.class,0);
		}
		public Posneg_integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posneg_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterPosneg_integer_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitPosneg_integer_literal(this);
		}
	}

	public final Posneg_integer_literalContext posneg_integer_literal() throws RecognitionException {
		Posneg_integer_literalContext _localctx = new Posneg_integer_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_posneg_integer_literal);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case T__2:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				integer_literal();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				negated_integer_literal();
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
		enterRule(_localctx, 14, RULE_float_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			setState(103);
			match(ID);
			setState(104);
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

	public static class Constant_literalContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Constant_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterConstant_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitConstant_literal(this);
		}
	}

	public final Constant_literalContext constant_literal() throws RecognitionException {
		Constant_literalContext _localctx = new Constant_literalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant_literal);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				bool_literal();
				}
				break;
			case T__2:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				integer_literal();
				}
				break;
			case FLOAT_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				float_literal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				string_literal();
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

	public static class Bare_idContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(MlirParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(MlirParser.LETTER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(MlirParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MlirParser.UNDERSCORE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MlirParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MlirParser.DIGIT, i);
		}
		public List<TerminalNode> ID_CHARS() { return getTokens(MlirParser.ID_CHARS); }
		public TerminalNode ID_CHARS(int i) {
			return getToken(MlirParser.ID_CHARS, i);
		}
		public Bare_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bare_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBare_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBare_id(this);
		}
	}

	public final Bare_idContext bare_id() throws RecognitionException {
		Bare_idContext _localctx = new Bare_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bare_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==UNDERSCORE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << UNDERSCORE) | (1L << ID_CHARS))) != 0)) {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << UNDERSCORE) | (1L << ID_CHARS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class Suffix_idContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MlirParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MlirParser.DIGIT, i);
		}
		public Bare_idContext bare_id() {
			return getRuleContext(Bare_idContext.class,0);
		}
		public Suffix_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSuffix_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSuffix_id(this);
		}
	}

	public final Suffix_idContext suffix_id() throws RecognitionException {
		Suffix_idContext _localctx = new Suffix_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_suffix_id);
		int _la;
		try {
			setState(125);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					match(DIGIT);
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case LETTER:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				bare_id();
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

	public static class DimensionContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
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
		enterRule(_localctx, 24, RULE_dimension);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__5);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				decimal_literal();
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

	public static class Static_dimension_listContext extends ParserRuleContext {
		public List<Decimal_literalContext> decimal_literal() {
			return getRuleContexts(Decimal_literalContext.class);
		}
		public Decimal_literalContext decimal_literal(int i) {
			return getRuleContext(Decimal_literalContext.class,i);
		}
		public Static_dimension_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_dimension_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStatic_dimension_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStatic_dimension_list(this);
		}
	}

	public final Static_dimension_listContext static_dimension_list() throws RecognitionException {
		Static_dimension_listContext _localctx = new Static_dimension_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_static_dimension_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				decimal_literal();
				setState(132);
				match(T__6);
				}
				}
				setState(136); 
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

	public static class Dimension_list_rankedContext extends ParserRuleContext {
		public Token s8;
		public List<Token> dims = new ArrayList<Token>();
		public Token RANKED_DIMENSION;
		public List<TerminalNode> RANKED_DIMENSION() { return getTokens(MlirParser.RANKED_DIMENSION); }
		public TerminalNode RANKED_DIMENSION(int i) {
			return getToken(MlirParser.RANKED_DIMENSION, i);
		}
		public Dimension_list_rankedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_list_ranked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimension_list_ranked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimension_list_ranked(this);
		}
	}

	public final Dimension_list_rankedContext dimension_list_ranked() throws RecognitionException {
		Dimension_list_rankedContext _localctx = new Dimension_list_rankedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dimension_list_ranked);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(140);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(138);
					((Dimension_list_rankedContext)_localctx).s8 = match(T__7);
					((Dimension_list_rankedContext)_localctx).dims.add(((Dimension_list_rankedContext)_localctx).s8);
					}
					break;
				case RANKED_DIMENSION:
					{
					setState(139);
					((Dimension_list_rankedContext)_localctx).RANKED_DIMENSION = match(RANKED_DIMENSION);
					((Dimension_list_rankedContext)_localctx).dims.add(((Dimension_list_rankedContext)_localctx).RANKED_DIMENSION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==RANKED_DIMENSION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dimension_list_unrankedContext extends ParserRuleContext {
		public Dimension_list_unrankedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_list_unranked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimension_list_unranked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimension_list_unranked(this);
		}
	}

	public final Dimension_list_unrankedContext dimension_list_unranked() throws RecognitionException {
		Dimension_list_unrankedContext _localctx = new Dimension_list_unrankedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dimension_list_unranked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__8);
			setState(145);
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

	public static class Dimension_listContext extends ParserRuleContext {
		public Dimension_list_rankedContext dimension_list_ranked() {
			return getRuleContext(Dimension_list_rankedContext.class,0);
		}
		public Dimension_list_unrankedContext dimension_list_unranked() {
			return getRuleContext(Dimension_list_unrankedContext.class,0);
		}
		public Dimension_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterDimension_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitDimension_list(this);
		}
	}

	public final Dimension_listContext dimension_list() throws RecognitionException {
		Dimension_listContext _localctx = new Dimension_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dimension_list);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case T__7:
			case RANKED_DIMENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				dimension_list_ranked();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				dimension_list_unranked();
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

	public static class Ssa_idContext extends ParserRuleContext {
		public Suffix_idContext suffix_id() {
			return getRuleContext(Suffix_idContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MlirParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MlirParser.DIGIT, i);
		}
		public Ssa_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ssa_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSsa_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSsa_id(this);
		}
	}

	public final Ssa_idContext ssa_id() throws RecognitionException {
		Ssa_idContext _localctx = new Ssa_idContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ssa_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__9);
			setState(152);
			suffix_id();
			setState(159);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(153);
				match(T__10);
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					match(DIGIT);
					}
					}
					setState(157); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
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

	public static class Symbol_ref_idContext extends ParserRuleContext {
		public Suffix_idContext suffix_id() {
			return getRuleContext(Suffix_idContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Symbol_ref_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_ref_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSymbol_ref_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSymbol_ref_id(this);
		}
	}

	public final Symbol_ref_idContext symbol_ref_id() throws RecognitionException {
		Symbol_ref_idContext _localctx = new Symbol_ref_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_symbol_ref_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__11);
			setState(164);
			switch (_input.LA(1)) {
			case DIGIT:
			case LETTER:
			case UNDERSCORE:
				{
				setState(162);
				suffix_id();
				}
				break;
			case T__4:
				{
				setState(163);
				string_literal();
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

	public static class Block_idContext extends ParserRuleContext {
		public Suffix_idContext suffix_id() {
			return getRuleContext(Suffix_idContext.class,0);
		}
		public Block_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterBlock_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitBlock_id(this);
		}
	}

	public final Block_idContext block_id() throws RecognitionException {
		Block_idContext _localctx = new Block_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__12);
			setState(167);
			suffix_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_aliasContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bare_idContext bare_id() {
			return getRuleContext(Bare_idContext.class,0);
		}
		public Type_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterType_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitType_alias(this);
		}
	}

	public final Type_aliasContext type_alias() throws RecognitionException {
		Type_aliasContext _localctx = new Type_aliasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__13);
			setState(172);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(170);
				string_literal();
				}
				break;
			case LETTER:
			case UNDERSCORE:
				{
				setState(171);
				bare_id();
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

	public static class Map_or_set_idContext extends ParserRuleContext {
		public Suffix_idContext suffix_id() {
			return getRuleContext(Suffix_idContext.class,0);
		}
		public Map_or_set_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_or_set_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterMap_or_set_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitMap_or_set_id(this);
		}
	}

	public final Map_or_set_idContext map_or_set_id() throws RecognitionException {
		Map_or_set_idContext _localctx = new Map_or_set_idContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_map_or_set_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__10);
			setState(175);
			suffix_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_aliasContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bare_idContext bare_id() {
			return getRuleContext(Bare_idContext.class,0);
		}
		public Attribute_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttribute_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttribute_alias(this);
		}
	}

	public final Attribute_aliasContext attribute_alias() throws RecognitionException {
		Attribute_aliasContext _localctx = new Attribute_aliasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attribute_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			setState(180);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(178);
				string_literal();
				}
				break;
			case LETTER:
			case UNDERSCORE:
				{
				setState(179);
				bare_id();
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

	public static class Ssa_id_listContext extends ParserRuleContext {
		public List<Ssa_idContext> ssa_id() {
			return getRuleContexts(Ssa_idContext.class);
		}
		public Ssa_idContext ssa_id(int i) {
			return getRuleContext(Ssa_idContext.class,i);
		}
		public Ssa_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ssa_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSsa_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSsa_id_list(this);
		}
	}

	public final Ssa_id_listContext ssa_id_list() throws RecognitionException {
		Ssa_id_listContext _localctx = new Ssa_id_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ssa_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			ssa_id();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(183);
				match(T__14);
				setState(184);
				ssa_id();
				}
				}
				setState(189);
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
		enterRule(_localctx, 48, RULE_none_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 50, RULE_float_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		enterRule(_localctx, 52, RULE_index_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Inttype_widthContext extends ParserRuleContext {
		public TerminalNode INTTYPE_WIDTH() { return getToken(MlirParser.INTTYPE_WIDTH, 0); }
		public Inttype_widthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inttype_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterInttype_width(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitInttype_width(this);
		}
	}

	public final Inttype_widthContext inttype_width() throws RecognitionException {
		Inttype_widthContext _localctx = new Inttype_widthContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inttype_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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

	public static class Signed_integer_typeContext extends ParserRuleContext {
		public Inttype_widthContext inttype_width() {
			return getRuleContext(Inttype_widthContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_signed_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__21);
			setState(199);
			inttype_width();
			}
		}
		catch (RecognitionException re) {
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
		public Inttype_widthContext inttype_width() {
			return getRuleContext(Inttype_widthContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_unsigned_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__22);
			setState(202);
			inttype_width();
			}
		}
		catch (RecognitionException re) {
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
		public Inttype_widthContext inttype_width() {
			return getRuleContext(Inttype_widthContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_signless_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__23);
			setState(205);
			inttype_width();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_integer_type);
		try {
			setState(210);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				signed_integer_type();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				unsigned_integer_type();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
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

	public static class Simple_typeContext extends ParserRuleContext {
		public None_typeContext none_type() {
			return getRuleContext(None_typeContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitSimple_type(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_simple_type);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				none_type();
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				float_type();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				index_type();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				integer_type();
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

	public static class Stride_listContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public Stride_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stride_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStride_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStride_list(this);
		}
	}

	public final Stride_listContext stride_list() throws RecognitionException {
		Stride_listContext _localctx = new Stride_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stride_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__24);
			setState(227);
			_la = _input.LA(1);
			if (_la==T__5 || _la==DIGIT) {
				{
				setState(219);
				dimension();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(220);
					match(T__14);
					setState(221);
					dimension();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(229);
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

	public static class Strided_layoutContext extends ParserRuleContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public Stride_listContext stride_list() {
			return getRuleContext(Stride_listContext.class,0);
		}
		public Strided_layoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strided_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterStrided_layout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitStrided_layout(this);
		}
	}

	public final Strided_layoutContext strided_layout() throws RecognitionException {
		Strided_layoutContext _localctx = new Strided_layoutContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_strided_layout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__26);
			setState(232);
			dimension();
			setState(233);
			match(T__14);
			setState(234);
			match(T__27);
			setState(235);
			stride_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ranked_memref_typeContext extends ParserRuleContext {
		public Dimension_list_rankedContext dimension_list_ranked() {
			return getRuleContext(Dimension_list_rankedContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Ranked_memref_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranked_memref_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterRanked_memref_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitRanked_memref_type(this);
		}
	}

	public final Ranked_memref_typeContext ranked_memref_type() throws RecognitionException {
		Ranked_memref_typeContext _localctx = new Ranked_memref_typeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ranked_memref_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__28);
			setState(238);
			match(T__29);
			setState(239);
			dimension_list_ranked();
			setState(240);
			simple_type();
			setState(241);
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

	public static class Memref_typeContext extends ParserRuleContext {
		public Ranked_memref_typeContext ranked_memref_type() {
			return getRuleContext(Ranked_memref_typeContext.class,0);
		}
		public Memref_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memref_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterMemref_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitMemref_type(this);
		}
	}

	public final Memref_typeContext memref_type() throws RecognitionException {
		Memref_typeContext _localctx = new Memref_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_memref_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			ranked_memref_type();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\6\4R\n\4\r\4\16"+
		"\4S\3\5\3\5\6\5X\n\5\r\5\16\5Y\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\b\3\b\5"+
		"\be\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13q\n\13\3\f\3\f"+
		"\7\fu\n\f\f\f\16\fx\13\f\3\r\6\r{\n\r\r\r\16\r|\3\r\5\r\u0080\n\r\3\16"+
		"\3\16\5\16\u0084\n\16\3\17\3\17\3\17\6\17\u0089\n\17\r\17\16\17\u008a"+
		"\3\20\3\20\6\20\u008f\n\20\r\20\16\20\u0090\3\21\3\21\3\21\3\22\3\22\5"+
		"\22\u0098\n\22\3\23\3\23\3\23\3\23\6\23\u009e\n\23\r\23\16\23\u009f\5"+
		"\23\u00a2\n\23\3\24\3\24\3\24\5\24\u00a7\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u00af\n\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00b7\n\30\3"+
		"\31\3\31\3\31\7\31\u00bc\n\31\f\31\16\31\u00bf\13\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\5!\u00d5\n!\3\"\3\"\3\"\3\"\5\"\u00db\n\"\3#\3#\3#\3#\7#\u00e1\n#\f"+
		"#\16#\u00e4\13#\5#\u00e6\n#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJ\2\6\3\2\3\4\3\2)*\4\2\"\")+\3\2\23\26\u00ee\2L\3\2\2"+
		"\2\4N\3\2\2\2\6Q\3\2\2\2\bU\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2"+
		"\20f\3\2\2\2\22h\3\2\2\2\24p\3\2\2\2\26r\3\2\2\2\30\177\3\2\2\2\32\u0083"+
		"\3\2\2\2\34\u0088\3\2\2\2\36\u008e\3\2\2\2 \u0092\3\2\2\2\"\u0097\3\2"+
		"\2\2$\u0099\3\2\2\2&\u00a3\3\2\2\2(\u00a8\3\2\2\2*\u00ab\3\2\2\2,\u00b0"+
		"\3\2\2\2.\u00b3\3\2\2\2\60\u00b8\3\2\2\2\62\u00c0\3\2\2\2\64\u00c2\3\2"+
		"\2\2\66\u00c4\3\2\2\28\u00c6\3\2\2\2:\u00c8\3\2\2\2<\u00cb\3\2\2\2>\u00ce"+
		"\3\2\2\2@\u00d4\3\2\2\2B\u00da\3\2\2\2D\u00dc\3\2\2\2F\u00e9\3\2\2\2H"+
		"\u00ef\3\2\2\2J\u00f5\3\2\2\2LM\5J&\2M\3\3\2\2\2NO\t\2\2\2O\5\3\2\2\2"+
		"PR\7\"\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UW\7\5\2"+
		"\2VX\7#\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[^\5\6\4"+
		"\2\\^\5\b\5\2][\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7\6\2\2`a\5\n\6\2a\r"+
		"\3\2\2\2be\5\n\6\2ce\5\f\7\2db\3\2\2\2dc\3\2\2\2e\17\3\2\2\2fg\7&\2\2"+
		"g\21\3\2\2\2hi\7\7\2\2ij\7\'\2\2jk\7\7\2\2k\23\3\2\2\2lq\5\4\3\2mq\5\n"+
		"\6\2nq\5\20\t\2oq\5\22\n\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\25"+
		"\3\2\2\2rv\t\3\2\2su\t\4\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w"+
		"\27\3\2\2\2xv\3\2\2\2y{\7\"\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\u0080\3\2\2\2~\u0080\5\26\f\2\177z\3\2\2\2\177~\3\2\2\2\u0080\31\3"+
		"\2\2\2\u0081\u0084\7\b\2\2\u0082\u0084\5\6\4\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\33\3\2\2\2\u0085\u0086\5\6\4\2\u0086\u0087\7\t\2"+
		"\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2\2\u008c\u008f\7\n\2\2\u008d"+
		"\u008f\7$\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\37\3\2\2\2\u0092\u0093"+
		"\7\13\2\2\u0093\u0094\7\t\2\2\u0094!\3\2\2\2\u0095\u0098\5\36\20\2\u0096"+
		"\u0098\5 \21\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098#\3\2\2\2"+
		"\u0099\u009a\7\f\2\2\u009a\u00a1\5\30\r\2\u009b\u009d\7\r\2\2\u009c\u009e"+
		"\7\"\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2%\3\2\2\2\u00a3\u00a6\7\16\2\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7"+
		"\5\22\n\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\'\3\2\2\2\u00a8"+
		"\u00a9\7\17\2\2\u00a9\u00aa\5\30\r\2\u00aa)\3\2\2\2\u00ab\u00ae\7\20\2"+
		"\2\u00ac\u00af\5\22\n\2\u00ad\u00af\5\26\f\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af+\3\2\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\5\30\r\2"+
		"\u00b2-\3\2\2\2\u00b3\u00b6\7\r\2\2\u00b4\u00b7\5\22\n\2\u00b5\u00b7\5"+
		"\26\f\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7/\3\2\2\2\u00b8\u00bd"+
		"\5$\23\2\u00b9\u00ba\7\21\2\2\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\61"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\63\3\2\2\2\u00c2"+
		"\u00c3\t\5\2\2\u00c3\65\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5\67\3\2\2\2"+
		"\u00c6\u00c7\7%\2\2\u00c79\3\2\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\5"+
		"8\35\2\u00ca;\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\58\35\2\u00cd="+
		"\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\58\35\2\u00d0?\3\2\2\2\u00d1"+
		"\u00d5\5:\36\2\u00d2\u00d5\5<\37\2\u00d3\u00d5\5> \2\u00d4\u00d1\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5A\3\2\2\2\u00d6\u00db"+
		"\5\62\32\2\u00d7\u00db\5\64\33\2\u00d8\u00db\5\66\34\2\u00d9\u00db\5@"+
		"!\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00dbC\3\2\2\2\u00dc\u00e5\7\33\2\2\u00dd\u00e2\5\32\16"+
		"\2\u00de\u00df\7\21\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\34\2\2\u00e8E\3\2\2\2\u00e9\u00ea\7\35\2"+
		"\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed\7\36\2\2\u00ed"+
		"\u00ee\5D#\2\u00eeG\3\2\2\2\u00ef\u00f0\7\37\2\2\u00f0\u00f1\7 \2\2\u00f1"+
		"\u00f2\5\36\20\2\u00f2\u00f3\5B\"\2\u00f3\u00f4\7!\2\2\u00f4I\3\2\2\2"+
		"\u00f5\u00f6\5H%\2\u00f6K\3\2\2\2\31SY]dpv|\177\u0083\u008a\u008e\u0090"+
		"\u0097\u009f\u00a1\u00a6\u00ae\u00b6\u00bd\u00d4\u00da\u00e2\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}