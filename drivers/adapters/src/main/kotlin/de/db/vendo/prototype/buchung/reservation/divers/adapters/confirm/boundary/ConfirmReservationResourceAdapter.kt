package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ConfirmReservationResourceAdapter @Inject constructor(
  @field:Default private val confirm: ConfirmUseCase
) : Service<UUID> {

  override fun serve(input: UUID) {
    confirm.action(input)
  }
}
