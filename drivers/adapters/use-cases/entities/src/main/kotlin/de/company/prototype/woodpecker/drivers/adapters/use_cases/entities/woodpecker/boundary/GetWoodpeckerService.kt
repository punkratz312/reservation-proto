package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary

import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.GetWoodpeckerComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerService @Inject constructor(
  private val getWoodpecker: GetWoodpeckerComponent
) : FunctionalService<WoodpeckerId, Woodpecker> {

  override fun serve(input: WoodpeckerId): Woodpecker {
    return getWoodpecker.execute(input)
  }
}