package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge

import java.util.*

interface ReservationRepositoryAdapterBridge {

  fun findBy(input: UUID): Optional<String>

  fun save(reservation: String): String

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
