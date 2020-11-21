package Utils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/TaniHub.feature"
        ,glue = {"StepDefinition"}
        ,plugin = {"pretty","html:target/Report",
        "json:target/Report/test-report.json"}
)
public class Runner {
}