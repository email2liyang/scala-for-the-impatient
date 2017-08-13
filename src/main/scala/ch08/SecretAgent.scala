package ch08

class SecretAgent(agentCode: String) extends Person(agentCode,10) {

  override val name: String = "secret"

  override def toString: String = "secret"

  override def id: String = "secret"


  def canEqual(other: Any): Boolean = other.isInstanceOf[SecretAgent]

  override def equals(other: Any): Boolean = other match {
    case that: SecretAgent =>
      (that canEqual this) &&
      name == that.name
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object SecretAgent extends App{
  val secretAgent = new SecretAgent("007")
  println(secretAgent.toString)
}
