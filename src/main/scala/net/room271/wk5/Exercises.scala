package net.room271.wk5

object Exercises {

  // Write a recursive definition of sum using pattern matching. A version
  // without pattern matching is provided to help here.
  // Hint: The pattern 'Nil' matches an empty list, and 'x :: xs' will match a
  // Cons cell (x is the head, xs is the tail)
  def sumNoPatterns(ints: List[Int]): Int = {
    if (ints.isEmpty) 0
    else sumNoPatterns(ints.tail)
  }

  def sum(ints: List[Int]): Int = ???

  // Write a product function in the same way
  def product(ints: List[Int]): Int = ???

  // Write a show function which returns the contents of an Option, or "?" if
  // the Option is None
  def show(o: Option[String]): String = ???

  // Assume we have parsed a JSON string and extracted it into one of the following case classes/objects:
  sealed trait JSON
  object JSON {
    case object JNull extends JSON
    case class JNumber(get: Double) extends JSON
    case class JString(get: String) extends JSON
    case class JBool(get: Boolean) extends JSON
    case class JArray(get: List[JSON]) extends JSON
    case class JObject(get: Map[String, JSON]) extends JSON
  }

  // e.g. with an imaginary 'parse' function, we might write:
  // parse("Bob")
  // => JString("Bob")

  // Write a function which extracts a field from a JSON entity if present
  // hint, think about what to do if the field isn't present (or if the JSON
  // entity is not even a JObject) - what is a sensible return type (add it!)?
  def getField(jsonValue: JSON, fieldName: String) = ???

  // Difficult: write a function to stringify JSON
  def stringify(jsonValue: JSON): String = ???

}
