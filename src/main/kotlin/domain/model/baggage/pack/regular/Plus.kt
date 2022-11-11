package domain.model.baggage.pack.regular

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(name: String = "Plus", price: BigDecimal) : Regular(name, price, ) {
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST

}