package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	//Create reference of CarsGuideHomePageLocators class
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	//Create constructor
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		
		//Initializing Page Factory elements
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToCarsForSaleMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();
	}
	
	//Sub Menus of CarsForSaleMenu
	
	public void clickOnSearchCarSubMenu() {
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
	public void clickOnUsedCarSearchSubMenu() {
		carsGuideHomePageLocators.UsedCarsSearchLink.click();
	}
	
	//Another Menu Sell My Car
	public void moveToSellMyCarMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.sellMyCarLink).perform();
	}
	
	//Sub Menus of SellMyCarMenu
	
	public void clickOnStartMyFreeAdSubMenu() {
		carsGuideHomePageLocators.startMyFREEAdLink.click();
	}
	
	public void clickOnEditYourAdSubMenu() {
		carsGuideHomePageLocators.editYourAdLink.click();
	}
	
	public void clickOnCarSellingTipsSubMenu() {
		
		carsGuideHomePageLocators.carSellingTipsLink.click();
	}
	
}
