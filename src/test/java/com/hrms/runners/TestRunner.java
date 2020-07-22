package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/SauceDemoLoginWithDataTable.feature", //specify which feature file to run
		glue="com/hrms/steps", //where we can find implementation code for gherkin steps?
					//we specify just package
		dryRun=false, //if set to true it will quickly scan that all gherkin steps have implementation code
					// if set to true no actual execution will happen
		monochrome = true
		,strict=true
		,tags= "@reporting"
		,plugin= {
				"pretty",
				"rerun:target/failed.txt"
		}
		)



public class TestRunner {

}
