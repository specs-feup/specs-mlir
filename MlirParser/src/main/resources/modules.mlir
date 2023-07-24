module {
  module {
  }
  module {
  }
  module attributes {foo.attr = true} {
  }
  module {
    %1 = "foo.result_op"() : () -> i32
  }
  module {
  }
  %0 = "op"() : () -> i32
  module @foo {
    module {
      module @bar attributes {foo.bar} {
      }
    }
  }
}
