object Kata523f5d21c841566fde000009 {
  def arrayDiff(a: Seq[Int], b: Seq[Int]): Seq[Int] = {
    a.filterNot(b.contains(_))
  }
}
