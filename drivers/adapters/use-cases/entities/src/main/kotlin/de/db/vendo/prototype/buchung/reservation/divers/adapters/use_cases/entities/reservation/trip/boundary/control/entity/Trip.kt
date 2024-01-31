package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.boundary.control.entity

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.station.boundary.control.entity.Station
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.train.boundary.control.entity.Train
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.train.wagon.boundary.control.entity.Wagon
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.train.wagon.seat.boundary.control.entity.Seat

data class Trip(
        val id: TripId,
        val origin: Station,
        val destination: Station,
        val stations: List<Station>,
        val train: Train,
        val seat: Seat,
        val wagon: Wagon
)