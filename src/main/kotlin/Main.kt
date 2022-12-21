import data.ticket.TicketListSingleton
import domain.presentation.extfunction.isMenuOptionValid
import domain.usecases.flight.GetFlights
import domain.usecases.flight.di.FlightDataDI
import domain.usecases.ticket.AssignFlightToTicket
import presentation.flight.formats.FlightConsoleFormat
import java.time.Month

fun main(args: Array<String>) {
    val getFlights = GetFlights(
        FlightDataDI().providesFlightsData()
    ).invoke(Month.JANUARY)
    getFlights.forEach { (t, u) ->
        print("$t. ")
        println(FlightConsoleFormat().format(u))
    }

    var flightOption = ""
    do {
        // Show the list of flights
        getFlights.forEach { (t, u) ->
            print("$t. ")
            println(FlightConsoleFormat().format(u))
        }

        println("""*** select number option ***""")
        flightOption = readLine().orEmpty()
    } while (!flightOption.isMenuOptionValid(getFlights))

    println("Option selected: $flightOption")
    println("*** Flight Selected ***")
    val ticketsListSingleton = TicketListSingleton()
    val flight = getFlights[flightOption.toInt()]
    AssignFlightToTicket(ticketsListSingleton).invoke(flight)

    val flightSelected = ticketsListSingleton.tickets.first().flight
    println(
        FlightConsoleFormat().format(flightSelected)
    )
}


