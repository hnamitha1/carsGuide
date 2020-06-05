package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarsSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(carSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(carSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	
	public void selectLocation(String location) {
		Select selectCarModel = new Select(carSearchPageLocators.selectLocationDropDown);
		selectCarModel.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarModel = new Select(carSearchPageLocators.priceDropDown);
		selectCarModel.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarButton() {
		carSearchPageLocators.findMyNextCarBtn.click();
	}
}
