package net.room271.wk4

object For {

  /**
   * for expressions are the main way to iterate in Scala
   */

  // Try running some of these in your sbt console!

  val x = 1 to 5  // 1.to(5)

  for (i <- 1 to 5) println("Iteration " + i) // note 1 to 5 creates a Range (look it up in Scaladocs)

  // Note the x <- y syntax is called a 'generator' and iterates through whatever y is

  val filesHere = new java.io.File(".").listFiles

  for (file <- filesHere) {
    println(file)
  }

  // filtering is supported

  for (file <- filesHere if file.getName.endsWith(".scala")) println(file)

  filesHere.filter(file => file.getName.endsWith(".scala")).map(file => println(file))

  // multiple generators are possible

  def fileLines(file: java.io.File): List[String] = {
    scala.io.Source.fromFile(file).getLines().toList
  }

  def grep2(pattern: String) = {
    for {
      file <- filesHere
      //if file.getName.endsWith(".scala")
      if file.isFile
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file + ": " + line.trim)
  }

  // using the 'yield' keyword transforms a collection and then returns it

  for (i <- 1 to 10) yield i * 2 // double each element in a range
  (1 to 10).map(_ * 2) // equivalent


  for (x <- 1 to 10) {
    println(x)
  }

  for (x <- 1 to 10) println(x)

  for {
    x <- 1 to 10
  } println(x)

  for (x <- 1 to 10; y <- 10 to 20 if y % 2 == 0) {
    println ("X is: " + x + " and Y is: " + y)
  }


  case class Person(name: String, children: List[Person])

  val people = List(
    Person("bob", List(Person("sarah", Nil))),
    Person("alice", List(Person("michael", Nil), Person("suzie", Nil)))
  )

  for {
    person <- people
    child <- person.children
    if (child.name.startsWith("s"))
  } yield child.name

  for (person <- people; child <- person.children) yield {
    child.name
  }
}
