package domain.usecases.ticket

import domain.model.Flight
import domain.model.Ticket
import domain.usecases.flight.GetFlightSaved

class AssigntFlightToTicket{
    operator fun invoke(flight: Flight) /*: Ticket*/ {}
}