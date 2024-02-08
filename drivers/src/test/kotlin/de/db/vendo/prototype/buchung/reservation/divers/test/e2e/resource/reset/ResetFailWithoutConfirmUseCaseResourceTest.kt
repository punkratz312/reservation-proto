package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Disabled

@QuarkusTest
@Disabled
class ResetFailWithoutConfirmUseCaseResourceTest : BDD() {
  override fun when_() {

  }

  override fun then_() {
    submit().let {
      confirm(it)
      reset(it)
    }
  }
}
