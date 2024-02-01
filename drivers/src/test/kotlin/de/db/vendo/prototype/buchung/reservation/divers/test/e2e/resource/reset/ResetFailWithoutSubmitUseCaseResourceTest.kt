package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo

@QuarkusTest
class ResetFailWithoutSubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    given()
            .`when`().get("reset")
            .then()
            .statusCode(400)
            .body(equalTo("Hello from RESTEasy Reactive"))
  }
}
