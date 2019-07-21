class Rational(n: Int, d: Int) {
  require(d != 0)

  val numer: Int = n / g
  val denom: Int = d / g
  private val g = gcd(n, d)

  def this(n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom

  def +(that: Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def *(that: Rational): Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object Application extends App {
  val x = new Rational(2, 3)
  val y = new Rational(1, 2)

  val sum = x + y
  val multiple = x * y

  println(sum)
  println(multiple)
}

