package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

class ReservationRepositoryUseCase : ReservationRepository {

    @Inject
    @field: Default
    lateinit var reservationRepositoryUseCaseBridge: ReservationRepositoryUseCaseBridge

    override fun findBy(id: ReservationId): Reservation {
        reservationRepositoryUseCaseBridge.findBy(id.id)
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

}