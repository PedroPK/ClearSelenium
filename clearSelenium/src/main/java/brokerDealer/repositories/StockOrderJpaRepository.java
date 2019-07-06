package brokerDealer.repositories;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import seleniumWebDriver.entities.StockOrder;

@Repository
public interface StockOrderJpaRepository extends JpaRepository<StockOrder, Integer> {
	
	public List<StockOrder> findByTicker(String ticker);
	
	public static Example<StockOrder> getStockOrderExample(String pTicker) {
		StockOrder order = new StockOrder();
		order.setTicker(pTicker);
		
		Example<StockOrder> exampleOrder = Example.of(order);
		return exampleOrder;
	}

}