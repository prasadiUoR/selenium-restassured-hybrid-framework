package ui;

import api.models.Customer;
import base.BaseUITest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.CustomerHomePage;
import ui.pages.LoginPage;
import ui.pages.RegisterPage;
import utils.FakerUtil;

public class CustomerRegistrationTest extends BaseUITest {

    @Test
    public void verifyCustomerRegistration(){
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.navigateToRegisterPage();

        Customer customer = FakerUtil.buildCustomer();
        RegisterPage registerPage = new RegisterPage(driver,wait);
        CustomerHomePage customerHomePage = registerPage.registerNewCustomer(customer);
        Assert.assertTrue(customerHomePage.isRegistrationSuccessful(),"Customer Registration failed in UI");
    }


}
