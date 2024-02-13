package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.Component
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ConfirmReservationComponent @Inject constructor(
  private val reservation: ReservationRepository
) : Component<String> {

  override fun execute(input: String) {
    reservation.findBy(UUID.randomUUID()).orElseThrow().let {
      reservation.save(it)
//      reservation.save(it.copy(status = CONFIRM))
    }
  }
}
