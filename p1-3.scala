object SphereVolume {
  def volumeOfSphere(r: Double): Double = {
    (4.0/3.0) * math.Pi * math.pow(r, 3)
  }

  def main(args: Array[String]): Unit = {
    val sphereRadius = 5
    val roundedVolume = BigDecimal(volumeOfSphere(sphereRadius)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    println(s"Volume of the sphere with radius $sphereRadius: $roundedVolume")
  }
}
