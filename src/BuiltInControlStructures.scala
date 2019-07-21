object BuiltInControlStructures extends App {

  //functional style
  val filenameF =
    if (!args.isEmpty) args(0)
    else "default.txt"
  if (!args(0).isEmpty)
    filename = args(0)
  // imperative style
  var filename = "default.txt"

  //imperative style
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  //functional style
  def gcd(x: Long, y: Long): Long = {
    if (y != 0) x else gcd(y, x % y)
  }
}
