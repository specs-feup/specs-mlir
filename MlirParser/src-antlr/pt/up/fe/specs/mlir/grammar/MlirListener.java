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
	 * Enter a parse tree produced by the {@code ValueID}
	 * labeled alternative in {@link MlirParser#id_ssa}.
	 * @param ctx the parse tree
	 */
	void enterValueID(MlirParser.ValueIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueID}
	 * labeled alternative in {@link MlirParser#id_ssa}.
	 * @param ctx the parse tree
	 */
	void exitValueID(MlirParser.ValueIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RankedDimensionList}
	 * labeled alternative in {@link MlirParser#dimension_list_ranked}.
	 * @param ctx the parse tree
	 */
	void enterRankedDimensionList(MlirParser.RankedDimensionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RankedDimensionList}
	 * labeled alternative in {@link MlirParser#dimension_list_ranked}.
	 * @param ctx the parse tree
	 */
	void exitRankedDimensionList(MlirParser.RankedDimensionListContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type(MlirParser.Complex_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#complex_type}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type(MlirParser.Complex_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(MlirParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(MlirParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TensorType}
	 * labeled alternative in {@link MlirParser#tensor_type}.
	 * @param ctx the parse tree
	 */
	void enterTensorType(MlirParser.TensorTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TensorType}
	 * labeled alternative in {@link MlirParser#tensor_type}.
	 * @param ctx the parse tree
	 */
	void exitTensorType(MlirParser.TensorTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNoneType(MlirParser.NoneTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNoneType(MlirParser.NoneTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MlirParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MlirParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(MlirParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(MlirParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(MlirParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(MlirParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(MlirParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(MlirParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(MlirParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(MlirParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MlirParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDeclaration}
	 * labeled alternative in {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MlirParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputOperand}
	 * labeled alternative in {@link MlirParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterInputOperand(MlirParser.InputOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputOperand}
	 * labeled alternative in {@link MlirParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitInputOperand(MlirParser.InputOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperandList}
	 * labeled alternative in {@link MlirParser#operand_list}.
	 * @param ctx the parse tree
	 */
	void enterOperandList(MlirParser.OperandListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperandList}
	 * labeled alternative in {@link MlirParser#operand_list}.
	 * @param ctx the parse tree
	 */
	void exitOperandList(MlirParser.OperandListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperandTypeList}
	 * labeled alternative in {@link MlirParser#operand_type_list}.
	 * @param ctx the parse tree
	 */
	void enterOperandTypeList(MlirParser.OperandTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperandTypeList}
	 * labeled alternative in {@link MlirParser#operand_type_list}.
	 * @param ctx the parse tree
	 */
	void exitOperandTypeList(MlirParser.OperandTypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributePropety}
	 * labeled alternative in {@link MlirParser#attributes_property}.
	 * @param ctx the parse tree
	 */
	void enterAttributePropety(MlirParser.AttributePropetyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributePropety}
	 * labeled alternative in {@link MlirParser#attributes_property}.
	 * @param ctx the parse tree
	 */
	void exitAttributePropety(MlirParser.AttributePropetyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeValue}
	 * labeled alternative in {@link MlirParser#attributes_value}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(MlirParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeValue}
	 * labeled alternative in {@link MlirParser#attributes_value}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(MlirParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeEntry}
	 * labeled alternative in {@link MlirParser#attributes_entry}.
	 * @param ctx the parse tree
	 */
	void enterAttributeEntry(MlirParser.AttributeEntryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeEntry}
	 * labeled alternative in {@link MlirParser#attributes_entry}.
	 * @param ctx the parse tree
	 */
	void exitAttributeEntry(MlirParser.AttributeEntryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDictionary}
	 * labeled alternative in {@link MlirParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDictionary(MlirParser.AttributeDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDictionary}
	 * labeled alternative in {@link MlirParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDictionary(MlirParser.AttributeDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Location}
	 * labeled alternative in {@link MlirParser#trailing_location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(MlirParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Location}
	 * labeled alternative in {@link MlirParser#trailing_location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(MlirParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationResult}
	 * labeled alternative in {@link MlirParser#operation_result}.
	 * @param ctx the parse tree
	 */
	void enterOperationResult(MlirParser.OperationResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationResult}
	 * labeled alternative in {@link MlirParser#operation_result}.
	 * @param ctx the parse tree
	 */
	void exitOperationResult(MlirParser.OperationResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationName}
	 * labeled alternative in {@link MlirParser#operation_name}.
	 * @param ctx the parse tree
	 */
	void enterOperationName(MlirParser.OperationNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationName}
	 * labeled alternative in {@link MlirParser#operation_name}.
	 * @param ctx the parse tree
	 */
	void exitOperationName(MlirParser.OperationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationAttributes}
	 * labeled alternative in {@link MlirParser#operation_attributes}.
	 * @param ctx the parse tree
	 */
	void enterOperationAttributes(MlirParser.OperationAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationAttributes}
	 * labeled alternative in {@link MlirParser#operation_attributes}.
	 * @param ctx the parse tree
	 */
	void exitOperationAttributes(MlirParser.OperationAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationReturnTypeList}
	 * labeled alternative in {@link MlirParser#operation_return_type_list}.
	 * @param ctx the parse tree
	 */
	void enterOperationReturnTypeList(MlirParser.OperationReturnTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationReturnTypeList}
	 * labeled alternative in {@link MlirParser#operation_return_type_list}.
	 * @param ctx the parse tree
	 */
	void exitOperationReturnTypeList(MlirParser.OperationReturnTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MlirParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MlirParser.OperationContext ctx);
}