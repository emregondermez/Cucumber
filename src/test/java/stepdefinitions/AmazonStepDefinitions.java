package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import pages.HMCPage;
import utulities.ConfigReader;
import utulities.Driver;


public class AmazonStepDefinitions {

    AmazonPages amazonPages;
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
        amazonPages = new AmazonPages();
        amazonPages.amazonSearchBox.sendKeys("iPhone", Keys.ENTER);
    }

    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        amazonPages = new AmazonPages();
        String actualResult = amazonPages.amazonSearchResult.getText();
        String expectedResult = "iPhone";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {

        amazonPages = new AmazonPages();
        amazonPages.amazonSearchBox.sendKeys("tea pot", Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        amazonPages = new AmazonPages();
        String actualResult = amazonPages.amazonSearchResult.getText();
        String expectedResult = "tea pot";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPages = new AmazonPages();
        amazonPages.amazonSearchBox.sendKeys("flower", Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        amazonPages = new AmazonPages();
        String actualResult = amazonPages.amazonSearchResult.getText();
        String expectedResult = "flower";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPages = new AmazonPages();
        amazonPages.amazonSearchBox.sendKeys(arananKelime, Keys.ENTER);
    }
    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String aranaKelime) {
        amazonPages = new AmazonPages();
        String actualResult = amazonPages.amazonSearchResult.getText();
        Assert.assertTrue(actualResult.contains(aranaKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }


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
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
    hmcPage=new HMCPage();
    Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isEnabled());
    }

}
