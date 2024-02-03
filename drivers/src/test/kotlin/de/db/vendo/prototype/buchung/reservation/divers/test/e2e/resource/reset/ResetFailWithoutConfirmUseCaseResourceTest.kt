package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.reset

import de.db.vendo.prototype.buchung.BDD
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Disabled

@QuarkusTest
@Disabled
class ResetFailWithoutConfirmUseCaseResourceTest : BDD() {
  override fun when_() {
    given()
      .`when`().get("submit")
      .then()
      .statusCode(200)
      .body(equalTo("Hello from RESTEasy Reactive"))
  }

  override fun then_() {
    given()
      .`when`().get("reset")
      .then()
      .statusCode(400)
      .body(equalTo("Hello from RESTEasy Reactive"))
  }
}
