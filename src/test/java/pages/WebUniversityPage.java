package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[normalize-space()='LOGIN PORTAL']")
    public WebElement loginPortalButton;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[normalize-space()='CONTACT US']")
    public WebElement contactUsButton;


}
