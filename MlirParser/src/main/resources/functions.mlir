module {
  func.func @myfunc_a() {
    %c:2 = addf %a, %b : f32
  }
  func.func @myfunc_b() {
    %d:2 = addf %a, %b : f64
    ^e:
    %f:2 = addf %d, %d : f64
  }
}
