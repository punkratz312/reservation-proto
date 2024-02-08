package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import java.util.*

interface ReservationRepository {

  fun findBy(input: ReservationId): Optional<Reservation>

  fun save(reservation: Reservation): Reservation

  fun submit(input: ReservationId)

  fun confirm(input: ReservationId)

  fun reset(input: ReservationId)

}


