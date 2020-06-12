package runner;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Extent-Reports/report.html"},
			features = "src/test/resources/features/",
			glue = "steps",
			tags = {"@Search-Cars"}
)
public class RunCuke extends  AbstractTestNGCucumberTests{

	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
    }
}
