package brokerDealer.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
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
import static brokerDealer.repositories.StockOrderDatasetGenerator.*;
import seleniumWebDriver.entities.StockOrder;

@RunWith(SpringRunner.class)
@SpringBootTest(
	classes= {
		SpringBootWebApplication.class
	}
)
public class StockOrderRepositoryTest {
	
	@Autowired
	private StockOrderRepository jpaRepository;
	
	/*@Autowired
	private StockOrderRepository	repository;*/
	
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
		StockOrder order = getBuyPetr4StockOrder();
		
		Example<StockOrder> orderExample = getStockOrderExample(order);
		
		// Act
		jpaRepository.saveAndFlush(order);
		
		Optional<StockOrder> findedOrder = jpaRepository.findOne(orderExample);
		
		// Assert
		assertNotNull(	findedOrder);
		assertTrue(		findedOrder.isPresent());
		//assertFalse(	findedOrder.isEmpty());
		
		// Logging
		logger.info("Original Order: " + order.toString());
		logger.info("Finded Order:   " + findedOrder.get().toString());
		
		// Tear Down
		jpaRepository.delete(order);
	}
	
	@Test
	public void testSaveAndFlush_1Buy_3Sell() {
		// Arrange
		List<StockOrder> listStockOrdersToSaveAndFlush = 
			getVvar3_1Buy3SellStockOrders();
		
		// Act
		saveAndFlush(listStockOrdersToSaveAndFlush);
		
		Optional<StockOrder> findedOrder = 
			this.jpaRepository.findOne(
				getExample(getBuyVvar3StockOrder_2019_07_02())
			);
		
		// Assert
		assertNotNull(	findedOrder);
		assertTrue(		findedOrder.isPresent());
		//assertFalse(	findedOrder.isEmpty());
		
		// Logging
		logger.info("Buy VVAR3: 	" + getBuyVvar3StockOrder_2019_07_02().toString());
		logger.info("Finded VAAR3:	" + findedOrder.get().toString());
		
		logger.info("Sell VVAR3 1: 	" + getSellVvar3StockOrder_2019_07_03_First().toString());
		logger.info("Sell VVAR3 2: 	" + getSellVvar3StockOrder_2019_07_03_Second().toString());
		logger.info("Sell VVAR3 3: 	" + getSellVvar3StockOrder_2019_07_05().toString());
		
		// Tear Down
		jpaRepository.deleteAll(listStockOrdersToSaveAndFlush);
	}
	
	private void saveAndFlush(List<StockOrder> pListStockOrdersToSaveAndFlush) {
		for ( StockOrder stockOrder: pListStockOrdersToSaveAndFlush ) {
			jpaRepository.save(stockOrder);
		}
		jpaRepository.flush();
	}

	private Example<StockOrder> getExample(StockOrder pStockOrder) {
		Example<StockOrder> orderBuyVVAR3Example = Example.of(pStockOrder);
		return orderBuyVVAR3Example;
	}
	
	@Test
	public void testGetStockOrderExample() {
		// Arrange
		String ticker = "VVAR3";
		
		// Act
		Example<StockOrder> example = getStockOrderExample(ticker);
		
		// Assert
		assertNotNull(example);
	}
	
	@Test
	public void testFindAByTicker_Vvar3Only() {
		// Arrange
		List<StockOrder> listStockOrdersToSaveAndFlush = getVvar3_1Buy3SellStockOrders();
		
		// Act
		saveAndFlush(listStockOrdersToSaveAndFlush);
		
		List<StockOrder> listOrders = jpaRepository.findByTicker("VVAR3");
		
		// Assert
		assertNotNull(listOrders);
		assertFalse(listOrders.isEmpty());
		
		// Tear Down
		jpaRepository.deleteAll(listStockOrdersToSaveAndFlush);
	}
	@Test
	public void testFindAByTicker_Vvar3_with_Petr4() {
		// Arrange
		List<StockOrder> listStockOrdersToSaveAndFlush = getVvar3_1Buy3SellStockOrders();
		listStockOrdersToSaveAndFlush.add(getBuyPetr4StockOrder());
		
		// Act
		saveAndFlush(listStockOrdersToSaveAndFlush);
		
		List<StockOrder> listOrders = jpaRepository.findByTicker("VVAR3");
		
		// Assert
		assertNotNull(listOrders);
		assertFalse(listOrders.isEmpty());
		assertTrue(listOrders.size() == 4);
		
		// Tear Down
		jpaRepository.deleteAll(listStockOrdersToSaveAndFlush);
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
