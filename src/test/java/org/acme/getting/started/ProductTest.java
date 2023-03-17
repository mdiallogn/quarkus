package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ProductTest {
    @Test
    public void helloEasyRestApi() {

        given()
                .when()
                    .get("/api/v1/product")
                .then()
                .statusCode(200)
                .body(is("Hello Easy REST API"));
    }
}