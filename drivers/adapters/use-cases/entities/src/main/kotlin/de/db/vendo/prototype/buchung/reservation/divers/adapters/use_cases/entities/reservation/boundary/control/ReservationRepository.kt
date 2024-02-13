package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control

import java.util.*

interface ReservationRepository {

  fun findBy(input: UUID): Optional<String>

  fun save(reservation: String): String

  fun submit(input: String)

  fun confirm(input: String)

  fun reset(input: String)

}


