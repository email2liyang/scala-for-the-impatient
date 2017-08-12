package ch06

abstract class UndoableAction(val desc: String) {

  def undo(): Unit

  def redo(): Unit
}

object DoNothingAction extends UndoableAction("Do nothing") {

  override def undo(): Unit = {}

  override def redo(): Unit = {}

  val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
}
