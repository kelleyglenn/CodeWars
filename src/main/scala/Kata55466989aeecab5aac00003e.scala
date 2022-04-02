object Kata55466989aeecab5aac00003e {

  def helper(length: Int, width: Int): Array[Int] = {
    val (min, max) = (Math.min(length, width), Math.max(length, width))
    if (length == width) Array(length) else min +: helper(min, max - min)
  }

  def sqInRect(min: Int, max: Int): Array[Int] = {
    if (min == max) Array.empty else helper(min, max)
  }
}
