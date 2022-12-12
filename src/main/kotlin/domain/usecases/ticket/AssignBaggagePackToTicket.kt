package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.Ticket
import domain.model.baggage.pack.BaggagePackage

class AssignBaggagePackageToTicket(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(baggagePackage: BaggagePackage?): Ticket? {
        return baggagePackage?.let {
            ticketsDataSource.tickets.first().apply {
                this.baggagePackage = it
            }
        }
    }
}