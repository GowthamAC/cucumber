package RestAssured;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
public class get {

    @Test
    public  void m1(){

//        Response response = when().get("https://reqres.in/api/users?page=2");
//        String response_body = response.asString();
//        System.out.println(response_body);
//        Object value = response.jsonPath().get("data[2].first_name");
//        System.out.println(value);
        Response response = given().queryParam("page","2")
                .when().get("https://reqres.in/api/users");
        String response_body = response.asString();
        System.out.println(response_body);
        List<Object> ids = response.jsonPath().getList("data.id");
        System.out.println(ids);
    }
}
