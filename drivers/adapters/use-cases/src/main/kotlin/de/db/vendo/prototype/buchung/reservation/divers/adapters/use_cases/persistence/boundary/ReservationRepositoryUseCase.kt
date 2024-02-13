package de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ReservationRepositoryUseCase @Inject constructor(
  private val bridge: ReservationRepositoryUseCaseBridge
) : ReservationRepository {

  override fun findBy(input: UUID): Optional<String> {
    return bridge.findBy(input).map { "Reservation(input, SUBMIT)" }
  }

  override fun save(reservation: String): String {
    return bridge.save(reservation)
  }

  override fun submit(input: String) {
    TODO("Not yet implemented")
  }

  override fun confirm(input: String) {
    TODO("Not yet implemented")
  }

  override fun reset(input: String) {
    TODO("Not yet implemented")
  }
}
