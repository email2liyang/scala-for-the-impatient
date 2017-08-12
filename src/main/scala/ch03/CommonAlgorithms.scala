package ch03

object CommonAlgorithms extends App {

  val nums = Array(1, 4, 2, 9, 8)

  nums.sorted.reverse.foreach(println(_))
  println(nums.min)
  println(nums.sum)
}
