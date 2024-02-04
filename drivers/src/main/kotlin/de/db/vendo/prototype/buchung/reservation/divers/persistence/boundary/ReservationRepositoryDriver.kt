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

  override fun findBy(id: UUID): String {
    return panacheRepository.findById(id).toString()
  }

  override fun save(reservation: String) {
    TODO("Not yet implemented")
  }

  override fun submit(id: UUID) {
    TODO("Not yet implemented")
  }

  override fun confirm(id: UUID) {
    TODO("Not yet implemented")
  }

  override fun reset(id: UUID) {
    TODO("Not yet implemented")
  }
}