package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.submit.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class SubmitReservationComponent @Inject constructor(
  val reservation: ReservationRepository
) : FunctionalComponent<String, String> {

  override fun execute(input: String): String {
//    return reservation.save(randomUUID().toString())
    return TODO("Provide the return value")
  }
}
