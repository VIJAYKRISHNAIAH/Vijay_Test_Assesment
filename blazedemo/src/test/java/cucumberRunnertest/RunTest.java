package cucumberRunnertest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "reports/JASON/cucumber.json",
		overviewReport = true, //default false;
		detailedReport = true, // default false;
		toPDF = true, // default false;
		featureOverviewChart = true, // default false;
		outputFolder = "reports")

@CucumberOptions(
plugin = { 
		"html:reports/HTML/",
		"json:reports/JASON/cucumber.json", 
		"pretty:reports/TEXT/cucumber-pretty.txt",
		"usage:reports/USAGE/cucumber-usage.json", 
		"junit:reports/JUNIT/cucumber-results.xml"},


		features = { "src/test/resources/Featurefile"},
         glue = { "com.blazedemo.blazedemo.stepdefs" })


public class RunTest {

}
