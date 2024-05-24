package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.common.bce.boundary.control.OutputComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerData
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.io.File

@ApplicationScoped
class FindAllHawksComponent @Inject constructor(
) : OutputComponent<Set<Woodpecker>> {

  override fun execute(): Set<Woodpecker> {
    val result = mutableListOf<Woodpecker>()
    File("birds.csv").useLines { lines ->
      lines.forEach {
        val woodpecker = it.split(";")
        result.add(Woodpecker(WoodpeckerData(
          birdFamily = woodpecker[0],
          englishBirdName = woodpecker[1],
          scientificBirdName = woodpecker[2],
          iucnCategory = woodpecker[3]
        )))
      }
    }
    return result.toSet()
  }
}
