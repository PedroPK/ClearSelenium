package brokerDealer.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import seleniumWebDriver.entities.StockOrder;

public class StockOrderRepository 
	implements StockOrderRepositoryInterface {
	
	@Autowired
	private StockOrderJpaRepository stockOrderJpaRepository;
	
	@Override
	public List<StockOrder> findAllStockOrdersByTicker(String pTicker) {
		Example<StockOrder> exampleOrder = StockOrderJpaRepository.getStockOrderExample(pTicker);
		
		List<StockOrder> orders = stockOrderJpaRepository.findAll(exampleOrder);
		
		return orders;
	}

}
