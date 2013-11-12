case class Human(name:String,height:Double)
object Human{
	def apply(name:String) = new Human(name,170.5)
}

object TestCaseClass{
	def main(args: Array[String]): Unit = {
		val human1 = Human("Ningen",170.5)
		println(s"Human1's height is ${human1.height}")
		println(s"Human1's toString = ${human1.toString}")
		println(s"Human1's HashCode = ${human1.hashCode}")
		val human2 = Human("Ningen")
		println(s"Human2's name is ${human2.name}")
		println(s"Human2's toString = ${human2.toString}")
		println(s"Human2's HashCode = ${human2.hashCode}")
		val isEqualsHuman = human1 == human2
		println(s"Human1 == Human2 is $isEqualsHuman")
	}
}