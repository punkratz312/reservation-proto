package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.SUBMIT
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class SubmitReservationComponent : FunctionalComponent<String, ReservationId> {

  @Inject
  @field: Default
  lateinit var reservation: ReservationRepository

  override fun execute(reference: String): ReservationId {
    return reservation.save(Reservation(ReservationId(UUID.randomUUID()), SUBMIT)).id
  }
}