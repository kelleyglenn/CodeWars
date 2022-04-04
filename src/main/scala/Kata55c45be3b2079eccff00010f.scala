object Kata55c45be3b2079eccff00010f {
  def order(str: String): String = {
    str.split(' ').sortBy(_.filter(_.isDigit).toInt).mkString(" ")
  }
}
