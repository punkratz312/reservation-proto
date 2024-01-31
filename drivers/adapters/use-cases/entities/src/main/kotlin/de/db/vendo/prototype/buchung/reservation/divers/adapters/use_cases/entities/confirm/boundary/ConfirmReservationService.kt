package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control.ConfirmReservationComponent
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.inject.Inject

class ConfirmReservationService @Inject constructor(private val confirmReservation: ConfirmReservationComponent) :
        Service<ReservationId> {

    override fun serve(reference: ReservationId) {
        confirmReservation.execute(reference)
    }

}