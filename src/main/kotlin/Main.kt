import domain.usecases.GetFlights
import domain.usecases.GetTickets
import presentation.flight.FlightHTMLFormat
import presentation.ticket.TicketConsoleFormat

fun main(args: Array<String>) {
    val getFlights = GetFlights(FlightHTMLFormat())
    val flightFormat = getFlights.invoke()
    println(flightFormat)

    val getTickets = GetTickets(TicketConsoleFormat())
    val ticketFormatted = getTickets.invoke()
    println(ticketFormatted)
}
