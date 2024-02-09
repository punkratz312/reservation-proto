package de.db.vendo.prototype.buchung.reservation.divers.adapters.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.reset.boundary.ResetUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ResetReservationResourceAdapter : Service<UUID> {

  @Inject
  @field: Default
  lateinit var reset: ResetUseCase

  override fun serve(input: UUID) {
    reset.action(input)
  }
}