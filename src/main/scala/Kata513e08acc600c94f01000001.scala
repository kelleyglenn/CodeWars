object Kata513e08acc600c94f01000001 {
  def rgb(r: Int, g: Int, b: Int): String = {
    hexString(r) + hexString(g) + hexString(b)
  }

  def hexString(i: Int): String = {
    "%02X".format(if (i < 0) 0 else if (i > 255) 255 else i)
  }
}
