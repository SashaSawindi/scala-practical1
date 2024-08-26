object TemperatureConversion {
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

  def main(args: Array[String]): Unit = {
    val celsius = 35
    val fahrenheit = celsiusToFahrenheit(celsius)
    println(s"$celsius C in Fahrenheit: $fahrenheit F")
  }
}
