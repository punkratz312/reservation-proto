package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerSpeciesComponent @Inject constructor(
  private val woodpeckers: Woodpeckers
) : FunctionalComponent<WoodpeckerId, Set<Woodpecker>> {

  override fun execute(input: WoodpeckerId): Set<Woodpecker> {
    return woodpeckers.findBy(woodpeckers.findBy(input.id).data.species)
  }
}
