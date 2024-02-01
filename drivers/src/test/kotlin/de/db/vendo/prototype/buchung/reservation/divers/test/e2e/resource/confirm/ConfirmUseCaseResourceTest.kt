package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.confirm

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo

@QuarkusTest
class ConfirmUseCaseResourceTest : BDD() {
  override fun when_() {
    given()
            .`when`().get("submit")
            .then()
            .statusCode(200)
            .body(equalTo("Hello from RESTEasy Reactive"))
  }

  override fun then_() {
    given()
            .`when`().get("confirm")
            .then()
            .statusCode(200)
            .body(equalTo("Hello from RESTEasy Reactive"))
  }
}
