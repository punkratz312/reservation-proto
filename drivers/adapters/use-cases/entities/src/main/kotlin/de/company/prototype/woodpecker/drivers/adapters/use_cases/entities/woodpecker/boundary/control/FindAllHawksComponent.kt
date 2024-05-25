package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control

import de.company.prototype.woodpecker.common.bce.boundary.control.OutputComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.WoodpeckerData
import jakarta.annotation.PostConstruct
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.io.File

@ApplicationScoped
class FindAllHawksComponent @Inject constructor(
) : OutputComponent<Set<Woodpecker>> {

  private val result: MutableList<Woodpecker> = mutableListOf()

  @PostConstruct
  fun init(): Set<Woodpecker> {
    File("birds.csv").useLines { lines ->
      lines.forEach { line ->
        val woodpecker = line.split(";")
        val birdFamily = woodpecker[0]
        if (birdFamily == "Hawks") {
          result.add(Woodpecker(WoodpeckerData(
            birdFamily = birdFamily,
            englishBirdName = woodpecker[1],
            scientificBirdName = woodpecker[2],
            iucnCategory = woodpecker[3]
          )))
        }
      }
    }
    return result.sortedWith(compareBy {
      listOf(
        "LC", "NT", "VU", "EN", "CR", "EW", "EX", "DD"
      ).indexOf(it.data.iucnCategory)
    }).toSet();
  }

  override fun execute(): Set<Woodpecker> {
    return result.toSet()
  }
}
