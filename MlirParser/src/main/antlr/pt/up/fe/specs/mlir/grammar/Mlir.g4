/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT: [0-9] ;
RANKED_DIMENSION : [0-9]'x' ;
ID : [A-Za-z_][A-Za-z0-9_]* ;
PATH : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;
TRUE : 'true' ;

WS : [ \t\r\n]+ -> skip ;

// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : operation;         // match keyword hello followed by an identifier

/* identifiers */
id_ssa : '%' ID #ValueID ;


/* dimensions */
dimension_list_ranked : (RANKED_DIMENSION)* #RankedDimensionList ;


/* type keywords */
keyword_type_float : 'f16' | 'f32' | 'f64' #FloatType ;

/* tensor types */
tensor_type : 'tensor' '<' dimension_list_ranked keyword_type_float '>' #TensorType ;

/* final type declaration */
type : tensor_type #TypeDeclaration ; /* TODO: Add more types */


/* operands */
operand : id_ssa #InputOperand ;
operand_list : '(' operand (',' operand)* ')' #OperandList ;
operand_type_list : '(' type (',' type)* ')' #OperandTypeList ;


/* attributes */
attributes_property : ID #AttributePropety ;
attributes_value : (ID | DIGIT) #AttributeValue ;
attributes_entry : attributes_property '=' attributes_value #AttributeEntry ;
attributes : '{' attributes_entry (',' attributes_entry)* '}' #AttributeDictionary ;


/* source code location */
loc : 'loc' '(' PATH ')' #Location ;


/* operations */
operation_result : id_ssa '='  #OperationResult ;
operation_name : '"' ID+ '"' #OperationName ;
operation_attributes : attributes #OperationAttributes ;
operation_return_type_list : '(' type (',' type)* ')' #OperationReturnTypeList ;

operation
    : operation_result? operation_name operand_list attributes ':' operand_type_list '->' operation_return_type_list loc
    ;