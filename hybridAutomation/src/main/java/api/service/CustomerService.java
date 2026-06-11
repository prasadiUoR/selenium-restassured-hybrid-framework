package api.service;

import api.specs.RequestSpecs;
import api.specs.ResponseSpecs;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CustomerService {

    public static ValidatableResponse getCustomer(String username, String password) {

        return given()
                .spec(RequestSpecs.getRequestSpec())
                .when()
                .get("/parabank/services/bank/login/" + username + "/"+ password)
                .then().spec(ResponseSpecs.getResponseSpec());

    }
}
