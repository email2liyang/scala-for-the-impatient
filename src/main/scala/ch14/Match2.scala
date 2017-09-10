package ch14

object Match2 extends App {

  val a = 1
  val b = "2"
  var c = None

  def parseInt(param: Any): Int = {
    param match {
      case x: Int => x
      case y: String => Integer.parseInt(y)
      case _ => 0
    }
  }

  println(parseInt(a))
  println(parseInt(b))
  println(parseInt(c))
}
