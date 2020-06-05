package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarSearchPageLocators {
	
	@FindBy(xpath="//*[@id='makes']")
	public WebElement  carMakeDropDown;
	
	@FindBy(xpath="//*[@id='models']")
	public WebElement  selectModelDropDown;
	
	@FindBy(xpath="//*[@id='locations']")
	public WebElement  selectLocationDropDown;
	
	@FindBy(xpath="//*[@id='priceTo']")
	public WebElement  priceDropDown;

	@FindBy(xpath="//*[@id='search-submit']")
	public WebElement  findMyNextCarBtn;
}
