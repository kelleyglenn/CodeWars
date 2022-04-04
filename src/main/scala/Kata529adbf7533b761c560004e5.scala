object Kata529adbf7533b761c560004e5 {
  private val cache: Array[BigInt] = new Array(100)
  cache(0) = 0
  cache(1) = 1

  def fib(n: Int): BigInt = {
    if (cache(n) == null) {
      cache(n) = fib(n - 2) + fib(n - 1)
    }
    cache(n)
  }
}
