
package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforActions {
	@Before
	public static void setUp () {
		SeleniumDriver.setUpDriver();
	}
}
