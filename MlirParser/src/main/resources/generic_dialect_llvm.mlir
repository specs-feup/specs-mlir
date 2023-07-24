"module"() ( {
  "llvm.func"() ( {
  ^bb0(%arg0: i32, %arg1: i32):  // no predecessors
    %0 = "llvm.add"(%arg1, %arg0) : (i32, i32) -> i32
    "llvm.return"(%0) : (i32) -> ()
  }) {linkage = 10 : i64, sym_name = "mlir_entry", type = !llvm.func<i32 (i32, i32)>} : () -> ()
}) : () -> ()