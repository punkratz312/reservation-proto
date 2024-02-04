package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ConfirmReservationResourceAdapter : Service<UUID> {

  @Inject
  @field: Default
  lateinit var confirm: ConfirmUseCase

  override fun serve(reference: UUID) {
    confirm.action(reference)
  }
}