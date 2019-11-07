package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.BalanceSheetIndicators.*;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalanceSheetIndicatorsTest {
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		accessTickerDetails(petr4, true);
	}
	
	@Test
	public void testGetAssetPETR4() {
		String asset = getAsset();
		
		assertEquals("924.465.000.000", asset);
	}

	@Test
	public void testGetAvailableCashPETR4() {
		String availableCash = getAvailableCash();
		
		assertEquals("60.309.000.000", availableCash);
	}

	@Test
	public void testGetCurrentAssetPETR4() {
		String currentAsset = getCurrentAsset();
		
		assertEquals("147.601.000.000", currentAsset);
	}

	@Test
	public void testGetGrossDebtPETR4() {
		String grossDebt = getGrossDebt();
		
		assertEquals("374.381.000.000", grossDebt);
	}

	@Test
	public void testGetNetDebtPETR4() {
		String netDebt = getNetDebt();
		
		assertEquals("314.072.000.000", netDebt);
	}

	@Test
	public void testGetquityPETR4() {
		String equity = getEquity();
		
		assertEquals("306.252.000.000", equity);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
}