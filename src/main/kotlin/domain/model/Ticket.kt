package domain.model

import domain.model.baggage.pack.BaggagePackage
import domain.model.seat.Seat
import java.math.BigDecimal

class Ticket {
    lateinit var flight: Flight
    lateinit var passenger: Passenger
    lateinit var baggagePackage: BaggagePackage
    lateinit var seat: Seat
    var totalPrice: BigDecimal = BigDecimal(0)
        get() {
            return if (this::flight.isInitialized && this::baggagePackage.isInitialized && this::seat.isInitialized)
                flight.price + baggagePackage.price + seat.price
            else BigDecimal(0)
        }
}
