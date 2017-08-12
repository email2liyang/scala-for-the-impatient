package ch03

object TransformingArrays extends App {

  val nums = Array(1, 2, 3, 4, 5, 6)
  val nums2 = for (elem <- nums if elem % 2 == 0) yield {
    elem * 2
  }

  nums2.foreach(println(_))

  val nums3 = nums filter (_ % 2 == 0) map (_ * 2)
  nums3.foreach(println(_))
}
