package brokerDealer.core;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import brokerDealer.repositories.StockOrderJpaRepository;

public class StockCalculator {
	
	@Autowired
	private StockOrderJpaRepository repository;
	
	public BigDecimal calcProfit(String pTicker) {
		BigDecimal result = BigDecimal.ZERO;
		
		if ( pTicker != null && !pTicker.isEmpty() ) {
			repository.findByTicker(pTicker);
		}
		
		return result;
	}
	
}