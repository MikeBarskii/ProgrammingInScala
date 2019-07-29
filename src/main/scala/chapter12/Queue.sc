import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int

  def put(x: Int)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(2 * x)
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = if (x >= 0) super.put(x)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  override def get() = buf.remove(0)

  override def put(x: Int): Unit = buf += x
}

val queue = new BasicIntQueue with Doubling with Filtering

queue.put(-1)
queue.put(0)
queue.put(1)

queue.get()
queue.get()
queue.get()