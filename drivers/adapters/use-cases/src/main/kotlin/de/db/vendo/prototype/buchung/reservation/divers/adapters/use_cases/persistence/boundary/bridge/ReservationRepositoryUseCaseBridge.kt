package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge

import java.util.*

interface ReservationRepositoryUseCaseBridge {

  fun findBy(input: UUID): String

  fun save(reservation: String)

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
