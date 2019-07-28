package chapter12

class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  override val left = topLeft.x
  override val right = bottomRight.x

  override def width = right - left
}

abstract class Component extends Rectangular

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}