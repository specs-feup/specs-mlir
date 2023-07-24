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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, DIGIT=9, 
		HEX_DIGIT=10, RANKED_DIMENSION=11, FLOAT_PRECISION=12, ID=13, PATH=14, 
		LETTER=15, UNDERSCORE=16, ID_CHARS=17, WS=18;
	public static final int
		RULE_root = 0, RULE_bool_literal = 1, RULE_decimal_literal = 2, RULE_hexadecimal_literal = 3, 
		RULE_integer_literal = 4, RULE_negated_integer_literal = 5, RULE_posneg_integer_literal = 6, 
		RULE_float_literal = 7, RULE_string_literal = 8, RULE_constant_literal = 9, 
		RULE_bare_id = 10, RULE_suffix_id = 11, RULE_dimension = 12, RULE_static_dimension_list = 13, 
		RULE_dimension_list_ranked = 14, RULE_dimension_list_unranked = 15, RULE_dimension_list = 16;
	public static final String[] ruleNames = {
		"root", "bool_literal", "decimal_literal", "hexadecimal_literal", "integer_literal", 
		"negated_integer_literal", "posneg_integer_literal", "float_literal", 
		"string_literal", "constant_literal", "bare_id", "suffix_id", "dimension", 
		"static_dimension_list", "dimension_list_ranked", "dimension_list_unranked", 
		"dimension_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'0x'", "'-'", "'\"'", "'?'", "'x'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "DIGIT", "HEX_DIGIT", 
		"RANKED_DIMENSION", "FLOAT_PRECISION", "ID", "PATH", "LETTER", "UNDERSCORE", 
		"ID_CHARS", "WS"
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
		public Dimension_listContext dimension_list() {
			return getRuleContext(Dimension_listContext.class,0);
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
			setState(34);
			dimension_list();
			}
		}
		catch (RecognitionException re) {
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
			setState(36);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(DIGIT);
				}
				}
				setState(41); 
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
			setState(43);
			match(T__2);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(HEX_DIGIT);
				}
				}
				setState(47); 
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
			setState(51);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				decimal_literal();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
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
			setState(53);
			match(T__3);
			setState(54);
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
			setState(58);
			switch (_input.LA(1)) {
			case T__2:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				integer_literal();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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
			setState(60);
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
			setState(62);
			match(T__4);
			setState(63);
			match(ID);
			setState(64);
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
			setState(70);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				bool_literal();
				}
				break;
			case T__2:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				integer_literal();
				}
				break;
			case FLOAT_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				float_literal();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
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
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==UNDERSCORE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << UNDERSCORE) | (1L << ID_CHARS))) != 0)) {
				{
				{
				setState(73);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << UNDERSCORE) | (1L << ID_CHARS))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(78);
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
			setState(85);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					match(DIGIT);
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case LETTER:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
			setState(89);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__5);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				decimal_literal();
				setState(92);
				match(T__6);
				}
				}
				setState(96); 
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
			setState(104);
			match(T__7);
			setState(105);
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
			setState(109);
			switch (_input.LA(1)) {
			case EOF:
			case RANKED_DIMENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				dimension_list_ranked();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\3\3\3\3\3\4\6\4*\n\4\r\4\16\4+\3\5\3\5\6\5\60\n\5\r\5\16\5\61\3\6\3"+
		"\6\5\6\66\n\6\3\7\3\7\3\7\3\b\3\b\5\b=\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13I\n\13\3\f\3\f\7\fM\n\f\f\f\16\fP\13\f\3\r\6\rS\n"+
		"\r\r\r\16\rT\3\r\5\rX\n\r\3\16\3\16\5\16\\\n\16\3\17\3\17\3\17\6\17a\n"+
		"\17\r\17\16\17b\3\20\7\20f\n\20\f\20\16\20i\13\20\3\21\3\21\3\21\3\22"+
		"\3\22\5\22p\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"\2\5\3\2\3\4\3\2\21\22\4\2\13\13\21\23n\2$\3\2\2\2\4&\3\2\2\2\6)\3\2\2"+
		"\2\b-\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16<\3\2\2\2\20>\3\2\2\2\22@\3"+
		"\2\2\2\24H\3\2\2\2\26J\3\2\2\2\30W\3\2\2\2\32[\3\2\2\2\34`\3\2\2\2\36"+
		"g\3\2\2\2 j\3\2\2\2\"o\3\2\2\2$%\5\"\22\2%\3\3\2\2\2&\'\t\2\2\2\'\5\3"+
		"\2\2\2(*\7\13\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-"+
		"/\7\5\2\2.\60\7\f\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\t\3\2\2\2\63\66\5\6\4\2\64\66\5\b\5\2\65\63\3\2\2\2\65\64\3\2\2"+
		"\2\66\13\3\2\2\2\678\7\6\2\289\5\n\6\29\r\3\2\2\2:=\5\n\6\2;=\5\f\7\2"+
		"<:\3\2\2\2<;\3\2\2\2=\17\3\2\2\2>?\7\16\2\2?\21\3\2\2\2@A\7\7\2\2AB\7"+
		"\17\2\2BC\7\7\2\2C\23\3\2\2\2DI\5\4\3\2EI\5\n\6\2FI\5\20\t\2GI\5\22\n"+
		"\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\25\3\2\2\2JN\t\3\2\2KM\t\4"+
		"\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\27\3\2\2\2PN\3\2\2\2QS\7"+
		"\13\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VX\5\26\f\2W"+
		"R\3\2\2\2WV\3\2\2\2X\31\3\2\2\2Y\\\7\b\2\2Z\\\5\6\4\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\33\3\2\2\2]^\5\6\4\2^_\7\t\2\2_a\3\2\2\2`]\3\2\2\2ab\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2c\35\3\2\2\2df\7\r\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h\37\3\2\2\2ig\3\2\2\2jk\7\n\2\2kl\7\t\2\2l!\3\2\2\2mp\5\36"+
		"\20\2np\5 \21\2om\3\2\2\2on\3\2\2\2p#\3\2\2\2\16+\61\65<HNTW[bgo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}