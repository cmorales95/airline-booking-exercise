package domain.model.seat

import java.math.BigDecimal

class SeatSection(
    val seatTypes: SeatTypes,
    val seats: Array<Seat>,
    val price: BigDecimal,
)