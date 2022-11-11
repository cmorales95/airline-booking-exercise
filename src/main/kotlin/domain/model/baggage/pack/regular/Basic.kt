package domain.model.baggage.pack.regular

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(name: String = "Basic", price: BigDecimal) : Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.END
}