package de.db.vendo.prototype.buchung.reservation.divers.adapters.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.ConfirmUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationResourceAdapter @Inject constructor(
  private val confirm: ConfirmUseCase,
  private val mapper: UserMapper
) : Service<ConfirmReservationResourceAdapterDto> {

  override fun serve(input: ConfirmReservationResourceAdapterDto) {
    confirm.action(input)
  }
}
