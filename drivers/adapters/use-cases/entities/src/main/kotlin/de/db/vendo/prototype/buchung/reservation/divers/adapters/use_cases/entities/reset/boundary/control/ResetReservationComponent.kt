package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reset.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.RESET
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ResetReservationComponent : Component<ReservationId> {

  @Inject
  @field: Default
  lateinit var reservation: ReservationRepository

  override fun execute(input: ReservationId) {
    reservation.findBy(input).orElseThrow().let {
//      if (it.status != CONFIRM) {
//        throw IllegalStateException("status != CONFIRM")
//      }
      reservation.save(it.copy(status = RESET))
    }
  }
}