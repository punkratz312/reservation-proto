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

  private val hawks: MutableList<Woodpecker> = mutableListOf()
  private val iucn = setOf(
    "LC", "NT", "VU", "EN", "CR", "EW", "EX", "DD"
  )
  private val comparator = compareBy<Woodpecker> {
    iucn.indexOf(it.data.iucnCategory)
  }

  @PostConstruct
  fun parseHawks(): Set<Woodpecker> {
    File("birds.csv").useLines { lines ->
      lines.forEach {
        parseHawk(it)
      }
    }
    return hawks.sortedWith(comparator).toSet();
  }

  private fun parseHawk(line: String) {
    val woodpecker = line.split(";")
    val birdFamily = woodpecker[0]
    if (birdFamily == "Hawks") {
      hawks.add(Woodpecker(WoodpeckerData(
        birdFamily = birdFamily,
        englishBirdName = woodpecker[1],
        scientificBirdName = woodpecker[2],
        iucnCategory = woodpecker[3]
      )))
    }
  }

  override fun execute(): Set<Woodpecker> {
    return hawks.toSet()
  }
}
