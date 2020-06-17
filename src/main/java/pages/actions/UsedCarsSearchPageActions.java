package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarSearchPageLocators usedCarSearchPageLocators= null;
	
	public UsedCarsSearchPageActions() {
		this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

}
