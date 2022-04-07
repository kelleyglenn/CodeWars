import Kata54d496788776e49e6b00052fTest.testing
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

class Kata54d496788776e49e6b00052fTest extends AnyFlatSpec {
  it should "pass basic tests" in {
    var lst: Array[Int] = Array(12, 15)
    testing(lst, "(2 12)(3 27)(5 15)")
    lst = Array(15, 21, 24, 30, 45)
    testing(lst, "(2 54)(3 135)(5 90)(7 21)")
  }
  it should "pass tests with negative values" in{
    var lst: Array[Int] = Array(-12, -15)
    testing(lst, "(2 -12)(3 -27)(5 -15)")
  }
}

object Kata54d496788776e49e6b00052fTest {
  private def testing(lst: Array[Int], expect: String): Unit = {
    println("Testing: " + lst.mkString(" "))
    val actual: String = Kata54d496788776e49e6b00052f.sumOfDivided(lst)
    println("Actual: " + actual)
    println("Expect: " + expect)
    assertResult(expect) {
      actual
    }
  }
}
