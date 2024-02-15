package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.trip.boundary.control.entity.Trip

data class Reservation(val id: ReservationId, val status: ReservationStatus, val trip: Trip)