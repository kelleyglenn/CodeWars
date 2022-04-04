import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Kata529adbf7533b761c560004e5Test extends AnyFlatSpec with Matchers {
  "fib(70)" should "return 190392490709135" in {
    Kata529adbf7533b761c560004e5.fib(70).toString should be("190392490709135")
  }
  "fib(60)" should "return 1548008755920" in {
    Kata529adbf7533b761c560004e5.fib(60).toString should be("1548008755920")
  }
  "fib(50)" should "return 12586269025" in {
    Kata529adbf7533b761c560004e5.fib(50).toString should be("12586269025")
  }
}
