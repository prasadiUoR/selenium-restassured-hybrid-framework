package hybrid;

import api.models.Customer;
import api.service.CustomerService;
import base.BaseHybridTest;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.AccountOverview;
import ui.pages.CustomerHomePage;
import ui.pages.LoginPage;
import ui.pages.RegisterPage;
import utils.ConfigReader;
import utils.FakerUtil;

import static org.hamcrest.Matchers.equalTo;

public class CustomerRegistrationHybridTest extends BaseHybridTest {

    @Test
    public void verifyCustomerRegistrationHybrid(){
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.navigateToRegisterPage();

        Customer customer = FakerUtil.buildCustomer();
        RegisterPage registerPage = new RegisterPage(driver,wait);
        CustomerHomePage customerHomePage = registerPage.registerNewCustomer(customer);
        Assert.assertTrue(customerHomePage.isRegistrationSuccessful(),"Customer Registration failed in UI");

        customerHomePage.logOut();
        AccountOverview accountOverview = loginPage.login(customer.getUsername(),customer.getPassword());
        Assert.assertTrue(accountOverview.isLoginSuccessful(),"Customer Login failed in UI");

        ValidatableResponse response = CustomerService.getCustomer(ConfigReader.get("username"), ConfigReader.get("password"));
        response.statusCode(200)
                .body("customer.firstName", equalTo(customer.getFirstName()))
                .body("customer.lastName", equalTo(customer.getLastName()))
                .body("customer.address.city", equalTo(customer.getCity()))
                .body("customer.phoneNumber", equalTo(customer.getPhone()))
                .body("customer.ssn", equalTo("90150"));
    }
}
