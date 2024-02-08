package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.confirm

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NOT_FOUND

@QuarkusTest
class ConfirmFailWithoutSubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    confirmReq("").statusCode(NOT_FOUND)
  }
}
