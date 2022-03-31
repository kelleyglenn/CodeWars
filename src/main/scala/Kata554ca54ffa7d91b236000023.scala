object Kata554ca54ffa7d91b236000023 {
  def deleteNth(elements: List[Int], maxOccurrences: Int): List[Int] = {
    elements.foldLeft(List[Int]()) { (list, elem) => if (list.count(_ == elem) < maxOccurrences) list :+ elem else list }
  }
}
