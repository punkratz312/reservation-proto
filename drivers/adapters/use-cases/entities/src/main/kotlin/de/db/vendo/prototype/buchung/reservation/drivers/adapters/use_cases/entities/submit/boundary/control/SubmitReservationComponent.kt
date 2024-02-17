package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.submit.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationComponent @Inject constructor(
  private val reservation: ReservationRepository
) : FunctionalComponent<ReservationId, String> {

  override fun execute(input: ReservationId): String {
//    return reservation.save(randomUUID().toString())
    TODO("Provide the return value")
  }
}
