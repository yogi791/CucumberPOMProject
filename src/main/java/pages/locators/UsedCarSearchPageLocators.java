package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchPageLocators {

	@FindBy(how=How.CSS,using="select[id='makes']")
	public WebElement carMakeDropdown;
	
	@FindBy(how=How.CSS,using="select[id='models']")
	public WebElement carModelsDropdown;
	
	@FindBy(how=How.CSS,using="select[id='locations']")
	public WebElement carLocationsDropdown;
	
	@FindBy(how=How.CSS,using="select[id='price-max']")
	public WebElement carPriceDropdown;
	
	@FindBy(how=How.CSS,using="input[type='submit']")
	public WebElement findMyNextCar;
	
}
