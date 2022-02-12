package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utulities.ConfigReader;

public class HMCStepDefinations {
    HMCPage hmcPage;
    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hmcPage = new HMCPage();
        hmcPage.mainPageLoginLinki.click();
    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String username) {
        hmcPage = new HMCPage();
        hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty(username));


    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        hmcPage = new HMCPage();
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        hmcPage=new HMCPage();
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isEnabled());
    }

    @And("giris yapilamdigini gorur")
    public void girisYapilamdiginiGorur() {

        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isEnabled());
    }


    @And("scenario outline'dan username olarak {string} girer")
    public void scenarioOutlineDanUsernameOlarakGirer(String username) {
        hmcPage = new HMCPage();
        hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scnario outline'dan password olarak {string} girer")
    public void scnarioOutlineDanPasswordOlarakGirer(String password) {
        hmcPage = new HMCPage();
        hmcPage.passwordTextBox.sendKeys(password);
    }
}
