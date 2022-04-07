import scala.math.Ordering.Implicits.seqOrdering

object Kata524c74f855025e2495000262 {
  def hand(holeCards: List[String], communityCards: List[String]): (String, List[String]) = {
    def isStraight(h: List[(Int, Char)]): Boolean = (h.maxBy(_._1)._1 - h.minBy(_._1)._1 == h.length - 1) && h.map(_._1).distinct.length == 5

    def isFlush(h: List[(Int, Char)]): Boolean = h.groupBy(_._2).size == 1

    def isGroupSizes(h: List[(Int, Char)], s: Seq[Int]): Boolean = h.groupBy(_._1).values.map(_.length).toList.sorted == s

    def distinctByCount(h: List[(Int, Char)]): List[Int] =
      h.groupBy(_._1).toList.sortBy(g => (g._2.length, g._1))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int.reverse)).map(_._1)

    val stringToValue = Map("J" -> 11, "Q" -> 12, "K" -> 13, "A" -> 14).withDefault(_.toInt)
    val valueToString = stringToValue.map(_.swap).withDefault(_.toString)
    val types: Seq[(String, List[(Int, Char)] => Boolean)] = Seq(
      ("straight-flush", h => isStraight(h) && isFlush(h)),
      ("four-of-a-kind", h => isGroupSizes(h, Seq(1, 4))),
      ("full house", h => isGroupSizes(h, Seq(2, 3))),
      ("flush", h => isFlush(h)),
      ("straight", h => isStraight(h)),
      ("three-of-a-kind", h => isGroupSizes(h, Seq(1, 1, 3))),
      ("two pair", h => isGroupSizes(h, Seq(1, 2, 2))),
      ("pair", h => isGroupSizes(h, Seq(1, 1, 1, 2))),
      ("nothing", _ => true)
    )
    val combos: List[List[(Int, Char)]] = (holeCards ++ communityCards).map(c => (stringToValue(c.dropRight(1)), c.last)).combinations(5).toList
    val (name, hands) = types.map { case (handTypeName, isHandType) => (handTypeName, combos.filter(isHandType)) }.filter(_._2.nonEmpty).head
    (name, hands.map(distinctByCount).max.map(valueToString(_)))
  }
}
