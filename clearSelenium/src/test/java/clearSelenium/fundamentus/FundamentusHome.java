package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.accessURL;
import static clearSelenium.SeleniumUtils.back;
import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.SeleniumUtils.getElementByXPath;
import static clearSelenium.SeleniumUtils.instanciateChromeDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import brokerDealer.util.CollectionsUtil;

public class FundamentusHome {
	
	/**
	 * URL's
	 */
	private static final String URL_FUNDAMENTUS					=	"https://www.fundamentus.com.br/index.php";
	private static final String URL_DETALHES_PAPEL				=	"https://www.fundamentus.com.br/detalhes.php?papel=";
	
	private static final int	QUANTITY_TICKERS				= 900;
	
	private static final String EXIBIR_BUTTON_XPATH				=	"/html/body/div[1]/div[1]/form/fieldset/input[2]";
	
	private static final String TICKER_INDEX					=	"INDEX";
	private static final String TICKER_LABEL_XPATH				=	"/html/body/div[1]/div[2]/div/div/table/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	private static final String TICKER_LINK_XPATH				=	"//*[@id=\"test1\"]/tbody/tr[" + TICKER_INDEX + "]/td[1]/a";
	
	private static final String TICKER_QUERY_INPUT_XPATH		=	"/html/body/div[1]/div[1]/form/fieldset/input[1]";
	
	
	@FindBy(xpath=EXIBIR_BUTTON_XPATH)
	private WebElement aExibirButton;
	
	/**
	 * List that will store all the Ticker labels.
	 * With then, we will be able to use the REST URL to Select/Find each Ticker Details:
	 *  - https://www.fundamentus.com.br/detalhes.php?papel=TICKER_LABEL
	 */
	List<String>						listTickerLabels	=	new ArrayList<>();
		//	Ticker	Dividend Yield
	Map<	String, BigDecimal> 		mapDividendYields	=	new HashMap<>();
	
	@BeforeClass
	public static void initializeChromeDriver() {
		/*
		 * True		= 	Headless
		 * False	= 	Full GUI Chrome
		 */
		instanciateChromeDriver(false);
	}
	
	public static void accessFundamentusHome() {
		accessFundamentusHome(false);
	}
	
	public static void accessFundamentusHome(boolean pHeadless) {
		//FundamentusHome fundamentusHome = new FundamentusHome();
		accessURL(URL_FUNDAMENTUS, pHeadless);
	}
	
	/**
	 * This Method will  take advantage of REST capabilities
	 * 
	 * - It will assemble a URL with the Ticket on it.
	 * - Access this URL
	 * - Show the Stock details page
	 * 
	 * @param pTickerLabel
	 */
	public static void accessTickerDetails(String pTickerLabel) {
		//FundamentusHome fundamentusHome = new FundamentusHome();
		accessURL(URL_DETALHES_PAPEL + pTickerLabel);
	}
	
	@Ignore
	@Test
	public void doNothingYet() {
		accessFundamentusHome();
	}
	
	@Test
	public void testSearchPETR4() {
		// Arrange
		String petr4Ticker = "PETR4";
		
		accessTickerDetails(petr4Ticker);
	}
	
	/**
	 * This Method will simulate a user. It will:
	 *  - Open the Fundamentos homepage
	 *  - Focus on the Input for Stock Ticker
	 *  - Fill this Input
	 *  - Press the Exibir button
	 *  - Show the Stock details page 
	 * @param pTicker
	 */
	private void openTickerPage(String pTicker) {
		accessFundamentusHome(false);
		getElementByXPath(TICKER_QUERY_INPUT_XPATH).sendKeys(pTicker);
		pressExibirButton();
	}
	
	@Ignore
	@Test
	public void pressExibirButtonVoid() {
		accessFundamentosHomeAndPressExibirButton();
	}
	
	@Ignore
	@Test
	public void cliclFirstTickerLinks() {
		accessFundamentosHomeAndPressExibirButton();
		
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
		accessFundamentosHomeAndPressExibirButton();
		openTickerPage(1);
		
		String text = FundamentalistIndicators.getDividendYieldTextValue();
		System.out.println(text);
	}
	
	@Ignore
	@Test
	public void getDividendYieldFromFirstTickerHeadless() {
		accessFundamentosHomeAndPressExibirButton();
		openTickerPage(1);
		
		String text = FundamentalistIndicators.getDividendYieldTextValue();
		System.out.println(text);
		
		assertNotNull(text);
		assertFalse(text.isEmpty());
	}
	
	@Ignore
	@Test
	public void getDividendYieldFromSecondTicker() {
		accessFundamentosHomeAndPressExibirButton();
		openTickerPage(2);
		
		String dividendYieldTextValue = FundamentalistIndicators.getDividendYieldTextValue();
		
		System.out.println(dividendYieldTextValue);
	}

	@Ignore
	@Test
	public void getDividendYieldsFrom3TickersInIteration() {
		accessFundamentosHomeAndPressExibirButton();
		
		for (int index = 1; index <= 3; index = index + 1) {
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
		accessFundamentosHomeAndPressExibirButton();
		
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
	
	/**
	 * This method should 
	 *  - List all Ticker labels
	 *  - For each one, access its Details page
	 *  - If it works fine, create another Test Method to get the Dividend Yield
	 *  
	 */
	@Ignore
	@Test(timeout=180000)
	public void access10TickersDetailsPage() {
		getAllTickerLabels();
		
		if ( this.listTickerLabels != null && !this.listTickerLabels.isEmpty() ) {
			Iterator<String>	iteratorTicker		=	this.listTickerLabels.iterator();
			int i = 0;
			while ( iteratorTicker.hasNext()		&&		i < 10 ) {
				String ticker = iteratorTicker.next();
				
				accessTickerDetails(ticker);
				
				i = i + 1;
			}
		} else {
			fail();
		}
		
	}
	
	/**
	 * This method does:
	 *  - List all Stock Tickers from Fundamentus main page
	 *  - For each Ticker, access its Details page.
	 *  - Gets the Dividend Yield and Stores it in a Map
	 */
	@Ignore
	@Test(timeout=180000)
	public void access10TickersDetailsPageAndGetDividendYields() {
		getAllTickerLabels();
		
		if ( this.listTickerLabels != null && !this.listTickerLabels.isEmpty() ) {
			Iterator<String>	iteratorTicker		=	this.listTickerLabels.iterator();
			int i = 0;
			while ( iteratorTicker.hasNext()		&&		i < 10 ) {
				String ticker = iteratorTicker.next();
				
				accessTickerDetails(ticker);
				
				try {
					BigDecimal dividendYield	=	getDividendYield();
					this.mapDividendYields.put(ticker, dividendYield);
				} catch (NoSuchElementException nsee ) {
					continue;
				}
				
				i = i + 1;
				System.out.println(this.mapDividendYields);
			}
		} else {
			fail();
		}
	}
	
	/**
	 * TODO - Resume from here
	 * 
	 * This is the State of Art until now
	 * 
	 * This method does:
	 *  - List all Stock Tickers from Fundamentus main page
	 *  - For each Ticker, access its Details page.
	 *  - Gets the Dividend Yield and Stores it in a Map
	 */
	@Ignore
	@Test(timeout=3600000)
	public void accessAllTickersDetailsPageAndGetDividendYields() {
		getAllTickerLabels();
		
		if ( this.listTickerLabels != null && !this.listTickerLabels.isEmpty() ) {
			Iterator<String>	iteratorTicker		=	this.listTickerLabels.iterator();
			
			int i = 0;
			while ( iteratorTicker.hasNext() ) {
				String ticker = iteratorTicker.next();
				
				accessTickerDetails(ticker);
				
				try {
					BigDecimal dividendYield	=	getDividendYield();
					this.mapDividendYields.put(ticker, dividendYield);
				} catch (NoSuchElementException nsee ) {
					continue;
				}
				i = i + 1;
				System.out.println(i + " " + CollectionsUtil.sortMapByValueInvertedOrder(this.mapDividendYields));
			}
		} else {
			fail();
		}
		
		System.out.println("Final Hashmap: " + this.mapDividendYields.size() + " " + CollectionsUtil.sortMapByValueInvertedOrder(this.mapDividendYields) );
	}
	
	private BigDecimal getDividendYield() {
		// Get the Dividend Yield. Ex: "1,0%"
		String dividendYieldTextValue = FundamentalistIndicators.getDividendYieldTextValue();
		
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
	
	public FundamentusHome accessFundamentosHomeAndPressExibirButton() {
		return accessFundamentosHomeAndPressExibirButton(false);
	}
	
	public FundamentusHome pressExibirButton() {
		if ( this.aExibirButton == null ) {
			this.aExibirButton = getElementByXPath(EXIBIR_BUTTON_XPATH); 
		}
		
		// Click in the Element
		this.aExibirButton.click();
		
		return this;
	}
	
	public FundamentusHome accessFundamentosHomeAndPressExibirButton(boolean pHeadless) {
		accessFundamentusHome(pHeadless);
		
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