package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.Flight
import domain.model.Ticket

class AssignFlightToTicket(
    private val  ticketsDataSource: TicketDataSource
) {
    operator fun invoke(flight: Flight?): Ticket? {
        return flight?.let {
            ticketsDataSource.tickets.first().apply {
                this.flight = flight
            }
        }
    }

}