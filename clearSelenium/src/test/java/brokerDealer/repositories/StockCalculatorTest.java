package brokerDealer.repositories;

import static brokerDealer.repositories.StockOrderDatasetGenerator.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static brokerDealer.core.StockCalculator.*;
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
	
	/**
	 * TODO Calc Profit Percentual
	 */
	
	/**
	 * TODO Calc Total Order Value
	 */
	
	/**
	 * TODO Calc Total Profit Value
	 */
	
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
		
		// Act
		List<StockOrder> listBuyOrders = getBuyOrders(listVvar3StockOrders);
		
		// Assert
		assertNotNull(listBuyOrders);
		assertEquals(9, listBuyOrders.size());
		assertEquals(BigDecimal.valueOf(-74268,2), calcProfit(listBuyOrders));
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
		assertEquals(BigDecimal.valueOf(-1350, 2), result);
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
	public void testCalProfit_BRFS3_06Jun2019_OneBuy_ThreeSells() {
		// Arrange
		List<StockOrder>	listBRFS3StockOrders	=	getBrfs3_1Buy3SellsStockOrders();
		
		// Act
		BigDecimal result = calcProfit(listBRFS3StockOrders);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(9150, 2), result);
		
		// Logging
	}
	
}