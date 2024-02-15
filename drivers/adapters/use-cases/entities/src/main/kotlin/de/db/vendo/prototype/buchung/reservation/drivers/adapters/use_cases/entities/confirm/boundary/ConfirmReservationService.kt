package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary.control.ConfirmReservationComponent
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationService @Inject constructor(
  val confirmReservation: ConfirmReservationComponent
) : Service<Reservation> {

  override fun serve(input: Reservation) {
    confirmReservation.execute(input)
  }
}