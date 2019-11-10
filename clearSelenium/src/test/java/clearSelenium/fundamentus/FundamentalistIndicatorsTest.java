package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;
import static clearSelenium.fundamentus.FundamentalistIndicators.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FundamentalistIndicatorsTest {
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		accessTickerDetails(petr4, true);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
	@Test
	public void testGetPriceOverProfit() {
		String priceOverProfit = getPriceOverProfit();
		
		assertEquals("11,49", priceOverProfit);
	}

	@Test
	public void testGetPriceOverBookValue() {
		String priceOverBookValue = getPriceOverBookValue();
		
		assertEquals("1,28", priceOverBookValue);
	}

	@Test
	public void testGetPriceOverEbit() {
		String priceOverEbit = getPriceOverEbit();
		
		assertEquals("4,15", priceOverEbit);
	}

	@Test
	public void testGetPriceSalesRatio() {
		String priceSalesRatio = getPriceSalesRatio();
		
		assertEquals("1,21", priceSalesRatio);
	}

	@Test
	public void testGetPriceOverAssets() {
		String priceOverAsset = getPriceOverAssets();
		
		assertEquals("0,42", priceOverAsset);
	}

	@Test
	public void testGetPriceOverWorkingCapital() {
		String priceOverWorkingCapital = getPriceOverWorkingCapital();
		
		assertEquals("28,09", priceOverWorkingCapital);
	}

	@Test
	public void testGetPriceOverNetCurretAsset() {
		String priceOverNetCurrentAsset = getPriceOverNetCurretAsset();
		
		assertEquals("-0,84", priceOverNetCurrentAsset);
	}

	@Test
	public void testGetDividendYieldTextValue() {
		String dividendYieldTextValue = getDividendYieldTextValue();
		
		assertEquals("3,7%", dividendYieldTextValue);
	}

	@Test
	public void testGetEnterpriseValueOverEbit() {
		String enterpriseValueOverEbit = getEnterpriseValueOverEbit();
		
		assertEquals("4,62", enterpriseValueOverEbit);
	}

	@Test
	public void testGeAssetTurnover() {
		String assetTurnover = getAssetTurnover();
		
		assertEquals("0,35", assetTurnover);
	}

	@Test
	public void testGeIncomeGrowthLast5Years() {
		String incomeGrowthLast5Years = getIncomeGrowthLast5Years();
		
		assertEquals("1,2%", incomeGrowthLast5Years);
	}

	@Test
	public void testGetProfitPerAction() {
		String profitPerAction = getProfitPerAction();
		
		assertEquals("2,61", profitPerAction);
	}

	@Test
	public void testGetBookValueOverStocks() {
		String bookValueOverStocks = getBookValueOverStocks();
		
		assertEquals("23,48", bookValueOverStocks);
	}

	@Test
	public void testGetGrossMargin() {
		String grossMargin = getGrossMargin();
		
		assertEquals("36,7%", grossMargin);
	}

	@Test
	public void testGetEbitMargin() {
		String ebitMargin = getEbitMargin();
		
		assertEquals("29,3%", ebitMargin);
	}

	@Test
	public void testGetNetMargin() {
		String netMargin = getNetMargin();
		
		assertEquals("11,0%", netMargin);
	}
	
	@Test
	public void testGetEvitOverAsset() {
		String evitOverAsset = getEvitOverAsset();
		
		assertEquals("10,2%", evitOverAsset);
	}
	
	@Test
	public void testGetReturnOverInvestedCapital() {
		String returnOverInvestedCapital = getReturnOverInvestedCapital();
		
		assertEquals("11,2%", returnOverInvestedCapital);
	}

	@Test
	public void testGetReturnOverEquity() {
		String returnOverEquity = getReturnOverEquity();
		
		assertEquals("11,1%", returnOverEquity);
	}

	@Test
	public void testGetCurrentLiquidity() {
		String currentLiquidity = getCurrentLiquidity();
		
		assertEquals("1,10", currentLiquidity);
	}
	
	@Test
	public void testGetGrossDebtOverEquity() {
		String grossDebtOverEquity = getGrossDebtOverEquity();
		
		assertEquals("1,22", grossDebtOverEquity);
	}
	
}
