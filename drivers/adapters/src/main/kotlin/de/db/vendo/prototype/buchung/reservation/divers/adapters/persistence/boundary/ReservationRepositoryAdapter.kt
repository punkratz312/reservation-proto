package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.confirm.boundary.dto.ReservationDTO
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ReservationRepositoryAdapter @Inject constructor(
  private val bridge: ReservationRepositoryAdapterBridge
) : ReservationRepositoryUseCaseBridge {
  override fun findBy(input: UUID): Optional<ReservationDTO> {
    TODO("Not yet implemented")
  }

  override fun save(reservation: ReservationDTO): ReservationDTO {
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