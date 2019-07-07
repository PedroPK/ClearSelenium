package brokerDealer.repositories;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import brokerDealer.core.StockCalculator;
import brokerDealer.springBoot.SpringBootWebApplication;
import seleniumWebDriver.entities.StockOrder;

import static brokerDealer.repositories.StockOrderDatasetGenerator.*;

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
		List<StockOrder> listVvar3StockOrders = get1Buy3SellVvar3StockOrders();
		
		// Act
		BigDecimal result = StockCalculator.calcProfit(listVvar3StockOrders);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(32030, 2), result);
	}
	
	@Test
	public void testCalcProfit_BuyOnly_Petr4() {
		// Arrange
		List<StockOrder> listPetr4BuyStockOrder = new ArrayList<>();
		listPetr4BuyStockOrder.add(getBuyPetr4StockOrder());
		
		// Act
		BigDecimal result = StockCalculator.calcProfit(listPetr4BuyStockOrder);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(-400), result);
	}
	
	@Test
	public void testCalcProfit_BuyOnly_Vvar3() {
		// Arrange
		List<StockOrder> listPetr4BuyStockOrder = new ArrayList<>();
		listPetr4BuyStockOrder.add(getBuyVvar3StockOrder());
		
		// Act
		BigDecimal result = StockCalculator.calcProfit(listPetr4BuyStockOrder);
		
		// Assert
		assertNotNull(result);			// The way to set the 461,70 Value with right Scale
		assertEquals(BigDecimal.valueOf(-46170, 2), result);
	}
	
	@Test
	public void testCalcProfit_EmptyList() {
		// Arrange
		List<StockOrder> listEmpty = new ArrayList<>();
		
		// Act
		BigDecimal result = StockCalculator.calcProfit(listEmpty);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
}