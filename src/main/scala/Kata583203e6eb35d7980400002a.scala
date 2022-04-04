object Kata583203e6eb35d7980400002a {
  def countSmileys(vec: Vector[String]): Int = {
    vec.count(s => s.length match {
      case 2 => ":;".contains(s(0)) && ")D".contains(s(1))
      case 3 => ":;".contains(s(0)) && "-~".contains(s(1)) && ")D".contains(s(2))
    })
  }
}
