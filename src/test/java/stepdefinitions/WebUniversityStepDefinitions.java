package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class WebUniversityStepDefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();


    @Given("Login Portal'a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {

    }
    @Given("{int} saniye bekler")
    public void saniye_bekler(Integer int1) {
    ReusableMethods.waitFor(int1);
    }
    @Given("Login Portal'a  tiklar")
    public void login_portal_a_tiklar() {
    webUniversityPage.loginPortalButton.click();
    }
    @Then("acilan Diger window'a gecer")
    public void acilan_diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");

    }
    @Then("{string} ve  {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String username, String password) {
        webUniversityPage.usernameTextBox.sendKeys(username);
        webUniversityPage.passwordTextBox.sendKeys(password);

    }
    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
        webUniversityPage.loginButton.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String expectedAlertMessage) {
     String actualAlertMessage=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertMessage,expectedAlertMessage);

    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.contactUsButton.isEnabled());
    }

}
