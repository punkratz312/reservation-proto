package de.db.vendo.prototype.buchung.reservation.drivers.test.e2e.resource.submit

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest

@QuarkusTest
class SubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    submit()
  }
}
