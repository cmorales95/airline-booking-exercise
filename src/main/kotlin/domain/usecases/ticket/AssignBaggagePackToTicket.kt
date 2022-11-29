package domain.usecases.ticket

import domain.model.Ticket
import domain.model.baggage.pack.BaggagePackage

class AssignBaggagePackToTicket {
    operator fun invoke(baggagePackage: BaggagePackage) /*Ticket*/ {}
}