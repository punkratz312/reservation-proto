package de.company.prototype.woodpecker.drivers.adapters.use_cases.confirm.boundary

import de.company.prototype.buchung.reservation.common.usecase.UseCase
import de.company.prototype.woodpecker.drivers.adapters.use_cases.dto.UseCaseDTO
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmUseCase @Inject constructor(
  private val confirmReservation: ConfirmReservationService,
//  private val mapper: UseCaseDTOMapper
) : UseCase<UseCaseDTO> {

  override fun action(input: UseCaseDTO) {
//    confirmReservation.serve(mapper.toReservation(input))
  }
}