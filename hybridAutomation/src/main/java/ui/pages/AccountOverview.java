package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOverview extends BasePage{
    public AccountOverview(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//h1[normalize-space()=\"Accounts Overview\"]")
    WebElement pageTitle;

    public boolean isLoginSuccessful() {

        return wait.until(
                        ExpectedConditions.visibilityOf(pageTitle))
                .isDisplayed();
    }
}
