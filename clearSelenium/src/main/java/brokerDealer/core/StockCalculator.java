package brokerDealer.core;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import brokerDealer.repositories.StockOrderRepository;
import seleniumWebDriver.entities.StockOrder;
import seleniumWebDriver.entities.enums.OrderType;

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
	
	public static BigDecimal calcProfit(List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( pListStockOrder != null && !pListStockOrder.isEmpty() ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				if ( stockOrder.getType() == OrderType.BUY ) {
					response = response.subtract(
						stockOrder.getPrice().multiply(
							BigDecimal.valueOf(
								stockOrder.getQuantity()
							)
						)
					);
				} else {
					if ( stockOrder.getType() == OrderType.SELL ) {
						response = response.add(
							stockOrder.getPrice().multiply(
								BigDecimal.valueOf(
									stockOrder.getQuantity()
								)
							)
						);
					}
				}
			}
		}
		
		return response;
	}
	
}