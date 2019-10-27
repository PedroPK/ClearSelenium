package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.accessURL;
import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.SeleniumUtils.getElementByXPath;
import static clearSelenium.SeleniumUtils.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentusHome {
	
	/**
	 * URL's
	 */
	private static final String URL_FUNDAMENTUS				=	"https://www.fundamentus.com.br/index.php";
	
	private static final String EXIBIR_BUTTON_XPATH			=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	private static final String TICKER_INDEX				=	"INDEX";
	private static final String TICKER_LABEL_XPATH			=	"/html/body/div[1]/div[2]/div/div/table/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	private static final String TICKER_LINK_XPATH			=	"//*[@id=\"test1\"]/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	
	private static final String DIVIDEND_YIELD_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
	
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
	
	@Ignore
	@Test
	public void doNothingYet() {
		accessFundamentusHome();
	}
	
	@Ignore
	@Test
	public void pressExibirButtonVoid() {
		pressExibirButton();
	}
	
	@Ignore
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
	
	@Ignore
	@Test
	public void getDividendYieldFromFirstTicker() {
		pressExibirButton();
		openTickerPage(1);
		
		String text = getDividendYield();
	}
	
	@Ignore
	@Test
	public void getDividendYieldFromSecondTicker() {
		pressExibirButton();
		openTickerPage(2);
		
		String dividendYieldTextValue = getDividendYield();
		
		System.out.println(dividendYieldTextValue);
	}

	private String getDividendYield() {
		WebElement dividendYieldWebElement = getElementByXPath(DIVIDEND_YIELD_XPATH);
		
		String dividendYieldTextValue = dividendYieldWebElement.getText();
		return dividendYieldTextValue;
	}
	
	@Test
	public void getDividendYieldsFrom3TickersInIteration() {
		pressExibirButton();
		
		Map<String, String> mapDividendYields = new HashMap<>();
		for (int index = 1; index <= 3; index = index + 1) {
			String tickerLabel = getTickerLabel(index);
			openTickerPage(index);
			
			String dividendYieldTextValue = getDividendYield();
			
			mapDividendYields.put(
				tickerLabel, 
				dividendYieldTextValue);
			
			back();
		}
		
		System.out.println(mapDividendYields);
	}

	private String getTickerLabel(int pIndex) {
		WebElement tickerLabelWebElement = getTickerLabelXPath(pIndex);
		String tickerLabel = tickerLabelWebElement.getText();
		return tickerLabel;
	}
	
	private WebElement getTickerLinkXPath(int pTickerIndex) {
		String tickerXPath = TICKER_LINK_XPATH;
		
		tickerXPath = tickerXPath.replace(TICKER_INDEX, pTickerIndex + "");
		
		WebElement firstTickerLink = getElementByXPath(tickerXPath);
		return firstTickerLink;
	}
	
	private WebElement getTickerLabelXPath(int pTickerIndex) {
		String tickerLabelXPath = TICKER_LABEL_XPATH;
		
		tickerLabelXPath = tickerLabelXPath.replace(TICKER_INDEX, pTickerIndex + "");
		
		WebElement firstTickerLink = getElementByXPath(tickerLabelXPath);
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