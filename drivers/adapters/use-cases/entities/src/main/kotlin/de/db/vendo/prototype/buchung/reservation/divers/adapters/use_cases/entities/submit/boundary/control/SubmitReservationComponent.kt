package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.submit.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.SUBMIT
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.UUID.randomUUID

@ApplicationScoped
class SubmitReservationComponent @Inject constructor(
  private val reservation: ReservationRepository
) : FunctionalComponent<String, ReservationId> {

  override fun execute(input: String): ReservationId {
    return reservation.save(Reservation(ReservationId(randomUUID()), SUBMIT)).id
  }
}
