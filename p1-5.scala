object RunningTime {
  def totalRunningTime(): Int = {
    val easyPace = 8 // minutes per km
    val tempoPace = 7 // minutes per km

    val totalMinutes = 2 * easyPace + 3 * tempoPace + 2 * easyPace
    totalMinutes
  }

  def main(args: Array[String]): Unit = {
    val runningTime = totalRunningTime()
    println(s"Total running time: $runningTime minutes")
  }
}
