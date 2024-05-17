package API_Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class MyTestClass {


    @Test
    public void test() {
        File body =new File("src/test/resources/data.json");

        HashMap<String , String> bodyH = new HashMap<>();
        bodyH.put("email","hatem@example.com");
        bodyH.put("password","123456");

        Response res = given().baseUri("https://todo.qacart.com/api/v1")
                .contentType(ContentType.JSON)
                .body(bodyH)
                .log().all()
                . when().post("/students/login")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .extract().response();
        System.out.println(res.asString());
    }
}
