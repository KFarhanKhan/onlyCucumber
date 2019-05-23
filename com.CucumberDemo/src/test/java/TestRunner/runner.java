package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags="@smoke",
		features="C:\\Users\\Farhan\\git\\repository26\\com.CucumberDemo\\src\\test\\resources\\Feature",
	    plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		glue="StepDefinition",
		dryRun= false
		
		
		
		
		)

public class runner {

}
