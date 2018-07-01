package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	CarSearchPageLocators carSearchPageLocators=null;
	
	public CarSearchPageActions() {
		this.carSearchPageLocators=new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String CarBrand) {
		Select select=new Select(carSearchPageLocators.carMakeDropdown);
		select.selectByVisibleText(CarBrand);
		
	}
	
	public void selectCarModel(String CarModel) {
		Select select=new Select(carSearchPageLocators.carModelDropdown);
		select.selectByVisibleText(CarModel);
	}

	public void selectCarLocation(String CarLocation) {
		Select select=new Select(carSearchPageLocators.carLocationsDropdown);
		select.selectByVisibleText(CarLocation);
	}

	public void selectCarPrice(String CarPrice) {
		Select select=new Select(carSearchPageLocators.carPriceDropdown);
		select.selectByVisibleText(CarPrice);
	}
	
	public void clickOnFindMyNextCarBtn() {
		carSearchPageLocators.findMyNextCar.click();
	}

}
