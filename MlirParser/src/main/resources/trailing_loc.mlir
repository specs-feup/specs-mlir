module {
  func.func @myfunc() {
    %c:2 = addf %a, %b : f32 loc("test_syntax.py":36:59)
  }
} loc("hi.mlir":30:1)

