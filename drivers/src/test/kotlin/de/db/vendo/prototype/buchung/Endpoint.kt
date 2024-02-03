package de.db.vendo.prototype.buchung

import io.restassured.RestAssured
import org.hamcrest.CoreMatchers

open class Endpoint {
  fun submit() {
    RestAssured.given()
      .`when`().get("submit")
      .then()
      .statusCode(200)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }

  fun confirm() {
    RestAssured.given()
      .`when`().get("submit")
      .then()
      .statusCode(200)
      .body(CoreMatchers.equalTo("Hello from RESTEasy Reactive"))
  }
}
