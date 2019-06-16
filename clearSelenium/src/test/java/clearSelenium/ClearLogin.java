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
	private static final String PASSWORD_INPUT_XPATH			= "//*[@id=\"password\"]";
	private static final String BIRTHDAY_INPUT_XPATH			= "//*[@id=\"dob\"]";
	private static final String ACCESS_MY_ACCOINT_INPUT_XPATH	= "//*[@id=\"form_id\"]/input[2]";
	private static final String NEW_PIT_SPAN_XPATH				= "//*[@id=\"content_middle\"]/div[2]/div[1]/a/span";
	
	private static WebDriver aWebDriver;
	
	public ClearLogin( WebDriver pWebDriver ) {
		aWebDriver = pWebDriver;
	}
	
	public static ClearLogin setSystemPropertyChromeWebDriver() {
		String pathString = getWebDriverPath();
		
		System.out.println(pathString);
		
		System.setProperty(
			WEBDRIVER_CHROME_DRIVER, 
			PATH_CHROME_DRIVER);
		
		aWebDriver = new ChromeDriver();
		
		ClearLogin clearLogin = new ClearLogin(aWebDriver);
		ClearLogin.accessURL();
		
		return clearLogin;
	}

	private static String getWebDriverPath() {
		Path path = Paths.get("." + File.separator + "libs" + File.separator + "chromedriver");
		String pathString = path.toString();
		return pathString;
	}
	
	public static void accessURL() {
		aWebDriver.get(URL_CLEAR);
	}
	
	private static WebElement fillInputByXPath(String pXPath, String pValue) {
		WebElement field = aWebDriver.findElement(By.xpath(pXPath));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	private static WebElement fillInputById(String pId, String pValue) {
		WebElement field = aWebDriver.findElement(By.id(pId));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	private static WebElement getElementByXPath(String pXPath) {
		WebElement field = aWebDriver.findElement(By.xpath(pXPath));
		
		return field;
	}
	
	public ClearLogin pressAccessMyAccountSubmitButton() {
		WebElement field = getElementByXPath(ACCESS_MY_ACCOINT_INPUT_XPATH);
		
		// Submit the Form
		field.submit();
		
		return this;
	}
	
	public ClearLogin pressNewPitSpan() {
		WebElement field = getElementByXPath(NEW_PIT_SPAN_XPATH);
		
		// Click in the Element
		field.click();
		
		return this;
	}
	
	public ClearLogin fillCPF(String pCPF) {
		fillInputByXPath(CPF_INPUT_XPATH, pCPF);
		
		return this;
	}
	
	public ClearLogin fillPassword(String pPassword) {
		fillInputByXPath(PASSWORD_INPUT_XPATH, pPassword);
		
		return this;
	}
	
	public ClearLogin fillBirthday(String pBirthday) {
		fillInputByXPath(BIRTHDAY_INPUT_XPATH, pBirthday);
		
		return this;
	}
	
	public void close() {
		if ( aWebDriver != null ) {
			aWebDriver.close();
		}
	}
	
}