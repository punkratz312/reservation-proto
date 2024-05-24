package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary

import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary.control.WoodpeckerRepository
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.persistence.boundary.bridge.ReservationRepositoryUseCaseBridge
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class WoodpeckerRepositoryUseCase @Inject constructor(
  private val bridge: ReservationRepositoryUseCaseBridge
) : WoodpeckerRepository {
  override fun findBy(id: UUID): Woodpecker {
    TODO("Not yet implemented")
  }

  override fun findBySpecies(id: UUID): Set<Woodpecker> {
    TODO("Not yet implemented")
  }


}
