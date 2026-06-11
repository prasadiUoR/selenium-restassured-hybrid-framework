package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{


    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement txtUserName;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value=\"Log In\"]")
    WebElement loginButton;

    @FindBy(linkText = "Register")
    WebElement lnkRegister;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToRegisterPage() {
        lnkRegister.click();
    }

    public void setUserName(String username){
        txtUserName.sendKeys(username);
    }

    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }

    public AccountOverview login(String username,
                                 String password) {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
        loginButton.click();

        return new AccountOverview(driver, wait);
    }

}
