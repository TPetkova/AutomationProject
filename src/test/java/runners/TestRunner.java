package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepdefinitions.BaseSteps;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = {"stepdefinitions", "helpers"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
