package ui;

import base.BaseUITest;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.pages.AccountOverview;
import ui.pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseUITest {

    @Test
    public void verifyLogin(){
        LoginPage loginPage = new LoginPage(driver,wait);
        AccountOverview accountOverview = loginPage.login(ConfigReader.get("username"),ConfigReader.get("password"));
        Assert.assertTrue(accountOverview.isLoginSuccessful(),"Customer Login failed in UI");

    }
}
