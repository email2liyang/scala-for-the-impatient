package ch04

object ConstructMap extends App {

  val sources = Map("scott" -> 1, "bob" -> 2, "cindy" -> 3)
  val mutableSources = new scala.collection.mutable.HashMap[String, Int]()
  val bobScore = sources.getOrElse("bob", 4)
  println(bobScore)

  for ((k, v) <- sources) {
    printf("%s->%d\n", k, v)
  }

  val reversMap = for ((k, v) <- sources) yield {
    (v, k)
  }

  println(reversMap)
}
