package API_Test.assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestAssured {

    private Response response;

    @BeforeTest
    public void setup() {
        // Store the response before the tests
        response = given()
                .baseUri("https://www.boredapi.com/api")
                .when()
                .get("/activity")
                .then()
                .extract()
                .response();
    }

    @Test
    public void testStatusCode() {
        // Check the status code
        response.then().statusCode(200);
    }

    @Test()
    public void testResponseBody() {
        // Validate the response body
        response.then()
                .body("size()", greaterThan(0))  // Ensure that the list is not empty
                .body("[0].activity", notNullValue())  // Ensure the first user has an activity
                .body("[0].type", notNullValue()) // Ensure the first user has a type
                .body("[0].participants", notNullValue())  // Ensure the first user has a participants
                .body("[0].price", notNullValue()) // Ensure the first user has a price
                .body("[0].link", notNullValue())  // Ensure the first user has a link
                .body("[0].key", notNullValue()) // Ensure the first user has a key
                .body("[0].accessibility", notNullValue()); // Ensure the first user has an accessibility

        // Print the response for debugging purposes
        System.out.println(response.asString());
    }
}
