package de.company.prototype.woodpecker

import io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails
import io.restassured.RestAssured.given
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification
import jakarta.ws.rs.core.MediaType.APPLICATION_JSON
import org.hamcrest.CoreMatchers.notNullValue
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

  fun findAllHawks(): ValidatableResponse {
    return given_()
      .`when`()
      .get("woodpeckers/findAllHawks")
      .then()
  }


  private fun given_(): RequestSpecification {
    return given().contentType(APPLICATION_JSON)
  }
}
