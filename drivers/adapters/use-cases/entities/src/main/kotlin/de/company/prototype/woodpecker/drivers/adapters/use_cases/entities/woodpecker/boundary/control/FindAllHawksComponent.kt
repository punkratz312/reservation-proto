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
  private val iucnOrder = setOf(
    "LC", "NT", "VU", "EN", "CR", "EW", "EX", "DD" // order effects sort evaluation
  )
  private val iucnCategoryToIndex = iucnCategoryToIndex()
  private val comparator = compareBy<Woodpecker> {
    iucnCategoryToIndex[it.data.iucnCategory] ?: Int.MAX_VALUE
  }

  @PostConstruct
  fun init() {
    parseHawks()
    val hawks = hawks.sortedWith(comparator).toSet()
    hawks.forEach { hawk ->
      println("${hawk.data.englishBirdName}, ${hawk.data.scientificBirdName}, ${hawk.data.iucnCategory}")
    }
  }

  private fun parseHawks() {
    File("birds.csv").useLines { lines ->
      lines.forEach {
        parseHawk(it)
      }
    }
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

  private fun iucnCategoryToIndex(): Map<String, Int> {
    return iucnOrder.withIndex().associate { it.value to it.index }
  }

  override fun execute(): Set<Woodpecker> {
    return hawks.toSet()
  }
}
