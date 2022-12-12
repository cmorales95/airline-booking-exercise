package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.Flight
import domain.model.Passenger
import domain.model.Ticket
import domain.model.baggage.pack.BaggagePackage

class AssignPassengerToTicket(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(passengers: List<Passenger>): List<Ticket> {
        val firstTicket = ticketsDataSource.tickets.first().apply {
            this.passenger = passengers.first()
        }

        val tickets = passengers.drop(1).map {
            val ticket = Ticket().apply {
                this.passenger = it
                this.flight = firstTicket.flight
                this.baggagePackage = firstTicket.baggagePackage
                this.seat = firstTicket.seat
                this.totalPrice = firstTicket.totalPrice
            }
            ticket
        }

        ticketsDataSource.tickets += tickets

        return ticketsDataSource.tickets
    }
}