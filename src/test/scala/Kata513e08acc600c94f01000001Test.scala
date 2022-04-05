class Kata513e08acc600c94f01000001Test extends org.scalatest.FunSuite {

  test("Samples") {
    assert(Kata513e08acc600c94f01000001.rgb(0, 0, 0) === "000000")
    assert(Kata513e08acc600c94f01000001.rgb(1, 2, 3) === "010203")
    assert(Kata513e08acc600c94f01000001.rgb(255, 255, 255) === "FFFFFF")
    assert(Kata513e08acc600c94f01000001.rgb(254, 253, 252) === "FEFDFC")
    assert(Kata513e08acc600c94f01000001.rgb(-20, 275, 125) === "00FF7D")
  }
}
