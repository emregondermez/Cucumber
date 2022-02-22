package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports3.html",
                "json:target/json-reports/Pcucumber3.json",
                "junit:target/xml-report/Pcucumber3.xml"},
        features ="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@hotel",
        dryRun = false
)
public class ParalelTestRunner3 {
}
