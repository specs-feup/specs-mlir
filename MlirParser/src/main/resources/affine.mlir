func.func @empty() {
  affine.for %i = 0 to 10 {
  } {some_attr = true}
  %0 = affine.min affine_map<(d0)[s0] -> (1000, d0 + 512, s0)> (%arg0)[%arg1]
}
func.func @valid_symbols(%arg0: index, %arg1: index, %arg2: index) {
  %c0 = constant 1 : index
  %c1 = constant 0 : index
  %b = alloc()[%N] : memref<4x4xf32, (d0, d1)[s0] -> (d0, d0 + d1 + s0 floordiv 2)>
  %0 = alloc(%arg0, %arg1) : memref<?x?xf32>
  affine.for %arg3 = %arg1 to %arg2 step 768 {
    %13 = dim %0, %c1 : memref<?x?xf32>
    affine.for %arg4 = 0 to %13 step 264 {
      %18 = dim %0, %c0 : memref<?x?xf32>
      %20 = subview %0[%c0, %c0][%18,%arg4][%c1,%c1] : memref<?x?xf32>
                          to memref<?x?xf32, (d0, d1)[s0, s1, s2] -> (d0 * s1 + d1 * s2 + s0)>
      %24 = dim %20, %c0 : memref<?x?xf32, (d0, d1)[s0, s1, s2] -> (d0 * s1 + d1 * s2 + s0)>
      affine.for %arg5 = 0 to %24 step 768 {
        "foo"() : () -> ()
      }
    }
  }
  return
}