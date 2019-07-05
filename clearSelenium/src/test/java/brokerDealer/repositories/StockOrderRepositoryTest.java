package brokerDealer.repositories;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.ContextConfiguration;
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
	StockOrderRepository repository;
	
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
	public void testSaveAndFlush() {
		// Arrange
		StockOrder order = new StockOrder();
		order.setDateTime(LocalTime.now());
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
		
		Logger logger = LoggerFactory.getLogger(StockOrderRepositoryTest.class);
		
		logger.info(order.toString());
		//System.out.println(order);
		
		System.out.println(findedOrder);
		//fail("Not yet implemented");
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
