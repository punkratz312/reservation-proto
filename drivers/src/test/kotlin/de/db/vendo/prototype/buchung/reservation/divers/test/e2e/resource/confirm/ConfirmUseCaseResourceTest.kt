package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.confirm

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Disabled

@QuarkusTest
@Disabled
class ConfirmUseCaseResourceTest : BDD() {
  override fun when_() {
    submit()
  }

  override fun then_() {
    confirm()
  }
}
