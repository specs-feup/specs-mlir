/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT: [0-9] ;
HEX_DIGIT : [0-9a-fA-F] ;
NO_ARGS : '()' ;
RANKED_DIMENSION : [0-9]+'x' ;
LEAD_INDENT : [A-Za-z][A-Za-z0-9._]* ;
INTTYPE_WIDTH : [1-9][0-9]* ;
FLOAT_PRECISION : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)? ;
ID : [A-Za-z_][A-Za-z0-9_]* ;
PATH : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;
LETTER : [a-zA-Z] ;
UNDERSCORE : [_] ;
ID_CHARS : [$.] ;

WS : [ \t\r\n]+ -> skip ;

root : memref_type ;

/* literals */
bool_literal            : 'true' | 'false' ;
decimal_literal         : DIGIT+ ;
hexadecimal_literal     : '0x' HEX_DIGIT+ ;
integer_literal         : decimal_literal | hexadecimal_literal ;
negated_integer_literal : '-' integer_literal ;
posneg_integer_literal  : integer_literal | negated_integer_literal ;
float_literal           : FLOAT_PRECISION ;
string_literal          : '"' ID '"' ;
constant_literal        : bool_literal | integer_literal | float_literal | string_literal ;

/* identifier syntax */
bare_id   : (LETTER | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE | ID_CHARS)* ;
suffix_id : DIGIT+ | bare_id ;

/* dimensions */
dimension               : '?' | decimal_literal ;
static_dimension_list   : (decimal_literal 'x')+ ; // 2x
dimension_list_ranked   : (dims+='?x' /*{$dims.add("x");}*/ | dims += RANKED_DIMENSION)+ ;
dimension_list_unranked : '*' 'x' ;
dimension_list          : dimension_list_ranked | dimension_list_unranked ;

/* identifiers */
ssa_id          : '%' suffix_id ('#' DIGIT+)? ;
symbol_ref_id   : '@' (suffix_id | string_literal) ;
block_id        : '^' suffix_id ;
type_alias      : '!' (string_literal | bare_id) ;
map_or_set_id   : '#' suffix_id ;
attribute_alias : '#' (string_literal | bare_id) ;
ssa_id_list     : ssa_id (',' ssa_id)* ;

/* simple types */
none_type             : 'none' ;
float_type            : 'f16' | 'bf16' | 'f32' | 'f64' ;
index_type            : 'index' ;
inttype_width         : INTTYPE_WIDTH ;
signed_integer_type   : 'si' inttype_width ;
unsigned_integer_type : 'ui' inttype_width ;
signless_integer_type : 'i' inttype_width ;
integer_type          : signed_integer_type | unsigned_integer_type | signless_integer_type ;

// final simple type declaration
simple_type : none_type | float_type | index_type | integer_type | complex_type ;

/* special types */
complex_type : 'complex' '<' type '>' ;
tuple_type   : 'tuple' '<' type '>' ; // TODO: fix this tuple_type rule

// final special type declaration
special_type : complex_type | tuple_type ;

/* dialects */
dialect_namespace : bare_id ;
dialect_type : '!' (opaque_dialect_type | pretty_dialect_type) ;

opaque_dialect_type : dialect_namespace dialect_type_body ;
pretty_dialect_type : dialect_namespace '.' LEAD_INDENT dialect_type_body? ;

dialect_type_body : '<' dialect_type_contents+ '>' ;
dialect_type_contents
    : dialect_type_body
    | '(' dialect_type_contents+ ')'
    | '[' dialect_type_contents+ ']'
    | '{' dialect_type_contents+ '}'
    | bare_id
    | constant_literal
    | type
    ;

/* memref type */
stride_list          : '[' (dimension (',' dimension)*)? ']' ;
strided_layout       : 'offset:' dimension ',' 'strides: ' stride_list ;
ranked_memref_type   : 'memref' '<' dimension_list_ranked simple_type '>' ; //memref<2x3xf64> memref<?xbf16, offset: 5, strides: [4, 5]>
unranked_memref_type : 'memref' '<' dimension_list_unranked (stride_list | strided_layout)? '>' ;

// final memref type declaration
memref_type : ranked_memref_type | unranked_memref_type ;

/* tensor type */


// final type declaration
type
    : simple_type #SimpleType
    | special_type #SpecialType
    | dialect_type #DialectType
    | type ('->' | 'to' |'into') type #FunctionType
    | '(' (type (',' type)*)? ')' ('->' | 'to' |'into') type #FunctionTypeList
    | NO_ARGS #NoArgsType
    ;

