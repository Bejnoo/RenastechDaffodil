package code;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class POSTToken {

    String baseUrl = RestAssured.baseURI = "https://simple-books-api.glitch.me";

    @Test
    (description = "User want to get token")
    void token(){
        System.out.println(utils.bearerToken());
    }


}
