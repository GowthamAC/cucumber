package RestAssured;

import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

class aa {
   aa(){
       System.out.println("1st class");
   }
}
class bb extends aa{
    bb(){
        System.out.println("2nd class");
    }
}
class cc extends bb{
    cc(){
        super();
        System.out.println("3rd class");
    }

    public static void main(String[] args) {
        cc obj = new cc();

    }
}