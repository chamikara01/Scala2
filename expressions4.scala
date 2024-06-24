object expressions4 {
  private val basePrice: Int = 15
  private val baseAttendance: Int = 120
  private val fixedCost: Int = 500
  private val costPerAttendee: Int = 3

  private def attendees(ticketPrice:Int): Int = {
    baseAttendance + ( (basePrice-ticketPrice)/5 * 20)
  }

  private def revenue(ticketPrice: Int): Int = {
    attendees(ticketPrice) * ticketPrice
  }

  private def cost(ticketPrice: Int): Int = {
    fixedCost + costPerAttendee * attendees(ticketPrice)
  }

  private def profit(ticketPrice: Int): Int = {
    revenue(ticketPrice)- cost(ticketPrice)
  }

  def main(args: Array[String]): Unit = {
    println(profit(30))
  }
}
