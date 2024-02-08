package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.CONFIRM
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationComponent : Component<ReservationId> {

  @Inject
  @field: Default
  lateinit var reservation: ReservationRepository

  override fun execute(input: ReservationId) {
    val findBy = reservation.findBy(input)
    findBy.orElseThrow().let {
      reservation.save(it.copy(status = CONFIRM))
    }
  }
}