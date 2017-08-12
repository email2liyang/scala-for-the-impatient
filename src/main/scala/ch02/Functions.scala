package ch02

object Functions extends App {

  def abs(x: Double) = if (x > 0) {
    x
  } else {
    -x
  }

  println(abs(-1))
  println(abs(2))

  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }

  println(decorate("hello"))
  println(decorate("hello",left = ">>>["))
  println(decorate(left = ">>>[",str="hello",right = "]<<<"))

  def sum(args: Int*) = {
    var result = 0
    for( arg <- args){
      result += arg
    }
    result
  }

  println(sum(1,2,3))
  println(sum(1 to 4 : _*))
}
