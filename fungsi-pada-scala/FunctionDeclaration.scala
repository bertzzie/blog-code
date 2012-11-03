def terbesar(x: Int, y: Int) = if (x > y) x else y

def terkecil(x: Int, y: Int) = {
  if (x > y)
    x
  else
    y
}

def getRandomNumber() = {
  4  // chosen by fair dice roll.
     // guaranteed to be random.
}

def halo() = println("Hello~")

println("Nilai terbesar dari 10 dan 5 adalah: " + terbesar(10, 5))

println("Nilai terkecil dari 10 dan 5 adalah: " + terkecil(10, 5))

println("Nilai acak: " + getRandomNumber())
println("Nilai acak: " + getRandomNumber)

halo()
