"module"() ( {
"func.func"() ( {
^bb0(%arg0: i32):  // no predecessors
    %c1_i32 = "std.constant"() {value = 1 : i32} : () -> i32
    %0 = "std.cmpi"(%arg0, %c1_i32) {predicate = 3 : i64} : (i32, i32) -> i1
    "std.cond_br"(%0)[^bb1, ^bb2] {operand_segment_sizes = dense<[1, 0, 0]> : vector<3xi32>} : (i1) -> ()
^bb1:  // pred: ^bb0
    "std.return"(%c1_i32) : (i32) -> ()
^bb2:  // pred: ^bb0
    "std.return"(%c1_i32) : (i32) -> ()
}) {sym_name = "mlir_entry", type = (i32) -> i32} : () -> ()
}) : () -> ()