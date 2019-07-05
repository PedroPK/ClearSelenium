package brokerDealer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import seleniumWebDriver.entities.StockOrder;

public interface StockOrderRepository 
	extends JpaRepository<StockOrder, Integer> {
	
	
	
}