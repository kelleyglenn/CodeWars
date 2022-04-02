object Kata54da539698b8a2ad76000228 {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    walk.size == 10 && walk.count(_ == 'n') == walk.count(_ == 's') && walk.count(_ == 'e') == walk.count(_ == 'w')
  }
}
