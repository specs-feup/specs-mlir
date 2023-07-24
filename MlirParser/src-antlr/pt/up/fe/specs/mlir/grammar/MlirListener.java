// Generated from pt/up/fe/specs/mlir/grammar/Mlir.g4 by ANTLR 4.5.3

    package pt.up.fe.specs.mlir.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MlirParser}.
 */
public interface MlirListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MlirParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MlirParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MlirParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(MlirParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(MlirParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(MlirParser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(MlirParser.Decimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_literal(MlirParser.Hexadecimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#hexadecimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_literal(MlirParser.Hexadecimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(MlirParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(MlirParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#negated_integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterNegated_integer_literal(MlirParser.Negated_integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#negated_integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitNegated_integer_literal(MlirParser.Negated_integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#posneg_integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterPosneg_integer_literal(MlirParser.Posneg_integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#posneg_integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitPosneg_integer_literal(MlirParser.Posneg_integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(MlirParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(MlirParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(MlirParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(MlirParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#constant_literal}.
	 * @param ctx the parse tree
	 */
	void enterConstant_literal(MlirParser.Constant_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#constant_literal}.
	 * @param ctx the parse tree
	 */
	void exitConstant_literal(MlirParser.Constant_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#bare_id}.
	 * @param ctx the parse tree
	 */
	void enterBare_id(MlirParser.Bare_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#bare_id}.
	 * @param ctx the parse tree
	 */
	void exitBare_id(MlirParser.Bare_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#suffix_id}.
	 * @param ctx the parse tree
	 */
	void enterSuffix_id(MlirParser.Suffix_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#suffix_id}.
	 * @param ctx the parse tree
	 */
	void exitSuffix_id(MlirParser.Suffix_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(MlirParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(MlirParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#static_dimension_list}.
	 * @param ctx the parse tree
	 */
	void enterStatic_dimension_list(MlirParser.Static_dimension_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#static_dimension_list}.
	 * @param ctx the parse tree
	 */
	void exitStatic_dimension_list(MlirParser.Static_dimension_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dimension_list_ranked}.
	 * @param ctx the parse tree
	 */
	void enterDimension_list_ranked(MlirParser.Dimension_list_rankedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimension_list_ranked}.
	 * @param ctx the parse tree
	 */
	void exitDimension_list_ranked(MlirParser.Dimension_list_rankedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dimension_list_unranked}.
	 * @param ctx the parse tree
	 */
	void enterDimension_list_unranked(MlirParser.Dimension_list_unrankedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimension_list_unranked}.
	 * @param ctx the parse tree
	 */
	void exitDimension_list_unranked(MlirParser.Dimension_list_unrankedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dimension_list}.
	 * @param ctx the parse tree
	 */
	void enterDimension_list(MlirParser.Dimension_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimension_list}.
	 * @param ctx the parse tree
	 */
	void exitDimension_list(MlirParser.Dimension_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#ssa_id}.
	 * @param ctx the parse tree
	 */
	void enterSsa_id(MlirParser.Ssa_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#ssa_id}.
	 * @param ctx the parse tree
	 */
	void exitSsa_id(MlirParser.Ssa_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#symbol_ref_id}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_ref_id(MlirParser.Symbol_ref_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#symbol_ref_id}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_ref_id(MlirParser.Symbol_ref_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#block_id}.
	 * @param ctx the parse tree
	 */
	void enterBlock_id(MlirParser.Block_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#block_id}.
	 * @param ctx the parse tree
	 */
	void exitBlock_id(MlirParser.Block_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void enterType_alias(MlirParser.Type_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#type_alias}.
	 * @param ctx the parse tree
	 */
	void exitType_alias(MlirParser.Type_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#map_or_set_id}.
	 * @param ctx the parse tree
	 */
	void enterMap_or_set_id(MlirParser.Map_or_set_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#map_or_set_id}.
	 * @param ctx the parse tree
	 */
	void exitMap_or_set_id(MlirParser.Map_or_set_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#attribute_alias}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_alias(MlirParser.Attribute_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#attribute_alias}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_alias(MlirParser.Attribute_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#ssa_id_list}.
	 * @param ctx the parse tree
	 */
	void enterSsa_id_list(MlirParser.Ssa_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#ssa_id_list}.
	 * @param ctx the parse tree
	 */
	void exitSsa_id_list(MlirParser.Ssa_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#none_type}.
	 * @param ctx the parse tree
	 */
	void enterNone_type(MlirParser.None_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#none_type}.
	 * @param ctx the parse tree
	 */
	void exitNone_type(MlirParser.None_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_type(MlirParser.Float_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_type(MlirParser.Float_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(MlirParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(MlirParser.Index_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#inttype_width}.
	 * @param ctx the parse tree
	 */
	void enterInttype_width(MlirParser.Inttype_widthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#inttype_width}.
	 * @param ctx the parse tree
	 */
	void exitInttype_width(MlirParser.Inttype_widthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#signed_integer_type}.
	 * @param ctx the parse tree
	 */
	void enterSigned_integer_type(MlirParser.Signed_integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#signed_integer_type}.
	 * @param ctx the parse tree
	 */
	void exitSigned_integer_type(MlirParser.Signed_integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#unsigned_integer_type}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_integer_type(MlirParser.Unsigned_integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#unsigned_integer_type}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_integer_type(MlirParser.Unsigned_integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#signless_integer_type}.
	 * @param ctx the parse tree
	 */
	void enterSignless_integer_type(MlirParser.Signless_integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#signless_integer_type}.
	 * @param ctx the parse tree
	 */
	void exitSignless_integer_type(MlirParser.Signless_integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(MlirParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(MlirParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(MlirParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(MlirParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#stride_list}.
	 * @param ctx the parse tree
	 */
	void enterStride_list(MlirParser.Stride_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#stride_list}.
	 * @param ctx the parse tree
	 */
	void exitStride_list(MlirParser.Stride_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#strided_layout}.
	 * @param ctx the parse tree
	 */
	void enterStrided_layout(MlirParser.Strided_layoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#strided_layout}.
	 * @param ctx the parse tree
	 */
	void exitStrided_layout(MlirParser.Strided_layoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#ranked_memref_type}.
	 * @param ctx the parse tree
	 */
	void enterRanked_memref_type(MlirParser.Ranked_memref_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#ranked_memref_type}.
	 * @param ctx the parse tree
	 */
	void exitRanked_memref_type(MlirParser.Ranked_memref_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#memref_type}.
	 * @param ctx the parse tree
	 */
	void enterMemref_type(MlirParser.Memref_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#memref_type}.
	 * @param ctx the parse tree
	 */
	void exitMemref_type(MlirParser.Memref_typeContext ctx);
}