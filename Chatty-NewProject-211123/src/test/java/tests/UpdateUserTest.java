package tests;

import com.github.javafaker.Faker;
import dto.UpdateUserRequest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static tests.BaseTest.postRequest;
import static tests.BaseTest.putRequest;

public class UpdateUserTest {
    Faker faker = new Faker();

    @Test
    public void updateEmail() {
        //4. Change Email

        //1. Create new user

        String userEmail = faker.internet().emailAddress();
        String userFirstName = faker.name().firstName();
        String userLastName = faker.name().lastName();
        String gender = "male";
        String tittle = "mr";
        String phone = "+49123456";


    }
}

