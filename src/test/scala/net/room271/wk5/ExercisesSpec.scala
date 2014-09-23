package net.room271.wk5

import net.room271.wk5.Exercises.JSON.{JBool, JString, JObject}
import org.scalatest.{FlatSpec, Matchers}

class ExercisesSpec extends FlatSpec with Matchers {

  "sum" should "add a list of integers" in {
    Exercises.sum(List(1, 2, 3)) should be(6)
  }

  "product" should "multiply a list of integers" in {
    Exercises.product(List(2, 5, 3)) should be(30)
  }

  "show" should "unpack an Option" in {
    Exercises.show(Some("hey!")) should be("hey!")
    Exercises.show(None) should be("?")
  }

  "getField" should "get a field from a JSON object" in {
    // TODO add some tests yourself!
  }

  "stringify" should "produce a JSON string" in {
    Exercises.stringify(JString("Hey")) should be("Hey")
    Exercises.stringify(JBool(true)) should be("true")
    // TODO add some more complex examples!
  }

}
