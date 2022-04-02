class Kata55466989aeecab5aac00003eTest extends org.scalatest.FunSuite {

  test("testSqInRect") {
    testing(5, 3, Array(3, 2, 1, 1))
    testing(3, 5, Array(3, 2, 1, 1))
    testing(5, 5, Array())
  }

  private def testing(min: Int, max: Int, expect: Array[Int]): Unit = {
    println("MIN: " + min + " MAX: " + max)
    val actual: Array[Int] = Kata55466989aeecab5aac00003e.sqInRect(min, max)
    println("Actual: " + actual.mkString(", "))
    println("Expect: " + expect.mkString(", "))
    println("-")
    assertResult(expect)(actual)
  }
}
