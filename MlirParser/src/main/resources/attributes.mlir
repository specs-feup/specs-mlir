module {
  func.func @myfunc(%tensor: tensor<256x?xf64>) -> tensor<*xf64> {
    %t_tensor = "with_attributes"(%tensor) { inplace = true, abc = -123, bla = unit, hello_world = "hey", value=@this::@is::@hierarchical, somelist = ["of", "values"], last = {butnot = "least", dictionaries = 0xabc} } : (tensor<2x3xf64>) -> tuple<vector<3xi33>,tensor<2x3xf64>>
    return %t_tensor : tensor<3x2xf64>
  }
  func.func @toy_func(%arg0: tensor<2x3xf64>) -> tensor<3x2xf64> {
    %0:2 = "toy.split"(%arg0) : (tensor<2x3xf64>) -> (tensor<3x2xf64>, f32)
    return %0#50 : tensor<3x2xf64>
  }
}
