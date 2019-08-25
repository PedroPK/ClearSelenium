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
		
		if ( isListValid(pListStockOrder) ) {
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
	
	public static BigDecimal calcBuyAveragePrice( List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( isListValid(pListStockOrder) ) {
			
			int totalQuantityStocks = 0;
			
			List<StockOrder> listBuyOrders = getBuyOrders(pListStockOrder);
			
			for ( StockOrder stockOrder: listBuyOrders ) {
				if ( stockOrder.getType().equals(OrderType.BUY) ) {
					totalQuantityStocks = totalQuantityStocks + stockOrder.getQuantity();
					
					response = response.add(
						stockOrder.getOrderValue()
					);
				}
			}
			
			response = divide(response, totalQuantityStocks);
		}
		
		return response;
	}
	
	public static BigDecimal calcSellAveragePrice( List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( isListValid(pListStockOrder) ) {
			
			int totalQuantityStocks = 0;
			
			List<StockOrder> listSellOrders = getSellOrders(pListStockOrder);
			
			for ( StockOrder stockOrder: listSellOrders ) {
				if ( stockOrder.getType().equals(OrderType.SELL) ) {
					totalQuantityStocks = totalQuantityStocks + stockOrder.getQuantity();
					
					response = response.add(
						stockOrder.getOrderValue()
					);
				}
			}
			
			response = divide(response, totalQuantityStocks);
		}
		
		return response;
	}
	
	public static List<StockOrder> getBuyOrders( List<StockOrder> pListStockOrder ) {
		List<StockOrder> listBuyOrders = new ArrayList<>();
		
		if ( isListValid(pListStockOrder) ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				if ( stockOrder.getType() == OrderType.BUY ) {
					listBuyOrders.add(stockOrder);
				}
			}
		}
		
		return listBuyOrders;
	}
	
	public static List<StockOrder> getSellOrders( List<StockOrder> pListStockOrder ) {
		List<StockOrder> listSellOrders = new ArrayList<>();
		
		if ( isListValid(pListStockOrder) ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				if ( stockOrder.getType() == OrderType.SELL ) {
					listSellOrders.add(stockOrder);
				}
			}
		}
		
		return listSellOrders;
	}
	
	public static BigDecimal calcProfitPercentage( List<StockOrder> pListStockOrder ) {
		BigDecimal response = BigDecimal.ZERO;
		
		if ( isListValid(pListStockOrder) ) {
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
	
	private static boolean isListValid(List<StockOrder> pListStockOrder) {
		return pListStockOrder != null && !pListStockOrder.isEmpty();
	}
	
}