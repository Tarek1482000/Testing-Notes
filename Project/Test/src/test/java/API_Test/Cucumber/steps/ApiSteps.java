package API_Test.Cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApiSteps {

    private final String URL = "https://www.boredapi.com/api";
    private Response response;

    @Given("GET API")
    public void get_bored_api() {
        RestAssured.baseURI = URL;
    }

    @When("I request a random activity from the API")
    public void i_request_a_random_activity_from_the_bored_api() {
        response = RestAssured.given().get("/activity");
    }

    @Then("The response status code should be {int}")
    public void the_response_status_code_should_be(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Then("The response should contain an activity")
    public void the_response_should_contain_an_activity() {
        String activity = response.jsonPath().getString("activity");
        assertNotNull(activity, "The response does not contain an activity");
    }

    @Then("The response should contain a type")
    public void the_response_should_contain_a_type() {
        String type = response.jsonPath().getString("type");
        assertNotNull(type, "The response does not contain a type");
    }

    @Then("The response should contain participants")
    public void the_response_should_contain_participants() {
        Integer participants = response.jsonPath().getInt("participants");
        assertNotNull(participants, "The response does not contain participants");
    }

    @Then("The response should contain a price")
    public void the_response_should_contain_a_price() {
        Float price = response.jsonPath().getFloat("price");
        assertNotNull(price, "The response does not contain a price");
    }

    @Then("The response should contain a key")
    public void the_response_should_contain_a_key() {
        String key = response.jsonPath().getString("key");
        assertNotNull(key, "The response does not contain a key");
    }

    @Then("The response should contain accessibility")
    public void the_response_should_contain_accessibility() {
        Float accessibility = response.jsonPath().getFloat("accessibility");
        assertNotNull(accessibility, "The response does not contain accessibility");
    }
}
