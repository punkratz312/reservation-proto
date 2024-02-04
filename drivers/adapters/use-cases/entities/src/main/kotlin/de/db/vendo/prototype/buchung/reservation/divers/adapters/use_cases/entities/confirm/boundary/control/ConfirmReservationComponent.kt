package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.CONFIRM
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.SUBMIT
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject

@ApplicationScoped
class ConfirmReservationComponent : Component<ReservationId> {

  @Inject
  @field: Default
  lateinit var reservationRepository: ReservationRepository

  override fun execute(reference: ReservationId) {
    reservationRepository.findBy(reference).orElseThrow().let {
      if (it.status != SUBMIT) {
        throw IllegalStateException(SUBMIT.toString())
      }
      reservationRepository.save(it.copy(status = CONFIRM))
    }
  }
}