package de.db.vendo.prototype.buchung.reservation.drivers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.AdapterDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.dto.mapper.Mapper
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationResourceAdapter @Inject constructor(
  private val confirm: ConfirmUseCase,
  private val mapper: Mapper
) : Service<AdapterDTO> {

  override fun serve(input: AdapterDTO) {
    confirm.action(mapper.toDTO(input))
  }
}
