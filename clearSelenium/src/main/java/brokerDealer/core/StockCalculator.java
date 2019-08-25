package brokerDealer.core;

import static brokerDealer.util.math.UtilMath.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
				if ( stockOrder.isBuyOrder() ) {
					response = response.subtract(
						stockOrder.getOrderValue()
					);
				} else {
					if ( stockOrder.isSellOrder() ) {
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
	
	public static List<StockOrder> getBuyOrders( List<StockOrder> pListStockOrders ) {
		List<StockOrder> listBuyOrders = new ArrayList<>();
		
		if ( isListValid(pListStockOrders) ) {
			for ( StockOrder stockOrder: pListStockOrders ) {
				if ( stockOrder.isBuyOrder() ) {
					listBuyOrders.add(stockOrder);
				}
			}
		}
		
		return listBuyOrders;
	}
	
	
	/**
	 * TODO 
	 * 		Create a test for this
	 * 
	 * 
	 * @param pListStockOrders
	 * @return
	 */
	public BigDecimal sumTotalValueBuyOrders( Optional<List<StockOrder>>	pListStockOrders	) {
		BigDecimal result = BigDecimal.ZERO;
		
		if ( pListStockOrders.isPresent() ) {
			for ( StockOrder stockOrder : pListStockOrders.get() ) {
				if ( stockOrder.isBuyOrder() ) {
					
				}
			}
		}
		
		return result;
	}
	
	public static List<StockOrder> getSellOrders( List<StockOrder> pListStockOrder ) {
		List<StockOrder> listSellOrders = new ArrayList<>();
		
		if ( isListValid(pListStockOrder) ) {
			for ( StockOrder stockOrder: pListStockOrder ) {
				if ( stockOrder.isSellOrder() ) {
					listSellOrders.add(stockOrder);
				}
			}
		}
		
		return listSellOrders;
	}
	
	/**
	 * TODO		Implement Tests to this method
	 * 
	 * 
	 * @param pListStockOrder
	 * @return
	 */
	public static BigDecimal calcProfitPercentage( List<StockOrder> pListStockOrder ) {
		BigDecimal percentageOfProfit = BigDecimal.ZERO;
		
		if ( isListValid(pListStockOrder) ) {
			//for ( StockOrder stockOrder: pListStockOrder ) {
				
				// Sum Values from all Buy Orders
				BigDecimal totalBuyValue = sumTotalValueFromBuyOrders(pListStockOrder);
				
				// Sum Values from all Sell Orders
				BigDecimal totalSellValue = getTotalValueFromSellOrders(pListStockOrder);
				
				// Get the Division of Total Sell Value by the Total Buy Value
				BigDecimal totalSellDividedByTotalBuyValues = totalSellValue.divide(totalBuyValue, 4,  RoundingMode.HALF_EVEN);

				// Subtract 1 from this result
				totalSellDividedByTotalBuyValues = totalSellDividedByTotalBuyValues.subtract(BigDecimal.ONE);
				
				// Multiply this to 100 to get the final Percentage of Profit
				percentageOfProfit = totalSellDividedByTotalBuyValues.multiply(BigDecimal.TEN).multiply(BigDecimal.TEN);
				/*
				 * TODO 
				 * 
				 * Divide Sell by Buy values
				 * 
				 * Subtract by 1
				 * 
				 * Multiply by 100
				 * 
				 * This is the Percentage response
				 */
				
				/*int quantity = stockOrder.getQuantity();
				BigDecimal price = stockOrder.getPrice();
				if ( stockOrder.isBuyOrder() ) {
					response = response.subtract(
						multiply(price, quantity)
					);
				} else {
					if ( stockOrder.isSellOrder() ) {
						response = response.add(
							multiply(price, quantity)
						);
					}
				}*/
				
			//}
		}
		
		return percentageOfProfit.setScale(2);
	}
	
	/**
	 * TODO		Implement Tests to this method
	 * 
	 * 
	 * @param pListStockOrder
	 * @return
	 */
	private static BigDecimal getTotalValueFromSellOrders(List<StockOrder> pListStockOrder) {
		BigDecimal totalSellValue = BigDecimal.ZERO;
		
		List<StockOrder> sellOrders		= getSellOrders(pListStockOrder);
		for (StockOrder sellStockOrder : sellOrders) {
			totalSellValue = totalSellValue.add(sellStockOrder.getOrderValue());
		}
		return totalSellValue;
	}
	
	/**
	 * TODO		Implement Tests to this method
	 * 
	 * 
	 * @param pListStockOrder
	 * @return
	 */
	private static BigDecimal sumTotalValueFromBuyOrders(List<StockOrder> pListStockOrder) {
		BigDecimal totalBuyValue = BigDecimal.ZERO;
		List<StockOrder> buyOrders		= getBuyOrders(pListStockOrder);
		for (StockOrder buyStockOrder : buyOrders) {
			totalBuyValue = totalBuyValue.add(buyStockOrder.getOrderValue());
		}
		return totalBuyValue;
	}
	
	/**
	 * TODO		Implement Tests to this method
	 * 
	 * 
	 * @param pListStockOrder
	 * @return
	 */
	private static boolean isListValid(List<StockOrder> pListStockOrder) {
		return pListStockOrder != null && !pListStockOrder.isEmpty();
	}
	
}