package ch14

object Match1 extends App {

  var sign1: Option[Int] = None
  var ch: Char = '+'

  ch match {
    case '+' => sign1 = Some(1)
    case '-' => sign1 = Some(-1)
    case _ => sign1 = None
  }

  var sign2: Option[Int] = ch match {
    case '+' => Some(1)
    case '-' => Some(-1)
    case _ => None
  }

  println(s"sign1 is $sign1")
  println(s"sign2 is $sign2")
}
