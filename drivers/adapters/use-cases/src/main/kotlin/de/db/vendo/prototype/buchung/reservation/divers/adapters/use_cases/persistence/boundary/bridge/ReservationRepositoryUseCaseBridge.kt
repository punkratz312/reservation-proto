package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge

import java.util.*

interface ReservationRepositoryUseCaseBridge {

  fun findBy(input: UUID): Optional<String>

  fun save(reservation: String): String

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
