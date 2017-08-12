package ch02

object LoopStmt extends App {

  for (i <- 1 to 5) {
    println(i)
  }

  var word = "hello"
  for (i <- 0 until word.length) {
    println(word(i))
  }

}
