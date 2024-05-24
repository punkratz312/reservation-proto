package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.common.bce.boundary.control.OutputComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksComponent @Inject constructor(
  private val woodpeckers: Woodpeckers
) : OutputComponent<Set<Woodpecker>> {

  override fun execute(): Set<Woodpecker> {
    return woodpeckers.findAllHawks()
  }
}
