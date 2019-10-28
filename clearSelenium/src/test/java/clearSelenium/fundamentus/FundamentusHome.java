package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.accessURL;
import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.SeleniumUtils.getElementByXPath;
import static clearSelenium.SeleniumUtils.*;

import java.math.BigDecimal;
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
	private static final String URL_DETALHES_PAPEL			=	"https://www.fundamentus.com.br/detalhes.php?papel=";
	
	private static final int	QUANTITY_TICKERS			= 900;
	
	private static final String EXIBIR_BUTTON_XPATH			=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	private static final String TICKER_INDEX				=	"INDEX";
	private static final String TICKER_LABEL_XPATH			=	"/html/body/div[1]/div[2]/div/div/table/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	private static final String TICKER_LINK_XPATH			=	"//*[@id=\"test1\"]/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	
	private static final String DIVIDEND_YIELD_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[4]/span";
	
	@FindBy(xpath=EXIBIR_BUTTON_XPATH)
	private WebElement aExibirButton;
	
	/**
	 * List that will store all the Ticker labels.
	 * With then, we will be able to use the REST URL to Select/Find each Ticker Details:
	 *  - https://www.fundamentus.com.br/detalhes.php?papel=TICKER_LABEL
	 */
	List<String>	listTickerLabels	=	new ArrayList<>();
	
	public static void accessFundamentusHome() {
		//FundamentusHome fundamentusHome = new FundamentusHome();
		accessURL(URL_FUNDAMENTUS);
	}
	
	public static void accessTickerDetails(String pTickerLabel) {
		//FundamentusHome fundamentusHome = new FundamentusHome();
		accessURL(URL_DETALHES_PAPEL + pTickerLabel);
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
		
		String text = getDividendYieldTextValue();
		System.out.println(text);
	}
	
	@Ignore
	@Test
	public void getDividendYieldFromSecondTicker() {
		pressExibirButton();
		openTickerPage(2);
		
		String dividendYieldTextValue = getDividendYieldTextValue();
		
		System.out.println(dividendYieldTextValue);
	}

	private String getDividendYieldTextValue() {
		WebElement dividendYieldWebElement = getElementByXPath(DIVIDEND_YIELD_XPATH);
		
		String dividendYieldTextValue = dividendYieldWebElement.getText();
		return dividendYieldTextValue;
	}
	
	@Ignore
	@Test(timeout = 120000)
	public void getDividendYieldsFrom3TickersInIteration() {
		pressExibirButton();
		
		Map<String, BigDecimal> mapDividendYields = new HashMap<>();
		for (int index = 1; index <= QUANTITY_TICKERS; index = index + 1) {
			try {
				// Get the Ticker Label. Ex: PETR3, PETR4, VALE3, etc
				String tickerLabel = getTickerLabel(index);
				
				// Open the Ticker page with its Details
				openTickerPage(index);
				
				// Get the Dividend Yield
				BigDecimal dividendYield = getDividendYield();
				
				mapDividendYields.put(
					tickerLabel, 
					dividendYield);
				
				back();
				
				System.out.println( index + " " + tickerLabel + " " + dividendYield );
				System.out.println(mapDividendYields);
			} catch (Exception e) {
				back();
				continue;
			}
		}
		
		System.out.println(mapDividendYields);
	}
	
	@Ignore
	@Test(timeout = 120000)
	public void getAllTickerLabels() {
		pressExibirButton();
		
		for (int index = 1; index <= QUANTITY_TICKERS; index = index + 1) {
			try {
				// Get the Ticker Label. Ex: PETR3, PETR4, VALE3, etc
				String tickerLabel = getTickerLabel(index);
				
				this.listTickerLabels.add(tickerLabel);
			} catch (Exception e) {
				continue;
			}
			System.out.println(this.listTickerLabels.size());
		}
		System.out.println(this.listTickerLabels);
	}
	
	@Ignore
	@Test(timeout = 60000)
	public void testAccessTickerDetailsPage() {
		String tickerLabel = "PETR4";
		
		accessTickerDetails(tickerLabel);
	}

	private BigDecimal getDividendYield() {
		// Get the Dividend Yield. Ex: "1,0%"
		String dividendYieldTextValue = getDividendYieldTextValue();
		
		// Remove the Percentage Symbol
		dividendYieldTextValue = dividendYieldTextValue.replace('%', ' ');
		
		// Remove Spaces in Start and End of the String
		dividendYieldTextValue = dividendYieldTextValue.trim();
		
		// Replace Comma with Dot
		dividendYieldTextValue = dividendYieldTextValue.replace(',', '.');
		
		// Convert to a BigDecimal
		BigDecimal dividendYield = new BigDecimal(dividendYieldTextValue);
		return dividendYield;
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