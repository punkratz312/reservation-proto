package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control.ConfirmReservationComponent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationService @Inject constructor(
  private val confirmReservation: ConfirmReservationComponent
) : Service<String> {

  override fun serve(input: String) {
    confirmReservation.execute(input)
  }
}