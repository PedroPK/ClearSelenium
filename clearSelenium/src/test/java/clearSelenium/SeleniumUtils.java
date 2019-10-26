package clearSelenium;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {
	
	private static final String CHROME_DRIVER_WINDOWS		=	"chromedriver.exe";
	private static final String CHROME_DRIVER_MAC			=	"chromedriver";
	
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
		String pathString = getWebDriverPath();
		
		System.out.println(pathString);
		
		// Get the Project Directory
		String path = System.getProperty("user.dir");
		
		String folderSeparator = System.getProperty("file.separator");
		
		String relativePath = folderSeparator + "src" + folderSeparator + "test" + folderSeparator + "resources" + folderSeparator;
		
		System.out.println(path);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String chromeDriver = CHROME_DRIVER_WINDOWS;
		if ( os.equals(OS_MAC_OS_X) ) {
			chromeDriver = CHROME_DRIVER_MAC;
		}
		
		System.out.println(path + relativePath + chromeDriver);
		
		System.setProperty(
			WEBDRIVER_CHROME_DRIVER, 
			path + relativePath + chromeDriver);
	}
	
	private static String getWebDriverPath() {
		Path path = Paths.get("." + File.separator + "libs" + File.separator + "chromedriver");
		String pathString = path.toString();
		return pathString;
	}
	
	public static WebDriver instanciateChromeDriver() {
		SeleniumUtils.setSystemPropertyChromeWebDriverOriginal();
		
		if ( aWebDriver == null ) {
			aWebDriver = new ChromeDriver();
		}
		
		return aWebDriver;
	}
	
	public static void accessURL(String pURL) {
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
	
	public static void closeWebDriver() {
		if ( aWebDriver != null ) {
			aWebDriver.close();
		}
	}
	
}