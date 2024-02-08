package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge

import java.util.*

interface ReservationRepositoryAdapterBridge {

  fun findBy(input: UUID): String

  fun save(reservation: String)

  fun submit(input: UUID)

  fun confirm(input: UUID)

  fun reset(input: UUID)

}
