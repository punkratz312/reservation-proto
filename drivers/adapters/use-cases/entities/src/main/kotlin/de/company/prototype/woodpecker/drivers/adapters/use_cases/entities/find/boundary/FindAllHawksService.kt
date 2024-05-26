package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.find.boundary

import de.company.prototype.woodpecker.common.bce.boundary.OutputService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.find.boundary.control.FindAllHawksComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksService @Inject constructor(
  private val findAllHawks: FindAllHawksComponent
) : OutputService<Set<Woodpecker>> {

  override fun serve(): Set<Woodpecker> {
    return findAllHawks.execute()
  }
}