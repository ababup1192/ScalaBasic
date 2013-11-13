case class Point(x:Double,y:Double)

trait Rectangular{
	val topLeft: Point
	val bottomRight: Point
	def left = topLeft.x
	def right = bottomRight.x
	def width = right - left
	//　もっと多くの幾何学メソッド・・・
}

abstract class Component extends Rectangular{
	// その他多くのクラス
}

case class Rectangle(topLeft:Point,bottomRight:Point) extends Rectangular{
	// その他多くのクラス
}

object TestRectangle{
	def main(args: Array[String]): Unit = {
		val rect = Rectangle(Point(1.0,1.0),Point(10.0,10.0))
		println(s"left = ${rect.left}")
		println(s"right = ${rect.right}")
		println(s"width = ${rect.width}")
	}
}