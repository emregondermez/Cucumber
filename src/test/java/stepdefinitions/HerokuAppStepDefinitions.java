package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuAppPage;
import utilities.ReusableMethod;


public class HerokuAppStepDefinitions {

    HerokuAppPage herokuappPage = new HerokuAppPage();
    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addButonElement.click();

    }
    @Then("Delete butonu gorununceye kadar bekler")
    public void delete_butonu_gorununceye_kadar_bekler() {

        ReusableMethod.waitForVisibility(herokuappPage.deleteButonElement,20);

    }
    @Then("Delete butonunun gorundgunu test eder")
    public void delete_butonunun_gorundgunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonElement.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonElement.click();

    }
}
