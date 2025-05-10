package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {".//Features\\LoginUser.feature"},
		glue="StepDefinition",
		dryRun = false,
		monochrome = true,
		//		tags = "@Sanity",//scenarios under @sanity tag will be executed
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
		)




public class Runner {

}
