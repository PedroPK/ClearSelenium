package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FundamentalistIndicatorsFundamentusTest {
	
	private FundamentalistIndicatorsFundamentus aFundamentalistIndicatorsFundamentus;
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		// Act
		accessTickerDetails(petr4, true);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
	@Before
	public void setUpFundamentalistIndicators() {
		this.aFundamentalistIndicatorsFundamentus = new FundamentalistIndicatorsFundamentus();
	}
	
	@Test
	public void testGetPriceOverProfit() {
		String priceOverProfit = this.aFundamentalistIndicatorsFundamentus.getPriceOverProfit();
		
		assertNotNull( priceOverProfit );
		assertTrue( priceOverProfit.length() == 5);
		
		//assertEquals("11,49", priceOverProfit);
	}

	@Test
	public void testGetPriceOverBookValue() {
		String priceOverBookValue = this.aFundamentalistIndicatorsFundamentus.getPriceOverBookValue();
		
		assertNotNull( priceOverBookValue );
		assertTrue( priceOverBookValue.length() == 4);
		
		//assertEquals("1,28", priceOverBookValue);
	}

	@Test
	public void testGetPriceOverEbit() {
		String priceOverEbit = this.aFundamentalistIndicatorsFundamentus.getPriceOverEbit();
		
		assertNotNull( priceOverEbit );
		assertTrue( priceOverEbit.length() == 4);
		
		//assertEquals("4,15", priceOverEbit);
	}

	@Test
	public void testGetPriceSalesRatio() {
		String priceSalesRatio = this.aFundamentalistIndicatorsFundamentus.getPriceSalesRatio();
		
		assertNotNull( priceSalesRatio );
		assertTrue( priceSalesRatio.length() == 4);
		
		//assertEquals("1,21", priceSalesRatio);
	}

	@Test
	public void testGetPriceOverAssets() {
		String priceOverAsset = this.aFundamentalistIndicatorsFundamentus.getPriceOverAssets();
		
		assertNotNull( priceOverAsset );
		assertTrue( priceOverAsset.length() == 4);
		
		//assertEquals("0,42", priceOverAsset);
	}

	@Test
	public void testGetPriceOverWorkingCapital() {
		String priceOverWorkingCapital = this.aFundamentalistIndicatorsFundamentus.getPriceOverWorkingCapital();
		
		assertNotNull( priceOverWorkingCapital );
		assertTrue( priceOverWorkingCapital.contains(","));
		
		//assertEquals("28,09", priceOverWorkingCapital);
	}

	@Test
	public void testGetPriceOverNetCurretAsset() {
		String priceOverNetCurrentAsset = this.aFundamentalistIndicatorsFundamentus.getPriceOverNetCurretAsset();
		
		assertNotNull( priceOverNetCurrentAsset );
		assertTrue( priceOverNetCurrentAsset.length() == 5);
		
		//assertEquals("-0,84", priceOverNetCurrentAsset);
	}

	@Test
	public void testGetDividendYieldTextValue() {
		String dividendYieldTextValue = this.aFundamentalistIndicatorsFundamentus.getDividendYieldTextValue();
		
		assertNotNull(dividendYieldTextValue);
		assertTrue(dividendYieldTextValue.length() == 4);
		
		//assertEquals("3,7%", dividendYieldTextValue);
	}

	@Test
	public void testGetEnterpriseValueOverEbit() {
		String enterpriseValueOverEbit = this.aFundamentalistIndicatorsFundamentus.getEnterpriseValueOverEbit();
		
		assertNotNull( enterpriseValueOverEbit );
		assertTrue( enterpriseValueOverEbit.length() == 4);
		
		//assertEquals("4,62", enterpriseValueOverEbit);
	}

	@Test
	public void testGeAssetTurnover() {
		String assetTurnover = this.aFundamentalistIndicatorsFundamentus.getAssetTurnover();
		
		assertNotNull( assetTurnover );
		assertTrue( assetTurnover.length() == 4);
		
		//assertEquals("0,35", assetTurnover);
	}

	@Test
	public void testGeIncomeGrowthLast5Years() {
		String incomeGrowthLast5Years = this.aFundamentalistIndicatorsFundamentus.getIncomeGrowthLast5Years();
		
		assertNotNull( incomeGrowthLast5Years );
		assertTrue( incomeGrowthLast5Years.contains(",") );
		assertTrue( incomeGrowthLast5Years.contains("%") );
		
		//assertEquals("1,2%", incomeGrowthLast5Years);
	}

	@Test
	public void testGetProfitPerAction() {
		String profitPerAction = this.aFundamentalistIndicatorsFundamentus.getProfitPerAction();
		
		assertNotNull( profitPerAction );
		assertTrue( profitPerAction.contains(",") );
		
		//assertEquals("2,61", profitPerAction);
	}

	@Test
	public void testGetBookValueOverStocks() {
		String bookValueOverStocks = this.aFundamentalistIndicatorsFundamentus.getBookValueOverStocks();
		
		assertNotNull( bookValueOverStocks );
		assertTrue( bookValueOverStocks.length() == 5);
		
		//assertEquals("23,48", bookValueOverStocks);
	}

	@Test
	public void testGetGrossMargin() {
		String grossMargin = this.aFundamentalistIndicatorsFundamentus.getGrossMargin();
		
		assertNotNull(grossMargin);
		assertTrue(grossMargin.length() == 5);
		//assertEquals("36,7%", grossMargin);
	}

	@Test
	public void testGetEbitMargin() {
		String ebitMargin = this.aFundamentalistIndicatorsFundamentus.getEbitMargin();
		
		assertNotNull( ebitMargin );
		assertTrue( ebitMargin.length() == 5);
		
		//assertEquals("29,3%", ebitMargin);
	}

	@Test
	public void testGetNetMargin() {
		String netMargin = this.aFundamentalistIndicatorsFundamentus.getNetMargin();
		
		assertNotNull( netMargin );
		assertTrue( netMargin.contains(",") );
		assertTrue( netMargin.contains("%") );
		
		//assertEquals("11,0%", netMargin);
	}
	
	@Test
	public void testGetEvitOverAsset() {
		String evitOverAsset = this.aFundamentalistIndicatorsFundamentus.getEbitOverAsset();
		
		assertNotNull( evitOverAsset );
		assertTrue( evitOverAsset.contains(",") );
		assertTrue( evitOverAsset.contains("%") );
		
		//assertEquals("10,2%", evitOverAsset);
	}
	
	@Test
	public void testGetReturnOverInvestedCapital() {
		String returnOverInvestedCapital = this.aFundamentalistIndicatorsFundamentus.getReturnOverInvestedCapital();
		
		assertNotNull( returnOverInvestedCapital );
		assertTrue( returnOverInvestedCapital.contains(",") );
		assertTrue( returnOverInvestedCapital.contains("%") );
		
		//assertEquals("11,2%", returnOverInvestedCapital);
	}

	@Test
	public void testGetReturnOverEquity() {
		String returnOverEquity = this.aFundamentalistIndicatorsFundamentus.getReturnOverEquity();
		
		assertNotNull( returnOverEquity );
		assertTrue( returnOverEquity.contains(",") );
		assertTrue( returnOverEquity.contains("%") );
		
		//assertEquals("11,1%", returnOverEquity);
	}

	@Test
	public void testGetCurrentLiquidity() {
		String currentLiquidity = this.aFundamentalistIndicatorsFundamentus.getCurrentLiquidity();
		
		assertNotNull( currentLiquidity );
		assertTrue( currentLiquidity.length() == 4);
		
		//assertEquals("1,10", currentLiquidity);
	}
	
	@Test
	public void testGetGrossDebtOverEquity() {
		String grossDebtOverEquity = this.aFundamentalistIndicatorsFundamentus.getGrossDebtOverEquity();
		
		assertNotNull( grossDebtOverEquity );
		assertTrue( grossDebtOverEquity.length() == 4);
		
		//assertEquals("1,22", grossDebtOverEquity);
	}
	
}
