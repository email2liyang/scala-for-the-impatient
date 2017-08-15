package ch09

import ch09.RegexControl.{name, num}

object RegexControl extends App {

  val numberPattern = """\s*[0-9]+\s+""".r

  numberPattern.findAllIn("99 asd 89 de").toArray.foreach(println(_))

  val numberPattern2 = """([0-9]+) ([a-z]+)""".r

  val numberPattern2(num, name) = "99 bottles"

  println(s"$num - $name")

  val names = for (numberPattern2(num, name) <- numberPattern2.findAllIn("1 apple 2 apples")) yield {
    num + "_" + name
  }
  names.foreach(println(_))
}
