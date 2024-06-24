object expressions3 {
  private val normalHourlyRate: Double = 250.0
  private val otHourlyRate: Double = 85.0
  private val taxRate: Double = 0.0025
  
  private def grossSalary(nHours: Double, otHours: Double): Double = {
    nHours * normalHourlyRate + otHours * otHourlyRate
  }
  
  private def tax(nHours: Double, otHours: Double): Double = {
    grossSalary(nHours, otHours) * taxRate
  }
  
  private def calculateSalary(nHours: Double, otHours: Double): Double = {
    grossSalary(nHours, otHours) - tax(nHours, otHours)
  }
  
  def main(args: Array[String]): Unit = {
    println(calculateSalary(40,30))
  }
}
