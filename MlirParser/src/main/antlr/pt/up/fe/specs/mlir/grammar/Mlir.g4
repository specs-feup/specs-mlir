/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT: [0-9] ;
HEX_DIGIT : [0-9a-fA-F] ;
RANKED_DIMENSION : [0-9]'x' ;
FLOAT_PRECISION : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)? ;
ID : [A-Za-z_][A-Za-z0-9_]* ;
PATH : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;
LETTER : [a-zA-Z] ;
UNDERSCORE : [_] ;
ID_CHARS : [$.] ;

WS : [ \t\r\n]+ -> skip ;

root : dimension_list ;

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
static_dimension_list   : (decimal_literal 'x')+ ;
dimension_list_ranked   : RANKED_DIMENSION* ;
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
