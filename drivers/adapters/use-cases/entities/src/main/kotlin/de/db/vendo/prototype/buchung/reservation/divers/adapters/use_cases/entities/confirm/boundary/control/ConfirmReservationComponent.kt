package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.inject.Inject

class ConfirmReservationComponent @Inject constructor(private val reservationRepository: ReservationRepository) :
        Component<ReservationId> {

    override fun execute(reference: ReservationId) {
        reservationRepository.findBy(reference);
    }

}