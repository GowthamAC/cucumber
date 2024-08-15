package RestAssured;

import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

class aa {
    public String name= "name1";
    public int phnNo =123;
    public String add = "Bangalore";

    public aa(){

    }
    public aa(String name, String add, int phnNo){
        this.name=name;
    }
}
