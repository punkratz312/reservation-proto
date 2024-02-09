package de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import de.db.vendo.prototype.buchung.reservation.divers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

class ReservationRepositoryAdapter : ReservationRepositoryAdapterBridge {

  @Inject
  @field: Default
  lateinit var repositoryUseCaseBridge: ReservationRepositoryUseCaseBridge

  override fun findBy(input: UUID): Optional<String> {
    return repositoryUseCaseBridge.findBy(input).map { it.toString() }
  }

  override fun save(reservation: String): String {
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