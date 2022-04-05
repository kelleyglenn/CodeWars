class Kata51ba717bb08c1cd60f00002fTest extends org.scalatest.FunSuite {
  test("Sample 1") {
    assert(Kata51ba717bb08c1cd60f00002f.solution(List(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)) === "-6,-3-1,3-5,7-11,14,15,17-20")
  }
  test("Sample 2") {
    assert(Kata51ba717bb08c1cd60f00002f.solution(List(-3, -2, -1, 2, 10, 15, 16, 18, 19, 20)) === "-3--1,2,10,15,16,18-20")
  }
}
