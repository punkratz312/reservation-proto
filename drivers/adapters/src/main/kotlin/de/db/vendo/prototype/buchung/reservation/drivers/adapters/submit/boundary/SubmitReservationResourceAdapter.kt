package de.db.vendo.prototype.buchung.reservation.drivers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.submit.boundary.SubmitUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationResourceAdapter @Inject constructor(
  val submit: SubmitUseCase
) : FunctionalService<String, String> {

  override fun serve(input: String): String {
    return submit.action(input)
  }
}
