
object Kata55b7bb74a0256d4467000070 {
  val knownPrimes: LazyList[Long] = 2L #:: knownPrimes.map(prev => {
    var candidate = prev + (if (prev == 2L) 1L else 2L)
    while (knownPrimes.takeWhile(p => p * p <= candidate).exists(p => candidate % p == 0)) {
      candidate += 2L
    }
    candidate
  })

  def primeFactorsOf(number: Long): Seq[Long] = {
    if (number < 2) Seq.empty
    else {
      // Skip the primes the number is not divisible by, and handle the case where the number is prime
      val firstPrimeFactor = knownPrimes.dropWhile(p => p * p <= number && number % p != 0).head
      if (number % firstPrimeFactor == 0) firstPrimeFactor +: primeFactorsOf(number / firstPrimeFactor)
      else Seq(number)
    }
  }

  // Calculate directly, instead of testing each numerator
  def properFractions(denominator: Long): Long = {
    val maxNumerator = denominator - 1
    var count: Long = denominator - 1
    val denominatorFactors = primeFactorsOf(denominator).distinct
    for (numberOfFactors <- 1 to denominatorFactors.length) {
      // Remove the number that are divisible by 1 factor, add the number that are divisible by 2 factors, and so on
      count += (if (numberOfFactors % 2 == 0) 1 else -1) * denominatorFactors.combinations(numberOfFactors).map(maxNumerator / _.product).sum
    }
    count
  }
}
