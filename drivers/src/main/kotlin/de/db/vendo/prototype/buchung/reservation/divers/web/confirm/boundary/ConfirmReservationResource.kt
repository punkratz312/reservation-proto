package de.db.vendo.prototype.buchung.reservation.divers.web.confirm.boundary


import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary.ConfirmReservationResourceAdapter
import jakarta.inject.Inject
import java.util.*

class ConfirmReservationResource @Inject constructor(private val confirmReservation: ConfirmReservationResourceAdapter) :
        Service<UUID> {

    override fun serve(reference: UUID) {
        confirmReservation.serve(reference)
    }

}