package de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary

import de.company.prototype.woodpecker.common.bce.boundary.OutputService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.FindAllHawksService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksUseCase @Inject constructor(
  private val findAllHawks: FindAllHawksService
) : OutputService<Set<String>> {

  override fun serve(): Set<String> {
    val map = findAllHawks.serve().map {
      {
        it.toString()
      }
    }.toSet()
    return emptySet()
  }

}
