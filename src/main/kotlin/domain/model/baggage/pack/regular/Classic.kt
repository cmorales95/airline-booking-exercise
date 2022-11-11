package domain.model.baggage.pack.regular

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Classic(name: String = "Classic", price: BigDecimal) : Regular(name, price){
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}