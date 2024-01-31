package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.inject.Inject
import java.util.*

class ConfirmReservationResourceAdapter @Inject constructor(private val confirm: ConfirmUseCase) : Service<UUID> {

    override fun serve(reference: UUID) {
        confirm.action(reference)
    }

}