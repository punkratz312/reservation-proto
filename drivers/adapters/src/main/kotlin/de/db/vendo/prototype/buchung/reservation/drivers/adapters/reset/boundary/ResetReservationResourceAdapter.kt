package de.db.vendo.prototype.buchung.reservation.drivers.adapters.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.reset.boundary.ResetUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ResetReservationResourceAdapter @Inject constructor(
  val reset: ResetUseCase
) : Service<UUID> {

  override fun serve(input: UUID) {
    reset.action(input)
  }
}