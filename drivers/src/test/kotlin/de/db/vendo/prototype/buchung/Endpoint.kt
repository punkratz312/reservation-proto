package de.db.vendo.prototype.buchung

import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON
import org.hamcrest.CoreMatchers.notNullValue
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT

open class Endpoint {

  init {
    enableLoggingOfRequestAndResponseIfValidationFails()
  }

  fun submit(): String {
    return given_()
      .`when`()
      .put("submit")
      .then()
      .statusCode(NO_CONTENT)
      .body(notNullValue())
      .extract()
      .body()
      .asString()
//      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirm(id: String) {
    confirmReq(id)
      .statusCode(NO_CONTENT)
//      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirmReq(id: String): ValidatableResponse {
    return given_()
      .pathParam("id", id)
      .`when`()
      .put("confirm")
      .then()
  }

  private fun given_(): RequestSpecification {
    return given().contentType(APPLICATION_JSON)
  }
}
