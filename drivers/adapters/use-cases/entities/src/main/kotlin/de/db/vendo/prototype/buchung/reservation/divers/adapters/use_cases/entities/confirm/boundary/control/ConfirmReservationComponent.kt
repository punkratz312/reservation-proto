package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.CONFIRM
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationComponent @Inject constructor(
  @field:Default private val reservation: ReservationRepository
) : Component<ReservationId> {

  override fun execute(input: ReservationId) {
    reservation.findBy(input).orElseThrow().let {
      reservation.save(it.copy(status = CONFIRM))
    }
  }
}
