package API_Test.Cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/API_Test/Cucumber/features/Api.feature"},
        glue = {"API_Test.Cucumber.steps"},
        plugin = {"pretty", "html:target/report.html"}
)
public class TestRunner {

}
