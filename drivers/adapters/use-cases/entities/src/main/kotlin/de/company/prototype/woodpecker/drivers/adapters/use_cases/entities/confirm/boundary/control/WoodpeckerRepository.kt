package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.confirm.boundary.control

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import java.util.*

interface WoodpeckerRepository {
  fun findBy(id: UUID): Woodpecker
  fun findBySpecies(id: UUID): Set<Woodpecker>

}
