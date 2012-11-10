def cetak(strs: String*) = {
  for(str <- strs)
    println(str)
}

println("cetak(\"Jumlah\", \"Parameter\", \"tidak\", \"penting\"):")
cetak("Jumlah", "Parameter", "tidak", "penting")
println
  
val arr = Array("Ini", "Array", "String")

//cetak(arr)

println("cetak(arr: _*):")
cetak(arr: _*)
