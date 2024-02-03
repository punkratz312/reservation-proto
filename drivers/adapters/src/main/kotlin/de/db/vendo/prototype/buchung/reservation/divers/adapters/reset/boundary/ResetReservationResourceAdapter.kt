package de.db.vendo.prototype.buchung.reservation.divers.adapters.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.reset.boundary.ResetUseCase
import jakarta.inject.Inject
import java.util.*

class ResetReservationResourceAdapter @Inject constructor(private val reset: ResetUseCase) : Service<UUID> {

  override fun serve(reference: UUID) {
    reset.action(reference)
  }
}