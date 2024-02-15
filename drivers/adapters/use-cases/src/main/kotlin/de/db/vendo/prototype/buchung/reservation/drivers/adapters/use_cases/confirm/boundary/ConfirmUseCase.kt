package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.mapper.UseCaseDTOMapper
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmUseCase @Inject constructor(
  val confirmReservation: ConfirmReservationService,
  val mapper: UseCaseDTOMapper
) : UseCase<UseCaseDTO> {

  override fun action(input: UseCaseDTO) {
    confirmReservation.serve(mapper.toReservation(input))
  }
}