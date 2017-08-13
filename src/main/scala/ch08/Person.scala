package ch08

abstract class Person(val name: String, val age: Int) {

  def id: String

  override def toString: String = getClass.getName + "[name=" + name + "],[age=" + age + "]"

}
