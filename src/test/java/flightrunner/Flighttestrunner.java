package flightrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/Jyothiaddala/Documents/JavaTraining/CucumberBDD/src/main/java/com/qa/features/easyjet.feature",
		glue = {"easyjetstepdefs"},
		format = {"pretty","html:test-outout"},
		monochrome = true, 
		strict = true,
		dryRun = false
		)

public class Flighttestrunner {

}
