package de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.FindAllHawksService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.Woodpeckers
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksUseCase @Inject constructor(
  private val findAllHawks: FindAllHawksService
) : Woodpeckers {

  override fun findAllHawks(): Set<Woodpecker> {
    return findAllHawks.serve()
  }

}
