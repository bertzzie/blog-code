def hitungDeret(x: Int, y: Int): Int = {
  if (x > y) 0 else x + hitungDeret(x + 1, y)
}

def hitungDeretKuadrat(x: Int, y: Int): Int = {
  if (x > y) 0 else x*x + hitungDeretKuadrat(x + 1, y)
}

println("Hitung Deret")
println("------------")
println("hitungDeret(1, 3): " + hitungDeret(1, 3))
println("hitungDeret(2, 6): " + hitungDeret(2, 6))
println("hitungDeret(8, 1): " + hitungDeret(8, 1))
println

println("Hitung Deret Kuadrat")
println("--------------------")
println("hitungDeretKuadrat(1, 3): " + hitungDeretKuadrat(1, 3))
println("hitungDeretKuadrat(2, 6): " + hitungDeretKuadrat(2, 6))
println("hitungDeretKuadrat(8, 1): " + hitungDeretKuadrat(8, 1))
println

def hitungDeret2(x: Int, y: Int, fungsiBilangan: Int => Int): Int = {
  if (x > y) 0 else fungsiBilangan(x) + hitungDeret2(x + 1, y, fungsiBilangan)
}

println("Hitung Deret (Parameter)")
println("------------------------")
println("hitungDeret(1, 3, x => x)\t: " + hitungDeret2(1, 3, x => x))
println("hitungDeret(1, 3, x => x * x)\t: " + hitungDeret2(1, 3, x => x * x))
println("hitungDeret(1, 3, _ + 1)\t: " + hitungDeret2(1, 3, _ + 1))

val hitungDeretKuadrat2 = hitungDeret2(_: Int, _: Int, x => x * x)

println("hitungDeretKuadrat (parsial)\t: " + hitungDeretKuadrat2(2, 6))
