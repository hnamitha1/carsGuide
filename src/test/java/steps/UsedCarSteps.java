package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions =  new UsedCarsSearchPageActions();
	
	@Given("^I navigate to the  Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_navigate_to_the_Home_Page_of_CarsGuide_Website(String websiteURL) {
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to buy \\+ sell Menu$")
	public void i_move_to_buy_sell_Menu() throws Throwable {
		carsGuideHomePageActions.moveToBuyAndSellMenu(); 
	}

	@And("^click on Used Search link$")
	public void click_on_Used_Search_link() throws Throwable {
		carsGuideHomePageActions.clickOnUsedMenu();
	}

	@And("^select carMaker from AnyMake dropdown$")
	public void select_carMaker_from_AnyMake_dropdown(List<String> list) throws Throwable {
		String menu = list.get(1);
	    usedCarsSearchPageActions.selectCarMake(menu);
	}

	@And("^select  car model$")
	public void select_car_model(List<String> list) throws Throwable {
		String menu = list.get(1);
	    usedCarsSearchPageActions.selectCarModel(menu);
	}

	@And("^select location  from SelectLocation dropdown$")
	public void select_location_from_SelectLocation_dropdown(List<String> list) throws Throwable {
		String menu = list.get(1);
		usedCarsSearchPageActions.selectLocation(menu);
	}

	@And("^select price$")
	public void select_price(List<String> list) {
		String menu = list.get(1);
		usedCarsSearchPageActions.selectCarPrice(menu);
	}

	@And("^click on Find_My_Car button$")
	public void click_on_Find_My_Car_button() {
	    usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of Used cars$")
	public void i_should_see_list_of_Used_cars() throws Throwable {
	    System.out.println("Used cars list found");
	}

	@And("^the page title should match expected title  \"([^\"]*)\"$")
	public void the_page_title_should_match_expected_title(String expectedTitle) throws Throwable {
		Thread.sleep(3000);
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}



}
