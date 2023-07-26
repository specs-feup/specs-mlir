// Generated from pt\u005Cup\fe\specs\mlir\grammar\Mlir.g4 by ANTLR 4.5.3

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
	 * Enter a parse tree produced by {@link MlirParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(MlirParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(MlirParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(MlirParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(MlirParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MlirParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MlirParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#bareId}.
	 * @param ctx the parse tree
	 */
	void enterBareId(MlirParser.BareIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#bareId}.
	 * @param ctx the parse tree
	 */
	void exitBareId(MlirParser.BareIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#bareIdList}.
	 * @param ctx the parse tree
	 */
	void enterBareIdList(MlirParser.BareIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#bareIdList}.
	 * @param ctx the parse tree
	 */
	void exitBareIdList(MlirParser.BareIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(MlirParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(MlirParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#idSsa}.
	 * @param ctx the parse tree
	 */
	void enterIdSsa(MlirParser.IdSsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#idSsa}.
	 * @param ctx the parse tree
	 */
	void exitIdSsa(MlirParser.IdSsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dimensionListRanked}.
	 * @param ctx the parse tree
	 */
	void enterDimensionListRanked(MlirParser.DimensionListRankedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimensionListRanked}.
	 * @param ctx the parse tree
	 */
	void exitDimensionListRanked(MlirParser.DimensionListRankedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#noneType}.
	 * @param ctx the parse tree
	 */
	void enterNoneType(MlirParser.NoneTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#noneType}.
	 * @param ctx the parse tree
	 */
	void exitNoneType(MlirParser.NoneTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MlirParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MlirParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#floatType}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(MlirParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#floatType}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(MlirParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#signedIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterSignedIntegerType(MlirParser.SignedIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#signedIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitSignedIntegerType(MlirParser.SignedIntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedIntegerType(MlirParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#unsignedIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedIntegerType(MlirParser.UnsignedIntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#signlessIntegerType}.
	 * @param ctx the parse tree
	 */
	void enterSignlessIntegerType(MlirParser.SignlessIntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#signlessIntegerType}.
	 * @param ctx the parse tree
	 */
	void exitSignlessIntegerType(MlirParser.SignlessIntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(MlirParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(MlirParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(MlirParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(MlirParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(MlirParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(MlirParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#tensorType}.
	 * @param ctx the parse tree
	 */
	void enterTensorType(MlirParser.TensorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#tensorType}.
	 * @param ctx the parse tree
	 */
	void exitTensorType(MlirParser.TensorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MlirParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MlirParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(MlirParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(MlirParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#operandList}.
	 * @param ctx the parse tree
	 */
	void enterOperandList(MlirParser.OperandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#operandList}.
	 * @param ctx the parse tree
	 */
	void exitOperandList(MlirParser.OperandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#operandTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOperandTypeList(MlirParser.OperandTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#operandTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOperandTypeList(MlirParser.OperandTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#attributesProperty}.
	 * @param ctx the parse tree
	 */
	void enterAttributesProperty(MlirParser.AttributesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#attributesProperty}.
	 * @param ctx the parse tree
	 */
	void exitAttributesProperty(MlirParser.AttributesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#attributesValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributesValue(MlirParser.AttributesValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#attributesValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributesValue(MlirParser.AttributesValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#attributesEntry}.
	 * @param ctx the parse tree
	 */
	void enterAttributesEntry(MlirParser.AttributesEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#attributesEntry}.
	 * @param ctx the parse tree
	 */
	void exitAttributesEntry(MlirParser.AttributesEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(MlirParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(MlirParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#trailingLocation}.
	 * @param ctx the parse tree
	 */
	void enterTrailingLocation(MlirParser.TrailingLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#trailingLocation}.
	 * @param ctx the parse tree
	 */
	void exitTrailingLocation(MlirParser.TrailingLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#opResult}.
	 * @param ctx the parse tree
	 */
	void enterOpResult(MlirParser.OpResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#opResult}.
	 * @param ctx the parse tree
	 */
	void exitOpResult(MlirParser.OpResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#opAttributes}.
	 * @param ctx the parse tree
	 */
	void enterOpAttributes(MlirParser.OpAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#opAttributes}.
	 * @param ctx the parse tree
	 */
	void exitOpAttributes(MlirParser.OpAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#opReturnType}.
	 * @param ctx the parse tree
	 */
	void enterOpReturnType(MlirParser.OpReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#opReturnType}.
	 * @param ctx the parse tree
	 */
	void exitOpReturnType(MlirParser.OpReturnTypeContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MlirParser#genericOperation}.
	 * @param ctx the parse tree
	 */
	void enterGenericOperation(MlirParser.GenericOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#genericOperation}.
	 * @param ctx the parse tree
	 */
	void exitGenericOperation(MlirParser.GenericOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#customOperation}.
	 * @param ctx the parse tree
	 */
	void enterCustomOperation(MlirParser.CustomOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#customOperation}.
	 * @param ctx the parse tree
	 */
	void exitCustomOperation(MlirParser.CustomOperationContext ctx);
}