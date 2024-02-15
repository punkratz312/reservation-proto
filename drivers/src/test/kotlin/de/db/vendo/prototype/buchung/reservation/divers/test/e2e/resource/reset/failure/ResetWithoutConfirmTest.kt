package de.db.vendo.prototype.buchung.reservation.drivers.test.e2e.resource.reset.failure

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest

@QuarkusTest
class ResetWithoutConfirmTest : BDD() {
  override fun then_() {
    resetReq(submit()).statusCode(500)
//    resetReq(submit()).statusCode(PRECONDITION_FAILED)
  }
}
