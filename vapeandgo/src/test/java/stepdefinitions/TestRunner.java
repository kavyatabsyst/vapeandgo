package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",                     // Path to your feature files folder
    glue = "stepdefinitions",                                // Package containing step definitions
    plugin = { "pretty", "html:target/cucumber-reports.html" }, // Generates pretty and HTML reports
    monochrome = true                                        // Improves console output readability
)
public class TestRunner {
    // This class is used as an entry point for running Cucumber tests
}
