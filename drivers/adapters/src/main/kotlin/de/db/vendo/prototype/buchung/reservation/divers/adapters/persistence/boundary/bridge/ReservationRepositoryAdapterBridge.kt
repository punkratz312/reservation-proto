package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge

import java.util.*

interface ReservationRepositoryAdapterBridge {

  fun findBy(id: UUID): String

  fun save(reservation: String)

  fun submit(id: UUID)

  fun confirm(id: UUID)

  fun reset(id: UUID)

}
