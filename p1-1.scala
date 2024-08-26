object DiskArea {
  def areaOfDisk(r: Double): Double = {
    math.Pi * r * r
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    val roundedArea = BigDecimal(areaOfDisk(radius)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    println(s"Area of the disk with radius $radius: $roundedArea")
  }
}
