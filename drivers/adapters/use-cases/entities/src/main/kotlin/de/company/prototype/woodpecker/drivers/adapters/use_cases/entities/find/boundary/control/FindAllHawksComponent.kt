package de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.find.boundary.control

import de.company.prototype.woodpecker.common.bce.boundary.control.OutputComponent
import de.company.prototype.woodpecker.drivers.adapters.use_cases.entities.woodpecker.boundary.control.entity.Woodpecker
import jakarta.annotation.PostConstruct
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import java.io.File
import java.math.BigInteger.ZERO

@ApplicationScoped
class FindAllHawksComponent @Inject constructor(
) : OutputComponent<Set<Woodpecker>> {

  private var hawks: Set<Woodpecker> = mutableSetOf()
  private val iucnOrder = setOf(
    "LC", "NT", "VU", "EN", "CR", "EW", "EX", "DD" // order effects sort evaluation
  )
  private val iucnCategoryToIndex = iucnCategoryToIndex()
  private val iucn = compareBy<Woodpecker> {
    iucnCategoryToIndex[it.iucnCategory] ?: ZERO
  }

  @PostConstruct
  fun init() {
    File(javaClass.classLoader.getResource("birds.csv")!!.file).useLines { birds ->
      hawks = parseHawks(birds).sortedWith(iucn).toSet()
      //      println("hawks")
      //      hawks.forEach(out::println)
    }
  }

  private fun parseHawks(birds: Sequence<String>): Set<Woodpecker> =
    birds.mapNotNull { bird ->
      bird.split(";")
        .takeIf { isEagleBuzzardVultureKiteEtc(it[0]) }
        ?.let { pickWoodpecker(it) }
    }.toSet()

  private fun pickWoodpecker(woodpecker: List<String>) =
    Woodpecker(
      birdFamily = woodpecker[0],
      englishBirdName = woodpecker[1],
      scientificBirdName = woodpecker[2],
      iucnCategory = woodpecker[3]
    )

  private fun isEagleBuzzardVultureKiteEtc(woodpecker: String) = woodpecker == "Hawks, eagles"

  private fun iucnCategoryToIndex(): Map<String, Int> {
    return iucnOrder.withIndex().associate { it.value to it.index }
  }

  override fun execute(): Set<Woodpecker> {
    return hawks
  }
}
