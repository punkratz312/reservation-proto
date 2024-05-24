package de.company.prototype.woodpecker.drivers.test.e2e.resource.find

import de.company.prototype.woodpecker.BDD
import io.quarkus.test.junit.QuarkusTest
import org.hamcrest.CoreMatchers.hasItems
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NOT_FOUND

@QuarkusTest
class ConfirmWithoutSubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    findReq("").statusCode(NOT_FOUND)
      .body("$", hasItems(1, 2, 3))
  }
}
