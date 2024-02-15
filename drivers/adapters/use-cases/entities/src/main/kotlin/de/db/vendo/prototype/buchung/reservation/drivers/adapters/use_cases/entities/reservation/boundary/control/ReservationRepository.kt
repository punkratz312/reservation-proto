package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import java.util.*

interface ReservationRepository {

  fun findBy(input: ReservationId): Optional<Reservation>

  fun save(reservation: Reservation): Reservation

  fun submit(input: Reservation)

  fun confirm(input: Reservation)

  fun reset(input: Reservation)

}


