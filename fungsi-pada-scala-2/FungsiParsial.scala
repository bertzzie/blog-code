def total(a: Int, b: Int, c: Int) = a + b + c

println("total(10, 20, 30):")
println(total(10, 20, 30))
println

val totalTambah10 = total(10, _: Int, _: Int)

println("totalTambah10(15, 20):")
println(totalTambah10(15, 20))
println

val totalSatu = total(10, _: Int, 5)

println("totalSatu(10):")
println(totalSatu(10))
println

val totalKW = total(_: Int, _: Int, _: Int)

println("totalKW(1, 2, 3):")
println(totalKW(1, 2, 3))
println

val totalKW2 = total _

println("totalKW2(2, 3, 4):")
println(totalKW2(2, 3, 4))

// val tot = total
// val tot = total_
