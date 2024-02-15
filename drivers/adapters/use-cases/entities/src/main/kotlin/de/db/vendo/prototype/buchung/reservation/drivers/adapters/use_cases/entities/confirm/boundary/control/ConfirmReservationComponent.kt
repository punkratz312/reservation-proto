package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.CONFIRM
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationComponent @Inject constructor(
  val reservation: ReservationRepository
) : Component<Reservation> {

  override fun execute(input: Reservation) {
    reservation.findBy(input.id).orElseThrow().let {
      reservation.save(input.copy(status = CONFIRM))
    }
  }
}
