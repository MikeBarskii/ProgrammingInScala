package chapter10

class LineElement(s: String) extends Element {
  val contents: Array[String] = Array(s)

  override val height: Int = 1
  override val width: Int = s.length

}
