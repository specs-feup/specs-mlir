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


/* literals */
bool_literal : TRUE | FALSE;
decimal_literal : DIGIT+;
hexadecimal_literal : HEX HEX_DIGIT+ ;
integer_literal : decimal_literal | hexadecimal_literal ;
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

opaque_dialect_item : bare_id '<' string_literal '>' ;
pretty_dialect_item : bare_id '.' bare_id pretty_dialect_item_body? ;
pretty_dialect_item_body : '<' pretty_dialect_item_contents (',' pretty_dialect_item_contents)* '>' ;
pretty_dialect_item_contents : ('(' pretty_dialect_item_contents ')')
                              | ('[' pretty_dialect_item_contents ']')
                              | ('{' pretty_dialect_item_contents '}')
                              | bare_id
                              | constant_literal
                              | type
                              ;

/* dialect types */
dialect_type : EXCLAMATION_SYMBOL (opaque_dialect_item | pretty_dialect_item) ;

/* final type definition */
non_function_type
    : type_alias | complex_type | float_type | index_type | integer_type | memref_type | none_type | tensor_type_a | tuple_type | vector_type | dialect_type
    ;
type
    : type_alias | dialect_type | complex_type | float_literal | function_type | type ((LPAREN RPAREN) | (LPAREN type (COMMA_SYMBOL type)* RPAREN)) | index_type | integer_type | memref_type | none_type | tensor_type_a | tuple_type | vector_type
    ;

/* uses of types */
//type_list_no_parens : type (COMMA_SYMBOL type)* ;
//type_list_no_parens : type (COMMA_SYMBOL type)* ;
//type_list_parens : (LPAREN RPAREN) | (LPAREN type (COMMA_SYMBOL type)* RPAREN) ;
function_result_type : ((LPAREN RPAREN) | (LPAREN type (COMMA_SYMBOL type)* RPAREN)) | type (COMMA_SYMBOL type)* | non_function_type ;
function_type : function_result_type (RARROW | TO | INTO) function_result_type;
//llvm_function_type : type type_list_parens ;
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
ssa_id_and_type : ssa_id COLON_SYMBOL type ;
ssa_id_and_type_list : ssa_id_and_type (COMMA_SYMBOL ssa_id_and_type)* ;
block_arg_list : LPAREN optional_ssa_and_type_list RPAREN ;
operation_list : operation+ ;

block_label : block_id optional_block_arg_list COLON_SYMBOL ;
successor_list : LSQUARE_PAREN block_id? (COMMA_SYMBOL block_id)* RSQUARE_PAREN ;

block : optional_block_label operation_list ;
region : LCURLY_PAREN block* RCURLY_PAREN ;
region_list : LPAREN region? (COMMA_SYMBOL region)* RPAREN ;

optional_symbol_ref_id                 : symbol_ref_id? ;
optional_func_mod_attrs                : ('attributes' attribute_dict)? ;
optional_arg_list                      : argument_list? ;
optional_fn_result_list                : (RARROW function_result_list)? ;
optional_fn_body                       : function_body? ;
optional_symbol_id_list                : symbol_id_list? ;
optional_affine_constraint_conjunction : affine_constraint_conjunction? ;
optional_float_type                    : (COLON_SYMBOL float_type)? ;
optional_int_type                      : (COLON_SYMBOL (index_type | integer_type) )? ;
optional_type                          : (COLON_SYMBOL type)? ;
optional_int_literal                   : (COLON_SYMBOL integer_literal)? ;
optional_ssa_use_list                  : ssa_use_list? ;
optional_attr_dict                     : attribute_dict? ;
optional_trailing_loc                  : trailing_location? ;
optional_op_result_list                : op_result_list? ;
optional_ssa_and_type_list             : ssa_id_and_type_list? ;
optional_block_arg_list                : block_arg_list? ;
optional_layout_specification          : (COMMA_SYMBOL layout_specification)? ;
optional_memory_space                  : (COMMA_SYMBOL memory_space)? ;
optional_block_label                   : block_label? ;
optional_symbol_use_list               : symbol_use_list? ;
optional_successor_list                : successor_list? ;
optional_region_list                   : region_list? ;

named_argument : ssa_id COLON_SYMBOL type optional_attr_dict ;
argument_list
    : (named_argument (COMMA_SYMBOL named_argument)*)
    | (type optional_attr_dict (COMMA_SYMBOL type optional_attr_dict)*)
    ;

function_result : type optional_attr_dict ;
function_result_list_no_parens : function_result (COMMA_SYMBOL function_result)* ;
function_result_list_parens : (LPAREN RPAREN) | (LPAREN function_result_list_no_parens RPAREN) ;
function_result_list : function_result_list_parens | non_function_type ;
function_body : region ;

module : 'module' optional_symbol_ref_id optional_func_mod_attrs region optional_trailing_loc ;
function : 'func.func' symbol_ref_id LPAREN optional_arg_list RPAREN optional_fn_result_list optional_func_mod_attrs optional_fn_body optional_trailing_loc ;
generic_module : string_literal LPAREN optional_arg_list RPAREN LPAREN region RPAREN optional_attr_dict trailing_type optional_trailing_loc ;

dim_id_list : LPAREN bare_id? (COMMA_SYMBOL bare_id)* RPAREN ;
symbol_id_list : LSQUARE_PAREN bare_id? (COMMA_SYMBOL bare_id)* RSQUARE_PAREN ;
dim_and_symbol_id_lists : dim_id_list optional_symbol_id_list ;
symbol_or_const : posneg_integer_literal | ssa_id | bare_id ;

dim_use_list : LPAREN ssa_use_list? RPAREN ;
symbol_use_list : '[' ssa_use_list? ']' ;
dim_and_symbol_use_list : dim_use_list optional_symbol_use_list ;

affine_expr
    : '(' affine_expr ')'
    | affine_expr '+' affine_expr
    | affine_expr '-' affine_expr
    | posneg_integer_literal '*' affine_expr
    | affine_expr '*' posneg_integer_literal
    | affine_expr '&ceildiv&' integer_literal
    | affine_expr '&floordiv&' integer_literal
    | affine_expr '&mod&' integer_literal
    | '-' affine_expr
    | 'symbol' '(' ssa_id ')'
    | posneg_integer_literal
    | ssa_id
    | bare_id
    ;

semi_affine_expr
    : '(' semi_affine_expr ')'
    | semi_affine_expr '+' semi_affine_expr
    | semi_affine_expr '-' semi_affine_expr
    | symbol_or_const '*' semi_affine_expr
    | semi_affine_expr '*' symbol_or_const
    | semi_affine_expr '&ceildiv&' semi_affine_oprnd
    | semi_affine_expr '&floordiv&' semi_affine_oprnd
    | semi_affine_expr '&mod&' semi_affine_oprnd
    | 'symbol' '(' symbol_or_const ')'
    | symbol_or_const
    ;

semi_affine_oprnd : symbol_or_const | '(' semi_affine_expr ')' ;

multi_dim_affine_expr_no_parens : affine_expr (',' affine_expr)* ;
multi_dim_semi_affine_expr_no_parens : semi_affine_expr (',' semi_affine_expr)* ;
multi_dim_affine_expr : '(' multi_dim_affine_expr_no_parens ')' ;
multi_dim_semi_affine_expr : '(' multi_dim_semi_affine_expr_no_parens ')' ;
affine_constraint : affine_expr '>=' '0'
                  | affine_expr '==' '0'
                  ;
affine_constraint_conjunction : affine_constraint (',' affine_constraint)* ;

affine_map_inline      : 'affine_map' '<' dim_and_symbol_id_lists '->' multi_dim_affine_expr '>' ;
semi_affine_map_inline : dim_and_symbol_id_lists '->' multi_dim_semi_affine_expr ;
integer_set_inline     : dim_and_symbol_id_lists ':' '(' optional_affine_constraint_conjunction ')' ;

// Definition of maps and sets
affine_map      : map_or_set_id | affine_map_inline ;
semi_affine_map : map_or_set_id | semi_affine_map_inline ;
integer_set     : map_or_set_id | integer_set_inline ;


affine_map_list : affine_map (',' affine_map)* ;

// ----------------------------------------------------------------------
// General structure and top-level definitions

// Definitions of affine maps/integer sets/aliases are at the top of the file
type_alias_def : type_alias '=' 'type' type ;
affine_map_def      : map_or_set_id '=' affine_map_inline ;
semi_affine_map_def : map_or_set_id '=' semi_affine_map_inline ;
integer_set_def     : map_or_set_id '=' integer_set_inline ;
attribute_alias_def : attribute_alias '=' attribute_value ;
definition : type_alias_def | affine_map_def | semi_affine_map_def | integer_set_def | attribute_alias_def ;


// ----------------------------------------------------------------------
// Structure of an MLIR parse-able string

definition_list              : definition* ;
function_list                : function* ;
module_list                  : (module | generic_module)* ;
definition_and_function_list : definition_list function_list ;
definition_and_module_list   : definition_list module_list ;

mlir_file
    : definition_and_function_list*
    | definition_and_module_list*
    ;



// %t_tensor = "toy.transpose"(%tensor) {inplace = true} : (tensor<2x3xf64>) -> tensor<3x2xf64> loc("example/file/path":12:1)
root : mlir_file;         // match keyword hello followed by an identifier
