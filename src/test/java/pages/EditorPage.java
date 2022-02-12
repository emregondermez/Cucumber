package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class EditorPage {
    public EditorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='New']")
    public WebElement newButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeBox;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extensionBox;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryBox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement editorSearchBox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement editorSearchResult;



}
