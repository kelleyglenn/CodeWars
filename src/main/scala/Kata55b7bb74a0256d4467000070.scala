
object Kata55b7bb74a0256d4467000070 {
  val knownOddPrimes: LazyList[Long] = 3L #:: knownOddPrimes.map(prev => {
    var candidate = prev + 2L
    while (knownOddPrimes.takeWhile(p => p * p <= candidate).exists(p => candidate % p == 0)) {
      candidate += 2L
    }
    candidate
  })
  val knownPrimes: LazyList[Long] = 2L #:: knownOddPrimes

  def primeFactorsOf(l: Long): Seq[Long] = {
    allPrimeFactorsOf(l).distinct
  }

  def allPrimeFactorsOf(l: Long): Seq[Long] = {
    if (l < 2) Seq.empty
    else {
      val firstPrimeFactor = knownPrimes.dropWhile(p => l % p != 0 && p * p <= l).head
      if (l % firstPrimeFactor == 0) firstPrimeFactor +: primeFactorsOf(l / firstPrimeFactor)
      else Seq(l)
    }
  }

  def properFractions(denominator: Long): Long = {
    val maxNumerator = denominator - 1
    var count: Long = denominator - 1
    val denominatorFactors = primeFactorsOf(denominator)
    (1 to denominatorFactors.length).foreach(numberOfFactors => {
      count += (if (numberOfFactors % 2 == 0) 1 else -1) * denominatorFactors.combinations(numberOfFactors).map(maxNumerator / _.product).sum
    })
    count
  }
}
