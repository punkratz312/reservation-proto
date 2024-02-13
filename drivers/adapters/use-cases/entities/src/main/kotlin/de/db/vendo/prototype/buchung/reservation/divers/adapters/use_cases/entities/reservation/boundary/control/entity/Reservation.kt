package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity

data class Reservation(val id: ReservationId, val status: ReservationStatus)
//data class Reservation(val id: UUID, val trip: Trip, val status: String)