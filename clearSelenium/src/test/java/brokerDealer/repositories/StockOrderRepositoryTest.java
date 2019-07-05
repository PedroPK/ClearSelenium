package brokerDealer.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

import brokerDealer.springBoot.SpringBootWebApplication;
import seleniumWebDriver.entities.StockOrder;
import seleniumWebDriver.entities.enums.OrderType;

@RunWith(SpringRunner.class)
@SpringBootTest(
	classes= {
		SpringBootWebApplication.class
	}
)
public class StockOrderRepositoryTest {
	
	@Autowired
	private StockOrderRepository repository;
	
	private static Logger logger;
	
	
	@BeforeClass
	public static void getLogger() {
		logger = LoggerFactory.getLogger(StockOrderRepositoryTest.class);
	}
	
	@Ignore @Test
	public void testFindAll() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllSort() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllByIdIterableOfID() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testSaveAllIterableOfS() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFlush() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFirstSaveAndFlush() {
		// Arrange
		StockOrder order = new StockOrder();
		order.setDateTime(LocalDateTime.now());
		order.setTicker("PETR4F");
		order.setQuantity(10);
		order.setPrice(BigDecimal.valueOf(40));
		order.setType(OrderType.BUY);
		
		Example<StockOrder> orderExample = Example.of(order);
		
		// Act
		repository.saveAndFlush(order);
		
		Optional<StockOrder> findedOrder = repository.findOne(orderExample);
		
		// Assert
		assertNotNull(findedOrder);
		assertTrue(findedOrder.isPresent());
		assertFalse(findedOrder.isEmpty());
		
		logger.info("Original Order: " + order.toString());
		logger.info("Finded Order:   " + findedOrder.get().toString());
	}
	
	@Test
	public void testSaveAndFlush_1Buy_3Sell() {
		// Arrange
		StockOrder orderBuyVVAR3 = new StockOrder();
		orderBuyVVAR3.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 02), LocalTime.of(10, 01, 02)));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(90);
		orderBuyVVAR3.setPrice(5.13);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		StockOrder orderSellVVAR3_First = new StockOrder();
		orderSellVVAR3_First.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 03), LocalTime.of(11, 02, 03)));
		orderSellVVAR3_First.setTicker("VVAR3");
		orderSellVVAR3_First.setQuantity(45);
		orderSellVVAR3_First.setPrice(5.5);
		orderSellVVAR3_First.setType(OrderType.SELL);
		
		StockOrder orderSellVVAR3_Second = new StockOrder();
		orderSellVVAR3_Second.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 03), LocalTime.of(12, 03, 04)));
		orderSellVVAR3_Second.setTicker("VVAR3");
		orderSellVVAR3_Second.setQuantity(30);
		orderSellVVAR3_Second.setPrice(5.9);
		orderSellVVAR3_Second.setType(OrderType.SELL);
		
		StockOrder orderSellVVAR3_Third = new StockOrder();
		orderSellVVAR3_Third.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 05), LocalTime.of(12, 34, 35)));
		orderSellVVAR3_Third.setTicker("VVAR3");
		orderSellVVAR3_Third.setQuantity(55);
		orderSellVVAR3_Third.setPrice(6.5);
		orderSellVVAR3_Third.setType(OrderType.SELL);
		
		Example<StockOrder> orderBuyVVAR3Example = Example.of(orderBuyVVAR3);
		
		// Act
		repository.saveAndFlush(orderBuyVVAR3);
		repository.saveAndFlush(orderSellVVAR3_First);
		repository.saveAndFlush(orderSellVVAR3_Second);
		repository.saveAndFlush(orderSellVVAR3_Third);
		
		Optional<StockOrder> findedOrder = repository.findOne(orderBuyVVAR3Example);
		
		// Assert
		assertNotNull(findedOrder);
		assertTrue(findedOrder.isPresent());
		assertFalse(findedOrder.isEmpty());
		
		logger.info("Buy VVAR3: 	" + orderBuyVVAR3.toString());
		logger.info("Finded VAAR3:	" + findedOrder.get().toString());
		
		logger.info("Sell VVAR3 1: 	" + orderSellVVAR3_First.toString());
		logger.info("Sell VVAR3 2: 	" + orderSellVVAR3_Second.toString());
		logger.info("Sell VVAR3 3: 	" + orderSellVVAR3_Third.toString());
	}
	
	@Ignore @Test
	public void testDeleteInBatch() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testDeleteAllInBatch() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testGetOne() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllExampleOfS() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllExampleOfSSort() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllSort1() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testFindAllPageable() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testSave() {
		fail("Not yet implemented");
	}
	
	@Ignore @Test
	public void testSaveAllIterableOfS1() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testExistsById() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindAll1() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindAllByIdIterableOfID1() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testCount() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testDeleteAllIterableOfQextendsT() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindOne() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindAllExampleOfS1() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindAllExampleOfSSort1() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testFindAllExampleOfSPageable() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testCountExampleOfS() {
		fail("Not yet implemented");
	}

	@Ignore @Test
	public void testExists() {
		fail("Not yet implemented");
	}

}
