package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset.failure

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Disabled
import java.util.*

@QuarkusTest
@Disabled
class ResetWithoutSubmitTest : BDD() {
  override fun then_() {
    reset(UUID.randomUUID().toString())
  }
}
