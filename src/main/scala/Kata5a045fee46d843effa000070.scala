object Kata5a045fee46d843effa000070 {
  def primeFactors(n: Int, c: Int = 2): Seq[Int] = {
    if (n < 2) Seq()
    else if (n % c == 0) c +: primeFactors(n / c)
    else primeFactors(n, c + 1)
  }

  def decomp(n: Int): String = {
    val counts = (2 to n).flatMap(primeFactors(_)).groupBy(identity)
    counts.keySet.toList.sorted.map { f => f.toString + (if (counts(f).size == 1) "" else "^" + counts(f).size) }.mkString(" * ")
  }
}