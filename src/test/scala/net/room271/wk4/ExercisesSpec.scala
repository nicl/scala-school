package net.room271.wk4

import org.scalatest.{Matchers, FlatSpec}

class ExercisesSpec extends FlatSpec with Matchers {

  "fizzBuzz" should "generate a fizz-buzz sequence" in {
    val fizzBuzz15 = List(
      "1",
      "2",
      "fizz",
      "4",
      "buzz",
      "fizz",
      "7",
      "8",
      "fizz",
      "buzz",
      "11",
      "fizz",
      "13",
      "14",
      "fizz buzz"
    )
    Exercises.fizzBuzz(15) should be (fizzBuzz15)
  }

  "filterEven" should "filter out odd numbers" in {
    val examples = List(
      (1 to 10).toList,
      List(0),
      List(1, 3, 5, 7),
      List(2, 4, 992, 4)
    )

    for (example <- examples) {
      Exercises.filterEven(example) should be (example.filter(_ % 2 == 0))
    }
  }

  "filterOdd" should "filter out odd numbers" in {
    val examples = List(
      (1 to 10).toList,
      List(0),
      List(1, 3, 5, 7),
      List(2, 4, 992, 4)
    )

    for (example <- examples) {
      Exercises.filterOdd(example) should be (example.filter(_ % 2 != 0))
    }
  }

  "map" should "map over a list" in {
    // Note, this is a weak test, you may want to improve it by adding your own examples
    Exercises.map(List(1, 2, 3), _ * 2) should be (List(2, 4, 6))
  }

  "intesection" should "find the intersect of two sets" in {
    val s1 = Set(1, 2, 4, 6, 3)
    val s2 = Set(10, 9, 4, 3)

    Exercises.intersection(s1, s2) should be (Set(4, 3))
  }

}
