package ch14

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

object Amount extends App {

  val dollar = Dollar(14.0)
  val currency = Currency(15.0, "AUD")

  val money = Array(dollar, currency)

  money.foreach { amt =>
    val desc = amt match {
      case Dollar(v) => "$" + v
      case Currency(v, u) => u + v
      case _ => "Unknown"
    }
    println("desc is " + desc)
  }
}

