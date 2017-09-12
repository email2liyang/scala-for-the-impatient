package ch17

object Type1 extends App {

  class Pair[T, S](val first: T, val second: S)

  val p = new Pair(1, "first")
  val p2: Pair[Any, Any] = new Pair(1, 2)
}




