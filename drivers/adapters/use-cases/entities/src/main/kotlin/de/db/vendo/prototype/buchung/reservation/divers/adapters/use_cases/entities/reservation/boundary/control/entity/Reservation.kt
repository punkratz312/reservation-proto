package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.trip.boundary.control.entity.Trip

data class Reservation(val id: ReservationId, val trip: Trip, val status: String)