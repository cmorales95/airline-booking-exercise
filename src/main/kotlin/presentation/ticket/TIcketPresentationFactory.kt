package presentation.ticket

import domain.model.Ticket
import domain.presentation.Formatter
import presentation.PresentationFactory
import presentation.PresentationFormat
import presentation.ticket.format.TicketConsoleFormat

class TIcketPresentationFactory : PresentationFactory<Ticket> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Ticket> {
        return TicketConsoleFormat()
    }
}