class Kata51b62bf6a9c58071c600001bTest extends org.scalatest.FunSuite {

  test("testEncode") {
    assert(Kata51b62bf6a9c58071c600001b.encode(1) === "I")
    assert(Kata51b62bf6a9c58071c600001b.encode(3) === "III")
    assert(Kata51b62bf6a9c58071c600001b.encode(4) === "IV")
    assert(Kata51b62bf6a9c58071c600001b.encode(6) === "VI")
    assert(Kata51b62bf6a9c58071c600001b.encode(14) === "XIV")
    assert(Kata51b62bf6a9c58071c600001b.encode(21) === "XXI")
    assert(Kata51b62bf6a9c58071c600001b.encode(89) === "LXXXIX")
    assert(Kata51b62bf6a9c58071c600001b.encode(91) === "XCI")
    assert(Kata51b62bf6a9c58071c600001b.encode(984) === "CMLXXXIV")
    assert(Kata51b62bf6a9c58071c600001b.encode(1000) === "M")
    assert(Kata51b62bf6a9c58071c600001b.encode(1666) === "MDCLXVI")
    assert(Kata51b62bf6a9c58071c600001b.encode(1889) === "MDCCCLXXXIX")
    assert(Kata51b62bf6a9c58071c600001b.encode(1989) === "MCMLXXXIX")
    assert(Kata51b62bf6a9c58071c600001b.encode(2008) === "MMVIII")
  }

}
