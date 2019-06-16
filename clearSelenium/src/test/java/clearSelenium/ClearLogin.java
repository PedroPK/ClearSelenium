package clearSelenium;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearLogin {
	
	/**
	 * URL's
	 */
	private static final String URL_CLEAR = "https://www.clear.com.br/pit/signin?controller=SignIn";
	
	private static final String WEBDRIVER_CHROME_DRIVER		= "webdriver.chrome.driver";
	
	private static final String PATH_CHROME_DRIVER			= "/Users/pedropk/Downloads/Apps/Development/SeleniumWebDriver/chromedriver";
	
	private static final String CPF_INPUT_XPATH					= "//*[@id=\"identificationNumber\"]";
	
	private static WebDriver aDriver;
	
	public ClearLogin( WebDriver pWebDriver ) {
		aDriver = pWebDriver;
	}
	
	public static ClearLogin setSystemPropertyChromeWebDriver() {
		String pathString = getWebDriverPath();
		
		System.out.println(pathString);
		
		System.setProperty(
			WEBDRIVER_CHROME_DRIVER, 
			PATH_CHROME_DRIVER);
		
		aDriver = new ChromeDriver();
		
		ClearLogin clearLogin = new ClearLogin(aDriver);
		ClearLogin.accessURL();
		
		return clearLogin;
	}

	private static String getWebDriverPath() {
		Path path = Paths.get("." + File.separator + "libs" + File.separator + "chromedriver");
		String pathString = path.toString();
		return pathString;
	}
	
	public static void accessURL() {
		aDriver.get(URL_CLEAR);
	}
	
	private static WebElement fillInputByXPath(String pXPath, String pValue) {
		WebElement field = aDriver.findElement(By.xpath(pXPath));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	private static WebElement fillInputById(String pId, String pValue) {
		WebElement field = aDriver.findElement(By.id(pId));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	public ClearLogin fillCPF(String pNome) {
		fillInputByXPath(CPF_INPUT_XPATH, pNome);
		
		return this;
	}
	
	public void close() {
		if ( aDriver != null ) {
			aDriver.close();
		}
	}
	
}