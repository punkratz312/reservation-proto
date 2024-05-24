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
    val lineList = mutableListOf<String>()
    val result = mutableListOf<Woodpecker>()
    File("birds.csv").useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { line ->
      println(">  $line")
      val parts = line.split(";")
      if (parts.size == 4) {
        val woodpeckerData = WoodpeckerData(
          birdFamily = parts[0],
          englishBirdName = parts[1],
          scientificBirdName = parts[2],
          iucnCategory = parts[3]
        )
        val woodpecker = Woodpecker(woodpeckerData)
        result.add(woodpecker)
      }
    }
    return result.toSet()
  }
}
