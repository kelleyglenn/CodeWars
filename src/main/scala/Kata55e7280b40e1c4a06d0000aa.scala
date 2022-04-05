object Kata55e7280b40e1c4a06d0000aa {
  def chooseBestSum(t: Int, k: Int, ls: List[Int]): Int = {
    val f = ls.combinations(k).toList.map(_.sum).filter(_ <= t)
    if (f.nonEmpty) f.max else -1
  }
}
