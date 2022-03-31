

object Kata515de9ae9dcfc28eb6000001 {

  def substrings(s: String, size: Int): List[String] = {
    // Mine
    Range(0, s.length, size).map(i => s.substring(i, Math.min(i + size, s.length))).toList.map(sub => sub + "_" * (size - sub.length))
    // Better
    s.grouped(size).map(_.padTo(size, '_')).toList
  }

  def solution(s: String): List[String] = {
    substrings(s, 2)
  }

  def main(args: Array[String]): Unit = {
    println(substrings("abcdefg", 3))
  }
}
