package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.control.SubmitReservationComponent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationService @Inject constructor(
  private val submitReservation: SubmitReservationComponent
) : FunctionalService<String, ReservationId> {

  override fun serve(input: String): ReservationId {
    return submitReservation.execute(input)
  }
}