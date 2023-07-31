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
	 * Enter a parse tree produced by {@link MlirParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MlirParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MlirParser.DecimalLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MlirParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MlirParser.BooleanLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#symbolRefId}.
	 * @param ctx the parse tree
	 */
	void enterSymbolRefId(MlirParser.SymbolRefIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#symbolRefId}.
	 * @param ctx the parse tree
	 */
	void exitSymbolRefId(MlirParser.SymbolRefIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#valueIdList}.
	 * @param ctx the parse tree
	 */
	void enterValueIdList(MlirParser.ValueIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#valueIdList}.
	 * @param ctx the parse tree
	 */
	void exitValueIdList(MlirParser.ValueIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#valueUse}.
	 * @param ctx the parse tree
	 */
	void enterValueUse(MlirParser.ValueUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#valueUse}.
	 * @param ctx the parse tree
	 */
	void exitValueUse(MlirParser.ValueUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#valueUseList}.
	 * @param ctx the parse tree
	 */
	void enterValueUseList(MlirParser.ValueUseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#valueUseList}.
	 * @param ctx the parse tree
	 */
	void exitValueUseList(MlirParser.ValueUseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dictionaryProperties}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryProperties(MlirParser.DictionaryPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dictionaryProperties}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryProperties(MlirParser.DictionaryPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#dictionaryAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryAttribute(MlirParser.DictionaryAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dictionaryAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryAttribute(MlirParser.DictionaryAttributeContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#region}.
	 * @param ctx the parse tree
	 */
	void enterRegion(MlirParser.RegionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#region}.
	 * @param ctx the parse tree
	 */
	void exitRegion(MlirParser.RegionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#regionList}.
	 * @param ctx the parse tree
	 */
	void enterRegionList(MlirParser.RegionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#regionList}.
	 * @param ctx the parse tree
	 */
	void exitRegionList(MlirParser.RegionListContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#successorList}.
	 * @param ctx the parse tree
	 */
	void enterSuccessorList(MlirParser.SuccessorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#successorList}.
	 * @param ctx the parse tree
	 */
	void exitSuccessorList(MlirParser.SuccessorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#successor}.
	 * @param ctx the parse tree
	 */
	void enterSuccessor(MlirParser.SuccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#successor}.
	 * @param ctx the parse tree
	 */
	void exitSuccessor(MlirParser.SuccessorContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#opResultList}.
	 * @param ctx the parse tree
	 */
	void enterOpResultList(MlirParser.OpResultListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#opResultList}.
	 * @param ctx the parse tree
	 */
	void exitOpResultList(MlirParser.OpResultListContext ctx);
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
	 * Enter a parse tree produced by the {@code KnownLocation}
	 * labeled alternative in {@link MlirParser#location}.
	 * @param ctx the parse tree
	 */
	void enterKnownLocation(MlirParser.KnownLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KnownLocation}
	 * labeled alternative in {@link MlirParser#location}.
	 * @param ctx the parse tree
	 */
	void exitKnownLocation(MlirParser.KnownLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnknownLocation}
	 * labeled alternative in {@link MlirParser#location}.
	 * @param ctx the parse tree
	 */
	void enterUnknownLocation(MlirParser.UnknownLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnknownLocation}
	 * labeled alternative in {@link MlirParser#location}.
	 * @param ctx the parse tree
	 */
	void exitUnknownLocation(MlirParser.UnknownLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#valueIdAndType}.
	 * @param ctx the parse tree
	 */
	void enterValueIdAndType(MlirParser.ValueIdAndTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#valueIdAndType}.
	 * @param ctx the parse tree
	 */
	void exitValueIdAndType(MlirParser.ValueIdAndTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#valueIdAndTypeList}.
	 * @param ctx the parse tree
	 */
	void enterValueIdAndTypeList(MlirParser.ValueIdAndTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#valueIdAndTypeList}.
	 * @param ctx the parse tree
	 */
	void exitValueIdAndTypeList(MlirParser.ValueIdAndTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#blockArgList}.
	 * @param ctx the parse tree
	 */
	void enterBlockArgList(MlirParser.BlockArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#blockArgList}.
	 * @param ctx the parse tree
	 */
	void exitBlockArgList(MlirParser.BlockArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#blockLabel}.
	 * @param ctx the parse tree
	 */
	void enterBlockLabel(MlirParser.BlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#blockLabel}.
	 * @param ctx the parse tree
	 */
	void exitBlockLabel(MlirParser.BlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MlirParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MlirParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#dimensionListUnranked}.
	 * @param ctx the parse tree
	 */
	void enterDimensionListUnranked(MlirParser.DimensionListUnrankedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#dimensionListUnranked}.
	 * @param ctx the parse tree
	 */
	void exitDimensionListUnranked(MlirParser.DimensionListUnrankedContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(MlirParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(MlirParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#typeListParens}.
	 * @param ctx the parse tree
	 */
	void enterTypeListParens(MlirParser.TypeListParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#typeListParens}.
	 * @param ctx the parse tree
	 */
	void exitTypeListParens(MlirParser.TypeListParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#tensorMemrefElementType}.
	 * @param ctx the parse tree
	 */
	void enterTensorMemrefElementType(MlirParser.TensorMemrefElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#tensorMemrefElementType}.
	 * @param ctx the parse tree
	 */
	void exitTensorMemrefElementType(MlirParser.TensorMemrefElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#unrankedTensorType}.
	 * @param ctx the parse tree
	 */
	void enterUnrankedTensorType(MlirParser.UnrankedTensorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#unrankedTensorType}.
	 * @param ctx the parse tree
	 */
	void exitUnrankedTensorType(MlirParser.UnrankedTensorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#rankedTensorType}.
	 * @param ctx the parse tree
	 */
	void enterRankedTensorType(MlirParser.RankedTensorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#rankedTensorType}.
	 * @param ctx the parse tree
	 */
	void exitRankedTensorType(MlirParser.RankedTensorTypeContext ctx);
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
	 * Enter a parse tree produced by {@link MlirParser#vectorType}.
	 * @param ctx the parse tree
	 */
	void enterVectorType(MlirParser.VectorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#vectorType}.
	 * @param ctx the parse tree
	 */
	void exitVectorType(MlirParser.VectorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#strideList}.
	 * @param ctx the parse tree
	 */
	void enterStrideList(MlirParser.StrideListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#strideList}.
	 * @param ctx the parse tree
	 */
	void exitStrideList(MlirParser.StrideListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#stridedLayout}.
	 * @param ctx the parse tree
	 */
	void enterStridedLayout(MlirParser.StridedLayoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#stridedLayout}.
	 * @param ctx the parse tree
	 */
	void exitStridedLayout(MlirParser.StridedLayoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#rankedMemrefType}.
	 * @param ctx the parse tree
	 */
	void enterRankedMemrefType(MlirParser.RankedMemrefTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#rankedMemrefType}.
	 * @param ctx the parse tree
	 */
	void exitRankedMemrefType(MlirParser.RankedMemrefTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#unrankedMemrefType}.
	 * @param ctx the parse tree
	 */
	void enterUnrankedMemrefType(MlirParser.UnrankedMemrefTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#unrankedMemrefType}.
	 * @param ctx the parse tree
	 */
	void exitUnrankedMemrefType(MlirParser.UnrankedMemrefTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MlirParser#memrefType}.
	 * @param ctx the parse tree
	 */
	void enterMemrefType(MlirParser.MemrefTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MlirParser#memrefType}.
	 * @param ctx the parse tree
	 */
	void exitMemrefType(MlirParser.MemrefTypeContext ctx);
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
}