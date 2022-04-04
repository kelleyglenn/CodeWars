import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Kata55b7bb74a0256d4467000070Test extends AnyFlatSpec with Matchers {

  "knownPrimes" should "generate correctly" in {
    Kata55b7bb74a0256d4467000070.knownPrimes.head should be(2)
    Kata55b7bb74a0256d4467000070.knownPrimes(1) should be(3)
    Kata55b7bb74a0256d4467000070.knownPrimes.take(7) should equal(List(2, 3, 5, 7, 11, 13, 17))
    // Retrieved from https://en.wikipedia.org/wiki/List_of_prime_numbers#The_first_1000_prime_numbers
    Kata55b7bb74a0256d4467000070.knownPrimes(24) should be(97)
    Kata55b7bb74a0256d4467000070.knownPrimes(999) should be(7919)
    // Retrieved from http://compoasso.free.fr/primelistweb/page/prime/liste_online_en.php
    Kata55b7bb74a0256d4467000070.knownPrimes(600) should be(4421)
    Kata55b7bb74a0256d4467000070.knownPrimes(1200) should be(9739)
    Kata55b7bb74a0256d4467000070.knownPrimes(1800) should be(15413)
    Kata55b7bb74a0256d4467000070.knownPrimes(2400) should be(21391)
    Kata55b7bb74a0256d4467000070.knownPrimes(3600) should be(33617)
  }
  "knownPrimes" should "generate quickly" in {
    for (_ <- 1 to 1000) {
      Kata55b7bb74a0256d4467000070.knownPrimes(50000) should be(611957)
    }
  }
  "primeFactorsOf Integers" should "work" in {
    Kata55b7bb74a0256d4467000070.primeFactorsOf(6) should equal(List(2, 3))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(10) should equal(List(2, 5))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(30) should equal(List(2, 3, 5))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(99).distinct should equal(List(3, 11))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(210) should equal(List(2, 3, 5, 7))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(89280).distinct should equal(List(2, 3, 5, 31))
  }
  "primeFactorsOf Integers" should "work quickly" in {
    Kata55b7bb74a0256d4467000070.primeFactorsOf(Int.MaxValue - 1).distinct should equal(List(2, 3, 7, 11, 31, 151, 331))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(Int.MaxValue) should equal(List(Int.MaxValue))
  }
  "primeFactorsOf Longs" should "work quickly" in {
    Kata55b7bb74a0256d4467000070.primeFactorsOf(Int.MaxValue + 1L).distinct should equal(List(2))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(4816623752L).distinct should equal(List(2, 23, 89, 294127))
  }
  "combinations" should "behave as expected" in {
    Kata55b7bb74a0256d4467000070.primeFactorsOf(210).combinations(1).toList should
      equal(List(List(2), List(3), List(5), List(7)))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(210).combinations(2).toList should
      equal(List(List(2, 3), List(2, 5), List(2, 7), List(3, 5), List(3, 7), List(5, 7)))
    Kata55b7bb74a0256d4467000070.primeFactorsOf(210).combinations(3).toList should
      equal(List(List(2, 3, 5), List(2, 3, 7), List(2, 5, 7), List(3, 5, 7)))
  }
  "properFractions(1)" should "return 0" in {
    Kata55b7bb74a0256d4467000070.properFractions(1) should be(0)
  }
  "properFractions(2)" should "return 1" in {
    Kata55b7bb74a0256d4467000070.properFractions(2) should be(1)
  }
  "properFractions(5)" should "return 4" in {
    Kata55b7bb74a0256d4467000070.properFractions(5) should be(4)
  }
  "properFractions(15)" should "return 8" in {
    Kata55b7bb74a0256d4467000070.properFractions(15) should be(8)
  }
  "properFractions(25)" should "return 20" in {
    Kata55b7bb74a0256d4467000070.properFractions(25) should be(20)
  }
  "properFractions(30)" should "return 8" in {
    Kata55b7bb74a0256d4467000070.properFractions(30) should be(8)
  }
  "properFractions(210)" should "return 48" in {
    Kata55b7bb74a0256d4467000070.properFractions(210) should be(48)
  }
  "properFractions(4816623752)" should "return 2277711744" in {
    Kata55b7bb74a0256d4467000070.properFractions(4816623752L) should be(2277711744L)
  }

}
