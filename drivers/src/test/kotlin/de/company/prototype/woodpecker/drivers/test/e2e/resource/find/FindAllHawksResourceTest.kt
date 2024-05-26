package de.company.prototype.woodpecker.drivers.test.e2e.resource.find

import de.company.prototype.woodpecker.BDD
import io.quarkus.test.junit.QuarkusTest
import io.restassured.response.ValidatableResponse
import org.hamcrest.CoreMatchers.equalTo
import org.jboss.resteasy.reactive.RestResponse.StatusCode.OK

@QuarkusTest
class FindAllHawksResourceTest : BDD() {

  private lateinit var response: ValidatableResponse

  override fun when_() {
    response = findAllHawks().statusCode(OK)
  }

  override fun then_() {
    response
      .body("size", equalTo(249))
      .body("hawks[0].iucnCategory", equalTo("LC"))
      .body("hawks[0].englishBirdName", equalTo("Black-winged Kite"))
      .body("hawks[1].iucnCategory", equalTo("LC"))
      .body("hawks[1].englishBirdName", equalTo("Black-shouldered Kite"))
      .body("hawks[2].iucnCategory", equalTo("LC"))
      .body("hawks[2].englishBirdName", equalTo("White-tailed Kite"))
      .body("hawks[248].iucnCategory", equalTo("DD"))
      .body("hawks[248].englishBirdName", equalTo("Chestnut-shouldered Goshawk"))
    println(response.extract().body().asPrettyString())
  }
}
