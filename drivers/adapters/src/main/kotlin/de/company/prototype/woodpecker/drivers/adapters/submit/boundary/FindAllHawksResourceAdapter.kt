package de.company.prototype.woodpecker.drivers.adapters.submit.boundary

import de.company.prototype.woodpecker.common.bce.boundary.OutputService
import de.company.prototype.woodpecker.drivers.adapters.use_cases.persistence.boundary.FindAllHawksUseCase
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject


@ApplicationScoped
class FindAllHawksResourceAdapter @Inject constructor(
  private val woodpeckers: FindAllHawksUseCase
) : OutputService<Set<Any>> {

  override fun serve(): Set<Any> {
    return woodpeckers.serve()
  }

}
