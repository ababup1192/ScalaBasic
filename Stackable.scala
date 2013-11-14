abstract class IntQueue{
	def get(): Int
	def put(x: Int):Unit
}

import scala.collection.mutable.ArrayBuffer
class BasicIntQueue extends IntQueue{
	private val buf = new ArrayBuffer[Int]
	def get():Int = buf.remove(0)
	def put(x:Int):Unit = {buf += x}
}

object TestBasicIntQueue{
	def main(args: Array[String]): Unit = {
		val queue = new BasicIntQueue
		queue.put(10)
		queue.put(20)
		println(queue.get())
		println(queue.get())
	}
}

trait Doubling extends IntQueue{
	abstract override def put(x:Int):Unit = {super.put(2 * x)}
}

class DoublingQueue extends BasicIntQueue with Doubling

object TestDoublingQueue{
	def main(args: Array[String]): Unit = {
		val queue = new DoublingQueue
		queue.put(10)
		println(queue.get())
		val instantQueue = new BasicIntQueue with Doubling
		instantQueue.put(10)
		println(instantQueue.get())
	}
}

trait Incrementing extends IntQueue{
	abstract override def put(x: Int):Unit = {super.put(x+1)}
}

trait Filtering extends IntQueue{
	abstract override def put(x:Int):Unit = {
		if(x >= 0) super.put(x)
	}
}

object TestStackable{
	def main(args: Array[String]): Unit = {
		println("---Queue1---")
		val queue = (new BasicIntQueue with Incrementing with Filtering)
		queue.put(-1); queue.put(0); queue.put(1)
		println(queue.get())
		println(queue.get())
		//continue
		println("---Queue2---")
		val queue2 = (new BasicIntQueue with Filtering with Incrementing)
		queue2.put(-1); queue2.put(0); queue2.put(1)
		println(queue2.get())
		println(queue2.get())
		println(queue2.get())
	}
}
