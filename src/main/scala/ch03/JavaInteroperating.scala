package ch03

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

object JavaInteroperating extends App {

  val command = ArrayBuffer("ls", "-a", "~")
  val pb = new ProcessBuilder(command.asJava)

  val cmd = pb.command().asScala

  println(cmd)
}
