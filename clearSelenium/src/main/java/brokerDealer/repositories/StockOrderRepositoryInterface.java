package brokerDealer.repositories;

import java.util.List;

import seleniumWebDriver.entities.StockOrder;

public interface StockOrderRepositoryInterface {
	
	public List<StockOrder> findAllStockOrdersByTicker(String pTicker);
	
	/*public static List<StockOrder> findAllStockOrdersByTicker(String pTicker) {
		Example<StockOrder> exampleOrder = StockOrderRepositoryInterface.getStockOrderExample(pTicker);
		
		List<StockOrder> orders = findAll(exampleOrder);
		
		return orders;
	}*/
	
}