package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.FunctionalUseCase
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.submit.boundary.SubmitReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class SubmitUseCase : FunctionalUseCase<UseCaseDTO, String> {

  @Inject
  @field: Default
  lateinit var submitReservation: SubmitReservationService

  override fun action(input: UseCaseDTO): String {
    TODO("Provide the return value")
//    return submitReservation.serve(input)
  }
}