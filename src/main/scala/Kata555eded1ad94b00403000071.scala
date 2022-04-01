object Kata555eded1ad94b00403000071 {
  def seriesSumWithFractions(n: Int): String = {
    // With sufficiently large n, this overflows the range of a Long
    val fractions = Range(0, n).map(i => (1L, i * 3L + 1))
    val summedFraction = fractions.reduce((sum, i) => {
      (sum._1 * i._2 + sum._2, sum._2 * i._2)
    })
    val result = summedFraction._1.toFloat / summedFraction._2.toFloat
    f"$result%1.2f"
  }

  def seriesSum(n: Int): String = {
    val result = (0 until n).foldLeft(0f) { (sum, i) => sum + 1f / (i * 3 + 1).toFloat }
    f"$result%1.2f"
  }
}
