package de.db.vendo.prototype.buchung.reservation.drivers.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.persistence.boundary.bridge.ReservationRepositoryAdapterBridge
import de.db.vendo.prototype.buchung.reservation.drivers.persistence.boundary.dto.DriverDTO
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class ReservationRepositoryDriver @Inject constructor(
  private val panacheRepository: PanacheRepository<DriverDTO>
) : ReservationRepositoryAdapterBridge {

  override fun findBy(input: UUID): Optional<String> {
    //    panacheRepository.findById(1L)
    TODO("Not yet implemented")
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