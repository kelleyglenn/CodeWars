class Kata54da539698b8a2ad76000228Test extends org.scalatest.FunSuite {

  test("testIsValidWalk") {

    val validWalks = Seq(
      Seq('n','s','n','s','n','s','n','s','n','s'),
    )

    val invalidWalks = Seq(
      Seq('w','e','w','e','w','e','w','e','w','e','w','e'),
      Seq('w'),
      Seq('n','n','n','s','n','s','n','s','n','s')
    )

    validWalks.foreach { valid =>
        assert(Kata54da539698b8a2ad76000228.isValidWalk(valid))
    }

    invalidWalks.foreach { invalid =>
        assert(!Kata54da539698b8a2ad76000228.isValidWalk(invalid))
    }
  }

}
