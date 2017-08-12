package ch02

object Procedures extends App{
  def box(word:String):Unit = {
    val border = "-"*word.length + "--\n"
    println(border+"|"+word+"|\n"+border)
  }

  box("hello")
}
