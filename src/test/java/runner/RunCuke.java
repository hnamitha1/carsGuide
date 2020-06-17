package runner;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent-Reports/report.html"},
		   features = "src/test/resources/features/",
			glue = "steps",
			 tags = {"@Search-Cars, @Used-Car-Search"} 
)
public class RunCuke extends  AbstractTestNGCucumberTests{
	// plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Extent-Reports/report.html"},
				
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
    }
}
