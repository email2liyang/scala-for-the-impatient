package ch05

import scala.collection.mutable.ArrayBuffer

class Network {

  class Member(val name: String) {

    val contacts = new ArrayBuffer[Member]
  }

  val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

object Network extends App{
  val charls = new Network
  val frad = new Network

  val charseMember = charls.join("member")

  println(charls)
}
