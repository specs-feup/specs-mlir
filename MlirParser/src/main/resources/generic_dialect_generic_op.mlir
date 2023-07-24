"module"() ( {
  "func.func"() ( {
  ^bb0(%arg0: i32, %arg1: i32):  // no predecessors
    %0 = "generic_op_with_region"(%arg0, %arg1) ( {
      %1 = "std.addi"(%arg1, %arg0) : (i32, i32) -> i32
      "std.return"(%1) : (i32) -> ()
    }) : (i32, i32) -> i32
    %2 = "generic_op_with_regions"(%0, %arg0) ( {
      %3 = "std.subi"(%0, %arg0) : (i32, i32) -> i32
      "std.return"(%3) : (i32) -> ()
    }, {
      %4 = "std.addi"(%3, %arg0) : (i32, i32) -> i32
      "std.return"(%4) : (i32) -> ()
    }) : (i32, i32) -> i32
    %5 = "generic_op_with_region_and_attr"(%2, %arg0) ( {
      %6 = "std.subi"(%2, %arg0) : (i32, i32) -> i32
      "std.return"(%6) : (i32) -> ()
    }) {attr = "string attribute"} : (i32, i32) -> i32
    %7 = "generic_op_with_region_and_successor"(%5, %arg0)[^bb1] ( {
      %8 = "std.addi"(%5, %arg0) : (i32, i32) -> i32
      "std.br"(%8)[^bb1] : (i32) -> ()
    }) {attr = "string attribute"} : (i32, i32) -> i32
  ^bb1(%ret: i32):
    "std.return"(%ret) : (i32) -> ()
  }) {sym_name = "mlir_entry", type = (i32, i32) -> i32} : () -> ()
}) : () -> ()
