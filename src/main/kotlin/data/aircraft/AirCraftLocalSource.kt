package data.aircraft

import domain.datasource.aircraft.AirCraftDataSource
import domain.model.AirCraft
import domain.model.seat.Seat
import domain.model.seat.SeatSection
import domain.model.seat.SeatTypes
import java.math.BigDecimal

class AirCraftLocalSource : AirCraftDataSource {
    override fun getAirCrafts(): List<AirCraft> = listOf(
        AirCraft("Airbus", "A320", getSeatSections()),
        AirCraft("Airbus", "A320", getSeatSections()),
        AirCraft("Airbus", "A320", getSeatSections()),
    )


    private fun getSeatSections(): List<SeatSection> {
        return listOf(
            SeatSection(
                seatTypes = SeatTypes.BUSINESS,
                seats = arrayOf(
                    Seat("1", BigDecimal(30), SeatTypes.BUSINESS),
                    Seat("2", BigDecimal(30), SeatTypes.BUSINESS),
                    Seat("3", BigDecimal(30), SeatTypes.BUSINESS),
                ),
                BigDecimal(30)
            ),
            SeatSection(
                seatTypes = SeatTypes.PLUS,
                seats = arrayOf(
                    Seat("4", BigDecimal(20), SeatTypes.PLUS),
                    Seat("5", BigDecimal(20), SeatTypes.PLUS),
                    Seat("6", BigDecimal(20), SeatTypes.PLUS),
                ),
                BigDecimal(20)
            ),
            SeatSection(
                seatTypes = SeatTypes.ECONOMY,
                seats = arrayOf(
                    Seat("7", BigDecimal(10), SeatTypes.ECONOMY),
                    Seat("8", BigDecimal(10), SeatTypes.ECONOMY),
                    Seat("9", BigDecimal(10), SeatTypes.ECONOMY),
                ),
                BigDecimal(10)
            )
        )
    }
}