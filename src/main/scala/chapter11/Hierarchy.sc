def isEqual(x: Int, y: Int) = x == y

isEqual(421, 421)

def isEqual1(x: Any, y: Any) = x == y

isEqual1(421, 421)

val x = "abcd".substring(2)
val y = "abcd".substring(2)

// in Java it'd be false, you should use equals, but here it's true
x == y

val z = new String("abc")
val q = new String("abc")

//true
z == q

//compare references => false
z eq q

// the opposite of eq method => true
z ne q

// Nothing is using for abnormal termination
def error(message: String): Nothing =
  throw new RuntimeException(message)

/*
  As nothing is subclass of all classes, even values,
  this type of implementation is possible
 */
def divide(x: Int, y: Int): Int =
  if (y != 0) x / y
  else error("can't divide by zero")

// not compatible
//val i: Int = null

class Dollars(val amount: Int) extends AnyVal {
  override def toString: String = "$" + amount
}

val money = new Dollars(10000)
money.amount

