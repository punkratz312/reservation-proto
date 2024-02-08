package de.db.vendo.prototype.buchung.reservation.divers.web.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.reset.boundary.ResetReservationResourceAdapter
import jakarta.inject.Inject
import java.util.*

class ResetReservationResource @Inject constructor(private val resourceAdapter: ResetReservationResourceAdapter) :
  Service<UUID> {

  override fun serve(input: UUID) {
    resourceAdapter.serve(input)
  }
}