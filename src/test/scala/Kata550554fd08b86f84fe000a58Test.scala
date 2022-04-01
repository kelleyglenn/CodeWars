class Kata550554fd08b86f84fe000a58Test extends org.scalatest.FunSuite {
  test("simple test") {
    assert(Kata550554fd08b86f84fe000a58.inArray(Array("arp", "live", "strong"), Array("lively", "alive", "harp", "sharp", "armstrong"))
      === Array("arp", "live", "strong"))
  }
  test("empty result") {
    assert(Kata550554fd08b86f84fe000a58.inArray(Array("tarp", "mice", "bull"), Array("lively", "alive", "harp", "sharp", "armstrong"))
      === Array.empty)
  }
}
