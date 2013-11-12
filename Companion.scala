class Companion private (private val x:Int, private val y:Int){
	def calculate():Int = Companion.constTwelve * x * y
}

object Companion{
	def apply(x:Int,y:Int):Companion = new Companion(x,y)
	private def constTwelve():Int = 12
}

object TestCompanion{
	def main(args: Array[String]): Unit = {
		//Can't Compile here!
		//val companion = new Companion(1,2)
		val companion1 = Companion.apply(1,2)
		println(s"Companion1 calculate value = ${companion1.calculate()}")
		val companion2 = Companion(2,3)
		println(s"Companion2 calculate value = ${companion2.calculate()}")
	}
}