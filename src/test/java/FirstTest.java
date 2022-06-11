import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstTest {

    @Test
    public void first()
    {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = given();

        Response response = request.get("/api/users");

        response.then().assertThat()
                .statusCode(200);
    }
}
