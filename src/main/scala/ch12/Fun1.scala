package ch12

import scala.math._

object Fun1 extends App {

  val num = 3.14
  val fun = ceil _

  println(fun(num))

  Array(3.14, 2.75, 4.8).map(fun).foreach(println(_))

  Array(3.14, 2.75, 4.8) map {
    (x: Double) => {
      x * 3
    }
  } foreach {
    println(_)
  }

  "Mary has a little lamb"
    .split(" ").sortWith(_.length < _.length)
    .foreach(println(_))
}
