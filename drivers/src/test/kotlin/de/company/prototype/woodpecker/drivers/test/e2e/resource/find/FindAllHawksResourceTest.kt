package de.company.prototype.woodpecker.drivers.test.e2e.resource.find

import de.company.prototype.woodpecker.BDD
import io.quarkus.test.junit.QuarkusTest
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.jboss.resteasy.reactive.RestResponse.StatusCode.OK

@QuarkusTest
class FindAllHawksResourceTest : BDD() {
  override fun then_() {
    findAllHawks()
      .statusCode(OK)
      .body("size", equalTo(249))
      .body("hawks", notNullValue())
  }
}
