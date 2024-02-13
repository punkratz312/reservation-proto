package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.FunctionalUseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.SubmitReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class SubmitUseCase : FunctionalUseCase<String, String> {

  @Inject
  @field: Default
  lateinit var submitReservation: SubmitReservationService

  override fun action(input: String): String {
    return submitReservation.serve(input)
  }
}