package brokerDealer.repositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;

import seleniumWebDriver.entities.StockOrder;
import seleniumWebDriver.entities.enums.OrderType;

public class StockOrderDatasetGenerator {
	
	public static List<StockOrder> get1Buy3SellVvar3StockOrders() {
		List<StockOrder> listStockOrdersToSaveAndFlush = new ArrayList<>();
		
		listStockOrdersToSaveAndFlush.add(getBuyVvar3StockOrder());
		listStockOrdersToSaveAndFlush.add(getOrderSellVvar3_First());
		listStockOrdersToSaveAndFlush.add(getOrderSellVvar3_Second());
		listStockOrdersToSaveAndFlush.add(getOrderSellVvar3_Third());
		
		return listStockOrdersToSaveAndFlush;
	}
	
	public static StockOrder getBuyPetr4StockOrder() {
		StockOrder order = new StockOrder();
		
		order.setDateTime(LocalDateTime.now());
		order.setTicker("PETR4F");
		order.setQuantity(10);
		order.setPrice(BigDecimal.valueOf(40));
		order.setType(OrderType.BUY);
		
		return order;
	}
	
	public static StockOrder getBuyVvar3StockOrder() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 02), LocalTime.of(10, 01, 02)));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(90);
		orderBuyVVAR3.setPrice(5.13);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getOrderSellVvar3_First() {
		StockOrder orderSellVVAR3_First = new StockOrder();
		
		orderSellVVAR3_First.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 03), LocalTime.of(11, 02, 03)));
		orderSellVVAR3_First.setTicker("VVAR3");
		orderSellVVAR3_First.setQuantity(45);
		orderSellVVAR3_First.setPrice(5.5);
		orderSellVVAR3_First.setType(OrderType.SELL);
		
		return orderSellVVAR3_First;
	}
	
	public static StockOrder getOrderSellVvar3_Second() {
		StockOrder orderSellVVAR3_Second = new StockOrder();
		
		orderSellVVAR3_Second.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 03), LocalTime.of(12, 03, 04)));
		orderSellVVAR3_Second.setTicker("VVAR3");
		orderSellVVAR3_Second.setQuantity(30);
		orderSellVVAR3_Second.setPrice(5.9);
		orderSellVVAR3_Second.setType(OrderType.SELL);
		
		return orderSellVVAR3_Second;
	}
	
	public static StockOrder getOrderSellVvar3_Third() {
		StockOrder orderSellVVAR3_Third = new StockOrder();
		
		orderSellVVAR3_Third.setDateTime(LocalDateTime.of(LocalDate.of(2019, 07, 05), LocalTime.of(12, 34, 35)));
		orderSellVVAR3_Third.setTicker("VVAR3");
		orderSellVVAR3_Third.setQuantity(55);
		orderSellVVAR3_Third.setPrice(6.5);
		orderSellVVAR3_Third.setType(OrderType.SELL);
		
		return orderSellVVAR3_Third;
	}
	
	public static Example<StockOrder> getStockOrderExample(String pTicker) {
		StockOrder order = new StockOrder();
		order.setTicker(pTicker);
		
		Example<StockOrder> exampleOrder = Example.of(order);
		return exampleOrder;
	}
	
	public static Example<StockOrder> getStockOrderExample(StockOrder pStockOrder) {
		Example<StockOrder> orderExample = Example.of(pStockOrder);
		return orderExample;
	}
	
}