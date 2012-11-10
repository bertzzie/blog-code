def bagi(x: Double, y: Double) = x / y

println("Fungsi bagi standar")
println("-------------------")
println("bagi(27, 3): " + bagi(27, 3))
println

def bagiCurry(x: Double) = (y: Double) => x / y

println("Fungsi bagi konsep curry")
println("-----------------------------")
val ba = bagiCurry(27)
println("bagi(27, 3): " + ba(3))
println

def bagiRealCurry(x: Double)(y: Double) = x / y
def total(x: Int)(y: Int)(z: Int) = x + y + z

println("Fungsi bagi menggunakan curry scala")
println("-------------------")
println("bagi(27)(3)\t: " + bagiRealCurry(27)(3))
println("total(1)(2)(3)\t: " + total(1)(2)(3))
println

val duaBagi = bagiRealCurry(2)_

println("Placeholder pada Curry")
println("----------------------")
println("duaBagi(8): " + duaBagi(8))
println

//def withMagic(code: String, func: () => String) = {
  //if (code == "alohomora") {
    //println("Well hello, " + func())
  //} else {
    //println("Intruder alert! Intruder alert! Piertotum Locomotr! Protect your castle!")
  //}
//}

//def withMagic(code: String, func: => String) = {
  //if (code == "alohomora") {
    //println("Well hello, " + func)
  //} else {
    //println("Intruder alert! Intruder alert! Piertotum Locomotr! Protect your castle!")
  //}
//}

def withMagic(code: String)(func: => String) = {
  if (code == "alohomora") {
    println("Well hello, " + func)
  } else {
    println("Intruder alert! Intruder alert! Piertotum Locomotr! Protect your castle!")
  }
}

println("Custom controls")
println("---------------")
withMagic("alohomora") {
  "Nevile Longbottom"
}

withMagic("wingardiun leviooosa") {
  val name = "ErrMyKnee "
  val lastName = "Grenger"
  name + lastName
}


