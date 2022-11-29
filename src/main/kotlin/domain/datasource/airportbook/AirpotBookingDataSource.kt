package domain.datasource.airportbook

import domain.model.AirportBooking

interface AirpotBookingDataSource {
    fun getAirBookingPairs(): List<Pair<AirportBooking, AirportBooking>>
}