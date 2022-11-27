package presentation.ticket.format

import domain.model.Ticket
import domain.presentation.Formatter

class TicketHTMLFormat : Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
            <p>
            Passenger: ${t.passenger.name}
            Flight Number: ${t.flight.number}
            Departure: ${t.flight.departureArrivalBooking.first.airport.name}
            Arrival: ${t.flight.departureArrivalBooking.second.airport.name}
            Flight Price: ${t.flight.price}
            BaggagePlan $//{}
            Seat: ${t.seat.number}
            Total: $$t.totalPrice
            </p>
        """.trimIndent()
    }
}