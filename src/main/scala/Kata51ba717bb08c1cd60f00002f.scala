object Kata51ba717bb08c1cd60f00002f {
  def solution(xs: List[Int]): String = {
    xs.foldLeft(Seq[Seq[Int]]()) {
      // Seq(Seq(6, 5, 4), Seq(2, 1, 0)), 7 -> Seq(Seq(7, 6, 5, 4), Seq(2, 1, 0)
      case ((h :: it) :: ot, i) => if (h + 1 == i) (i +: h +: it) +: ot else Seq(i) +: (h +: it) +: ot
      case (Seq(), i) => Seq(Seq(i))
    }.map(_.reverse).reverse.map(s => s.length match {
      case 1 => s.head.toString
      case _ => Seq(s.head, s.last).mkString(if (s.length == 2) "," else "-")
    }).mkString(",")
  }
}
