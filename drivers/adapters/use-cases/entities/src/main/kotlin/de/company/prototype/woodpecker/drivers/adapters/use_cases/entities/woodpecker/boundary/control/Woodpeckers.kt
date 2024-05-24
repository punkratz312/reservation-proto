package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import java.util.*

interface Woodpeckers {

  fun findBy(id: UUID): Woodpecker

  fun findBy(species: String): Set<Woodpecker>

}
