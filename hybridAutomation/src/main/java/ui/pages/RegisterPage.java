package ui.pages;


import api.models.Customer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RegisterPage extends BasePage{

    @FindBy(id = "customer.firstName")
    WebElement txtFirstName;

    @FindBy(id="customer.lastName")
    WebElement txtLastName;

    @FindBy(id="customer.address.street")
    WebElement txtAddress;

    @FindBy(id="customer.address.city")
    WebElement txtCity;

    @FindBy(id="customer.address.state")
    WebElement txtState;

    @FindBy(id="customer.address.zipCode")
    WebElement txtZipCode;

    @FindBy(id="customer.phoneNumber")
    WebElement txtPhone;

    @FindBy(id="customer.ssn")
    WebElement txtSSN;

    @FindBy(id="customer.username")
    WebElement txtUsername;

    @FindBy(id="customer.password")
    WebElement txtPassword;

    @FindBy(id="repeatedPassword")
    WebElement txtConfirm;

    @FindBy(xpath = "//input[@value=\"Register\"]")
    WebElement registerButton;

    @FindBy(className = "error")
    List<WebElement> errorMessages;

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public CustomerHomePage registerNewCustomer(Customer customer){
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        txtFirstName.sendKeys(customer.getFirstName());
        txtLastName.sendKeys(customer.getLastName());
        txtAddress.sendKeys(customer.getAddress());
        txtCity.sendKeys(customer.getCity());
        txtState.sendKeys(customer.getState());
        txtZipCode.sendKeys(customer.getZipCode());
        txtPhone.sendKeys(customer.getPhone());
        txtSSN.sendKeys(customer.getSsn());
        txtUsername.sendKeys(customer.getUsername());
        txtPassword.sendKeys(customer.getPassword());
        txtConfirm.sendKeys(customer.getRepeatedPassword());
        registerButton.click();
        return new CustomerHomePage(driver,wait);


    }

}
