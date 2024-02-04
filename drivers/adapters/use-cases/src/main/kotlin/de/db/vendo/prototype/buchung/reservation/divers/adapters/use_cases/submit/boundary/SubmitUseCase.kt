package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.FunctionalUseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.SubmitReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class SubmitUseCase : FunctionalUseCase<String, UUID> {

  @Inject
  @field: Default
  lateinit var submitReservation: SubmitReservationService

  override fun action(reference: String): UUID {
    return submitReservation.serve(reference).id
  }
}