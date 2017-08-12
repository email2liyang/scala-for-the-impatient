package ch02

object Procedures extends App{
  /*
  “The concise procedure syntax can be a surprise for Java and C++ programmers.
  It is a common error to accidentally omit the = in a function definition.
  You then get an error message at the point where the function is called,
  and you are told that Unit is not acceptable at that location.”
  Excerpt From: Horstmann, Cay S. “Scala for the Impatient.” iBooks.
   */

  def theBox(word:String)  {
    box(word)
  }
  def box(word:String):Unit = {
    val border = "-"*word.length + "--\n"
    println(border+"|"+word+"|\n"+border)
  }

  box("hello")
  theBox("hello")
}
