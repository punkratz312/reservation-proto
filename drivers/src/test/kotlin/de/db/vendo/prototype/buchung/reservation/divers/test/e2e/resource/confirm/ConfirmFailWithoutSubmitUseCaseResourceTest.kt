package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.confirm

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo

@QuarkusTest
class ConfirmFailWithoutSubmitUseCaseResourceTest : BDD() {
  override fun then_() {
    given()
            .`when`().get("confirm")
            .then()
            .statusCode(400)
            .body(equalTo("Hello from RESTEasy Reactive"))
  }
}
