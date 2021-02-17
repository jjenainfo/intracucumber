package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features=".//Features/login.feature",
			glue= {"stepDefination"},
			dryRun= false,
			monochrome=true,
			plugin= {"pretty","html:target/cucumber-test-output"}
	 
			)
	public class TestRunner_001 {

}
