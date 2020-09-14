package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import clearSelenium.statusInvest.StatusInvestHome;

public class FundamentalistIndicatorsStatusInvestTest {
	
	private FundamentalistIndicatorsStatusInvest aFundamentalistIndicatorsStatusInvest;
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		// Act
		StatusInvestHome.accessTickerDetails(petr4, false);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
	@Before
	public void setUpFundamentalistIndicators() {
		this.aFundamentalistIndicatorsStatusInvest = new FundamentalistIndicatorsStatusInvest();
	}
	
	@Test
	public void testGetPriceOverProfit() {
		String priceOverProfit = this.aFundamentalistIndicatorsStatusInvest.getPriceOverProfit();
		
		assertNotNull(	priceOverProfit );
		assertTrue(		priceOverProfit.length() == 5);
		assertTrue(		priceOverProfit.contains(","));
		
		//assertEquals("-8,38", priceOverProfit);
	}
	
	@Test
	public void testGetPriceOverBookValue() {
		String priceOverBookValue = this.aFundamentalistIndicatorsStatusInvest.getPriceOverBookValue();
		
		assertNotNull(	priceOverBookValue );
		assertTrue( 	priceOverBookValue.length() == 4);
		assertTrue( 	priceOverBookValue.contains(","));
		
		//assertEquals("1,17", priceOverBookValue);
	}
	
	@Test
	public void testGetPriceOverEbit() {
		String priceOverEbit = this.aFundamentalistIndicatorsStatusInvest.getPriceOverEbit();
		
		assertNotNull(	priceOverEbit );
		assertEquals(	"Preço sobre EBIT deveria ter 6 Caracteres",	 6,		priceOverEbit.length()	);
		assertTrue( 	priceOverEbit.contains(","));
		
		assertEquals("-35,69", priceOverEbit);
	}
	
	@Ignore
	@Test
	public void testGetPriceSalesRatio() {
		String priceSalesRatio = this.aFundamentalistIndicatorsStatusInvest.getPriceSalesRatio();
		
		assertNotNull( priceSalesRatio );
		assertTrue( priceSalesRatio.length() == 4);
		
		//assertEquals("1,21", priceSalesRatio);
	}
	
	@Ignore
	@Test
	public void testGetPriceOverAssets() {
		String priceOverAsset = this.aFundamentalistIndicatorsStatusInvest.getPriceOverAssets();
		
		assertNotNull( priceOverAsset );
		assertTrue( priceOverAsset.length() == 4);
		
		//assertEquals("0,42", priceOverAsset);
	}
	
	@Ignore
	@Test
	public void testGetPriceOverWorkingCapital() {
		String priceOverWorkingCapital = this.aFundamentalistIndicatorsStatusInvest.getPriceOverWorkingCapital();
		
		assertNotNull( priceOverWorkingCapital );
		assertTrue( priceOverWorkingCapital.contains(","));
		
		//assertEquals("28,09", priceOverWorkingCapital);
	}
	
	@Ignore
	@Test
	public void testGetPriceOverNetCurretAsset() {
		String priceOverNetCurrentAsset = this.aFundamentalistIndicatorsStatusInvest.getPriceOverNetCurretAsset();
		
		assertNotNull( priceOverNetCurrentAsset );
		assertTrue( priceOverNetCurrentAsset.length() == 5);
		
		//assertEquals("-0,84", priceOverNetCurrentAsset);
	}
	
	@Ignore
	@Test
	public void testGetDividendYieldTextValue() {
		String dividendYieldTextValue = this.aFundamentalistIndicatorsStatusInvest.getDividendYieldTextValue();
		
		assertNotNull(dividendYieldTextValue);
		assertTrue(dividendYieldTextValue.length() == 4);
		
		//assertEquals("3,7%", dividendYieldTextValue);
	}
	
	@Ignore
	@Test
	public void testGetEnterpriseValueOverEbit() {
		String enterpriseValueOverEbit = this.aFundamentalistIndicatorsStatusInvest.getEnterpriseValueOverEbit();
		
		assertNotNull( enterpriseValueOverEbit );
		assertTrue( enterpriseValueOverEbit.length() == 4);
		
		//assertEquals("4,62", enterpriseValueOverEbit);
	}
	
	@Ignore
	@Test
	public void testGeAssetTurnover() {
		String assetTurnover = this.aFundamentalistIndicatorsStatusInvest.getAssetTurnover();
		
		assertNotNull( assetTurnover );
		assertTrue( assetTurnover.length() == 4);
		
		//assertEquals("0,35", assetTurnover);
	}
	
	@Ignore
	@Test
	public void testGeIncomeGrowthLast5Years() {
		String incomeGrowthLast5Years = this.aFundamentalistIndicatorsStatusInvest.getIncomeGrowthLast5Years();
		
		assertNotNull( incomeGrowthLast5Years );
		assertTrue( incomeGrowthLast5Years.contains(",") );
		assertTrue( incomeGrowthLast5Years.contains("%") );
		
		//assertEquals("1,2%", incomeGrowthLast5Years);
	}
	
	@Ignore
	@Test
	public void testGetProfitPerAction() {
		String profitPerAction = this.aFundamentalistIndicatorsStatusInvest.getProfitPerAction();
		
		assertNotNull( profitPerAction );
		assertTrue( profitPerAction.contains(",") );
		
		//assertEquals("2,61", profitPerAction);
	}
	
	@Ignore
	@Test
	public void testGetBookValueOverStocks() {
		String bookValueOverStocks = this.aFundamentalistIndicatorsStatusInvest.getBookValueOverStocks();
		
		assertNotNull( bookValueOverStocks );
		assertTrue( bookValueOverStocks.length() == 5);
		
		//assertEquals("23,48", bookValueOverStocks);
	}
	
	@Ignore
	@Test
	public void testGetGrossMargin() {
		String grossMargin = this.aFundamentalistIndicatorsStatusInvest.getGrossMargin();
		
		assertNotNull(grossMargin);
		assertTrue(grossMargin.length() == 5);
		//assertEquals("36,7%", grossMargin);
	}
	
	@Ignore
	@Test
	public void testGetEbitMargin() {
		String ebitMargin = this.aFundamentalistIndicatorsStatusInvest.getEbitMargin();
		
		assertNotNull( ebitMargin );
		assertTrue( ebitMargin.length() == 5);
		
		//assertEquals("29,3%", ebitMargin);
	}
	
	@Ignore
	@Test
	public void testGetNetMargin() {
		String netMargin = this.aFundamentalistIndicatorsStatusInvest.getNetMargin();
		
		assertNotNull( netMargin );
		assertTrue( netMargin.contains(",") );
		assertTrue( netMargin.contains("%") );
		
		//assertEquals("11,0%", netMargin);
	}
	
	@Ignore
	@Test
	public void testGetEvitOverAsset() {
		String evitOverAsset = this.aFundamentalistIndicatorsStatusInvest.getEbitOverAsset();
		
		assertNotNull( evitOverAsset );
		assertTrue( evitOverAsset.contains(",") );
		assertTrue( evitOverAsset.contains("%") );
		
		//assertEquals("10,2%", evitOverAsset);
	}
	
	@Ignore
	@Test
	public void testGetReturnOverInvestedCapital() {
		String returnOverInvestedCapital = this.aFundamentalistIndicatorsStatusInvest.getReturnOverInvestedCapital();
		
		assertNotNull( returnOverInvestedCapital );
		assertTrue( returnOverInvestedCapital.contains(",") );
		assertTrue( returnOverInvestedCapital.contains("%") );
		
		//assertEquals("11,2%", returnOverInvestedCapital);
	}
	
	@Ignore
	@Test
	public void testGetReturnOverEquity() {
		String returnOverEquity = this.aFundamentalistIndicatorsStatusInvest.getReturnOverEquity();
		
		assertNotNull( returnOverEquity );
		assertTrue( returnOverEquity.contains(",") );
		assertTrue( returnOverEquity.contains("%") );
		
		//assertEquals("11,1%", returnOverEquity);
	}
	
	@Ignore
	@Test
	public void testGetCurrentLiquidity() {
		String currentLiquidity = this.aFundamentalistIndicatorsStatusInvest.getCurrentLiquidity();
		
		assertNotNull( currentLiquidity );
		assertTrue( currentLiquidity.length() == 4);
		
		//assertEquals("1,10", currentLiquidity);
	}
	
	@Ignore
	@Test
	public void testGetGrossDebtOverEquity() {
		String grossDebtOverEquity = this.aFundamentalistIndicatorsStatusInvest.getGrossDebtOverEquity();
		
		assertNotNull( grossDebtOverEquity );
		assertTrue( grossDebtOverEquity.length() == 4);
		
		//assertEquals("1,22", grossDebtOverEquity);
	}
	
}