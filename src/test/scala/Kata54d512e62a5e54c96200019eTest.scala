import Kata54d512e62a5e54c96200019eTest.testing
import org.scalatest.Assertions._
import org.scalatest.flatspec.AnyFlatSpec

class Kata54d512e62a5e54c96200019eTest extends AnyFlatSpec {
  it should "pass basic tests" in {
    testing(7775460, "(2**2)(3**3)(5)(7)(11**2)(17)")
    testing(7919, "(7919)")

  }

}

object Kata54d512e62a5e54c96200019eTest {
  private def testing(m: Int, expect: String): Unit = {
    println("Testing: " + m)
    val actual: String = Kata54d512e62a5e54c96200019e.factors(m)
    println("Actual: " + actual)
    println("Expect: " + expect)
    assertResult(expect) {
      actual
    }
  }
}
