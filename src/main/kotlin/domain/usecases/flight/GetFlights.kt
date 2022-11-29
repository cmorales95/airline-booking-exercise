package domain.usecases.flight

import domain.model.AirCraft
import domain.model.Airport
import domain.model.AirportBooking
import domain.model.Flight
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetFlights(
    private val formatter: Formatter<Flight>
) {
    fun invoke(month: Month): Map<Int, Flight> {
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("AirBus", "A320"),
            price = BigDecimal(100.0),
            departureArrivalBooking = getAirportPair(),
        )

        val flights = mapOf(
            1 to flight,
            2 to flight,
            3 to flight,
        )

        return flights.filter { flightsEntry ->
            flightsEntry.value.departureArrivalBooking.first.dateTime.month == month
        }
    }

    private fun getAirportPair(): Pair<AirportBooking, AirportBooking> {
        return Pair(
            AirportBooking(
                airport = Airport("BOG","Bogotá"),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10, 13, 0, 0
                )
            ),
            AirportBooking(
                airport = Airport("CUN","Cancún"),
                dateTime = LocalDateTime.of(
                    2023, Month.JANUARY, 10, 17, 30, 0
                )
            )
        )
    }
}

