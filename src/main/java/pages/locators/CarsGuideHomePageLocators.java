package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsGuideHomePageLocators {
		
	@FindBy(linkText="buy + sell")
	public WebElement  carsForBuyAndSellLink;
	
	@FindBy(linkText="reviews")
	public WebElement  carsForReviewsLink;
	
	@FindBy(linkText="Search Cars")
	public WebElement  searchCarsLink;
	
	@FindBy(linkText="Used")
	public WebElement  usedCarsLink;
	
	@FindBy(linkText="Sell my car")
	public WebElement sellMyCarLink;
}
