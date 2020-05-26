package calculator;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/report"},
        glue = "calculator.stepdefinitions",
        features = "src/test/resources/calculator/features"
)
public class RunCucumberTest {
}
