package brokerDealer.core;

import static brokerDealer.util.math.UtilMath.*;

import java.math.BigDecimal;
import java.util.ArrayList;
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
						stockOrder.getOrderValue()
					);
				} else {
					if ( stockOrder.getType() == OrderType.SELL ) {
						response = response.add(
							stockOrder.getOrderValue()
						);
					}
				}
			}
		}
		
		return response;
	}
	
	public static BigDecimal calcBuyMeanPrice( List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( pListStockOrder != null && !pListStockOrder.isEmpty() ) {
			
			int totalQuantityStocks = 0;
			
			List<StockOrder> listBuyOrders = getBuyOrders(pListStockOrder);
			
			for ( StockOrder stockOrder: listBuyOrders ) {
				totalQuantityStocks = totalQuantityStocks + stockOrder.getQuantity();
				
				response = response.add(
					stockOrder.getOrderValue()
				);
			}
			
			response = divide(response, totalQuantityStocks);
		}
		
		return response;
	}
	
	public static List<StockOrder> getBuyOrders( List<StockOrder> pListStockOrder ) {
		List<StockOrder> listBuyOrders = new ArrayList<>();
		
		if ( pListStockOrder != null && !pListStockOrder.isEmpty() ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				if ( stockOrder.getType() == OrderType.BUY ) {
					listBuyOrders.add(stockOrder);
				}
			}
		}
		
		return listBuyOrders;
	}
	
	public static BigDecimal calcProfitPercentual( List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( pListStockOrder != null && !pListStockOrder.isEmpty() ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				
				int quantity = stockOrder.getQuantity();
				BigDecimal price = stockOrder.getPrice();
				if ( stockOrder.getType() == OrderType.BUY ) {
					response = response.subtract(
						multiply(price, quantity)
					);
				} else {
					if ( stockOrder.getType() == OrderType.SELL ) {
						response = response.add(
							multiply(price, quantity)
						);
					}
				}
				
				
			}
		}
		
		return response;
	}
	
}