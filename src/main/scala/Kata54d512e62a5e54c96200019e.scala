object Kata54d512e62a5e54c96200019e {
  def factors(m: Int): String = {
    primeFactorsOf(m).groupBy(identity).view.mapValues(_.length).toSeq.sorted.map {
      case (f, count) => if (count == 1) f else "%d**%d".format(f, count)
    }.mkString("(", ")(", ")")
  }

  def primeFactorsOf(i: Int, c: Int = 2): Seq[Int] = {
    if (i < 2) Seq.empty
    else if (i % c == 0) c +: primeFactorsOf(i / c, c)
    else primeFactorsOf(i, c + 1)
  }
}
