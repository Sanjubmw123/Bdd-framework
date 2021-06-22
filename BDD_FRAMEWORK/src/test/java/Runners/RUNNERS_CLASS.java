package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\Features" , glue = { "Steps" },
tags= {"@smoke ,@Regression"},
dryRun= false,
strict=false,
monochrome = true,
plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}

)

public class RUNNERS_CLASS {
	

}
