object Functions extends App {

  val incrementor = (x: Int) => x + 1

  println(incrementor(10))

  val someNumbers = List(10, 12, 13, -2, 3, -1)

  //Return the same result
  someNumbers.filter((x: Int) => x > 0)
  someNumbers.filter(x => x > 0)
  someNumbers.filter(_ > 0)

  someNumbers.filter(_ > 0).foreach(println)
  val smallSum = summator _
  val b = summator(1, _: Int, 3)

  def summator(a: Int, b: Int, c: Int) = {
    a + b + c
  }

  //1+3+4
  println(smallSum(1, 3, 4))

  //1+2+3
  println(b(2))

  //a & b have default values
  def summator2(a: Int = 2, b: Int = 3, c: Int) = {
    a + b + c
  }

  println(summator2(c = 4))

}
