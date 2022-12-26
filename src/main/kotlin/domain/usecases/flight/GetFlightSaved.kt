package domain.usecases.flight

import domain.datasource.ticket.TicketDataSource
import domain.model.Flight

class GetFlightSaved(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(): Flight {
        return ticketsDataSource.tickets.first().flight
    }
}