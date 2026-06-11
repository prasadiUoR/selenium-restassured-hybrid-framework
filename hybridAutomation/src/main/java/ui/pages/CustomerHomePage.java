package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerHomePage extends BasePage{


    @FindBy(xpath = "//p[contains(text(),\"Your account was created successfully.\")]")
    WebElement successMessage;

    @FindBy(linkText = "Log Out")
    WebElement lnkLogOut;

    public CustomerHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isRegistrationSuccessful() {

        return wait.until(
                        ExpectedConditions.visibilityOf(successMessage))
                .isDisplayed();
    }

    public void logOut(){
        lnkLogOut.click();
    }
}
