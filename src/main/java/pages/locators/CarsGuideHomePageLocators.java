package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="Cars For Sale")
	public WebElement carsForSaleLink;
	
	//Sub Menus of "Cars For Sale" menu
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Used Cars Search")
	public WebElement UsedCarsSearchLink;
	
	//Another Menu "Sell My Car"
	
	@FindBy(how=How.LINK_TEXT,using="Sell My Car")
	public WebElement sellMyCarLink;
	
	//Sub Menus of "Cars For Sale" menu
	
	@FindBy(how=How.LINK_TEXT,using="Start My FREE Ad")
	public WebElement startMyFREEAdLink;
	
	@FindBy(how=How.LINK_TEXT,using="Edit Your Ad")
	public WebElement editYourAdLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car Selling Tips")
	public WebElement carSellingTipsLink;
	
	//Another Menu "Car Reviews"
	
	@FindBy(how=How.LINK_TEXT,using="Car Reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car News")
	public WebElement carNewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Insurance")
	public WebElement insuranceLink;
	
	@FindBy(how=How.LINK_TEXT,using="Car Advice")
	public WebElement carAdviceLink;
	
	@FindBy(how=How.LINK_TEXT,using="Pricing & Specs")
	public WebElement pricingAndSpecsLink;
}
