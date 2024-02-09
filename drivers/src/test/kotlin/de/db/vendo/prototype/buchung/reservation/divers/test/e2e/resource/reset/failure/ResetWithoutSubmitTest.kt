package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset.failure

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NOT_FOUND
import java.util.UUID.randomUUID

@QuarkusTest
class ResetWithoutSubmitTest : BDD() {
  override fun then_() {
    resetReq(randomUUID().toString()).statusCode(NOT_FOUND)
  }
}
