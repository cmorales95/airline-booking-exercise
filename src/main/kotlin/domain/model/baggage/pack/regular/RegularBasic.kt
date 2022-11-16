package domain.model.baggage.pack.regular

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularBasic(
    price: BigDecimal
) : Regular(price) {
    override val name: String = "Regular Basic"
    override val boardingTurn: BoardingTurn = BoardingTurn.END
}