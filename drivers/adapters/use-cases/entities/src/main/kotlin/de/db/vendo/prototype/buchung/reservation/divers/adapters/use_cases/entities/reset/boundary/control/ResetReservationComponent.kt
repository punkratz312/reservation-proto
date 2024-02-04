package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.inject.Inject

class ResetReservationComponent @Inject constructor(private val reservation: ReservationRepository) :
  Component<ReservationId> {

  override fun execute(reference: ReservationId) {
    reservation.findBy(reference);
  }
}