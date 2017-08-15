package ch09

import scala.io.Source

object FileSources extends App {
  // try scala arm for try-with-resources style of programming
  // https://github.com/jsuereth/scala-arm
  val source = Source.fromInputStream(getClass.getResourceAsStream("/ch09/number.csv"))
  source.getLines().foreach(line => println(line))
  source.close()

  val source1 = Source.fromURL("http://horstmann.com")
  val source2 = Source.fromString("Hello world")

}
