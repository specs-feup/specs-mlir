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
decimalLiteral     : DIGIT+;
hexadecimalLiteral : '0x' HEX_DIGIT+;
integerLiteral     : decimalLiteral | hexadecimalLiteral;
floatLiteral       : FLOAT_PRECISION;
stringLiteral      : '"' LETTER+ '"';

/* identifiers */
idSsa : '%' ID;

/* dimensions */
dimensionListRanked : (RANKED_DIMENSION)*;

/* simple types */
noneType            : 'none';
indexType           : 'index';
floatType           : 'f16' | 'bf16' | 'f32' | 'f64';
signedIntegerType   : 'si' INTTYPE_WIDTH;
unsignedIntegerType : 'ui' INTTYPE_WIDTH;
signlessIntegerType : 'i' INTTYPE_WIDTH;
integerType         : signedIntegerType | unsignedIntegerType | signlessIntegerType;
complexType         : 'complex' '<' type '>';
tupleType           : 'tuple' '<' type '>';

/* tensor type */
tensorType : 'tensor' '<' dimensionListRanked floatType '>';

/* final type declaration */
// TODO: Add more types
type
    : noneType
    | indexType
    | floatType
    | integerType
    | complexType
    | tupleType
    | tensorType
    ;

/* operands */
operand         : idSsa;
operandList     : '(' operand (',' operand)* ')';
operandTypeList : '(' type (',' type)* ')';

/* attributes */
attributesProperty : ID;
attributesValue    : (ID | DIGIT);
attributesEntry    : attributesProperty '=' attributesValue;
attributes         : '{' attributesEntry (',' attributesEntry)* '}';

/* source code location */
trailingLocation : 'loc' '(' LOCATION ')';

/* operations */
opResult     : idSsa '=';
opAttributes : attributes;
opReturnType : type;

operation
    : opResult? ('"' name = ID+ '"') operandList opAttributes ':' operandTypeList '->' opReturnType trailingLocation? #GenericOperation
    | opResult? ID trailingLocation? #CustomOperation
    ;
