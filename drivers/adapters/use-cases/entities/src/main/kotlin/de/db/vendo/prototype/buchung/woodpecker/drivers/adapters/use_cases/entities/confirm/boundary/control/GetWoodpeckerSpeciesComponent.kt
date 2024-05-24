package de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerSpeciesComponent @Inject constructor(
  private val woodpeckers: WoodpeckerRepository
) : FunctionalComponent<WoodpeckerId, Set<Woodpecker>> {

  override fun execute(input: WoodpeckerId): Set<Woodpecker> {
    return woodpeckers.findBySpecies(input.id)
  }
}
