import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTests {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    void getRequestTest() {

        given()
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    void postRawTextTest() {

        given()
                .contentType("application/json")
                .body("{\"test\":\"value\"}")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.test", equalTo("value"));
    }

    @Test
    void postFormDataTest() {

        given()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    void putRequestTest() {

        given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    void patchRequestTest() {

        given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    void deleteRequestTest() {

        given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}