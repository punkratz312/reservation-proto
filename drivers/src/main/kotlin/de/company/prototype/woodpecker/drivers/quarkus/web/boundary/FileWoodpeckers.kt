package de.company.prototype.woodpecker.drivers.quarkus.web.boundary

import de.company.prototype.woodpecker.common.bce.boundary.FunctionalService
import jakarta.enterprise.context.ApplicationScoped
import java.io.File

@ApplicationScoped
class FileWoodpeckers : FunctionalService<Unit, Set<String>> {

  override fun serve(input: Unit): Set<String> {
    val lineList = mutableListOf<String>()
    File("birds.csv").useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println(">  $it") }
    return lineList.toHashSet()
  }
}
