package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker

interface Woodpeckers {

  fun findAllHawks(): Set<Woodpecker>

}
