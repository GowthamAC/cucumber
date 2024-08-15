package RestAssured;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import static io.restassured.RestAssured.*;
public class start_RestAssured {

    @Test
    public void get(){

//        Cookie cookie = new Cookie("abc", "tyrfydqwv");

        JSONObject obj = new JSONObject();
        obj.put("name", "morpheus");
        obj.put("job", "leader");

        Response response = given().body(obj)
                .when().post("https://reqres.in/api/users");

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

        String responseBody = response.asString();
        Object id_01 = response.jsonPath().get("id");

//        System.out.println(response.contentType());

        System.out.println(id_01);

        Assert.assertEquals(statusCode, 201);

    }
}
