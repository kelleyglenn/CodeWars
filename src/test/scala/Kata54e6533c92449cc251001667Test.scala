class Kata54e6533c92449cc251001667Test extends org.scalatest.FunSuite {

  test("Samples") {
    assert(Kata54e6533c92449cc251001667.uniqueInOrder("AAAABBBCCDAABBB") === Seq('A', 'B', 'C', 'D', 'A', 'B'))
    assert(Kata54e6533c92449cc251001667.uniqueInOrder("ABBCcAD") === Seq('A', 'B', 'C', 'c', 'A', 'D'))
    assert(Kata54e6533c92449cc251001667.uniqueInOrder(Seq(1, 2, 2, 3, 3)) === Seq(1, 2, 3))
  }

  test("empty"){
    assert(Kata54e6533c92449cc251001667.uniqueInOrder("") === Seq())
    assert(Kata54e6533c92449cc251001667.uniqueInOrder(Seq()) === Seq())
  }
}
