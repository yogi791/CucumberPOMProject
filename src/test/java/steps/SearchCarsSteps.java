package steps;

import static org.testng.Assert.fail;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions=new CarSearchPageActions();

	@Given("^I am on the HomePage \"([^\"]*)\" of CarsGuide website$")
	public void i_am_on_the_HomePage_of_CarsGuide_website(String WebSiteURL) throws Throwable {
	    
		SeleniumDriver.OpenPage(WebSiteURL);
		
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    
		String menu=list.get(1);
		System.out.println("Selected menu is: "+menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
		
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String SearchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarSubMenu();
	}

	@And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_car_brand_as_from_AnyMake_dropdown(String CarBrand) throws Throwable {
		carSearchPageActions.selectCarMake(CarBrand);
	}

	@And("^select car model as \"([^\"]*)\" from SelectModel dropdown$")
	public void select_car_model_as_from_SelectModel_dropdown(String CarModel) throws Throwable {
		carSearchPageActions.selectCarModel(CarModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String CarLocation) throws Throwable {
		carSearchPageActions.selectCarLocation(CarLocation);
	}

	@When("^select price as \"([^\"]*)\" from Price dropdown$")
	public void select_price_as_from_Price_dropdown(String CarPrice) throws Throwable {
	    carSearchPageActions.selectCarPrice(CarPrice);
	}

	@And("^click on FindMyNextCar button$")
	public void click_on_FindMyNextCar_button() throws Throwable {
		carSearchPageActions.clickOnFindMyNextCarBtn();
	}

	@Then("^I should see the list of searched car$")
	public void i_should_see_the_list_of_searched_car() throws Throwable {
	   System.out.println("Car list found");
	   
	}

	@And("^PageTitle should be \"([^\"]*)\"$")
	public void pagetitle_should_be(String Expected_title) throws Throwable {
	    
		String Actual_title=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(Actual_title, Expected_title);
		
	}

	
}
