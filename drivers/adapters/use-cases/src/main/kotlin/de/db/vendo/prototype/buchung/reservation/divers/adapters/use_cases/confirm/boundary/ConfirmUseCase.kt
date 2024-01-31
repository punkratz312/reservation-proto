package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.inject.Inject
import java.util.*

class ConfirmUseCase @Inject constructor(private val confirmReservation: ConfirmReservationService) :
        UseCase<UUID> {

    override fun action(reference: UUID) {
        confirmReservation.serve(ReservationId(reference))
    }

}