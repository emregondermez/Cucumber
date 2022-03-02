package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitions {

    String firstname;
    EditorPage editorPage;
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage = new EditorPage();
        editorPage.newButton.click();
    }
    @Then("firstname kutusuna {string} girer")
    public void firstname_kutusuna_girer(String firstname) {
        this.firstname=firstname;
        editorPage = new EditorPage();
        editorPage.firstnameBox.sendKeys(firstname);
    }
    @Then("lastname kutusuna {string} girer")
    public void lastname_kutusuna_girer(String lastname) {
        editorPage = new EditorPage();
        editorPage.lastnameBox.sendKeys(lastname);
    }
    @Then("position kutusuna {string} girer")
    public void position_kutusuna_girer(String position) {
        editorPage = new EditorPage();
        editorPage.positionBox.sendKeys(position);
    }
    @Then("office kutusuna {string} girer")
    public void office_kutusuna_girer(String officeName) {
        editorPage = new EditorPage();
        editorPage.officeBox.sendKeys(officeName);
    }
    @Then("extesion kutusuna {string} girer")
    public void extesion_kutusuna_girer(String extension) {
        editorPage = new EditorPage();
        editorPage.extensionBox.sendKeys(extension);
    }
    @Then("start date kutusuna {string} girer")
    public void start_date_kutusuna_girer(String startDate) {
        editorPage = new EditorPage();
        editorPage.startDateBox.sendKeys(startDate);
    }
    @Then("salary kutusuna {string} girer")
    public void salary_kutusuna_girer(String salary) {
        editorPage = new EditorPage();
        editorPage.salaryBox.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage = new EditorPage();
        editorPage.createButton.click();
    }

    @When("kullanici {string} isim ile arama yapar")
    public void kullaniciIsimIleAramaYapar(String firstname) {
       this.firstname=firstname;
        editorPage = new EditorPage();
        editorPage.editorSearchBox.sendKeys(firstname, Keys.ENTER);
    }


    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        editorPage = new EditorPage();
        Assert.assertTrue(editorPage.editorSearchResult.getText().contains(firstname));

    }


}
