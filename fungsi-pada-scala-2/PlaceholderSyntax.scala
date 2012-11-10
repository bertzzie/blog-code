val kumpulan = List(-20, -9, -3, 0, 2, 18, 29)

println("Menggunakan fugnsi literal biasa: (kumpulan.filter(x => x > 10))")
println(kumpulan.filter(x => x > 10))
println

println("Menggunakan placeholder syntax: (kumpulan.filter(_ > 10))")
println(kumpulan.filter(_ > 10))
println

println("Fungsi literal: (kumplan.sortWith((x, y) => x > y))")
println(kumpulan.sortWith((x, y) => x > y))
println

println("Dua placeholder: (kumplan.sortWith(_ > _))")
println(kumpulan.sortWith(_ > _))
println

val fungsi = (_: Int) + (_: Int)

println("Pemanggilan fungsi 'fungsi' (val fungsi = (_: Int) + (_: Int)): ")
println(fungsi(10, 15))
println

println("Placeholder pada seluruh argumen (kumpulan.foreach(println _)): ")
println(kumpulan.foreach(println _))
