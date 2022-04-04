
object Kata55b7bb74a0256d4467000070 {
  def properFractionsForSmall(d: Long): Long = {
    Range.Long.inclusive(1, d - 1, 1).count(n => Range.Long.inclusive(1, n, 1).filter(f => d % f == 0 && n % f == 0).max == 1)
  }

  def primeFactorsOf(l: Long): LazyList[Long] = {
    knownPrimes.takeWhile(_ <= l).filter(p => l % p == 0)
  }

  val knownOddPrimes: LazyList[Long] = 3L #:: knownOddPrimes.map(prev => {
    var candidate = prev + 2L
    while (knownOddPrimes.takeWhile(p => p * p <= candidate).exists(p => candidate % p == 0)) {
      candidate += 2L
    }
    candidate
  })
  val knownPrimes: LazyList[Long] = 2L #:: knownOddPrimes

  def properFractions(denominator: Long): Long = {
    var count: Long = 0
    var numerator: Long = 1
    val denominatorFactors = primeFactorsOf(denominator)
    while (numerator < denominator) {
      if (!denominatorFactors.exists(numerator % _ == 0)) count += 1
      numerator += 1
    }
    count
  }
}
