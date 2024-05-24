package de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.confirm.boundary

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.FunctionalService
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.confirm.boundary.control.GetWoodpeckerComponent
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.db.vendo.prototype.buchung.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
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