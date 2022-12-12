package domain.usecases.ticket

import domain.datasource.ticket.TicketDataSource
import domain.model.*
import domain.model.baggage.pack.regular.RegularPlus
import domain.model.seat.Seat
import domain.model.seat.SeatSection
import domain.model.seat.SeatStatus
import domain.model.seat.SeatTypes
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetTickets(
    private val ticketsDataSource: TicketDataSource
) {
    operator fun invoke(): List<Ticket> {
        return ticketsDataSource.tickets
    }
}
