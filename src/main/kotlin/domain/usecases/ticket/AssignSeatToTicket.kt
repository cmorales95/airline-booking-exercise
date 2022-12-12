package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.Passenger
import domain.model.Ticket
import domain.model.seat.Seat

class AssignSeatToTicket(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(seat: Seat?): Ticket? {
        return seat?.let {
            ticketsDataSource.tickets.first().apply {
                this.seat = it
            }
        }
    }
}