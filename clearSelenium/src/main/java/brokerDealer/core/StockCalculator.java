package brokerDealer.core;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import brokerDealer.repositories.StockOrderRepository;

public class StockCalculator {
	
	@Autowired
	private StockOrderRepository repository;
	
	public BigDecimal calcProfit(String pTicker) {
		BigDecimal result = BigDecimal.ZERO;
		
		if ( pTicker != null && !pTicker.isEmpty() ) {
			repository.findByTicker(pTicker);
		}
		
		return result;
	}
	
}