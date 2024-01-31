package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import java.util.*

class ReservationRepositoryUseCase : ReservationRepositoryUseCaseBridge, ReservationRepository {

    override fun findBy(id: ReservationId): Reservation {
        TODO("Not yet implemented")
        //        return Reservation(id, Trip())
    }

    override fun save(reservation: Reservation) {
        TODO("Not yet implemented")
    }

    override fun submit(id: ReservationId) {
        TODO("Not yet implemented")
    }

    override fun confirm(id: ReservationId) {
        TODO("Not yet implemented")
    }

    override fun reset(id: ReservationId) {
        TODO("Not yet implemented")
    }

    override fun findBy(id: UUID): String {
        return findBy(ReservationId(id)).toString()
    }

    override fun save(reservation: String) {
        TODO("Not yet implemented")
    }

    override fun submit(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun confirm(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun reset(id: UUID) {
        TODO("Not yet implemented")
    }

}