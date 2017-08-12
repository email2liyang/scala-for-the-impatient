package ch05

class Person(val name: String, var age: Int) {

  def this(name: String) {
    this(name, 1)
  }

}

object Person extends App {
  val person = new Person("bob",65)
  println(person.name)
}
