module {
  func.func @myfunc() {
        %a, %b = "tensor_replicator"(%tensor, %tensor) : (memref<?xbf16, 2>,
          memref<?xf32, offset: 5, strides: [6, 7]>,
          memref<*xf32, 8>)
  }
}