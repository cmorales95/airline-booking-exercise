package domain.model

import java.time.LocalTime

data class AirportBooking(
    val airport: Airport,
    val localTime: LocalTime
)
