object Kata54d496788776e49e6b00052f {
  def sumOfDivided(lst: Array[Int]): String = {
    lst.flatMap(primeFactorsOf(_)).distinct.sorted.map(f => "%d %d".format(f, lst.filter(_ % f == 0).sum)).mkString("(", ")(", ")")
  }

  def primeFactorsOf(i: Int, c: Int = 2): Seq[Int] = {
    if (Math.abs(i) < 2) Seq()
    else if (i % c == 0) c +: primeFactorsOf(i / c, c)
    else primeFactorsOf(i, c + 1)
  }
}
