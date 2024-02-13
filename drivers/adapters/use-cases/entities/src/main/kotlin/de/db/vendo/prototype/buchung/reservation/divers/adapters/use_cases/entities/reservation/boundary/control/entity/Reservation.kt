package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity

import java.util.*

data class Reservation(val id: UUID, val status: ReservationStatus)
//data class Reservation(val id: UUID, val trip: Trip, val status: String)