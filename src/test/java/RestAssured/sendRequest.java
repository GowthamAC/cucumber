package RestAssured;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.annotation.meta.When;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import  static io.restassured.RestAssured.*;

public class sendRequest {

    @Test
    public void m1(){

        SoftAssert sAssert =new SoftAssert();
        File file = new File("./src/test/resources/post.json");
        Response response = given().body(file)
                .when().post("https://reqres.in/api/users");

        Headers allHeaders = response.getHeaders();
        System.out.println(allHeaders);
        String responseBody = response.asString();
        System.out.println(responseBody);
        int statusCode = response.getStatusCode();
        sAssert.assertEquals(statusCode, 201, "Status code is not proper");
        long responseTime = response.getTime();
        System.out.println(responseTime);
        sAssert.assertTrue(responseTime<2000, "Response time not match");
        String name =response.jsonPath().getString("name");
        sAssert.assertEquals(name, "morpheus", "data in response is not match");
    }

}
