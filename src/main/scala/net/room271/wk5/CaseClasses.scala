package net.room271.wk5

object CaseClasses {

  // Case classes are classes prefixed with the 'case' keyword
  sealed trait Shape
  case class Square(width: Int) extends Shape
  case class Rectangle(width: Int, height: Int) extends Shape

  // what does case do? Essentially, it adds some convenience methods so you
  // don't have to. Specifically

  // 1. Adds a factory method with the name of the class
  val shape = Square(2) // no need to use 'new' (this is nice when you are nesting several classes)

  // 2. All arguments in the parameter list are treated as if they had a 'val' prefix
  // x.width = 3 // won't compile

  // 3. Provides sensible implementations of 'toString', 'hashCode', and 'equals'.
  // try typing x into sbt console (once you have defined it)

  // 4. Adds a copy method
  val y = shape.copy()

  // 5. provides support for pattern matching!
  shape match {
    case Square(w) => "Found a Square with width: " + w
    case Rectangle(w, h) => s"Found a Rectangle with width: $w and height: $h."
  }

  // Case classes are great for expressing algebraic data types (types with multiple variants)

  // for example, a List can either be empty (Nil) or a Cons cell:
  sealed trait List[+A]
  case object Nil extends List[Nothing]
  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  // or the Option type, which expresses results which can be empty or not
  sealed trait Option[+A]
  case class Some[+A](get: A) extends Option[A]
  case object None extends Option[Nothing]
}
