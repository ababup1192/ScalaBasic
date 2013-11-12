class Hello(xx:Int,yy:Int){
	val x = xx
	var y = yy
}

object TestHello{
	def main(args: Array[String]): Unit = {
		val hello = new Hello(1,2)
		println(s"x = ${hello.x}, y = ${hello.y}")
		hello.y = 3
		println(s"x = ${hello.x}, y = ${hello.y}")
	}

}