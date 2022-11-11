package domain.model.baggage.pack.vclub

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(name: String = "Basic", price: BigDecimal) : VClub(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}