/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}


RANKED_DIMENSION   : (DIGIT | '?')'x';
UNRANKED_DIMENSION : '*x' ;
//DIMENSION_SEPARATOR : 'x' ;

fragment DIGIT        : [0-9];
fragment HEX_DIGIT    : [0-9a-fA-F];
fragment LETTER       : [a-zA-Z];
fragment ID_PUNCT     : [$._-];
fragment ESCAPED_CHAR : '\\' (["\\/bfnrt"] | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT);
fragment ID_SUFFIX    : (DIGIT+ | ((LETTER|ID_PUNCT) (LETTER|ID_PUNCT|DIGIT)*));
fragment DIMENSION    : DIGIT | '?';

DECIMAL_LITERAL : DIGIT+;
FLOAT_PRECISION : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)?;
VALUE_ID :  '%' ID_SUFFIX;
CARET_ID :  '^' ID_SUFFIX;
SYMBOL_REF_ELEMENT : '@' ID_SUFFIX | '@' STRING_LITERAL;

fragment INTTYPE_WIDTH : [1-9][0-9]*;

SIGNED_INT_TYPE   : 'si' INTTYPE_WIDTH;
UNSIGNED_INT_TYPE : 'ui' INTTYPE_WIDTH;
SIGNLESS_INT_TYPE : 'i' INTTYPE_WIDTH;

BARE_ID : (LETTER | [_]) (LETTER | DIGIT | [_$.])*;



WS : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;

HEX_LITERAL    : '0x' HEX_DIGIT+;
STRING_LITERAL : '"' ~('^'|'"'|'\n'|'\f'|'\r')* '"';

root : operation*;  //   attribute-alias-def | type-alias-def      // match keyword hello followed by an identifier

decimalLiteral : value=DECIMAL_LITERAL;
integerLiteral locals[boolean isHexadecimal=false]
               : value=DECIMAL_LITERAL | value=HEX_LITERAL {$isHexadecimal = true;};
floatLiteral   : value=FLOAT_PRECISION;
stringLiteral  : value=STRING_LITERAL;
booleanLiteral : 'true' | 'false';

/// IDENTIFIERS AND KEYWORDS

bareIdList   : values+=BARE_ID (',' values+=BARE_ID)*;
aliasName    : value=BARE_ID;
symbolRefId  : values+=SYMBOL_REF_ELEMENT ('::' values+=SYMBOL_REF_ELEMENT)*;
valueIdList  : values+=VALUE_ID (',' values+=VALUE_ID)*;
valueUse     : value=VALUE_ID ('#' number=DECIMAL_LITERAL)?;
valueUseList : values+=valueUse (',' values+=valueUse)*;

/// DICTIONARIES & ATTRIBUTES
// TODO: add some of the builtin-attributes (e.g., IntegerAttr)
dictionaryProperties : '<' dictionaryAttribute '>';
dictionaryAttribute  : '{' (attributesEntry (',' attributesEntry)*)? '}';
attributesEntry      : attributesProperty '=' (integerLiteral | floatLiteral | stringLiteral | booleanLiteral);
attributesProperty   : value=BARE_ID;

/// REGIONS
region     : '{' operation+ block* '}';
regionList : '(' region (',' region)* ')';

/// OPERATIONS
// TODO: fix opResult in order to support inputs like '%result:2'
operation : opResultList?  genericOperation trailingLocation?; // TODO customOperation not supported

genericOperation
    : name=STRING_LITERAL '(' valueUseList? ')' successorList? dictionaryProperties? regionList? dictionaryAttribute? ':' functionType;

successorList : '[' successor (',' successor)* ']';
successor     : value=CARET_ID;
opResult      : value=VALUE_ID (':' integerLiteral)?;
opResultList  : opResult (',' opResult)* '=';

trailingLocation : 'loc' '(' location ')';

location
    : (file=STRING_LITERAL ':' line=DECIMAL_LITERAL ':' col=DECIMAL_LITERAL) #KnownLocation
    |'unknown' #UnknownLocation
    ;

//customOperation: BARE_ID; // TODO

/// BLOCKS
valueIdAndType     : valueId=VALUE_ID ':' valueType=type;
valueIdAndTypeList : values+=valueIdAndType (',' values+=valueIdAndType)* ;
blockArgList       : '(' args=valueIdAndTypeList? ')';
blockLabel         : blockId=CARET_ID blockArgList? ':';
block              : blockLabel operation+;

/// DIMENSIONS
dimension             : decimalLiteral | '?' ;
//dimensionListRanked   : (dimension DIMENSION_SEPARATOR)*;
dimensionListRanked   : value+=RANKED_DIMENSION*;
dimensionListUnranked : value=UNRANKED_DIMENSION ;

/// TYPES
noneType            : value='none';
indexType           : value='index';
floatType           : value=('f16' | 'bf16' | 'f32' | 'f64');
signedIntegerType   : value=SIGNED_INT_TYPE;
unsignedIntegerType : value=UNSIGNED_INT_TYPE;
signlessIntegerType : value=SIGNLESS_INT_TYPE;
integerType         : signedIntegerType | unsignedIntegerType | signlessIntegerType;
complexType         : 'complex' '<' type '>';
tupleType           : 'tuple' '<' type '>';

functionType   : (type | typeListParens) '->' (type | typeListParens);
typeListParens : '(' ')' | '(' (values+=type (',' values+=type)*) ')';

// tensor
tensorMemrefElementType  : floatType | integerType ;
unrankedTensorType       : 'tensor' '<' dimensionListUnranked tensorMemrefElementType '>';
rankedTensorType         : 'tensor' '<' dimensionListRanked tensorMemrefElementType '>' ;
tensorType               : unrankedTensorType | rankedTensorType;

// memref
strideList    : '[' (dimension (',' dimension)*)? ']';
stridedLayout : 'offset:' dimension ',' 'strides:' strideList;

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
