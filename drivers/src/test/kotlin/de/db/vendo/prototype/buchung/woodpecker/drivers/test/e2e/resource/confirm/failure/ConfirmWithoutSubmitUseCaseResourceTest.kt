package de.company.prototype.woodpecker.drivers.test.e2e.resource.confirm.failure

import de.company.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NOT_FOUND

@QuarkusTest
class ConfirmWithoutSubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    confirmReq("").statusCode(NOT_FOUND)
  }
}
