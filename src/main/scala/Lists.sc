import scala.collection.{immutable, mutable}

val myList = List("Will", "fill", "until")

println(myList.count(s => s.length == 4))

println(myList.contains("until"))

println(myList.filter(s => s.length == 4))

println(myList.forall(s => s.endsWith("l")))

myList.foreach(s => print(s))

myList.foreach(print)

println(myList.head)

println(myList.tail)

println(myList.map(s => s + "y"))

println(myList.mkString(","))

val tuple = (99, "Luft", List(1, 3, 4), 'u')

println(tuple.toString())

val map = mutable.Map[Int, String]()
val anotherMap = immutable.Map[Int, String]()

map += (1 -> "One")
map += (2 -> "Two")
map += (3 -> "Three")

println(
  """Multiple lines
    |println
  """.stripMargin)
