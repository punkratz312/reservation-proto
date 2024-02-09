package de.db.vendo.prototype.buchung

import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON
import org.hamcrest.CoreMatchers.notNullValue
import org.jboss.resteasy.reactive.RestResponse.StatusCode.NO_CONTENT
import org.jboss.resteasy.reactive.RestResponse.StatusCode.OK
import java.util.UUID.randomUUID

open class Endpoint {

  init {
    enableLoggingOfRequestAndResponseIfValidationFails()
  }


  fun submit(): String {
    return given_()
      .body("""
      {
        "id": "${randomUUID()}",
        "name": "${randomUUID()}",
        "type": "${randomUUID()}"
      }
      """)
      .`when`()
      .put("submit")
      .then()
      .statusCode(OK)
      .body(notNullValue())
      .extract()
      .body()
      .asString()
  }

  fun confirm(input: String) {
    confirmReq(input)
      .statusCode(NO_CONTENT)
  }

  fun reset(input: String) {
    resetReq(input)
      .statusCode(NO_CONTENT)
  }

  fun confirmReq(id: String): ValidatableResponse {
    return given_()
      .pathParam("id", id)
      .`when`()
      .put("confirm/{id}")
      .then()
  }

  fun resetReq(id: String): ValidatableResponse {
    return given_()
      .pathParam("id", id)
      .`when`()
      .put("reset/{id}")
      .then()
  }

  private fun given_(): RequestSpecification {
    return given().contentType(APPLICATION_JSON)
  }
}
