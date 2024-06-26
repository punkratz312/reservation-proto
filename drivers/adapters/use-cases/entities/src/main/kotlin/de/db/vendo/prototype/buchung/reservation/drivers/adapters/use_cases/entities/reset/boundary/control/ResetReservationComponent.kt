package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reset.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class ResetReservationComponent @Inject constructor(
  private val reservation: ReservationRepository
) : Component<ReservationId> {

  override fun execute(input: ReservationId) {
    reservation.findBy(input).orElseThrow().let {
//      if (it.status != CONFIRM) {
//        throw IllegalStateException("status != CONFIRM")
//      }
//      reservation.save(it.copy(status = RESET))
      reservation.save(it)
    }
  }
}
