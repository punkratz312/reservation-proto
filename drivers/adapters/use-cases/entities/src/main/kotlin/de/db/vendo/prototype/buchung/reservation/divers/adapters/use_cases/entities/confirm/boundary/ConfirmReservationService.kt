package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.Service
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control.ConfirmReservationComponent
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationService : Service<ReservationId> {

  @Inject
  @field: Default
  lateinit var confirmReservation: ConfirmReservationComponent

  override fun serve(input: ReservationId) {
    confirmReservation.execute(input)
  }
}