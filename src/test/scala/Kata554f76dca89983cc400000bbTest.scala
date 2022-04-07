import Kata554f76dca89983cc400000bbTest.testing
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

class Kata554f76dca89983cc400000bbTest extends AnyFlatSpec {
  behavior of "solEquaStr"
  it should "pass basic tests" in {
    testing(5, "[(3, 1)]")
    testing(9005, "[(4503, 2251), (903, 449)]")
    testing(9008, "[(1128, 562)]")
  }
  behavior of "solEquaStrBorrowed"
  it should "pass basic tests" in {
    assertResult("[(3, 1)]") {
      Kata554f76dca89983cc400000bb.solEquaStrBorrowed(5)
    }
    assertResult("[(4503, 2251), (903, 449)]") {
      Kata554f76dca89983cc400000bb.solEquaStrBorrowed(9005)
    }
    assertResult("[(1128, 562)]") {
      Kata554f76dca89983cc400000bb.solEquaStrBorrowed(9008)
    }
  }
  behavior of "factorPairs"
  it should "work" in {
    assert(Kata554f76dca89983cc400000bb.factorPairs(2) === Seq((2, 1)))
    assert(Kata554f76dca89983cc400000bb.factorPairs(4) === Seq((2, 2), (4, 1)))
    assert(Kata554f76dca89983cc400000bb.factorPairs(8) === Seq((4, 2), (8, 1)))
    assert(Kata554f76dca89983cc400000bb.factorPairs(12) === Seq((4, 3), (6, 2), (12, 1)))
  }
  it should "complete quickly" in {
    assert(Kata554f76dca89983cc400000bb.factorPairs(Int.MaxValue + 1L) ===
      Seq((1073741824, 2), (536870912, 4), (268435456, 8), (134217728, 16), (67108864, 32), (33554432, 64), (16777216, 128),
        (8388608, 256), (4194304, 512), (2097152, 1024), (1048576, 2048), (524288, 4096), (262144, 8192), (131072, 16384),
        (65536, 32768), (2147483648L, 1)))
    assert(Kata554f76dca89983cc400000bb.factorPairs(Long.MaxValue).contains((Long.MaxValue, 1)))
  }
}

object Kata554f76dca89983cc400000bbTest {

  private def testing(n: Long, expect: String): Unit = {
    println("Testing: " + n)
    val actual: String = Kata554f76dca89983cc400000bb.solEquaStr(n)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("-")
    assertResult(expect) {
      actual
    }
  }
}
