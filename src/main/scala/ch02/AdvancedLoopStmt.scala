package ch02

object AdvancedLoopStmt extends App {

  for (i <- 1 to 3; j <- 1 to 3 if i != j) {
    print(i * 10 + j + " ")
  }
  println("")
  val col = for (i <- 0 to 10) yield {
    i % 3
  }
  col.foreach(num => print(num + " "))
}
