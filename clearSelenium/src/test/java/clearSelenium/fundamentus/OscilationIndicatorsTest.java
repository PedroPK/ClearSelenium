package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;
import static clearSelenium.fundamentus.OscilationIndicators.*;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OscilationIndicatorsTest {
	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		accessTickerDetails(petr4, true);
	}
	
	@Test
	public void testGetDayOscilation() {
		String dayOscilation = getDayOscilation();
		
		assertEquals("0,20%", dayOscilation);
	}

	@Test
	public void testGetMonthOscilation() {
		String monthOscilation = getMonthOscilation();
		
		assertEquals("-2,24%", monthOscilation);
	}

	@Test
	public void testGetThirtyDaysOscilation() {
		String thirtyDaysOscilation = getThirtyDaysOscilation();
		
		assertEquals("12,07%", thirtyDaysOscilation);
	}

	@Test
	public void testGetTwenveMonthsOscilation() {
		String twenveMonthsOscilation = getTwenveMonthsOscilation();
		
		assertEquals("13,96%", twenveMonthsOscilation);
	}

	@Test
	public void testGetPresentYearOscilation() {
		String presentYearOscilation = getPresentYearOscilation();
		
		assertEquals("32,40%", presentYearOscilation);
	}

	@Test
	public void testGetLastYearOscilation() {
		String lastYearOscilation = getLastYearOscilation();
		
		assertEquals("45,90%", lastYearOscilation);
	}

	@Test
	public void testGetTwoLastYearsOscilation() {
		String twoLastYearsOscilation = getTwoLastYearsOscilation();
		
		assertEquals("8,31%", twoLastYearsOscilation);
	}

	@Test
	public void testGetThreeLastYearsOscilation() {
		String threeLastYearsOscilation = getThreeLastYearsOscilation();
		
		assertEquals("121,18%", threeLastYearsOscilation);
	}

	@Test
	public void testGetFourLastYearsOscilation() {
		String fourLastYearsOscilation = getFourLastYearsOscilation();
		
		assertEquals("-32,99%", fourLastYearsOscilation);
	}

	@Test
	public void testGetFiveLastYearsOscilation() {
		String fiveLastYearsOscilation = getFiveLastYearsOscilation();
		
		assertEquals("-36,30%", fiveLastYearsOscilation);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}
	
}