package de.db.vendo.prototype.buchung.reservation.divers.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.divers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import java.util.*

class ReservationRepositoryDriver : ReservationRepositoryAdapterBridge {

  @Inject
  @field: Default
  lateinit var panacheRepository: PanacheRepositoryBase<String, UUID>

  override fun findBy(input: UUID): Optional<String> {
    return Optional.of(panacheRepository.findById(input).toString())
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