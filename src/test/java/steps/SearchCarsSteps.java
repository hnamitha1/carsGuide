package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsSteps {
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide$")
	public void i_am_on_the_Home_Page_of_CarsGuide(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropDown$")
	public void select_carbrand_as_from_AnyMake_dropDown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^select carmodel as \"([^\"]*)\" from SelectModel dropDown$")
	public void select_carmodel_as_from_SelectModel_dropDown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropDown$")
	public void select_location_as_from_SelectLocation_dropDown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^select price as \"([^\"]*)\" from price dropDown$")
	public void select_price_as_from_price_dropDown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^click on Find My Next Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And("^the page title should be \"Bmw (\\d+) Series Cars Under (\\d+) for sale$")
	public void the_page_title_should_be_Bmw_Series_Cars_Under_for_sale(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
