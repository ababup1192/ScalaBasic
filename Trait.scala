trait Philosophical{
	def philosophize():Unit = {
		println("I consume memory,therefore I am")
	}
	override def toString:String = "Philosophical"
	def self():Unit
}
class Animal{
	override def toString:String = "Animal"
	def self():Unit = println("I am an Animal.")
}
class Frog extends Animal with Philosophical{
	override def self():Unit = {
		super.self()
		println("I am a Frog.")
	}
}
object TestTrait{
	def main(args: Array[String]): Unit = {
		println(s"${(new Frog()).toString}")
		val phrog:Philosophical = new Frog()
		phrog.self()
	}
}