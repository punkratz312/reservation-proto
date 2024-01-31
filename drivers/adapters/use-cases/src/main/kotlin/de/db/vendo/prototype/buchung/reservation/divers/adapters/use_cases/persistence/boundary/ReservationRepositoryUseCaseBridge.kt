package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary

import java.util.*

interface ReservationRepositoryUseCaseBridge {

    fun findBy(id: UUID): String

    fun save(reservation: String)

    fun submit(id: UUID)

    fun confirm(id: UUID)

    fun reset(id: UUID)

}
