/*
def square(s: Int) = s * s

def addSquare(x: Int, y: Int) = {
  square(x) + square(y)
}
*/

def addSquare(x: Int, y: Int) = {
  def square(s: Int) = s * s

  square(x) + square(y)
}

println("Hasil dari 2^2 + 3^2 adalah: " + addSquare(2, 3))

//println("Pangkat dua dari 4 adalah " + square(4))
