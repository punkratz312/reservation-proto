package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary

import de.company.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.GetWoodpeckerSpeciesComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerSpeciesService @Inject constructor(
  private val getWoodpeckerSpecies: GetWoodpeckerSpeciesComponent
) : FunctionalService<WoodpeckerId, Set<Woodpecker>> {

  override fun serve(input: WoodpeckerId): Set<Woodpecker> {
    return getWoodpeckerSpecies.execute(input)
  }
}