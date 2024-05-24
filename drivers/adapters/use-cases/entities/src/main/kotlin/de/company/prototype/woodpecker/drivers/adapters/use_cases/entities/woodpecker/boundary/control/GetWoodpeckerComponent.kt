package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.common.bce.boundary.control.FunctionalComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerComponent @Inject constructor(
  private val woodpeckers: Woodpeckers
) : FunctionalComponent<WoodpeckerId, Woodpecker> {

  override fun execute(input: WoodpeckerId): Woodpecker {
    return woodpeckers.findBy(input.id)
  }
}
