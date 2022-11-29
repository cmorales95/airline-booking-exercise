import data.aircraft.AirCraftLocalSource
import data.airport.AirportLocalSource
import data.airportbook.AirportBookingLocalSource
import data.flight.FlightLocalSource
import domain.model.Flight
import domain.presentation.Formatter
import domain.usecases.flight.GetFlights
import presentation.PresentationFormat
import presentation.flight.FlightPresentationFactory
import java.time.Month

fun main(args: Array<String>) {
    val airportLocalSource = AirportLocalSource()
    val airportBookingLocalSource = AirportBookingLocalSource(
        airportLocalSource
    )
    val airCraftLocalSource = AirCraftLocalSource()
    val flightsLocal = FlightLocalSource(
        airCraftLocalSource, airportBookingLocalSource,
    )
    val flights = GetFlights(flightsLocal).invoke(Month.JANUARY)
    println(flights)
}
