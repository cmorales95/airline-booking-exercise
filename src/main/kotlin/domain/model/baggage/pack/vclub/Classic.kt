package domain.model.baggage.pack.vclub

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Classic(name: String = "Classic VClub", price: BigDecimal) : VClub(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}