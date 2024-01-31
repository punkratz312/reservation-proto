package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

class ReservationRepositoryAdapter : ReservationRepositoryUseCaseBridge {

    @Inject
    @field: Default
    lateinit var reservationRepositoryAdapterBridge: ReservationRepositoryAdapterBridge

    override fun findBy(id: UUID): String {
        return reservationRepositoryAdapterBridge.findBy(id)
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