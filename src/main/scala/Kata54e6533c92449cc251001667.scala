object Kata54e6533c92449cc251001667 {
  def uniqueInOrder[T](xs: Iterable[T]): Seq[T] = {
    xs.foldLeft((Seq.empty: Seq[T], None: Option[T])) {
      case ((seq, prev), next) if prev.nonEmpty && prev.get == next => (seq, Some(next))
      case ((seq, _), next) => (seq :+ next, Some(next))
    }._1
  }
}
