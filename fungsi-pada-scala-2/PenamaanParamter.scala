def tekanan(rho: Double, g: Double, h: Double) = {
  rho * g * h
}

println("tekanan(1000, 9.8, 10):")
println(tekanan(1000, 9.8, 10))
println

println("tekanan(g = 9.8, h = 100, rho = 350):")
println(tekanan(g = 9.8, h = 100, rho = 350))
println

println("tekanan(1000, h = 10, g = 9.8):")
println(tekanan(1000, h = 10, g = 9.8))
// println(tekanan(1000, h = 10, 9.8))
