/**
 * Define a grammar called Hello
 */
grammar Mlir;

@header {
    package pt.up.fe.specs.mlir.grammar;
}

DIGIT: [0-9] ;
HEX_DIGIT : [0-9a-fA-F] ;
FLOAT_PRECISION : [-+]?[0-9]+[.][0-9]*([eE][-+]?[0-9]+)? ;
RANKED_DIMENSION : [0-9]'x' ;
ID : [A-Za-z_][A-Za-z0-9_]* ;
PATH : '"' [A-Za-z0-9_/]+ '"' ':'[0-9]+':'[0-9]+;
TRUE : 'true' ;

LETTER : [a-zA-Z] ;
UNDERSCORE : [_] ;
ID_PUNCT : [$._-] ;
ID_CHARS : [$.] ;

/* types */
NONE : 'none' ;
FLOAT : 'f16' | 'bf16' | 'f32' |'f64' ;
INTTYPE_WIDTH : [1-9][0-9]* ;
SIGNED_INTEGER : 'si' ;
UNSIGNED_INTEGER : 'ui' ;
SIGNLESS_INTEGER : 'i' ;
INDEX : 'index' ;
COMPLEX : 'complex' ;
VECTOR : 'vector' ;
TUPLE : 'tuple' ;
TENSOR : 'tensor' ;
HEX : '0x' ;
MEMREF : 'memref' ;
TO : 'to' ;
INTO : 'into' ;
UNIT : 'unit' ;
DENSE : 'dense' ;
OPAQUE : 'opaque' ;
SPARESE : 'sparse' ;
LOC : 'loc' ;

/* symbols */
LT_SYMBOL : '<' ;
GT_SYMBOL : '>' ;
DIMENSION_SEP_SYMBOL : 'x' ;
ASTERISK_SYMBOL : '*' ;
EXCLAMATION_SYMBOL : '!' ;
QUOTATION_MARKS_SYMBOL : '"' ;
COMMA_SYMBOL : ',' ;
DASH_SYMBOL : '-' ;
PERCENT_SYMBOL : '%' ;
AT_SYMBOL : '@' ;
HASH_SYMBOL : '#';
CARET_SYMBOL : '^';
COLON_SYMBOL : ':' ;
DOUBLE_COLON_SYMBOL : '::' ;
EQUAL_SYMBOL : '=' ;
DOT_SYMBOL : '.' ;

/* keywords */
OFFSET : 'offset:' ;
STRIDES : 'strides: ';

/* parenthesis */
LPAREN : '(' ;
RPAREN : ')' ;
LSQUARE_PAREN : '[' ;
RSQUARE_PAREN : ']' ;
LCURLY_PAREN : '{' ;
RCURLY_PAREN : '}' ;

/* arrows */
RARROW : '->' ;
LARROW : '<-' ;

WS : [ \t\r\n]+ -> skip ;

// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : operation;         // match keyword hello followed by an identifier


/* literals */
bool_literal : TRUE | FALSE;
decimal_literal : DIGIT+;
hexadecimal_literal : HEX HEX_DIGIT+ ;
integer_literal : decimal_literal | integer_literal ;
negated_integer_literal : DASH_SYMBOL integer_literal ;
posneg_integer_literal : integer_literal | negated_integer_literal ;
float_literal : FLOAT_PRECISION ;
string_literal : QUOTATION_MARKS_SYMBOL ID QUOTATION_MARKS_SYMBOL #StringLiteral ;
constant_literal : bool_literal | integer_literal | float_literal | string_literal ;

/* identifier syntax */
bare_id : (LETTER | UNDERSCORE) (LETTER | DIGIT | UNDERSCORE | ID_CHARS)* ;
suffix_id : DIGIT+ | bare_id ;

/* dimensions */
dimension : '?' | DIGIT+ ;
static_dimension_list : (DIGIT+ DIMENSION_SEP_SYMBOL) #StaticDimensionList ;
dimension_list_ranked : (dimension DIMENSION_SEP_SYMBOL)* #RankedDimensionList ;
dimension_list_unranked : ASTERISK_SYMBOL DIMENSION_SEP_SYMBOL #UnrankedDimensionList ;
dimension_list : dimension_list_ranked | dimension_list_unranked ;


/* identifiers */
id_ssa : '%' ID #ValueID ;
ssa_id : PERCENT_SYMBOL suffix_id (HASH_SYMBOL DIGIT+)? ;
symbol_ref_id : AT_SYMBOL (suffix_id | string_literal) ;
block_id : CARET_SYMBOL suffix_id ;
type_alias : EXCLAMATION_SYMBOL (string_literal | bare_id) #TypeAlias ;
map_or_set_id : HASH_SYMBOL suffix_id ;
attribute_alias : HASH_SYMBOL (string_literal | bare_id) ;

ssa_id_list : ssa_id (COMMA_SYMBOL ssa_id)* ;

ssa_use : ssa_id | constant_literal ;
ssa_use_list : ssa_use (COMMA_SYMBOL ssa_use)* ;

/* type keywords */
none_type : NONE #None ;
float_type : FLOAT #FloatType ;
index_type : INDEX #IndexType ;
inttype_width : INTTYPE_WIDTH #IntTypeWidth ;
signed_integer_type   : SIGNED_INTEGER inttype_width #SignedIntegerType ;
unsigned_integer_type : UNSIGNED_INTEGER inttype_width #UnsignedIntegerType ;
signless_integer_type : SIGNLESS_INTEGER inttype_width #SignlessIntegerType ;
integer_type : signed_integer_type | unsigned_integer_type | signless_integer_type ;
complex_type : COMPLEX LT_SYMBOL type GT_SYMBOL #ComplexType ;
tuple_type : TUPLE LT_SYMBOL type GT_SYMBOL #TupleType ; // TODO: fix this

/* vector type */
vector_element_type : float_type | integer_type ;
vector_type : VECTOR LT_SYMBOL static_dimension_list vector_element_type GT_SYMBOL #VectorType ;

/* tensor type */
tensor_memref_element_type : vector_element_type | vector_type | complex_type | type_alias ;
ranked_tensor_type : TENSOR LT_SYMBOL dimension_list_ranked tensor_memref_element_type GT_SYMBOL #RankedTensorType ;
unranked_tensor_type : TENSOR LT_SYMBOL dimension_list_unranked tensor_memref_element_type GT_SYMBOL #UnrankedTensorType ;
tensor_type_a : ranked_tensor_type | unranked_tensor_type ; // TODO: rename this

/* memref type */
stride_list : LSQUARE_PAREN (dimension (COMMA_SYMBOL dimension)*)? RSQUARE_PAREN #StrideList ;
strided_layout : OFFSET dimension COMMA_SYMBOL STRIDES stride_list #StridedLayout ;
layout_specification : semi_affine_map | strided_layout ;
memory_space : integer_literal ;
ranked_memref_type : MEMREF LT_SYMBOL dimension_list_ranked tensor_memref_element_type optional_layout_specification optional_memory_space GT_SYMBOL ;
unranked_memref_type : MEMREF '<*x' tensor_memref_element_type optional_memory_space '>' ;
memref_type : ranked_memref_type | unranked_memref_type ;

/* dialect types */
dialect_type : EXCLAMATION_SYMBOL (opaque_dialect_item | pretty_dialect_item) ;

/* final type definition */
standard_type
    : complex_type | float_literal | function_type | llvm_function_type | index_type | integer_type | memref_type | none_type | tensor_type_a | tuple_type | vector_type
    ;
non_function_type
    : type_alias | complex_type | float_type | index_type | integer_type | memref_type | none_type | tensor_type_a | tuple_type | vector_type | dialect_type
    ;
type
    : type_alias | dialect_type | standard_type
    ;

/* uses of types */
type_list_no_parens : type (COMMA_SYMBOL type)* ;
type_list_parens : (LPAREN RPAREN) | (LPAREN type_list_no_parens RPAREN) ;
function_result_type : type_list_parens | type_list_no_parens | non_function_type ;
function_type : function_result_type (RARROW | TO | INTO) function_result_type;
llvm_function_type : type type_list_parens ;
ssa_use_and_type : ssa_use COLON_SYMBOL type ;
ssa_use_and_type_list : ssa_use_and_type (COMMA_SYMBOL ssa_use_and_type)* ;

/* attributes */
array_attribute : LSQUARE_PAREN (attribute_value (COMMA_SYMBOL attribute_value)*)? RSQUARE_PAREN ;
bool_attribute : bool_literal ;
dictionary_attribute : LCURLY_PAREN (attribute_entry (COMMA_SYMBOL attribute_entry)*)? RCURLY_PAREN ;
elements_attribute : dense_elements_attribute | opaque_elements_attribute | sparse_elements_attribute ;
float_attribute : (float_literal optional_float_type) | (hexadecimal_literal COLON float_type) ;
integer_attribute : posneg_integer_literal optional_int_type ;
integer_set_attribute : affine_map ;
string_attribute : string_literal optional_type ;
symbol_ref_attribute : (symbol_ref_id (DOUBLE_COLON_SYMBOL symbol_ref_id)*) ;
type_attribute : type ;
unit_attribute : UNIT ;

/* elements attribute types */
dense_elements_attribute : DENSE LT_SYMBOL attribute_value GT_SYMBOL COLON_SYMBOL (tensor_type_a | vector_type) ;
opaque_elements_attribute : OPAQUE LT_SYMBOL bare_id COMMA_SYMBOL hexadecimal_literal GT_SYMBOL COLON_SYMBOL (tensor_type_a | vector_type) ;
sparse_elements_attribute : SPARSE LT_SYMBOL attribute_value COMMA_SYMBOL attribute_value GT_SYMBOL COLON_SYMBOL (tensor_type_a | vector_type) ;

standard_attribute
    : array_attribute | bool_attribute | dictionary_attribute | elements_attribute | float_attribute | integer_attribute | integer_set_attribute | string_attribute | symbol_ref_attribute | type_attribute | unit_attribute
    ;

/* attribute values */
attribute_value : attribute_alias | dialect_attribute | standard_attribute ;
dependent_attribute_entry : bare_id EQUAL_SYMBOL attribute_value ;
dialect_attribute_entry : (bare_id DOT_SYMBOL bare_id) | (bare_id DOT_SYMBOL bare_id EQUAL_SYMBOL attribute_value) ;
dialect_attribute : HASH_SYMBOL (opaque_dialect_item | pretty_dialect_item) ;

/* attribute dictionaries */
attribute_entry : dialect_attribute_entry | dependent_attribute_entry ;
attribute_dict : (LCURLY_PAREN RCURLY_PAREN) | (LCURLY_PAREN attribute_entry (COMMA_SYMBOL attribute_entry)* RCURLY_PAREN) ;

/* types that appear after the operation, indicating return types */
trailing_type : COLON_SYMBOL (function_type | function_result_type) ;

/* operation results */
op_result : ssa_id optional_int_literal ;
op_result_list : op_result (COMMA_SYMBOL op_result)* EQUAL_SYMBOL ;

/* trailing location, for debug information */
location : string_literal COLON_SYMBOL decimal_literal COLON_SYMBOL decimal_literal ;
trailing_location : (LOC LPAREN location RPAREN) ;

generic_operation : string_literal LPAREN optional_ssa_use_list RPAREN optional_successor_list optional_region_list optional_attr_dict trailing_type ;
custom_operation : bare_id DOT_SYMBOL bare_id optional_ssa_use_list trailing_type ;

operation
    : optional_op_result_list (custom_operation | generic_operation | module | generic_module | function) optional_trailing_loc
    ;

/* block arguments */