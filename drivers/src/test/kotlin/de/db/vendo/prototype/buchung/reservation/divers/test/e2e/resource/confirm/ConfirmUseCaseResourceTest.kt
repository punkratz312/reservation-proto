package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.confirm

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest

@QuarkusTest
class ConfirmUseCaseResourceTest : BDD() {
  override fun then_() {
    val id = submit()
    confirm(id)
  }
}
