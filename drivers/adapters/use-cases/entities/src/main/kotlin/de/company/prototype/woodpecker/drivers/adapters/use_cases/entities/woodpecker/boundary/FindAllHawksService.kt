package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary

import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.FindAllHawksComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksService @Inject constructor(
  private val findAllHawks: FindAllHawksComponent
) : FunctionalService<Unit, Set<Woodpecker>> {

  override fun serve(input: Unit): Set<Woodpecker> {
    return findAllHawks.execute(input)
  }
}