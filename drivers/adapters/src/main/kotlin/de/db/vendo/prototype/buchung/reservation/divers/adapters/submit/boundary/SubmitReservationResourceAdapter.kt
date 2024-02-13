package de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary.SubmitUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class SubmitReservationResourceAdapter @Inject constructor(
  private val submit: SubmitUseCase
) : FunctionalService<String, UUID> {

  override fun serve(input: String): UUID {
    return submit.action(input)
  }
}
