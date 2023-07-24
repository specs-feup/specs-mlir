"module"() ( {
  "func.func"() ( {
  ^bb0(%arg0: i32, %arg1: i32):  // no predecessors
    %0 = "std.addi"(%arg1, %arg0) : (i32, i32) -> i32
    "std.return"(%0) : (i32) -> ()
  }) {sym_name = "mlir_entry", type = (i32, i32) -> i32} : () -> ()
}) : () -> ()