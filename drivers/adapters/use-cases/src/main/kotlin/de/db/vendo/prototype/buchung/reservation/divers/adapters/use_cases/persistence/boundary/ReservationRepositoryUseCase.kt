package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.ReservationRepository
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.Reservation
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationId
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.reservation.boundary.control.entity.ReservationStatus.SUBMIT
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ReservationRepositoryUseCase @Inject constructor(
  private val bridge: ReservationRepositoryUseCaseBridge
) : ReservationRepository {

  override fun findBy(input: ReservationId): Optional<Reservation> {
    return bridge.findBy(input.id).map { Reservation(input, SUBMIT) }
  }

  override fun save(reservation: Reservation): Reservation {
    TODO("Not yet implemented")
  }

  override fun submit(input: Reservation) {
    TODO("Not yet implemented")
  }

  override fun confirm(input: Reservation) {
    TODO("Not yet implemented")
  }

  override fun reset(input: Reservation) {
    TODO("Not yet implemented")
  }

}
