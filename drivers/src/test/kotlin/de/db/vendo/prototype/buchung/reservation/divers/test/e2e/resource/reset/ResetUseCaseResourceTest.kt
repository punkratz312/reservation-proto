package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest

@QuarkusTest
class ResetUseCaseResourceTest : BDD() {
  override fun then_() {
    submit().let {
      confirm(it)
      reset(it)
    }
  }
}
