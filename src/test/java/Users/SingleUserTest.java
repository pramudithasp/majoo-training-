package Users;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SingleUserTest {

    @Test
    public void successGetUsers(ITestContext context)
    {
        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification request = given();

        Response response = request.get("/api/users"+context.getAttribute("id_user"));

        response.then().assertThat().statusCode(200);

        System.out.println(response.asString());
    }
}
