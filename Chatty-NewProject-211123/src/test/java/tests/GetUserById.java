package tests;

import dto.UserData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static tests.BaseTest.getRequest;

public class GetUserById {

    @Test
    public void validUserDataTest(){

        //60d0fe4f5311236168a109da
        //get user by id, log all from response
        String requestedId = "1fd247ee-cc2e-4df9-b0c5-7fb03b434df9";

        //System.out.println(user.getId());

        Response response = getRequest("user/" + requestedId, 200 );
        UserData user = response.body().jsonPath().getObject("", UserData.class);
        System.out.println(user.getId());


        //extract data from response json to instance of UserData class

        //Check that all fields are NOT empty

        //assertFalse(user.getId().isEmpty());
        //assertFalse(user.getEmail().isEmpty());
        //assertFalse(user.getFirstName().isEmpty());
        //assertFalse(user.getLastName().isEmpty());
        //assertFalse(user.getRegisterDate().isEmpty());
        //assertFalse(user.getUpdatedDate().isEmpty());
    }
}
