package de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary

import de.company.prototype.woodpecker.common.bce.boundary.OutputService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.FindAllHawksService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class FindAllHawksUseCase @Inject constructor(
  private val findAllHawks: FindAllHawksService
) : OutputService<Set<Woodpecker>> {

//  override fun findAllHawks(): Set<Woodpecker> {
////    findAllHawks.serve()
//    TODO()
//  }

  override fun serve(): Set<Woodpecker> {
    return findAllHawks.serve()
  }

}
