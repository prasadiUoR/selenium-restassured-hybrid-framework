package api;

import api.service.CustomerService;
import base.BaseAPITest;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import utils.ConfigReader;

import static org.hamcrest.Matchers.equalTo;

public class LoginAPITest extends BaseAPITest {

    @Test
    public void testLoginAPI() {
        ValidatableResponse response = CustomerService.getCustomer(ConfigReader.get("username"), ConfigReader.get("password"));

        response.statusCode(200)
                .body("customer.ssn", equalTo("90150"));
    }
}
