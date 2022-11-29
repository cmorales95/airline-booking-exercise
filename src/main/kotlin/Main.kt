import domain.model.Flight
import domain.presentation.Formatter
import domain.usecases.flight.GetFlights
import presentation.PresentationFormat
import presentation.flight.FlightPresentationFactory

fun main(args: Array<String>) {
    val format = PresentationFormat.CONSOLE
    val flightFormat: Formatter<Flight> = FlightPresentationFactory().getPresentationFormat(format)
    val flights = GetFlights(flightFormat).invoke()
    println(flights)


}
