object Kata550554fd08b86f84fe000a58 {
  def inArray(array1: Array[String], array2: Array[String]): Array[String] = {
    array1.filter(one => array2.exists(_.contains(one))).distinct.sorted
  }
}
