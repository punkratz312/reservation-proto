package de.db.vendo.prototype.buchung.reservation.drivers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.dto.UseCaseDTO
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ReservationRepositoryAdapter @Inject constructor(
  private val bridge: ReservationRepositoryAdapterBridge
) : ReservationRepositoryUseCaseBridge {

  override fun findBy(input: UUID): Optional<UseCaseDTO> {
    TODO("Not yet implemented")
  }

  override fun save(reservation: UseCaseDTO): UseCaseDTO {
    TODO("Not yet implemented")
  }

  override fun submit(input: UUID) {
    TODO("Not yet implemented")
  }

  override fun confirm(input: UUID) {
    TODO("Not yet implemented")
  }

  override fun reset(input: UUID) {
    TODO("Not yet implemented")
  }


}