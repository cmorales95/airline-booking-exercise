package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.*

class GetTickets(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(): List<Ticket> {
        return ticketsDataSource.tickets
    }
}
