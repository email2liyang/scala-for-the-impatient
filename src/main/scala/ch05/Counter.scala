package ch05

import scala.beans.BeanProperty

class Counter {

  @BeanProperty var value = 1

  def increase() = value += 1

  def current = value

  def isLessThan(other: Counter): Boolean = value < other.value
}

object Runner extends App {

  val counter = new Counter
  counter.increase()

  println(counter.current)
  println(counter.getValue)
}