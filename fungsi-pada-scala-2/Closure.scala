val tambah = (x: Int) => x + 1

var angka = 1000

val tambahAngka = (x: Int) => x + angka

println("Closure (Angka = 1000)")
println("-------")
println("tambahAngka(10)  : " + tambahAngka(10))
println("tambahAngka(536) : " + tambahAngka(536))
println

angka = 200

println("Closure (Angka = 200)")
println("---------------------")
println("tambahAngka(56)\t: " + tambahAngka(56))
println("tambahAngka(1)\t: " + tambahAngka(1))

def buatPenambahAngka(n: Int) = (x: Int) => x + n

val tambah100 = buatPenambahAngka(100)
val tambah10 = buatPenambahAngka(10)

println("Closure Many Instances")
println("----------------------")
println("tambah100(28)\t: " + tambah100(28))
println("tambah10(54)\t: " + tambah10(54))
