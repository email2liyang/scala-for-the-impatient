package ch10

class SavingAccount extends ConsoleLogger {

  var balance: Double = 100.0

  def withDraw(amount: Double): Double = {
    if (amount > balance) {
      log("not enough money")
    } else {
      balance -= amount
    }

    balance
  }
}
