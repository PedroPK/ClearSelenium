package brokerDealer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import seleniumWebDriver.entities.StockOrder;

@Repository
public interface StockOrderRepository extends JpaRepository<StockOrder, Integer> {
	
	public List<StockOrder> findByTicker(String ticker);
	
}