package de.db.vendo.prototype.buchung.reservation.divers.test.e2e.resource.submit

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class SubmitUseCaseResourceTest {
    @Test
    fun testHelloEndpoint() {
        given()
                .`when`().get("/hello")
                .then()
                .statusCode(200)
                .body(equalTo("Hello from RESTEasy Reactive"))
    }
}
