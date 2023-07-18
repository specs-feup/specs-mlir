/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT: [0-9] ;
RANKED_DIMENSION : [0-9]'x' ;
ID : [a-zA-Z_$][a-zA-Z_0-9]* ;
TRUE : 'true' ;

WS : [ \t\r\n]+ -> skip ;

// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : operation ;         // match keyword hello followed by an identifier


//=----------------------------------------=//

// Identifiers
id_ssa : '%' ID #ValueID ;


//=----------------------------------------=//

// Dimensions
dimension_list_ranked : (RANKED_DIMENSION)* #RankedDimensionList ;


//=----------------------------------------=//

// Type keywords
keyword_type_float : 'f16' | 'f32' | 'f64' #FloatType ;

// Tensor types
tensor_type : 'tensor' '<' dimension_list_ranked keyword_type_float '>' #TensorType ;

// Final type declaration
type : tensor_type #TypeDeclaration ; /* TODO: Add more types */

//=----------------------------------------=//

// Operands
operand : id_ssa #InputOperand ;
operand_list : operand (',' operand)* #OperandList ;
operand_type_list : '(' type (',' type)* ')' #OperandTypeList ;

//=----------------------------------------=//

// Attributes

attr_property : ID #AttributePropety ;
attr_value : (ID | DIGIT) #AttributeValue ;
attr_entry : attr_property '=' attr_value #AttributeEntry ;

attributes : '{' attr_entry (',' attr_entry)* '}' #AttributeDictionary ;


//=----------------------------------------=//

// Location

loc : 'loc' '(' '"' ID+ '"' ')' #Location ;


//=----------------------------------------=//


// Operations

op_result : id_ssa '='  #OperationResult ;
op_name : '"' ID+ '"' #OperationName ;
op_attributes : attributes #OperationAttributes ;
op_return_type_list : '(' type (',' type)* ')' #OperationReturnTypeList ;

// Final operation declaration
operation
    : (op_result '=') ? op_name operand_list op_attributes ':' operand_type_list '->' op_return_type_list loc
    ;
