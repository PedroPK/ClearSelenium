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
		StatusInvestHome.accessTickerDetails(petr4, true);
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
		
		//assertEquals("-35,69", priceOverEbit);
	}
	
	@Test
	public void testGetPriceSalesRatio() {
		String priceSalesRatio = this.aFundamentalistIndicatorsStatusInvest.getPriceSalesRatio();
		
		assertNotNull(	priceSalesRatio );
		assertEquals(	"Preço sobre Receita Líquida por Ação deveria ter 4 Caracteres",	 4,		priceSalesRatio.length()	);
		assertTrue( 	priceSalesRatio.contains(","));
		
		//assertEquals("1,00", priceSalesRatio);
	}
	
	@Test
	public void testGetPriceOverAssets() {
		String priceOverAsset = this.aFundamentalistIndicatorsStatusInvest.getPriceOverAssets();
		
		assertNotNull(	priceOverAsset );
		assertEquals(	"Preço sobre Ativos deveria ter 4 Caracteres",	 4,		priceOverAsset.length()	);
		assertTrue( 	priceOverAsset.contains(","));
		
		//assertEquals("0,28", priceOverAsset);
	}
	
	@Test
	public void testGetPriceOverWorkingCapital() {
		String priceOverWorkingCapital = this.aFundamentalistIndicatorsStatusInvest.getPriceOverWorkingCapital();
		
		assertNotNull( 	priceOverWorkingCapital );
		assertEquals(	"Preço sobre Capital de Giro deveria ter 4 Caracteres",	 4,		priceOverWorkingCapital.length()	);
		assertTrue( 	priceOverWorkingCapital.contains(","));
		
		//assertEquals("4,93", priceOverWorkingCapital);
	}
	
	@Test
	public void testGetPriceOverNetCurretAsset() {
		String priceOverNetCurrentAsset = this.aFundamentalistIndicatorsStatusInvest.getPriceOverNetCurretAsset();
		
		assertNotNull( 	priceOverNetCurrentAsset );
		assertEquals(	"Preço sobre Ativo Circulante Líquido deveria ter 5 Caracteres",	 5,		priceOverNetCurrentAsset.length()	);
		assertTrue( 	priceOverNetCurrentAsset.contains(","));
		
		//assertEquals("-0,35", priceOverNetCurrentAsset);
	}
	
	@Test
	public void testGetDividendYieldTextValue() {
		String dividendYieldTextValue = this.aFundamentalistIndicatorsStatusInvest.getDividendYieldTextValue();
		
		assertNotNull(	dividendYieldTextValue);
		assertEquals(	"Dividend Yield deveria ter 4 Caracteres",	 4,		dividendYieldTextValue.length()	);
		assertTrue( 	dividendYieldTextValue.contains(","));
		
		//assertEquals("2,85", dividendYieldTextValue);
	}
	
	@Test
	public void testGetEnterpriseValueOverEbit() {
		String enterpriseValueOverEbit = this.aFundamentalistIndicatorsStatusInvest.getEnterpriseValueOverEbit();
		
		assertNotNull( 	enterpriseValueOverEbit );
		assertEquals(	"Enterprise Value sobre Ebit deveria ter 6 Caracteres",	 6,		enterpriseValueOverEbit.length()	);
		assertTrue( 	enterpriseValueOverEbit.contains(","));
		
		//assertEquals("-84,65", enterpriseValueOverEbit);
	}
	
	@Test
	public void testGeAssetTurnover() {
		String assetTurnover = this.aFundamentalistIndicatorsStatusInvest.getAssetTurnover();
		
		assertNotNull(	assetTurnover );
		assertEquals(	"Giro de Ativos deveria ter 4 Caracteres",	 4,		assetTurnover.length()	);
		assertTrue( 	assetTurnover.contains(","));
		
		//assertEquals("0,28", assetTurnover);
	}
	
	@Test
	public void testGeIncomeGrowthLast5Years() {
		String incomeGrowthLast5Years = this.aFundamentalistIndicatorsStatusInvest.getIncomeGrowthLast5Years();
		
		assertNotNull(	incomeGrowthLast5Years );
		assertEquals(	"Crescimento da Receita Líquida deveria ter 6 Caracteres",	 6,		incomeGrowthLast5Years.length()	);
		assertTrue(		incomeGrowthLast5Years.contains(",") );
		assertTrue(		incomeGrowthLast5Years.contains("%") );
		
		//assertEquals("-2,17%", incomeGrowthLast5Years);
	}
	
	@Test
	public void testGetProfitPerAction() {
		String profitPerAction = this.aFundamentalistIndicatorsStatusInvest.getProfitPerAction();
		
		assertNotNull(	profitPerAction );
		assertEquals(	"Lucro por Ação deveria ter 5 Caracteres",	 5,		profitPerAction.length()	);
		assertTrue(		profitPerAction.contains(",") );
		
		//assertEquals("-2,61", profitPerAction);
	}
	
	@Test
	public void testGetBookValueOverStocks() {
		String bookValueOverStocks = this.aFundamentalistIndicatorsStatusInvest.getBookValueOverStocks();
		
		assertNotNull(	bookValueOverStocks );
		assertEquals(	"Valor Patrimonial por Ação deveria ter 5 Caracteres",	 5,		bookValueOverStocks.length()	);
		assertTrue(		bookValueOverStocks.contains(",") );
		
		//assertEquals("18,61", bookValueOverStocks);
	}
	
	@Test
	public void testGetGrossMargin() {
		String grossMargin = this.aFundamentalistIndicatorsStatusInvest.getGrossMargin();
		
		assertNotNull(	grossMargin);
		assertEquals(	"Margem Bruta deveria ter 6 Caracteres",	 6,		grossMargin.length()	);
		assertTrue(		grossMargin.contains(",") );
		assertTrue(		grossMargin.contains("%") );
		
		//assertEquals("40,99%", grossMargin);
	}
	
	@Test
	public void testGetEbitMargin() {
		String ebitMargin = this.aFundamentalistIndicatorsStatusInvest.getEbitMargin();
		
		assertNotNull(	ebitMargin );
		assertEquals(	"Margem EBIT deveria ter 6 Caracteres",	 6,		ebitMargin.length()	);
		assertTrue(		ebitMargin.contains(",") );
		assertTrue(		ebitMargin.contains("%") );
		
		//assertEquals("-2,80%", ebitMargin);
	}
	
	@Test
	public void testGetNetMargin() {
		String netMargin = this.aFundamentalistIndicatorsStatusInvest.getNetMargin();
		
		assertNotNull(	netMargin );
		assertEquals(	"Margem Líquida deveria ter 7 Caracteres",	 7,		netMargin.length()	);
		assertTrue(		netMargin.contains(",") );
		assertTrue(		netMargin.contains("%") );
		
		//assertEquals("-11,92%", netMargin);
	}
	
	/**
	 * Não parece existir esta Métrica no Status Invest
	 */
	@Ignore
	@Test
	public void testGetEbitOverAsset() {
		String evitOverAsset = this.aFundamentalistIndicatorsStatusInvest.getEbitOverAsset();
		
		assertNotNull( evitOverAsset );
		assertTrue( evitOverAsset.contains(",") );
		assertTrue( evitOverAsset.contains("%") );
		
		//assertEquals("10,2%", evitOverAsset);
	}
	
	@Test
	public void testGetReturnOverInvestedCapital() {
		String returnOverInvestedCapital = this.aFundamentalistIndicatorsStatusInvest.getReturnOverInvestedCapital();
		
		assertNotNull(	returnOverInvestedCapital );
		assertEquals(	"Retorno sobre Capital Investido deveria ter 6 Caracteres",	 6,		returnOverInvestedCapital.length()	);
		assertTrue(		returnOverInvestedCapital.contains(",") );
		assertTrue(		returnOverInvestedCapital.contains("%") );
		
		//assertEquals("-3,01%", returnOverInvestedCapital);
	}
	
	@Test
	public void testGetReturnOverEquity() {
		String returnOverEquity = this.aFundamentalistIndicatorsStatusInvest.getReturnOverEquity();
		
		assertNotNull(	returnOverEquity );
		assertEquals(	"Retorno sobre Patrimônio Líquido deveria ter 7 Caracteres",	 7,		returnOverEquity.length()	);
		assertTrue(		returnOverEquity.contains(",") );
		assertTrue(		returnOverEquity.contains("%") );
		
		//assertEquals("-14,00%", returnOverEquity);
	}
	
	@Test
	public void testGetCurrentLiquidity() {
		String currentLiquidity = this.aFundamentalistIndicatorsStatusInvest.getCurrentLiquidity();
		
		assertNotNull(	currentLiquidity );
		assertEquals(	"Liquidez Corrente deveria ter 4 Caracteres",	 4,		currentLiquidity.length()	);
		assertTrue(		currentLiquidity.contains(",") );
		
		//assertEquals("1,40", currentLiquidity);
	}
	
	@Test
	public void testGetGrossDebtOverEquity() {
		String grossDebtOverEquity = this.aFundamentalistIndicatorsStatusInvest.getGrossDebtOverEquity();
		
		assertNotNull( grossDebtOverEquity );
		assertTrue( grossDebtOverEquity.length() == 4);
		
		//assertEquals("1,22", grossDebtOverEquity);
	}
	
}