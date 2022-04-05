import Kata5a045fee46d843effa000070Test.testing
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

class Kata5a045fee46d843effa000070Test extends AnyFlatSpec {
  it should "pass basic tests" in {
    testing(17, "2^15 * 3^6 * 5^3 * 7^2 * 11 * 13 * 17")
    testing(5, "2^3 * 3 * 5")
    testing(22, "2^19 * 3^9 * 5^4 * 7^3 * 11^2 * 13 * 17 * 19")
    testing(14, "2^11 * 3^5 * 5^2 * 7^2 * 11 * 13")
    testing(25, "2^22 * 3^10 * 5^6 * 7^3 * 11^2 * 13 * 17 * 19 * 23")

  }
  behavior of "primeFactors"
  it should "pass basic tests" in {
    assert(Kata5a045fee46d843effa000070.primeFactors(10) == Seq(2, 5))
    assert(Kata5a045fee46d843effa000070.primeFactors(30) == Seq(2, 3, 5))
    assert(Kata5a045fee46d843effa000070.primeFactors(8) == Seq(2, 2, 2))
    assert(Kata5a045fee46d843effa000070.primeFactors(17) == Seq(17))
    assert(Kata5a045fee46d843effa000070.primeFactors(89280).distinct == Seq(2, 3, 5, 31))
    assert(Kata5a045fee46d843effa000070.primeFactors(Int.MaxValue - 1).distinct == Seq(2, 3, 7, 11, 31, 151, 331))
  }
}

object Kata5a045fee46d843effa000070Test {
  private def testing(n: Int, expected: String): Unit = {
    println("N: " + n)
    val actual: String = Kata5a045fee46d843effa000070.decomp(n)
    assertResult(expected) {
      actual
    }
  }
}
