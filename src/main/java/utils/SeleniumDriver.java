package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait Waitriver;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=50;
	
	//Singalton design pattern
	private SeleniumDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\My Project\\CucumberPOMProject\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
		driver=new FirefoxDriver();*/
		/*System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\operadriver.exe");
		driver=new OperaDriver();*/
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void OpenPage(String url) {
		
		driver.get(url);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver=new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
}
