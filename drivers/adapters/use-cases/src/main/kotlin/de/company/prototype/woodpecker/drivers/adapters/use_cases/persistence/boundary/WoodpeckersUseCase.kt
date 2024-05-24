package de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.Woodpeckers
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.util.*

@ApplicationScoped
class WoodpeckersUseCase @Inject constructor(
//  private val bridge: ReservationRepositoryUseCaseBridge
) : Woodpeckers {
  override fun findBy(id: UUID): Woodpecker {
    TODO("Not yet implemented")
  }

  override fun findBy(species: String): Set<Woodpecker> {
    TODO("Not yet implemented")
  }


}
