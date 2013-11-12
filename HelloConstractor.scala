class Hello(val x:Int,val y:Int){
	println("Default Constructor")
	def this(x:Int) = {
		this(x,0)
		println("Nothing y Constructor")
	}
	def this() ={
	 	this(0)
		println("Nothing x y Constructor")
	}
}

object TestHello{
	def main(args: Array[String]): Unit = {
		val hello = new Hello(1,2)
		println(s"x = ${hello.x}, y = ${hello.y}")
		val hello2 = new Hello(3)
		println(s"x = ${hello2.x}, y = ${hello2.y}")
		val hello3 = new Hello()
		println(s"x = ${hello3.x}, y = ${hello3.y}")
	}
}