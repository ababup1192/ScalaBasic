//sex 0 == male, 1 == female
case class Human(name:String,height:Double,sex:Int)

object TestPatternMatch{
	def main(args: Array[String]): Unit = {
		val humanList = List(Human("John",170.5,0),Human("Bob",190.5,0),
			Human("Mike",200.0,0),Human("Alice",155.0,1),Human("Melissa",170.5,1))

		val bigHumanList:List[Human] = for(human <- humanList if{
			human match{
				case Human(_,h,0) => h >= 180
				case Human(_,h,1) => h >= 170
				case _ => false
			}
			})yield human
		bigHumanList.foreach(h => println(s"Big Human is ${h.toString}"))
	}
}
