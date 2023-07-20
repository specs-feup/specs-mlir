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
		DIGIT=18, RANKED_DIMENSION=19, ID=20, PATH=21, TRUE=22, WS=23;
	public static final int
		RULE_root = 0, RULE_id_ssa = 1, RULE_dimension_list_ranked = 2, RULE_keyword_type_float = 3, 
		RULE_tensor_type = 4, RULE_type = 5, RULE_operand = 6, RULE_operand_list = 7, 
		RULE_operand_type_list = 8, RULE_attr_property = 9, RULE_attr_value = 10, 
		RULE_attr_entry = 11, RULE_attributes = 12, RULE_loc = 13, RULE_op_result = 14, 
		RULE_op_name = 15, RULE_op_attributes = 16, RULE_op_return_type_list = 17, 
		RULE_operation = 18;
	public static final String[] ruleNames = {
		"root", "id_ssa", "dimension_list_ranked", "keyword_type_float", "tensor_type", 
		"type", "operand", "operand_list", "operand_type_list", "attr_property", 
		"attr_value", "attr_entry", "attributes", "loc", "op_result", "op_name", 
		"op_attributes", "op_return_type_list", "operation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'f16'", "'f32'", "'f64'", "'tensor'", "'<'", "'>'", "'('", 
		"','", "')'", "'='", "'{'", "'}'", "'loc'", "'\"'", "':'", "'->'", null, 
		null, null, null, "'true'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "DIGIT", "RANKED_DIMENSION", "ID", 
		"PATH", "TRUE", "WS"
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
			setState(38);
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
		enterRule(_localctx, 2, RULE_id_ssa);
		try {
			_localctx = new ValueIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
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
		enterRule(_localctx, 4, RULE_dimension_list_ranked);
		int _la;
		try {
			_localctx = new RankedDimensionListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RANKED_DIMENSION) {
				{
				{
				setState(43);
				match(RANKED_DIMENSION);
				}
				}
				setState(48);
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

	public static class Keyword_type_floatContext extends ParserRuleContext {
		public Keyword_type_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_type_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterKeyword_type_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitKeyword_type_float(this);
		}
	}

	public final Keyword_type_floatContext keyword_type_float() throws RecognitionException {
		Keyword_type_floatContext _localctx = new Keyword_type_floatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyword_type_float);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
		public Keyword_type_floatContext keyword_type_float() {
			return getRuleContext(Keyword_type_floatContext.class,0);
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
		enterRule(_localctx, 8, RULE_tensor_type);
		try {
			_localctx = new TensorTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(T__5);
			setState(53);
			dimension_list_ranked();
			setState(54);
			keyword_type_float();
			setState(55);
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

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			_localctx = new TypeDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			tensor_type();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_operand);
		try {
			_localctx = new InputOperandContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		enterRule(_localctx, 14, RULE_operand_list);
		int _la;
		try {
			_localctx = new OperandListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__7);
			setState(62);
			operand();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(63);
				match(T__8);
				setState(64);
				operand();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
		enterRule(_localctx, 16, RULE_operand_type_list);
		int _la;
		try {
			_localctx = new OperandTypeListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			setState(73);
			type();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(74);
				match(T__8);
				setState(75);
				type();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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

	public static class Attr_propertyContext extends ParserRuleContext {
		public Attr_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_property; }
	 
		public Attr_propertyContext() { }
		public void copyFrom(Attr_propertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributePropetyContext extends Attr_propertyContext {
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
		public AttributePropetyContext(Attr_propertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributePropety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributePropety(this);
		}
	}

	public final Attr_propertyContext attr_property() throws RecognitionException {
		Attr_propertyContext _localctx = new Attr_propertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr_property);
		try {
			_localctx = new AttributePropetyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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

	public static class Attr_valueContext extends ParserRuleContext {
		public Attr_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_value; }
	 
		public Attr_valueContext() { }
		public void copyFrom(Attr_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeValueContext extends Attr_valueContext {
		public TerminalNode ID() { return getToken(MlirParser.ID, 0); }
		public TerminalNode DIGIT() { return getToken(MlirParser.DIGIT, 0); }
		public AttributeValueContext(Attr_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributeValue(this);
		}
	}

	public final Attr_valueContext attr_value() throws RecognitionException {
		Attr_valueContext _localctx = new Attr_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr_value);
		int _la;
		try {
			_localctx = new AttributeValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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

	public static class Attr_entryContext extends ParserRuleContext {
		public Attr_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_entry; }
	 
		public Attr_entryContext() { }
		public void copyFrom(Attr_entryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttributeEntryContext extends Attr_entryContext {
		public Attr_propertyContext attr_property() {
			return getRuleContext(Attr_propertyContext.class,0);
		}
		public Attr_valueContext attr_value() {
			return getRuleContext(Attr_valueContext.class,0);
		}
		public AttributeEntryContext(Attr_entryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterAttributeEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitAttributeEntry(this);
		}
	}

	public final Attr_entryContext attr_entry() throws RecognitionException {
		Attr_entryContext _localctx = new Attr_entryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attr_entry);
		try {
			_localctx = new AttributeEntryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			attr_property();
			setState(88);
			match(T__10);
			setState(89);
			attr_value();
			}
		}
		catch (RecognitionException re) {
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
		public List<Attr_entryContext> attr_entry() {
			return getRuleContexts(Attr_entryContext.class);
		}
		public Attr_entryContext attr_entry(int i) {
			return getRuleContext(Attr_entryContext.class,i);
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
		enterRule(_localctx, 24, RULE_attributes);
		int _la;
		try {
			_localctx = new AttributeDictionaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__11);
			setState(92);
			attr_entry();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(93);
				match(T__8);
				setState(94);
				attr_entry();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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

	public static class LocContext extends ParserRuleContext {
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
	 
		public LocContext() { }
		public void copyFrom(LocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocationContext extends LocContext {
		public TerminalNode PATH() { return getToken(MlirParser.PATH, 0); }
		public LocationContext(LocContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitLocation(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loc);
		try {
			_localctx = new LocationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__13);
			setState(103);
			match(T__7);
			setState(104);
			match(PATH);
			setState(105);
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
		enterRule(_localctx, 28, RULE_op_result);
		try {
			_localctx = new OperationResultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			id_ssa();
			setState(108);
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
		enterRule(_localctx, 30, RULE_op_name);
		int _la;
		try {
			_localctx = new OperationNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__14);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(ID);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(116);
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
		enterRule(_localctx, 32, RULE_op_attributes);
		try {
			_localctx = new OperationAttributesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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

	public static class Op_return_type_listContext extends ParserRuleContext {
		public Op_return_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_return_type_list; }
	 
		public Op_return_type_listContext() { }
		public void copyFrom(Op_return_type_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationReturnTypeListContext extends Op_return_type_listContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public OperationReturnTypeListContext(Op_return_type_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).enterOperationReturnTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MlirListener ) ((MlirListener)listener).exitOperationReturnTypeList(this);
		}
	}

	public final Op_return_type_listContext op_return_type_list() throws RecognitionException {
		Op_return_type_listContext _localctx = new Op_return_type_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op_return_type_list);
		int _la;
		try {
			_localctx = new OperationReturnTypeListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
			setState(121);
			type();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(122);
				match(T__8);
				setState(123);
				type();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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

	public static class OperationContext extends ParserRuleContext {
		public Op_nameContext op_name() {
			return getRuleContext(Op_nameContext.class,0);
		}
		public Operand_listContext operand_list() {
			return getRuleContext(Operand_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Operand_type_listContext operand_type_list() {
			return getRuleContext(Operand_type_listContext.class,0);
		}
		public Op_return_type_listContext op_return_type_list() {
			return getRuleContext(Op_return_type_listContext.class,0);
		}
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
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
		enterRule(_localctx, 36, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(131);
				op_result();
				}
			}

			setState(134);
			op_name();
			setState(135);
			operand_list();
			setState(136);
			attributes();
			setState(137);
			match(T__15);
			setState(138);
			operand_type_list();
			setState(139);
			match(T__16);
			setState(140);
			op_return_type_list();
			setState(141);
			loc();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\7\4/\n\4\f\4\16\4\62\13\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tD"+
		"\n\t\f\t\16\tG\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16b\n\16"+
		"\f\16\16\16e\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\6\21s\n\21\r\21\16\21t\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\177\n\23\f\23\16\23\u0082\13\23\3\23\3\23\3\24\5\24\u0087\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\4\6\4\2\24\24\26\26\u0085\2(\3\2"+
		"\2\2\4*\3\2\2\2\6\60\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f;\3\2\2\2\16="+
		"\3\2\2\2\20?\3\2\2\2\22J\3\2\2\2\24U\3\2\2\2\26W\3\2\2\2\30Y\3\2\2\2\32"+
		"]\3\2\2\2\34h\3\2\2\2\36m\3\2\2\2 p\3\2\2\2\"x\3\2\2\2$z\3\2\2\2&\u0086"+
		"\3\2\2\2()\5&\24\2)\3\3\2\2\2*+\7\3\2\2+,\7\26\2\2,\5\3\2\2\2-/\7\25\2"+
		"\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2\2\62\60"+
		"\3\2\2\2\63\64\t\2\2\2\64\t\3\2\2\2\65\66\7\7\2\2\66\67\7\b\2\2\678\5"+
		"\6\4\289\5\b\5\29:\7\t\2\2:\13\3\2\2\2;<\5\n\6\2<\r\3\2\2\2=>\5\4\3\2"+
		">\17\3\2\2\2?@\7\n\2\2@E\5\16\b\2AB\7\13\2\2BD\5\16\b\2CA\3\2\2\2DG\3"+
		"\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\f\2\2I\21\3\2\2\2J"+
		"K\7\n\2\2KP\5\f\7\2LM\7\13\2\2MO\5\f\7\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\f\2\2T\23\3\2\2\2UV\7\26\2\2V\25\3"+
		"\2\2\2WX\t\3\2\2X\27\3\2\2\2YZ\5\24\13\2Z[\7\r\2\2[\\\5\26\f\2\\\31\3"+
		"\2\2\2]^\7\16\2\2^c\5\30\r\2_`\7\13\2\2`b\5\30\r\2a_\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\17\2\2g\33\3\2\2\2hi\7\20"+
		"\2\2ij\7\n\2\2jk\7\27\2\2kl\7\f\2\2l\35\3\2\2\2mn\5\4\3\2no\7\r\2\2o\37"+
		"\3\2\2\2pr\7\21\2\2qs\7\26\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"uv\3\2\2\2vw\7\21\2\2w!\3\2\2\2xy\5\32\16\2y#\3\2\2\2z{\7\n\2\2{\u0080"+
		"\5\f\7\2|}\7\13\2\2}\177\5\f\7\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7\f\2\2\u0084%\3\2\2\2\u0085\u0087\5\36\20\2\u0086\u0085\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5 \21\2\u0089\u008a"+
		"\5\20\t\2\u008a\u008b\5\32\16\2\u008b\u008c\7\22\2\2\u008c\u008d\5\22"+
		"\n\2\u008d\u008e\7\23\2\2\u008e\u008f\5$\23\2\u008f\u0090\5\34\17\2\u0090"+
		"\'\3\2\2\2\t\60EPct\u0080\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}