package de.db.vendo.prototype.buchung

import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import org.hamcrest.CoreMatchers

open class Endpoint {
  fun submit() {
    given()
      .`when`().get("submit")
      .then()
      .statusCode(200)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirm() {
    confirmReq()
      .statusCode(202)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirmReq(): ValidatableResponse {
    return given()
      .`when`().get("submit")
      .then()
  }
}
