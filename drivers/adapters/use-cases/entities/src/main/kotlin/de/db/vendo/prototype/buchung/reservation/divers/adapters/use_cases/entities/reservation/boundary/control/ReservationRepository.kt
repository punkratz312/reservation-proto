package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control


import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId

interface ReservationRepository {

    fun findBy(id: ReservationId): Reservation

    fun save(reservation: Reservation)

    fun submit(id: ReservationId)

    fun confirm(id: ReservationId)

    fun reset(id: ReservationId)

}
