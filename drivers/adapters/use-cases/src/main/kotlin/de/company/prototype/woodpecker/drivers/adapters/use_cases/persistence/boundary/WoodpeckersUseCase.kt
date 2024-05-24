package de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.Woodpeckers
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class WoodpeckersUseCase @Inject constructor(
  private val bridge: WoodpeckersUseCaseBridge
) : Woodpeckers {
  override fun findAllHawks(): Set<Woodpecker> {
    return bridge.findAllHawks()
  }

}
