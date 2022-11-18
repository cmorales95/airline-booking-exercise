package domain.model

import domain.model.baggage.pack.BaggagePackage
import domain.model.seat.Seat
import java.math.BigDecimal

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: BaggagePackage,
    val seat: Seat,
    val totalPrice: BigDecimal = flight.price + baggagePackage.price + seat.price
)
