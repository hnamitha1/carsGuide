package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;


public class SearchCarsSteps {
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions =  new CarsSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide$")
	public void i_am_on_the_Home_Page_of_CarsGuide(String websiteURL) {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    String menu = list.get(1);
	    System.out.println(menu);
	    carsGuideHomePageActions.moveToBuyAndSellMenu();  	
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropDown$")
	public void select_carbrand_as_from_AnyMake_dropDown(String carBrand) throws Throwable {
	    carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select carmodel as \"([^\"]*)\" from SelectModel dropDown$")
	public void select_carmodel_as_from_SelectModel_dropDown(String carModel) throws Throwable {
	    carsSearchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropDown$")
	public void select_location_as_from_SelectLocation_dropDown(String location) throws Throwable {
	    carsSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price dropDown$")
	public void select_price_as_from_price_dropDown(String carPrice) throws Throwable {
	    carsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find My Next Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    System.out.println("cars list found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
	    String actualTitle = SeleniumDriver.getDriver().getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    Thread.sleep(6000);
	}


}
