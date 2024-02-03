package de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary.SubmitUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*


@ApplicationScoped
class SubmitReservationResourceAdapter : Service<UUID> {

  @Inject
  @field: Default
  lateinit var submit: SubmitUseCase

  override fun serve(reference: UUID) {
    return submit.action(reference)
  }
}