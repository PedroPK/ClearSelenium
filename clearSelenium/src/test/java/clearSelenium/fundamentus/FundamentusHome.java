package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.accessURL;
import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.SeleniumUtils.getElementByXPath;
import static clearSelenium.SeleniumUtils.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentusHome {
	
	/**
	 * URL's
	 */
	private static final String URL_FUNDAMENTUS				=	"https://www.fundamentus.com.br/index.php";
	
	private static final String EXIBIR_BUTTON_XPATH			=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	private static final String TICKER_LINK_INDEX			=	"INDEX";
	private static final String TICKER_LINK_XPATH			=	"//*[@id=\"test1\"]/tbody/tr[" + TICKER_LINK_INDEX + "]/td[1]/a";
	
	private static final String DIVIDEND_YELD_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
	
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
	
	@Test
	public void cliclFirstTickerLinks() {
		pressExibirButton();
		
		int tickerIndex = 1;
		
		openTickerPage(tickerIndex);
	}

	private void openTickerPage(int pTickerIndex) {
		WebElement firstTickerLink = getTickerLinkXPath(pTickerIndex);
		
		firstTickerLink.click();
	}
	
	@Test
	public void getDividendYeldFromFirstTicker() {
		pressExibirButton();
		openTickerPage(1);
		
		String text = getDividendYeld();
	}
	
	@Test
	public void getDividendYeldFromSecondTicker() {
		pressExibirButton();
		openTickerPage(2);
		
		String dividendYeldTextValue = getDividendYeld();
		
		System.out.println(dividendYeldTextValue);
	}

	private String getDividendYeld() {
		WebElement dividendYeldWebElement = getElementByXPath(DIVIDEND_YELD_XPATH);
		
		String dividendYeldTextValue = dividendYeldWebElement.getText();
		return dividendYeldTextValue;
	}
	
	@Test
	public void getDividendYeldsFrom3TickersInIteration() {
		pressExibirButton();
		
		List<String> listDividendYelds = new ArrayList<>();
		for (int index = 1; index <= 3; index = index + 1) {
			openTickerPage(index);
			
			String dividendYeldTextValue = getDividendYeld();
			
			listDividendYelds.add(dividendYeldTextValue);
			
			back();
		}
	}
	
	private WebElement getTickerLinkXPath(int pTickerIndex) {
		String tickerXPath = TICKER_LINK_XPATH;
		
		tickerXPath = tickerXPath.replace(TICKER_LINK_INDEX, pTickerIndex + "");
		
		WebElement firstTickerLink = getElementByXPath(tickerXPath);
		return firstTickerLink;
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