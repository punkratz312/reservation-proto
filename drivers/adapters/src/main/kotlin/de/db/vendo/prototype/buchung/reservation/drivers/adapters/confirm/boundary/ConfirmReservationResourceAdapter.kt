package de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.AdapterToUseCaseMapper
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary.dto.ConfirmReservationResourceAdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationResourceAdapter @Inject constructor(
  private val confirm: ConfirmUseCase,
  private val mapper: AdapterToUseCaseMapper
) : Service<ConfirmReservationResourceAdapterDTO> {

  override fun serve(input: ConfirmReservationResourceAdapterDTO) {
    confirm.action(mapper.toDTO(input))
  }
}
