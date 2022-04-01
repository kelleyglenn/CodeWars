class Kata555eded1ad94b00403000071Test extends org.scalatest.FunSuite {

  test("testSeriesSum") {
    assert(Kata555eded1ad94b00403000071.seriesSum(1) == "1.00")
    assert(Kata555eded1ad94b00403000071.seriesSum(2) == "1.25")
    assert(Kata555eded1ad94b00403000071.seriesSum(5) == "1.57")
    assert(Kata555eded1ad94b00403000071.seriesSum(15) == "1.94")
    assert(Kata555eded1ad94b00403000071.seriesSum(58) == "2.40")
  }

}
