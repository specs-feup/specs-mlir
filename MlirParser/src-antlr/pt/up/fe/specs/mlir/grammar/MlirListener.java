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
	 * Enter a parse tree produced by {@link MlirParser#keyword_type_float}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_type_float(MlirParser.Keyword_type_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#keyword_type_float}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_type_float(MlirParser.Keyword_type_floatContext ctx);
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
	 * labeled alternative in {@link MlirParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLocation(MlirParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Location}
	 * labeled alternative in {@link MlirParser#loc}.
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