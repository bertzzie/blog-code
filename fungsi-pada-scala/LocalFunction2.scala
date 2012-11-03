import scala.io.Source

/* VERSI PERTAMA
def processFile(filename: String, width: Int) = {
  val source = Source.fromFile(filename)
  for (line <- source.getLines())
    processLine(filename, width, line)
}

def processLine(filename: String, width: Int, line: String) = {
  if(line.length > width)
    println(filename + ": " + line.trim)
}
 */

/* VERSI 2
def processFile(filename: String, width: Int) = {
  def processLine(filename: String, width: Int, line: String) = {
    if(line.length > width)
      println(filename + ": " + line.trim)
  }
  val source = Source.fromFile(filename)
  for (line <- source.getLines())
    processLine(filename, width, line)
}
*/

def processFile(filename: String, width: Int) = {
  def processLine(line: String) = {
    if(line.length > width)
      println(filename + ": " + line.trim)
  }
  val source = Source.fromFile(filename)
  for (line <- source.getLines())
    processLine(line)
}

val width = args(0).toInt
for(arg <- args.drop(1))
  processFile(arg, width)
