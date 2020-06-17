package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarSearchPageLocators usedCarSearchPageLocators= null;
	
	public UsedCarsSearchPageActions() {
		this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(usedCarSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(usedCarSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	
	public void selectLocation(String location) {
		Select selectCarModel = new Select(usedCarSearchPageLocators.selectLocationDropDown);
		selectCarModel.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarModel = new Select(usedCarSearchPageLocators.priceDropDown);
		selectCarModel.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarButton() {
		usedCarSearchPageLocators.findMyNextCarBtn.click();
	}

}
