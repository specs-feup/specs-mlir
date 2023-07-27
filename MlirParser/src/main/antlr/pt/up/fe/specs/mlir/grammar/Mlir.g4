/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

fragment DIGIT    : [0-9];
fragment HEX_DIGIT        : [0-9a-fA-F];
fragment LETTER           : [a-zA-Z];
fragment ID_PUNCT         : [$._-];

fragment ESCAPED_CHAR: '\\' (["\\/bfnrt"] | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT);

fragment ID_SUFFIX: (DIGIT+ | ((LETTER|ID_PUNCT) (LETTER|ID_PUNCT|DIGIT)*));

//ID               : (LETTER | '_')[A-Za-z0-9_.$]*;
DECIMAL_LITERAL    : DIGIT+;
FLOAT_PRECISION  : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)?;

BARE_ID          : (LETTER | [_]) (LETTER | DIGIT | [_$.])*;

VALUE_ID        :  '%' ID_SUFFIX;

CARET_ID        :  '^' ID_SUFFIX;

SYMBOL_REF_ELEMENT  : '@' ID_SUFFIX | '@' STRING_LITERAL;

INTTYPE_WIDTH    : [1-9][0-9]*;

RANKED_DIMENSION : [0-9]'x';

//LOCATION         : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;





WS : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;



HEX_LITERAL: '0x' HEX_DIGIT+;

STRING_LITERAL: '"' ~('^'|'"'|'\n'|'\f'|'\r')* '"';

// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : operation*;  //   attribute-alias-def | type-alias-def      // match keyword hello followed by an identifier



/* literals */
//decimalLiteral     : ;
//hexadecimalLiteral : ;
integerLiteral locals[boolean isHexadecimal=false]     :
    value=DECIMAL_LITERAL | value=HEX_LITERAL {$isHexadecimal = true;};

floatLiteral       : value=FLOAT_PRECISION;

stringLiteral      : value=STRING_LITERAL;

booleanLiteral     : 'true' | 'false';

/// IDENTIFIERS AND KEYWORDS

//bareId             : value=BARE_ID;

bareIdList         : values+=BARE_ID (',' values+=BARE_ID)*;

//valueId            : value=VALUE_ID;

aliasName          : value=BARE_ID;

symbolRefId        : values+=SYMBOL_REF_ELEMENT ('::' values+=SYMBOL_REF_ELEMENT)*;

valueIdList        : values+=VALUE_ID (',' values+=VALUE_ID)*;

valueUse           : value=VALUE_ID ('#' number=DECIMAL_LITERAL)?;

valueUseList       : values+=valueUse (',' values+=valueUse)*;


/// OPERATIONS

operation
    : opResultList?  genericOperation trailingLocation?; // TODO customOperation not supported

genericOperation: name=STRING_LITERAL '(' valueUseList? ')' successorList? /* dictionaryProperties? regionList? dictionaryAttribute? */ ':' functionType;

successorList:  '[' successor (',' successor)* ']';

successor: value=CARET_ID; // (':' blockArgList)? TODO: What is a blockArgList?

//operandList opAttributes ':' operandTypeList '->' opReturnType;

opResult     : value=VALUE_ID (':' integerLiteral)?;

opResultList :  opResult (',' opResult)* '=';

trailingLocation : 'loc' '(' location ')';

location :
    (file=STRING_LITERAL ':' line=DECIMAL_LITERAL ':' col=DECIMAL_LITERAL) #KnownLocation
    |'unknown' #UnknownLocation
    ;



//customOperation: BARE_ID; // TODO



opAttributes : attributes;

opReturnType : type;


/* identifiers */
idSsa : '%' BARE_ID;

/* dimensions */
dimensionListRanked : (RANKED_DIMENSION)*;

/* simple types */
noneType            : 'none';
indexType           : 'index';
floatType           : 'f16' | 'bf16' | 'f32' | 'f64';
signedIntegerType   : 'si' width=INTTYPE_WIDTH;
unsignedIntegerType : 'ui' width=INTTYPE_WIDTH;
signlessIntegerType : 'i' width=INTTYPE_WIDTH;
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

functionType    : (type | typeListParens) '->' (type | typeListParens);

typeListParens  :'(' (type (',' type)*) ')';


/* operands */
operand         : idSsa;
operandList     : '(' operand (',' operand)* ')';
operandTypeList : '(' type (',' type)* ')';

/* attributes */
attributesProperty : value=BARE_ID;
//attributesValue    : DECIMAL_LITERAL ;//(ID | DIGIT);
attributesEntry    : attributesProperty '=' (integerLiteral | floatLiteral | stringLiteral | booleanLiteral);
attributes         : '{' attributesEntry (',' attributesEntry)* '}';


