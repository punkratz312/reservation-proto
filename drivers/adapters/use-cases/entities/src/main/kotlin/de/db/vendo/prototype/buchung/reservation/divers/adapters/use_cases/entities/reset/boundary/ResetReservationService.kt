package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary.control.ResetReservationComponent
import jakarta.inject.Inject

class ResetReservationService @Inject constructor(private val confirmReservation: ResetReservationComponent) :
  Service<ReservationId> {

  override fun serve(input: ReservationId) {
    confirmReservation.execute(input)
  }
}