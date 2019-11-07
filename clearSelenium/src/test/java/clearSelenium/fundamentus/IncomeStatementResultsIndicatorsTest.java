package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.IncomeStatementResultsIndicators.*;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class IncomeStatementResultsIndicatorsTest {
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		accessTickerDetails(petr4, true);
	}
	
	@Test
	public void testGetNetIncomeLast12MonthsPETR4() {
		String netIncomeLast12Months = getNetIncomeLast12Months();
		
		assertEquals("322.337.000.000", netIncomeLast12Months);
	}

	@Test
	public void testGetEbitLast12MonthsPETR4() {
		String ebitLast12Months = getEbitLast12Months();
		
		assertEquals("94.388.000.000", ebitLast12Months);
	}

	@Test
	public void testGetNetProfitLast12MonthsPETR4() {
		String netProfitLast12Months = getNetProfitLast12Months();
		
		assertEquals("34.086.000.000", netProfitLast12Months);
	}

	@Test
	public void testGetNetIncomeLast03MonthsPETR4() {
		String netIncomeLast03Months = getNetIncomeLast03Months();
		
		assertEquals("77.051.000.000", netIncomeLast03Months);
	}

	@Test
	public void testGetEbitLast03MonthsPETR4() {
		String ebitLast03Months = getEbitLast03Months();
		
		assertEquals("23.026.000.000", ebitLast03Months);
	}

	@Test
	public void testGetNetProfitLast03MonthsPETR4() {
		String netProfitLast03Months = getNetProfitLast03Months();
		
		assertEquals("9.087.000.000", netProfitLast03Months);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
}