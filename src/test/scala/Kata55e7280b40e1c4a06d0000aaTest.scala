import Kata55e7280b40e1c4a06d0000aaTest.testing
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

class Kata55e7280b40e1c4a06d0000aaTest extends AnyFlatSpec {
  it should "pass basic tests" in {
    var ts = List(50, 55, 56, 57, 58)
    testing(163, 3, ts, 163)
    ts = List(50)
    testing(163, 3, ts, -1)
    testing(163, 1, ts, 50)
  }
  it should "pass extended tests" in {
    testing(331, 5, List(91, 74, 73, 85, 73, 81, 87), -1)
  }
}

object Kata55e7280b40e1c4a06d0000aaTest {

  private def testing(t: Int, k: Int, ls: List[Int], expect: Int): Unit = {
    println("Testing:\n" + t + " " + k + "\n" + ls.mkString(", "))
    val actual: Int = Kata55e7280b40e1c4a06d0000aa.chooseBestSum(t, k, ls)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect) {
      actual
    }
  }
}
