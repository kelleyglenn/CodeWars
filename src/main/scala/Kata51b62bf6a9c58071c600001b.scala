object Kata51b62bf6a9c58071c600001b {
  def encode(arabic: Int): String = {
    val charsByPos = Array(('M', ' ', ' '), ('C', 'D', 'M'), ('X', 'L', 'C'), ('I', 'V', 'X'))
    f"$arabic%04d".map(_.asDigit).zipWithIndex.filterNot(_._1 == 0).map { case (digit, pos) =>
      val (one, five, ten) = charsByPos(pos)
      digit match {
        case d if (0 to 3).contains(d) => "".padTo(d, one)
        case 4 => "" + one + five
        case d if (5 to 8).contains(d) => "" + five + "".padTo(d - 5, one)
        case 9 => "" + one + ten
      }
    }.mkString
  }
}
