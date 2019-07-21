package brokerDealer.repositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;

import static brokerDealer.core.utils.DateTimeUtils.*;
import seleniumWebDriver.entities.StockOrder;
import seleniumWebDriver.entities.enums.OrderType;

public class StockOrderDatasetGenerator {
	
	public static List<StockOrder> get1Buy3SellVvar3StockOrders() {
		List<StockOrder> listStockOrdersToSaveAndFlush = new ArrayList<>();
		
		listStockOrdersToSaveAndFlush.add(getBuyVvar3StockOrder_2019_07_02());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_First());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_Second());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_05());
		
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
	
	public static List<StockOrder> getAllVvar3StockOrders() {
		List<StockOrder> listStockOrdersToSaveAndFlush = new ArrayList<>();
		
		listStockOrdersToSaveAndFlush.add(getBuyVvar3StockOrder_2018_10_18());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2018_11_01());
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_05()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_08()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_14()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_15()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_19()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_21_First()));
		listStockOrdersToSaveAndFlush.add((getBuyVvar3StockOrder_2019_02_21_Second()));
		listStockOrdersToSaveAndFlush.add((getSellVvar3StockOrder_2019_02_25()));
		listStockOrdersToSaveAndFlush.add((getSellVvar3StockOrder_2019_02_26()));
		listStockOrdersToSaveAndFlush.add((getSellVvar3StockOrder_2019_02_26()));
		listStockOrdersToSaveAndFlush.add(getBuyVvar3StockOrder_2019_07_02());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_First());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_Second());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_05());
		
		return listStockOrdersToSaveAndFlush;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2018_10_18() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2018, 10, 18, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(90);
		orderBuyVVAR3.setPrice(5.13);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getSellVvar3StockOrder_2018_11_01() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2018, 11, 01, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(1);
		orderBuyVVAR3.setPrice(16.63);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_05() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 05, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.79);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_08() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 8, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(1);
		orderBuyVVAR3.setPrice(5.56);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_14() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 14, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.33);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_15() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 15, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(9);
		orderBuyVVAR3.setPrice(5.38);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_19() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 19, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.39);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_21_First() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 21, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(5);
		orderBuyVVAR3.setPrice(4.79);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_02_21_Second() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 21, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(5);
		orderBuyVVAR3.setPrice(4.89);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getSellVvar3StockOrder_2019_02_25() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 25, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(4.99);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getSellVvar3StockOrder_2019_02_26() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 26, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(4.80);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getBuyVvar3StockOrder_2019_07_02() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 07, 02, 10, 01, 02));
		orderBuyVVAR3.setTicker("VVAR3");
		orderBuyVVAR3.setQuantity(1);
		orderBuyVVAR3.setPrice(13.50);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	public static StockOrder getSellVvar3StockOrder_2019_07_03_First() {
		StockOrder orderSellVVAR3_First = new StockOrder();
		
		orderSellVVAR3_First.setDateTime(getLocalDateTime(2019, 07, 03, 11, 02, 03));
		orderSellVVAR3_First.setTicker("VVAR3");
		orderSellVVAR3_First.setQuantity(45);
		orderSellVVAR3_First.setPrice(5.5);
		orderSellVVAR3_First.setType(OrderType.SELL);
		
		return orderSellVVAR3_First;
	}
	
	public static StockOrder getSellVvar3StockOrder_2019_07_03_Second() {
		StockOrder orderSellVVAR3_Second = new StockOrder();
		
		orderSellVVAR3_Second.setDateTime(getLocalDateTime(2019, 07, 03, 12, 03, 04));
		orderSellVVAR3_Second.setTicker("VVAR3");
		orderSellVVAR3_Second.setQuantity(30);
		orderSellVVAR3_Second.setPrice(5.9);
		orderSellVVAR3_Second.setType(OrderType.SELL);
		
		return orderSellVVAR3_Second;
	}
	
	public static StockOrder getSellVvar3StockOrder_2019_07_05() {
		StockOrder orderSellVVAR3_Third = new StockOrder();
		
		orderSellVVAR3_Third.setDateTime(getLocalDateTime(2019, 07, 05, 12, 34, 35));
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
	
	public static StockOrder getBuyBrfs3StockOrder_2019_06_28() {
		StockOrder orderBuyBrfs3 = new StockOrder();
		orderBuyBrfs3.setDateTime(getLocalDateTime(2019, 06, 28, 10, 11, 12));
		
		
		return orderBuyBrfs3;
	}
	
}