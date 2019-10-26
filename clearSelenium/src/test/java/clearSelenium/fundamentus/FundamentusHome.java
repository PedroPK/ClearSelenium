package clearSelenium.fundamentus;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import clearSelenium.SeleniumUtils;

public class FundamentusHome {
	
	/**
	 * URL's
	 */
	private static final String URL_FUNDAMENTUS				= "https://www.fundamentus.com.br/index.php";
	
	private static final String PATH_CHROME_DRIVER			=	"C:\\Users\\pedro.carlos.santos\\git\\ClearSelenium\\clearSelenium\\src\\test\\resources\\chromedriver.exe";
	
	private static final String EXIBIR_BUTTON_XPATH			=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	@FindBy(xpath=EXIBIR_BUTTON_XPATH)
	private WebElement aExibirButton;
	
	private static WebDriver aWebDriver;
	
	/*
	 * public FundamentusHome() { //instanciateChromeDriver(); }
	 */
	
	/*
	 * public FundamentusHome( WebDriver pWebDriver ) { aWebDriver = pWebDriver; }
	 */
	
	public static FundamentusHome accessFundamentusHome() {
		instanciateChromeDriver();
		
		FundamentusHome fundamentusHome = new FundamentusHome();
		FundamentusHome.accessURL();
		
		return fundamentusHome;
	}
	
	@BeforeClass
	public static void instanciateChromeDriver() {
		SeleniumUtils.setSystemPropertyChromeWebDriverOriginal();
		
		aWebDriver = new ChromeDriver();
	}
	
	@Test
	public void doNothingYet() {
		accessFundamentusHome();
	}

	public static void accessURL() {
		aWebDriver.get(URL_FUNDAMENTUS);
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
	
	
	private WebElement getSpanByTickerContent(String pTicker) {
		WebElement field = getElementByXPath("//*[contains(text(), '" + pTicker + "')]\"");
		
		return field;
	}
	
	@Test
	public void pressExibirButtonVoid() {
		pressExibirButton();
	}
	
	public FundamentusHome pressExibirButton() {
		if ( aWebDriver == null ) {
			accessFundamentusHome();
		}
		
		if ( this.aExibirButton == null ) {
			this.aExibirButton = getElementByXPath(EXIBIR_BUTTON_XPATH); 
		}
		
		// Click in the Element
		this.aExibirButton.click();
		
		return this;
	}
	
	@AfterClass
	public static void close() {
		if ( aWebDriver != null ) {
			aWebDriver.close();
		}
	}
	
}