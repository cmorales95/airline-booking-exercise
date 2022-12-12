import data.aircraft.AirCraftLocalSource
import data.airport.AirportLocalSource
import data.airportbook.AirportBookingLocalSource
import data.baggage.BaggaVClubLocalSource
import data.baggage.BaggageRegularLocalSource
import data.flight.FlightLocalSource
import data.ticket.TicketListSingleton
import domain.datasource.airport.AirportDataSource
import domain.model.Flight
import domain.presentation.Formatter
import domain.usecases.baggage.GetBaggagePackage
import domain.usecases.baggage.types.BaggagePackageConsole
import domain.usecases.baggage.types.format.BaggageTypesConsoleFormat
import domain.usecases.flight.GetFlights
import domain.usecases.flight.di.FlightDataDI
import domain.usecases.ticket.AssignFlightToTicket
import presentation.PresentationFormat
import presentation.flight.FlightPresentationFactory
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

    println("*** Flight Selected ***")
    val ticketsListSingleton = TicketListSingleton()
    val flight = getFlights[1]
    AssignFlightToTicket(ticketsListSingleton).invoke(flight)

    val flightSelected = ticketsListSingleton.tickets.first().flight
    println(
        FlightConsoleFormat().format(flightSelected)
    )
}
