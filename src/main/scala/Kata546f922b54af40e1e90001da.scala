object Kata546f922b54af40e1e90001da {
  def alphabetPosition(text: String): String = {
    text.filter(_.isLetter).toLowerCase.map(c => (c - 'a' + 1).toString).mkString(" ")
  }
}
