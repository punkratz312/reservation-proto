package de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.confirm.boundary.control

import de.db.vendo.prototype.buchung.reservation.common.bce.boundary.control.FunctionalComponent
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.db.vendo.prototype.buchung.reservation.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerId
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class GetWoodpeckerComponent @Inject constructor(
  private val woodpeckers: WoodpeckerRepository
) : FunctionalComponent<WoodpeckerId, Woodpecker> {

  override fun execute(input: WoodpeckerId): Woodpecker {
    return woodpeckers.findBy(input.id)
  }
}
