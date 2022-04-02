class Kata523f5d21c841566fde000009Test extends org.scalatest.FunSuite {

  test("testArrayDiff") {
    val tests = Seq(
      (Seq(1, 2), Seq(1), Seq(2)),
      (Seq(1, 2, 2), Seq(1), Seq(2, 2)),
      (Seq(1, 2, 2), Seq(2), Seq(1)),
      (Seq(1, 2, 2), Seq(), Seq(1, 2, 2)),
      (Seq(), Seq(1, 2), Seq())
    )
    tests.foreach { case (a, b, expected) =>
      assert(Kata523f5d21c841566fde000009.arrayDiff(a, b) == expected)

    }
  }
}
