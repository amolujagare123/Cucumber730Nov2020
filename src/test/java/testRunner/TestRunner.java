package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "Features" , glue = "stepdefinitions"
        /*, tags = "@mulipleInput"*/
, plugin = {/*"pretty",*/"html:target/cucumber/report.html"}
,dryRun = true
)

public class TestRunner {
}
