package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;
	
	public  CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToBuyAndSellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carsForBuyAndSellLink).build().perform();
	}
	
	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsedMenu() {
		carsGuideHomePageLocators.usedCarsLink.click();
	}
	
	public void clickOnSellMyCarMenu() {
		carsGuideHomePageLocators.sellMyCarLink.click();
	}
}
