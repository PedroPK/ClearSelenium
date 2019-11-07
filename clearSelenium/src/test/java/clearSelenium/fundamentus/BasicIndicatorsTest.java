package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.closeWebDriver;
import static clearSelenium.fundamentus.BasicIndicators.*;
import static clearSelenium.fundamentus.FundamentusHome.accessTickerDetails;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicIndicatorsTest {

	
	@BeforeClass
	public static void initializeChromeDriver() {
		// Arrange
		String petr4 = "PETR4";
		
		accessTickerDetails(petr4, true);
	}
	
	@Test
	public void testGeTickerPETR4() {
		String ticker = getTicker();
		
		assertEquals("PETR4", ticker);
	}
	
	@Test
	public void testGeTypePETR4() {
		String type = getType();
		
		assertEquals("PN", type);
	}
	
	@Test
	public void testGetCompanyPETR4() {
		String company = getCompany();
		
		assertEquals("PETROBRAS PN", company);
	}
	
	@Test
	public void testGetSectorPETR4() {
		String sector = getSector();
		
		assertEquals("Petróleo, Gás e Biocombustíveis", sector);
	}
	
	@Test
	public void testGetSubSectorPETR4() {
		String sector = getSubSector();
		
		assertEquals("Exploração e/ou Refino e Distribuição", sector);
	}
	
	@Test
	public void testGetPricePETR4() {
		String sector = getPrice();
		
		assertEquals("29,71", sector);
	}
	
	@Test
	public void testGetDatePricePETR4() {
		String sector = getDatePrice();
		
		assertEquals("06/11/2019", sector);
	}
	
	@Test
	public void testGetMinimumPriceLast52WeeksPETR4() {
		String minumiumPrice = getMinimumPriceLast52Weeks();
		
		assertEquals("20,68", minumiumPrice);
	}
	
	@Test
	public void testGetMaximumPriceLast52WeeksPETR4() {
		String maximumPrice = getMaximumPriceLast52Weeks();
		
		assertEquals("30,43", maximumPrice);
	}
	
	@Test
	public void testGeMAverageVolumeLast52WeeksPETR4() {
		String averageVolume = getAverageVolumeLast52Weeks();
		
		assertEquals("1.431.470.000", averageVolume);
	}
	
	@AfterClass
	public static void close() {
		closeWebDriver();
	}

}