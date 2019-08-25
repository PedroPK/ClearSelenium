package brokerDealer.core;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static brokerDealer.core.StockCalculator.*;
import static brokerDealer.repositories.StockOrderDatasetGenerator.*;

import seleniumWebDriver.entities.StockOrder;

@RunWith(SpringRunner.class)
/*@SpringBootTest(
	classes= {
		SpringBootWebApplication.class
	}
)*/
public class StockCalculatorTest {
	
	@Test
	public void testCalcProfit() {
		// Arrange
		List<StockOrder> listVvar3StockOrders = get1Vvar3_1Buy3SellStockOrders();
		
		// Act
		BigDecimal result = calcProfit(listVvar3StockOrders);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(76850, 2), result);
	}
	
	@Test
	public void testGetBuyOrders_FromListWithOnlyOneBuyOrderAmongOtherSellOrders() {
		// Arrange
		List<StockOrder> listVvar3StockOrders = get1Vvar3_1Buy3SellStockOrders();
		
		// Act
		List<StockOrder> listBuyOrders = getBuyOrders(listVvar3StockOrders);
		
		// Assert
		assertNotNull(listBuyOrders);
		assertEquals(1, listBuyOrders.size());
		assertEquals(getBuyVvar3StockOrder_2019_07_02(), listBuyOrders.get(0));
	}
	
	@Test
	public void testGetBuyOrders_FromListWithTwoBuyOrderAmongOtherSellOrders() {
		// Arrange
		List<StockOrder> listVvar3StockOrders = get1Vvar3_1Buy3SellStockOrders();
		
		// Act
		List<StockOrder> listBuyOrders = getBuyOrders(listVvar3StockOrders);
		
		// Assert
		assertNotNull(listBuyOrders);
		assertEquals(1, listBuyOrders.size());
		assertEquals(getBuyVvar3StockOrder_2019_07_02(), listBuyOrders.get(0));
	}
	
	@Test
	public void testGetBuyOrders_FromAllVvar3StockOrders() {
		// Arrange
		List<StockOrder> listVvar3StockOrders = getAllVvar3StockOrders();
		
		// Act							Mean Buy Value:		1190.88 / 230	= 5.1777
		List<StockOrder> listBuyOrders = getBuyOrders(listVvar3StockOrders);
		
		// Assert
		assertNotNull(listBuyOrders);
		assertEquals(9, listBuyOrders.size());
		
		//			Mean Buy Value:		1190.88 / 230	= 5.1777
		assertEquals(BigDecimal.valueOf(-119088,2), calcProfit(listBuyOrders));
	}
	
	@Test
	public void testCalcProfit_BuyOnly_Petr4() {
		// Arrange
		List<StockOrder> listPetr4BuyStockOrder = new ArrayList<>();
		listPetr4BuyStockOrder.add(getBuyPetr4StockOrder());
		
		// Act
		BigDecimal result = calcProfit(listPetr4BuyStockOrder);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(-400), result);
	}
	
	@Test
	public void testCalcProfit_BuyOnly_Vvar3() {
		// Arrange
		List<StockOrder> listPetr4BuyStockOrder = new ArrayList<>();
		listPetr4BuyStockOrder.add(getBuyVvar3StockOrder_2019_07_02());
		
		// Act
		BigDecimal result = calcProfit(listPetr4BuyStockOrder);
		
		// Assert
		assertNotNull(result);			// The way to set the 461,70 Value with right Scale
		assertEquals(BigDecimal.valueOf(-46170, 2), result);
	}
	
	@Test
	public void testCalcProfit_EmptyList() {
		// Arrange
		List<StockOrder> listEmpty = new ArrayList<>();
		
		// Act
		BigDecimal result = calcProfit(listEmpty);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testCalProfit_BRFS3_04Jun2019_OneBuy_ThreeSells() {
		// Arrange
		List<StockOrder>	listBuyVvar3StockOrders	=	getBrfs3_1Buy3SellsStockOrders();
		
		// Act
		BigDecimal result = calcProfit(listBuyVvar3StockOrders);
		
		// Assert
		assertNotNull(result);		// R$91,50
		assertEquals(BigDecimal.valueOf(9150, 2), result);
		
		// Logging
	}
	
	/**
	 * 	Calc Average Buy Price
	 */
	@Test
	public void testCalcAverageBuyPrice_OnlyWithBuyOrders() {
		// Arrange
		List<StockOrder>	listSellVvar3StockOrders	=	getBuyVvar3StockOrders();
		
		// Act
		BigDecimal averageBuyPrice = calcBuyAveragePrice(listSellVvar3StockOrders);
		
		// Assert					R$  5,17
		assertEquals(BigDecimal.valueOf(517, 2), averageBuyPrice);
	}
	
	/**
	 * 	Calc Average Buy Price
	 */
	@Test
	public void testCalcAverageBuyPrice_MixedBuyAndSellOrders() {
		// Arrange
		List<StockOrder>	listBuyAndSellVvar3StockOrders	=	getAllVvar3StockOrders();
		
		// Act
		BigDecimal averageBuyPrice = calcBuyAveragePrice(listBuyAndSellVvar3StockOrders);
		
		// Assert					R$  5,17
		assertEquals(BigDecimal.valueOf(517, 2), averageBuyPrice);
	}
	
	/**
	 * TODO		Calc Average Sell Price
	 */
	@Test
	public void testCalcAverageSellPrice_OnlyWithSellOrders() {
		// Arrange
		List<StockOrder>	listBRFS3StockOrders	=	getSellVvar3StockOrders();
		
		// Act
		BigDecimal averageSellPrice = calcSellAveragePrice(listBRFS3StockOrders);
		
		// Assert
		assertEquals(
			BigDecimal.valueOf(584, 2), 
			averageSellPrice			.setScale(2, RoundingMode.HALF_DOWN));
	}
	
	/**
	 * TODO Calc Profit Percentual
	 */
	@Test
	public void testCalcProficPercentage_BRFS3_04Jun2019_OnBuy_ThreeSells() {
		// Arrange
		List<StockOrder>	listBRFS3StockOrders	=	getBrfs3_1Buy3SellsStockOrders();
		
		// Act
		BigDecimal result = calcProfitPercentage(listBRFS3StockOrders);
		
		// Assert
		assertNotNull(result);		//  10,46%
		assertEquals(BigDecimal.valueOf(1046, 2), result);
	}
	
	/**
	 * TODO Calc Total Order Value
	 */
	
	/**
	 * TODO Calc Total Profit Value
	 */
	
	
	// Template Test Method
	@Ignore
	@Test
	public void testTeplateMethod() {
		// Arrange
		
		
		// Act
		
		
		// Assert
		
		
	}
	
}