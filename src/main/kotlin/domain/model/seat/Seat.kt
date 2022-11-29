package domain.model.seat

import java.math.BigDecimal

data class Seat(
    val number: String,
    val price: BigDecimal,
    val type: SeatTypes,
    val status: SeatStatus = SeatStatus.AVAILABLE,
)
