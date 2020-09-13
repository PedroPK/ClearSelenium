package clearSelenium;

import static brokerDealer.util.FilesFoldersUtil.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumUtils {
	
	private static final String CHROME_DRIVER_WINDOWS		=	"chromedriver.exe";
	private static final String CHROME_DRIVER_MAC			=	"chromedriver_mac_v85";
	
	private static final String WEBDRIVER_CHROME_DRIVER		=	"webdriver.chrome.driver";
	
	private static final String OS_MAC_OS_X					=	"Mac OS X";
	
	/**
	 * WebDriver instance
	 */
	private static WebDriver aWebDriver;
	
	public static WebDriver getWebDriver() {
		if ( aWebDriver == null ) {
			instanciateChromeDriver();
		}
		
		return aWebDriver;
	}
	
	public static void setSystemPropertyChromeWebDriverOriginal() {
		// Get the Project Directory
		String fullPath = getFullPathToSrcTestResourceFolder();
		
		String os = getOperationalSystemName();
		
		String chromeDriver = CHROME_DRIVER_WINDOWS;
		if ( os.equals(OS_MAC_OS_X) ) {
			chromeDriver = CHROME_DRIVER_MAC;
		}
		
		System.setProperty(
			WEBDRIVER_CHROME_DRIVER, 
			fullPath + chromeDriver);
	}
	
	public static ChromeOptions getHeadlessChromeOptions() {
		ChromeOptions options	=	new ChromeOptions();
		options.addArguments("--headless");
		
		return options;
	}
	
	public static WebDriver instanciateChromeDriver() {
		return instanciateChromeDriver(false);
	}
	
	public static WebDriver instanciateChromeDriver(boolean pHeadless) {
		if ( aWebDriver == null ) {
			SeleniumUtils.setSystemPropertyChromeWebDriverOriginal();
			
			if (pHeadless) {
				aWebDriver = new ChromeDriver(getHeadlessChromeOptions());
			} else {
				aWebDriver = new ChromeDriver();
			}
		}
		
		return aWebDriver;
	}
	
	public static void accessURL(String pURL) {
		accessURL(pURL, false);
	}
	
	public static void accessURL(String pURL, boolean pHeadless) {
		instanciateChromeDriver(pHeadless);
		
		getWebDriver().get(pURL);
	}
	
	public static WebElement fillInputByXPath(String pXPath, String pValue) {
		WebElement field = getWebDriver().findElement(By.xpath(pXPath));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	public static WebElement fillInputById(String pId, String pValue) {
		WebElement field = getWebDriver().findElement(By.id(pId));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	public static WebElement getElementByXPath(String pXPath) {
		WebElement field = getWebDriver().findElement(By.xpath(pXPath));
		
		return field;
	}
	
	public WebElement getSpanByTickerContent(String pTicker) {
		WebElement field = getElementByXPath("//*[contains(text(), '" + pTicker + "')]\"");
		
		return field;
	}
	
	public static void back() {
		if ( aWebDriver != null ) {
			aWebDriver.navigate().back();
		}
	}
	
	public static void closeWebDriver() {
		if ( aWebDriver != null ) {
			aWebDriver.close();
		}
	}
	
}