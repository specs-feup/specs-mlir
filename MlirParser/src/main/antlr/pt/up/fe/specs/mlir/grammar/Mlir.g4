/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT            : [0-9];
HEX_DIGIT        : [0-9a-fA-F];
INTTYPE_WIDTH    : [1-9][0-9]*;
LETTER           : [a-zA-Z];
RANKED_DIMENSION : [0-9]'x';
FLOAT_PRECISION  : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)?;
ID               : [A-Za-z_][A-Za-z0-9_.]*;
LOCATION         : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;

WS : [ \t\r\n]+ -> skip ;

// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : operation;         // match keyword hello followed by an identifier

/* literals */
decimal_literal     : DIGIT+;
hexadecimal_literal : '0x' HEX_DIGIT+;
integer_literal     : decimal_literal | hexadecimal_literal;
float_literal       : FLOAT_PRECISION;
string_literal      : '"' LETTER+ '"';

/* identifiers */
id_ssa : '%' ID #ValueID;

/* dimensions */
dimension_list_ranked : (RANKED_DIMENSION)* #RankedDimensionList;

/* simple types */
none_type             : 'none';
index_type            : 'index';
float_type            : 'f16' | 'bf16' | 'f32' | 'f64';
signed_integer_type   : 'si' INTTYPE_WIDTH;
unsigned_integer_type : 'ui' INTTYPE_WIDTH;
signless_integer_type : 'i' INTTYPE_WIDTH;
integer_type          : signed_integer_type | unsigned_integer_type | signless_integer_type;
complex_type          : 'complex' '<' type '>';
tuple_type            : 'tuple' '<' type '>';

/* tensor type */
tensor_type : 'tensor' '<' dimension_list_ranked float_type '>' #TensorType;

/* final type declaration */
// TODO: Add more types
type
    : none_type #NoneType
    | index_type #IndexType
    | float_type #FloatType
    | integer_type #IntegerType
    | complex_type #ComplexType
    | tuple_type #TupleType
    | tensor_type #TypeDeclaration
    ;

/* operands */
operand           : id_ssa #InputOperand;
operand_list      : '(' operand (',' operand)* ')' #OperandList;
operand_type_list : '(' type (',' type)* ')' #OperandTypeList;

/* attributes */
attributes_property : ID #AttributePropety;
attributes_value    : (ID | DIGIT) #AttributeValue;
attributes_entry    : attributes_property '=' attributes_value #AttributeEntry;
attributes          : '{' attributes_entry (',' attributes_entry)* '}' #AttributeDictionary;

/* source code location */
trailing_location : 'loc' '(' LOCATION ')' #TrailingLocation;

/* operations */
op_result      : id_ssa '='  #OperationResult;
op_name        : '"' ID+ '"' #OperationName;
op_attributes  : attributes #OperationAttributes;
op_return_type : type #OperationReturnTypeList;

operation
    : op_result? op_name operand_list op_attributes ':' operand_type_list '->' op_return_type trailing_location
    ;
