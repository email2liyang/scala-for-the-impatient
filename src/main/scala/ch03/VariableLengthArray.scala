package ch03
import scala.collection.mutable.ArrayBuffer

object VariableLengthArray extends App {
  val b = ArrayBuffer[Int]()
  b += 1
  b += (1,2,3,4,5)
  b ++= Array(8,9,10)
  b.insert(2, 0, 9)
  b.toArray.foreach(println(_))
}
