package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.usecase.UseCase
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.dto.ReservationDTO
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.dto.ReservationMapper
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.ConfirmReservationService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmUseCase @Inject constructor(
  private val confirmReservation: ConfirmReservationService,
  private val mapper: ReservationMapper
) : UseCase<ReservationDTO> {

  override fun action(input: ReservationDTO) {
    confirmReservation.serve(mapper.toReservation(input))
  }
}