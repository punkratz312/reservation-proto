package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmUseCase @Inject constructor(
  private val confirmReservation: ConfirmReservationService
) : UseCase<UseCaseDto> {

  override fun action(input: UseCaseDto) {
    confirmReservation.serve("ReservationId(input)")
  }
}