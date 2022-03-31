object Kata54ff3102c1bad923760001f3 {
  def getCount(inputStr: String): Int = {
    inputStr.count(Set('a','e','i','o','u').contains)
  }
}
