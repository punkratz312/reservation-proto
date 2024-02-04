package de.db.vendo.prototype.buchung.reservation.divers.adapters.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary.SubmitUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*


@ApplicationScoped
class SubmitReservationResourceAdapter : FunctionalService<UUID, UUID> {

  @Inject
  @field: Default
  lateinit var submit: SubmitUseCase

  override fun serve(reference: UUID): UUID {
    submit.action(reference)
    return UUID.randomUUID()
  }
}