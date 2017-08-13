package ch08

class Employee(employeeName: String, age: Int, salary: Double) extends Person(employeeName, age) {

  def this(employName: String) {
    this(employName, 10, 1000.0)
  }

  override def id: String = employeeName
}

object Employee extends App {

  val employee = new Employee("jack")

  employee match {
    case e: Employee => {
      println("I'm employee " + e.toString)
    }
    case _ => {
      println("I'm person")
    }
  }
}
