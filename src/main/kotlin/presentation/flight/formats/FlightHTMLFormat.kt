package presentation.flight.formats

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightHTMLFormat : Formatter<Flight> {
    override fun format(t: Flight): String {
        val departure = t.departureArrivalBooking.first
        val arrival = t.departureArrivalBooking.second
        return """
            <p>
            $t.number
            Origin: ${departure.airport.name}
            Origin DateTime: ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival: ${arrival.airport.name}
            Arrival DateTime: ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Duration: $t.duration
            Price: $${t.price}
            </p>
        """.trimIndent()
    }
}