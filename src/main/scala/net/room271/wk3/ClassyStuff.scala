package net.room271.wk3

/**
 * Define a class
 *
 * note, we preface lyrics with 'val' but we could also use var or omit it
 * altogether
 */

class Song(val lyrics: List[String]) {

  def singSong(): Unit = {
    lyrics foreach { line =>
      println(line)
    }
  }
}

/**
 * Define an object to do some stuff (note, we just use this as a wrapper for
 * code here but typically objects just contain static methods)
 */

object ScratchPad {

  val happyBirthday = new Song(List("Happy birthday to you",
    "I don't want to get sued",
    "So I'll stop right there"))

  happyBirthday.singSong()
}

/**
 * Define a BankAccount class which stores a balance and allows users to deposit
 * and withdraw funds
 *
 * 
 */

// Imperative-style (note, 'bal' is a var)
class BankAccount {

  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int): Unit = {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean = {
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
  }
}

// Functional style (note, 'case' keyword has many effects, but the key thing
// here is that it sets all constructor parameters - in this case 'balance' -
// to be vals by default)
//
// Instead of modifying balance directly, we return a new object if changes are
// made
case class BankBalance(balance: Int) {

  def deposit(amount: Int): Unit = {
    require(amount > 0)
    BankBalance(balance + amount)
  }

  def withdraw(amount: Int): BankBalance = {
    if (amount > balance) this
    else BankBalance(balance - amount)
  }
}



