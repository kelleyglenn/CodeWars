import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class Kata583203e6eb35d7980400002aTest extends AnyFunSpec with Matchers {
  describe("Example Tests") {
    it("Run successfully") {
      Kata583203e6eb35d7980400002a.countSmileys(Vector.empty) shouldBe 0
      Kata583203e6eb35d7980400002a.countSmileys(Vector(":D", ":~)", ";~D", ":)")) shouldBe 4
      Kata583203e6eb35d7980400002a.countSmileys(Vector(":)", ":(", ":D", ":O", ":;")) shouldBe 2
      Kata583203e6eb35d7980400002a.countSmileys(Vector(";]", ":[", ";*", ":$", ";-D")) shouldBe 1
    }
  }
}