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
}