package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.submit.boundary.control.SubmitReservationComponent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationService @Inject constructor(
  private val submitReservation: SubmitReservationComponent
) : FunctionalService<ReservationId, String> {

  override fun serve(input: ReservationId): String {
    return submitReservation.execute(input)
  }
}