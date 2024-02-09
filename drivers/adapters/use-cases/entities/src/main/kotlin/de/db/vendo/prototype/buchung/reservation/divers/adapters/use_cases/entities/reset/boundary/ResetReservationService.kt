package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary.control.ResetReservationComponent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ResetReservationService : Service<ReservationId> {

  @Inject
  @field: Default
  lateinit var resetReservation: ResetReservationComponent

  override fun serve(input: ReservationId) {
    resetReservation.execute(input)
  }
}