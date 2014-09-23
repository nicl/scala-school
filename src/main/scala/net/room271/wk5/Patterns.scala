package net.room271.wk5

object Patterns {

  // Pattern matching is a way to branch on type or structural information.
  // It's like a richer version of the switch statement common in most C-like languages.

  // the basic form is:
  // [target] match { [cases] }
  // where [target] is an object and [cases] is a series of cases to match against
  // cases take the form: case [pattern] => [result]

  // let's look at some basic examples
  val x = List("abc")

  x match {
    case Nil => println("I am an empty list!")
    case _ => println("I am not empty!")
  }

  val y = "Bob"

  y match {
    case "Bob" => "Found Bob!"
    case someoneElse => "Found: " + someoneElse
  }

  // Pattern matching works especially well with case classes and the sealed keyword:
  sealed trait Fruit
  case object Banana
  case object Apple
  case object Melon

  val fruit = Apple

  // Try defining the above in your console and then run:
  fruit match {
    case Banana => "Found a banana! - "
    case Apple => "Found an apple! - mmm tasty"
  }

  // what happened? How can you fix it?

  // .. but there are lots of ways to match:

  // by constant
  def matchNumber(x: Int): String = x match {
    case 1 => "One"
    case _ => "Two"
    case _ => "Many"
  }

  def stringToBoolean(s: String): Option[Boolean] = {
    case "yes" => Some(true)
    case "no" => Some(false)
    case _ => None
  }



  // by type (often used for safe casting, or conversions)
  10 match {
    case x: Int => x.toString
    case unknown => "Found"
  }

}
