package brokerDealer.repositories;

import static brokerDealer.util.dateTime.DateTimeUtils.getLocalDateTime;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;

import seleniumWebDriver.entities.StockOrder;
import seleniumWebDriver.entities.enums.OrderType;

public class StockOrderDatasetGenerator {
	
	private static final String BRFS3F_TICKER	= "BRFS3F";
	private static final String PETR4F_TICKER	= "PETR4F";
	private static final String VVAR3_TICKER	= "VVAR3";
	private static final String VVAR11_TICKER	= "VVAR11";
	
	/**
	 * Quantity of Stocks:		1			45			30			55
	 * Price of each Stock:		13.5		5.5			5.9			6.5
	 * ------------------------------------------------------------------
	 * Total Order Value:		13.5	+	247,5	+	177		+	357,5
	 * 
	 * Total Value:								795,5
	 * -----------------------------------------------
	 * Total Quantity of Stocks:				131
	 * 
	 * Mean Value	==========================	6,0725
	 * 
	 * 
	 * @return
	 */
	public static List<StockOrder> get1Vvar3_1Buy3SellStockOrders() {
		List<StockOrder> listStockOrdersToSaveAndFlush = new ArrayList<>();
		
		listStockOrdersToSaveAndFlush.add(getBuyVvar3StockOrder_2019_07_02());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_First());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_03_Second());
		listStockOrdersToSaveAndFlush.add(getSellVvar3StockOrder_2019_07_05());
		
		return listStockOrdersToSaveAndFlush;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		40
	 * 
	 * @return
	 */
	public static StockOrder getBuyPetr4StockOrder() {
		StockOrder order = new StockOrder();
		
		order.setDateTime(LocalDateTime.now());
		order.setTicker(PETR4F_TICKER);
		order.setQuantity(10);
		order.setPrice(BigDecimal.valueOf(40));
		order.setType(OrderType.BUY);
		
		return order;
	}
	
	/**
	 * Type of Order					Buy						Buy			Buy			Buy			Buy			Buy			Buy			Buy			Sell		Sell		Buy			Sell		Sell		Sell
	 * Quantity of Stocks:				90			+			10		+	1		+	10		+	9		+	10		+	5		+	5		+	10		+	10		+	90		+	45		+	30		+	55
	 * Price of each Stock:				5.13					5.79		5.56		5.33		5.38		5.39		4.79		4.89		4.99		4.8			5.13		5.5			5.9			6.5
	 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Total Order Value:				461.7		+			57.9	+	5.56	+	53.3	+	48.42	+	53.90	+	23.95	+	24.45	+	49.90	+	48		+	461.7	+	247.50	+	177		+	357.50
	 * 
	 * Values of Buy Orders:			461.7			+		57.9	+	5.56	+	53.3	+	48.42	+	53.90	+	23.95	+	24.45				+				461.7
	 * Values of Sell Orders:																													+	49.90	+	48			+			247.50	+	177		+	357.50
	 * 
	 * Total Values of Buy Orders:		1190.88
	 * Total Values of Sell Orders:		882.90
	 * 
	 * Quantity of Buy	Stocks:			90			+			10		+	1		+	10		+	9		+	10		+	5		+	5					+				90
	 * Quantity of Sell	Stocks:																		+												10		+	10			+			45		+	30		+	55
	 * 
	 * Total Quantity of Buy Stocks: 	230
	 * Total Quantity of Sell Stocks: 	150
	 * 
	 * 
	 * Mean Buy Value:					1190.88 / 230	= 5.1777
	 * Mean Sell Value:					882.90  / 150	= 5.886
	 * 
	 * Profit:
	 * 	- Value:							153,85
	 *  - Percentage:						20.71%
	 * 
	 * 
	 * Total Value:								1639.21
	 * ------------------------------------------------
	 * Total Quantity of Stocks:				 380
	 * 
	 * 
	 * 
	 * @return		List with all Stock Orders
	 */
	public static List<StockOrder> getAllVvar3StockOrders() {
		List<StockOrder> listAllVvar3StockOrders = new ArrayList<>();
		
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2018_10_18());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_05());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_08());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_14());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_15());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_19());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_21_First());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_21_Second());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_02_25());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_02_26());
		listAllVvar3StockOrders.add(getBuyVvar3StockOrder_2019_07_02());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_02());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_03_First());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_03_Second());
		listAllVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_05());
		
		return listAllVvar3StockOrders;
	}
	
	/**
	 * Type of Order					Buy				Buy			Buy			Buy			Buy			Buy			Buy			Buy			Buy
	 * Quantity of Stocks:				90		+		10		+	1		+	10		+	9		+	10		+	5		+	5		+	90
	 * Price of each Stock:				5.13			5.79		5.56		5.33		5.38		5.39		4.79		4.89		5.13
	 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Values of Buy Orders:			461.7	+		57.9	+	5.56	+	53.3	+	48.42	+	53.90	+	23.95	+	24.45	+	461.7
	 * Total Values of Buy Orders:		1190.88
	 * 
	 * Quantity of Buy	Stocks:			90		+		10		+	1		+	10		+	9		+	10	+		5		+	5		+	90
	 * Total Quantity of Buy Stocks: 	230
	 * 
	 * Mean Buy Value:					1190.88 / 230	= 5.1777
	 * 
	 * 
	 * @return		List with all Stock Orders
	 */
	public static List<StockOrder> getBuyVvar3StockOrders() {
		List<StockOrder> listBuyVvar3StockOrders = new ArrayList<>();
		
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2018_10_18());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_05());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_08());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_14());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_15());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_19());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_21_First());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_02_21_Second());
		listBuyVvar3StockOrders.add(getBuyVvar3StockOrder_2019_07_02());
		
		return listBuyVvar3StockOrders;
	}
	
	/**
	 * Type of Order					Sell		Sell		Sell		Sell		Sell
	 * Quantity of Stocks:				10		+	10		+	45		+	30		+	55
	 * Price of each Stock:				4.99		4.8			5.5			5.9			6.5
	 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * Values of Sell Orders:			49.90	+	48		+	247.50	+	177		+	357.50
	 * Total Values of Sell Orders:		882.90
	 * 
	 * Quantity of Sell	Stocks:			10		+	10		+	45		+	30		+	55
	 * Total Quantity of Sell Stocks: 	150
	 * 
	 * Mean Sell Value:					882.90  / 150	= 5.886
	 * 
	 * 
	 * @return		List with all Stock Orders
	 */
	public static List<StockOrder> getSellVvar3StockOrders() {
		List<StockOrder> listSellVvar3StockOrders = new ArrayList<>();
		
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_02_25());
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_02_26());
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_02());
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_03_First());
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_03_Second());
		listSellVvar3StockOrders.add(getSellVvar3StockOrder_2019_07_05());
		
		return listSellVvar3StockOrders;
	}
	
	/**
	 * Quantity of Stocks:		90
	 * Price of each Stock:		5.13
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2018_10_18() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2018, 10, 18,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(90);
		orderBuyVVAR3.setPrice(5.13);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		1
	 * Price of each Stock:		16.63
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar11StockOrder_2018_11_01() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2018, 11, 01,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR11_TICKER);
		orderBuyVVAR3.setQuantity(1);
		orderBuyVVAR3.setPrice(16.63);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		5.79
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_05() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 05,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.79);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		1
	 * Price of each Stock:		5.56
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_08() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 8,		10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(1);
		orderBuyVVAR3.setPrice(5.56);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		5.33
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_14() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 14,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.33);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		9
	 * Price of each Stock:		5.38
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_15() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 15,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(9);
		orderBuyVVAR3.setPrice(5.38);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		5.39
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_19() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 19,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(5.39);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		5
	 * Price of each Stock:		4.79
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_21_First() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 21,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(5);
		orderBuyVVAR3.setPrice(4.79);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		5
	 * Price of each Stock:		4.89
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_02_21_Second() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 21,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(5);
		orderBuyVVAR3.setPrice(4.89);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		4.99
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_02_25() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 25,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(4.99);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		4.8
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_02_26() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 02, 26, 10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(10);
		orderBuyVVAR3.setPrice(4.80);
		orderBuyVVAR3.setType(OrderType.SELL);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		90
	 * Price of each Stock:		5.13
	 * 
	 * @return
	 */
	public static StockOrder getBuyVvar3StockOrder_2019_07_02() {
		StockOrder orderBuyVVAR3 = new StockOrder();
		
											//		Date			Time
		orderBuyVVAR3.setDateTime(getLocalDateTime(2019, 07, 02,	10, 01, 02));
		orderBuyVVAR3.setTicker(VVAR3_TICKER);
		orderBuyVVAR3.setQuantity(90);
		orderBuyVVAR3.setPrice(5.13);
		orderBuyVVAR3.setType(OrderType.BUY);
		
		return orderBuyVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		5.38
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_07_02() {
		StockOrder orderSellVVAR3 = new StockOrder();
		
											//		Date			Time
		orderSellVVAR3.setDateTime(getLocalDateTime(2019, 07, 02,	10, 02, 03));
		orderSellVVAR3.setTicker(VVAR3_TICKER);
		orderSellVVAR3.setQuantity(10);
		orderSellVVAR3.setPrice(5.38);
		orderSellVVAR3.setType(OrderType.SELL);
		
		return orderSellVVAR3;
	}
	
	/**
	 * Quantity of Stocks:		45
	 * Price of each Stock:		5.5
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_07_03_First() {
		StockOrder orderSellVVAR3_First = new StockOrder();
		
													//		Date			Time
		orderSellVVAR3_First.setDateTime(getLocalDateTime(2019, 07, 03,		11, 02, 03));
		orderSellVVAR3_First.setTicker(VVAR3_TICKER);
		orderSellVVAR3_First.setQuantity(45);
		orderSellVVAR3_First.setPrice(5.5);
		orderSellVVAR3_First.setType(OrderType.SELL);
		
		return orderSellVVAR3_First;
	}
	
	/**
	 * Quantity of Stocks:		30
	 * Price of each Stock:		5.9
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_07_03_Second() {
		StockOrder orderSellVVAR3_Second = new StockOrder();
		
													//		Date			Time
		orderSellVVAR3_Second.setDateTime(getLocalDateTime(2019, 07, 03,	12, 03, 04));
		orderSellVVAR3_Second.setTicker(VVAR3_TICKER);
		orderSellVVAR3_Second.setQuantity(30);
		orderSellVVAR3_Second.setPrice(5.9);
		orderSellVVAR3_Second.setType(OrderType.SELL);
		
		return orderSellVVAR3_Second;
	}
	
	/**
	 * Quantity of Stocks:		55
	 * Price of each Stock:		6.5
	 * 
	 * @return
	 */
	public static StockOrder getSellVvar3StockOrder_2019_07_05() {
		StockOrder orderSellVVAR3_Third = new StockOrder();
		
													//		Date			Time
		orderSellVVAR3_Third.setDateTime(getLocalDateTime(2019, 07, 05,		12, 34, 35));
		orderSellVVAR3_Third.setTicker(VVAR3_TICKER);
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
	
	/**
	 * Quantity of Stocks:		30
	 * Price of each Stock:		29.15
	 * 
	 * @return
	 */
	private static StockOrder getBrfs3BuyStockOrder_2019_06_28() {
		StockOrder orderBuyBrfs3 = 
			new StockOrder(
					2019, 06, 28,		// Date 
					10, 11, 12,			// Time
					BRFS3F_TICKER,		// Ticker
					30,					// Quantity
					29.15,				// Price
					OrderType.BUY);		// Type of Order
		
		return orderBuyBrfs3;
	}
	
	/**
	 * Quantity of Stocks:		15
	 * Price of each Stock:		31.10
	 * 
	 * @return
	 */
	private static StockOrder getBrfs3SellStockOrder_2019_07_01() {
		StockOrder orderBrfs3Sell = 
			new StockOrder(
					2019, 07, 01,		// Date
					11, 12, 13,			// Time
					BRFS3F_TICKER,		// Ticker
					15,					// Quantity
					31.10,				// Price
					OrderType.SELL);	// Type of Order
		
		return orderBrfs3Sell;
	}
	
	/**
	 * Quantity of Stocks:		10
	 * Price of each Stock:		32,70
	 * 
	 * @return
	 */
	private static StockOrder getBrfs3SellStockOrder_2019_07_02() {
		StockOrder orderBrfs3Sell = 
			new StockOrder(
					2019, 07, 02,		// Date
					12, 13, 14,			// Time
					BRFS3F_TICKER,		// Ticker
					10,					// Quantity
					32.70,				// Price
					OrderType.SELL);	// Type of Order
		
		return orderBrfs3Sell;
	}
	
	/**
	 * Quantity of Stocks:		05
	 * Price of each Stock:		34.5
	 * 
	 * @return
	 */
	private static StockOrder getBrfs3SellStockOrder_2019_07_04() {
		StockOrder orderBrfs3Sell = 
			new StockOrder(
					2019, 07, 04,		// Date
					13, 14, 15,			// Time
					BRFS3F_TICKER,		// Ticker
					05,					// Quantity
					34.50,				// Price
					OrderType.SELL);	// Type of Order
		
		return orderBrfs3Sell;
	}
	
	/**
	 * Quantity of Stocks:		30			15			10			05
	 * Price of each Stock:		29.15		31.10		32.70		34.5
	 * --------------------------------------------------------------------
	 * Total Order Value:		874.50	+	466.50	+	327.00	+	172.50
	 * 
	 * Total Value:								995.15
	 * -----------------------------------------------
	 * Total Quantity of Stocks:				 60
	 * 
	 * Mean Value	==========================	15,5858
	 * 
	 * 
	 * @return
	 */
	public static List<StockOrder> getBrfs3_1Buy3SellsStockOrders() {
		List<StockOrder>	listBrfs3StockOrders	=	new ArrayList<>();
		
		listBrfs3StockOrders.add(getBrfs3BuyStockOrder_2019_06_28());
		listBrfs3StockOrders.add(getBrfs3SellStockOrder_2019_07_01());
		listBrfs3StockOrders.add(getBrfs3SellStockOrder_2019_07_02());
		listBrfs3StockOrders.add(getBrfs3SellStockOrder_2019_07_04());
		
		return listBrfs3StockOrders;
	}
	
}