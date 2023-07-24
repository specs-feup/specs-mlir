#map0 = affine_map<(d0, d1) -> (d0, d1)>
#map1 = affine_map<(d0) -> (d0)>
#map2 = affine_map<() -> (0)>
#map3 = affine_map<() -> (10)>
#map4 = affine_map<(d0, d1, d2) -> (d0, d1 + d2 + 5)>
#map5 = affine_map<(d0, d1, d2) -> (d0 + d1, d2)>
#map6 = affine_map<(d0, d1)[s0] -> (d0, d1 + s0 + 7)>
#map7 = affine_map<(d0, d1)[s0] -> (d0 + s0, d1)>
#map8 = affine_map<(d0, d1) -> (d0 + d1 + 11)>
#map9 = affine_map<(d0, d1)[s0] -> (d0, (d1 + s0) mod 9 + 7)>
#map10 = affine_map<(d0, d1)[s0] -> ((d0 + s0) floordiv 3, d1)>
#samap0 = (d0)[s0] -> (d0 floordiv (s0 + 1))
#samap1 = (d0)[s0] -> (d0 floordiv s0)
#samap2 = (d0, d1)[s0, s1] -> (d0*s0 + d1*s1)
#set0 = (d0) : (1 == 0)
#set1 = (d0, d1)[s0] : ()
#set2 = (d0, d1)[s0, s1] : (d0 >= 0, -d0 + s0 - 1 >= 0, d1 >= 0, -d1 + s1 - 1 >= 0)
#set3 = (d0, d1, d2) : (d0 - d2 * 4 == 0, d0 + d1 * 8 - 9 >= 0, -d0 - d1 * 8 + 11 >= 0)
#set4 = (d0, d1, d2, d3, d4, d5) : (d0 * 1089234 + d1 * 203472 + 82342 >= 0, d0 * -55 + d1 * 24 + d2 * 238 - d3 * 234 - 9743 >= 0, d0 * -5445 - d1 * 284 + d2 * 23 + d3 * 34 - 5943 >= 0, d0 * -5445 + d1 * 284 + d2 * 238 - d3 * 34 >= 0, d0 * 445 + d1 * 284 + d2 * 238 + d3 * 39 >= 0, d0 * -545 + d1 * 214 + d2 * 218 - d3 * 94 >= 0, d0 * 44 - d1 * 184 - d2 * 231 + d3 * 14 >= 0, d0 * -45 + d1 * 284 + d2 * 138 - d3 * 39 >= 0, d0 * 154 - d1 * 84 + d2 * 238 - d3 * 34 >= 0, d0 * 54 - d1 * 284 - d2 * 223 + d3 * 384 >= 0, d0 * -55 + d1 * 284 + d2 * 23 + d3 * 34 >= 0, d0 * 54 - d1 * 84 + d2 * 28 - d3 * 34 >= 0, d0 * 54 - d1 * 24 - d2 * 23 + d3 * 34 >= 0, d0 * -55 + d1 * 24 + d2 * 23 + d3 * 4 >= 0, d0 * 15 - d1 * 84 + d2 * 238 - d3 * 3 >= 0, d0 * 5 - d1 * 24 - d2 * 223 + d3 * 84 >= 0, d0 * -5 + d1 * 284 + d2 * 23 - d3 * 4 >= 0, d0 * 14 + d2 * 4 + 7234 >= 0, d0 * -174 - d2 * 534 + 9834 >= 0, d0 * 194 - d2 * 954 + 9234 >= 0, d0 * 47 - d2 * 534 + 9734 >= 0, d0 * -194 - d2 * 934 + 984 >= 0, d0 * -947 - d2 * 953 + 234 >= 0, d0 * 184 - d2 * 884 + 884 >= 0, d0 * -174 + d2 * 834 + 234 >= 0, d0 * 844 + d2 * 634 + 9874 >= 0, d2 * -797 - d3 * 79 + 257 >= 0, d0 * 2039 + d2 * 793 - d3 * 99 - d4 * 24 + d5 * 234 >= 0, d2 * 78 - d5 * 788 + 257 >= 0, d3 - (d5 + d0 * 97) floordiv 423 >= 0, ((d0 + (d3 mod 5) floordiv 2342) * 234) mod 2309 + (d0 + d3 * 2038) floordiv 208 >= 0, ((((d0 + d3 * 2300) * 239) floordiv 2342) mod 2309) mod 239423 == 0, d0 + d3 mod 2642 + (((((d3 + d0 * 2) mod 1247) mod 2038) mod 2390) mod 2039) floordiv 55 >= 0)
#matmul_accesses = [
  affine_map<(m, n, k) -> (m, k)>,
  affine_map<(m, n, k) -> (k, n)>,
  affine_map<(m, n, k) -> (m, n)>
]
#matmul_trait = {
  args_in = 2,
  args_out = 1,
  iterator_types = ["parallel", "parallel", "reduction"],
  indexing_maps = #matmul_accesses,
  library_call = "external_outerproduct_matmul"
}

!vector_type_A = type vector<4xf32>
!vector_type_B = type vector<4xf32>
!vector_type_C = type vector<4x4xf32>

!matrix_type_A = type memref<?x?x!vector_type_A>
!matrix_type_B = type memref<?x?x!vector_type_B>
!matrix_type_C = type memref<?x?x!vector_type_C>