package tests;

import dto.LoginRequest;
import dto.LoginResponse;
import dto.SuccessLoginResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static tests.BaseTest.postRequest;

public class LoginTest {

    @Test
    public void successLogin(){

        String email = "johnsmith@gmail.com";
        String password = "qwerty070709";

        LoginRequest loginRequest = new LoginRequest("johnsmith@gmail.com", "qwerty070709");

        LoginResponse loginResponse = new LoginResponse("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyNDdlZS1jYzJlLTRkZjktYjBjNS03ZmIwM2I0MzRkZjkiLCJyb2xlIjoiVVNFUiIsImV4cCI6MTcyNTUyNzU5NH0.pDJvlCTHr7HC34LgjYxME-3f5ZKysutWil23J7jMMh4", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyNDdlZS1jYzJlLTRkZjktYjBjNS03ZmIwM2I0MzRkZjkiLCJpYXQiOjE3MjU1MjcyOTQsImV4cCI6MTcyNTcwMDA5NH0.PNDkQirOyD2KV9yBYz1dNSxybMd2f9sAHue3Y98kRO8", "1725527594");


        Response response = postRequest("api/auth/login", 200, loginRequest);



        assertFalse(loginResponse.getAccessToken().isEmpty());



       // SuccessLoginResponse response =
               // given().baseUri("http://chatty.telran-edu.de:8989/swagger-ui/index.html#/")
                       // .when().log().all()
                       // .post("api/auth/login")
                        //.then().log().all().statusCode(200).extract().body()
                        //.jsonPath().getObject("", SuccessLoginResponse.class);

        //String token = response.jsonPath().getString("token");
    }
}
