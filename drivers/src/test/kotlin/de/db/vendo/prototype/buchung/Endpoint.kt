package de.db.vendo.prototype.buchung

import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import org.hamcrest.CoreMatchers
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT

open class Endpoint {

  init {
    enableLoggingOfRequestAndResponseIfValidationFails()
  }

  fun submit() {
    given()
      .`when`().put("submit")
      .then()
      .statusCode(NO_CONTENT)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirm() {
    confirmReq()
      .statusCode(NO_CONTENT)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirmReq(): ValidatableResponse {
    return given()
      .`when`().put("submit")
      .then()
  }
}
