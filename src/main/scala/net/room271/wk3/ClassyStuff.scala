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

//class BankAccount { }



