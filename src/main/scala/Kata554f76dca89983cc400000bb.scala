object Kata554f76dca89983cc400000bb {

  // This function borrowed from the posted solutions, but I condensed it a bit
  def solEquaStrBorrowed(n: Long): String = (1L to math.sqrt(n).toLong)
    .filter(a => n % a == 0 && (n / a + a) % 2 == 0 && (n / a - a) % 4 == 0)
    .map(a => "(" + (n / a + a) / 2 + ", " + (n / a - a) / 4 + ")")
    .mkString("[", ", ", "]")

  def solEquaStr(n: Long): String = {
    factorPairs(n).map(f => (f._1 + f._2, f._1 - f._2)).filter(f => f._1 % 2 == 0 && f._2 % 4 == 0).sortBy(_._1)(Ordering[Long].reverse)
      .map(f => "(%d, %d)".format(f._1 / 2, f._2 / 4)).mkString("[", ", ", "]")
  }

  def factorPairs(n: Long): Seq[(Long, Long)] = {
    val primeFactors = primeFactorsOf(n)
    val combos = (1 to primeFactors.length).flatMap(primeFactors.combinations)
    combos.map(_.product).map(c => (Math.max(n / c, c), Math.min(n / c, c))).distinct
  }

  @scala.annotation.tailrec
  def primeFactorsOf(n: Long, c: Long = 2, res: Seq[Long] = Seq.empty): Seq[Long] = {
    if (n < 2) res
    else if (n % c == 0) primeFactorsOf(n / c, c, c +: res)
    else primeFactorsOf(n, c + 1, res)
  }
}
