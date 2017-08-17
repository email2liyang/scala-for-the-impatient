package ch13

object Folding extends App {

  val wordCountMap = "mississippi".foldLeft(Map[Char, Int]())((m, c) => {
    m + (c -> (m.getOrElse(c, 0) + 1))
  })

  for ((c, n) <- wordCountMap) {
    println(s"$c->$n")
  }

}
