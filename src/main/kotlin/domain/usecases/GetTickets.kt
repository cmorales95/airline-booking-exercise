package domain.usecases

import domain.model.*
import domain.model.baggage.pack.BaggagePackage
import domain.model.baggage.pack.regular.RegularPlus
import domain.model.seat.Seat
import domain.model.seat.SeatStatus
import domain.model.seat.SeatTypes
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetTickets(
    private val formatter: Formatter<Ticket>
){
    fun invoke(): String {
        val flight = Flight(
            number = "Y4 708",
            airCraft = AirCraft("AirBus", "A320"),
            price = BigDecimal(100.0),
            departureArrivalBooking = getAirportPair(),
        )

        val ticket = Ticket(
            flight = flight,
            passenger = Passenger("Cris", "not now", "34343"),
            baggagePackage = RegularPlus(BigDecimal(50)),
            seat = Seat("12", BigDecimal(60), SeatStatus.RESERVED, SeatTypes.PLUS)
        )

        return formatter.format(ticket)
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