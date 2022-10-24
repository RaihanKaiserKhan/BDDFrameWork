package homeRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "@multiData",
				features = { "features" },
	//	glue is adding theses packages into the test so that the test run
    // with out base package(Hook and BaseClass) the test will not run(Steps) 
				glue = { "base","stepsDefinationHome" },  
// dry run true will check if every steps have appropriate step methods without running the code
				dryRun = false, 
				
				monochrome = true,   //removing special character
				// preety will tell how the reporter will look like
				plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"}
				)
public class HomeRunner {

	
	
}
