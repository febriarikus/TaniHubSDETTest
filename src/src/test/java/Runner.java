import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber-parallel/report.json","pretty"},
        features = {
                "src/test/resources/features/UIAutomation.feature"
        })
public class Runner {}

