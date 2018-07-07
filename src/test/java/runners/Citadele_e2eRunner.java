package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"pretty", "html:citadele_e2e-report/html-report",
                "junit:citadele_e2e-report/junit-report.xml",
                "json:citadele_e2e-report/json-report.json"},
        tags = {"@CitadeleFeature"},
        glue = {"stepDefinitions"}
)
public class Citadele_e2eRunner {

}
