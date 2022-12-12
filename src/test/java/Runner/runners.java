package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "StepDefinitions",
        plugin = { "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cukes.xml",
        "rerun:target/rerun.txt"},

        dryRun = false,
        tags = "@smoke"
)
public class runners extends AbstractTestNGCucumberTests {
}