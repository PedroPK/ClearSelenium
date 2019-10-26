package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.accessURL;
import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.SeleniumUtils.getElementByXPath;
import static clearSelenium.SeleniumUtils.instanciateChromeDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentusHome {
	
	/**
	 * URL's
	 */
	private static final String URL_FUNDAMENTUS				= "https://www.fundamentus.com.br/index.php";
	
	private static final String EXIBIR_BUTTON_XPATH			=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	@FindBy(xpath=EXIBIR_BUTTON_XPATH)
	private WebElement aExibirButton;
	
	/*
	 * public FundamentusHome() { //instanciateChromeDriver(); }
	 */
	
	/*
	 * public FundamentusHome( WebDriver pWebDriver ) { aWebDriver = pWebDriver; }
	 */
	
	public static void accessFundamentusHome() {
		instanciateChromeDriver();
		
		//FundamentusHome fundamentusHome = new FundamentusHome();
		accessURL(URL_FUNDAMENTUS);
	}
	
	@BeforeClass
	public static void initializeChromeDriver() {
		instanciateChromeDriver();
	}
	
	@Test
	public void doNothingYet() {
		accessFundamentusHome();
	}
	
	@Test
	public void pressExibirButtonVoid() {
		pressExibirButton();
	}
	
	public FundamentusHome pressExibirButton() {
			accessFundamentusHome();
		
		if ( this.aExibirButton == null ) {
			this.aExibirButton = getElementByXPath(EXIBIR_BUTTON_XPATH); 
		}
		
		// Click in the Element
		this.aExibirButton.click();
		
		return this;
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
}