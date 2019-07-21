package seleniumWebDriver.entities;

import static brokerDealer.util.math.UtilMath.getBigDecimalFromInteger;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import brokerDealer.core.utils.DateTimeUtils;
import lombok.Data;
import seleniumWebDriver.entities.enums.OrderType;

@Entity
@Data
public class StockOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/**
	 * Indicates if its a Buy or Sell
	 */
	private OrderType	type;
	
	/**
	 * Indicates how many Stocks were traded
	 */
	private int			quantity;
	
	/**
	 * Indicates when the Order was sent
	 */
	private LocalDateTime 	dateTime;
	
	/**
	 * Indicates how much were paid for each Stock individually
	 */
	private BigDecimal	price;	
	
	/**
	 * This Ticker indicates which Stock its been Bought or Sold 
	 */
	private String ticker;
	
	/**
	 * No Arguments Constructor
	 */
	public StockOrder() {}
	
	/**
	 * Full arguments Constructor
	 * 
	 * @param pYear
	 * @param pMonth
	 * @param pDay
	 * @param pHour
	 * @param pMinute
	 * @param pSecond
	 * @param pTicker
	 * @param pQuantity
	 * @param pPrice
	 * @param pOrderType
	 */
	public StockOrder(
		int				pYear,
		int				pMonth,
		int				pDay,
		int				pHour,
		int				pMinute,
		int				pSecond,
		String			pTicker,
		int				pQuantity,
		double			pPrice,
		OrderType		pOrderType
	) {
		this.dateTime	= DateTimeUtils.getLocalDateTime(pYear, pMonth, pDay, pHour, pMinute, pSecond);
		this.ticker		= pTicker;
		this.quantity	= pQuantity;
		this.price		= BigDecimal.valueOf(pPrice);
		this.type		= pOrderType;
		
	}
	
	
	public void setPrice(BigDecimal pPrice) {
		this.price = pPrice;
	}
	public void setPrice(double pPrice) {
		// Converts a Double into a BigDecimal
		//										Set Scale to have 2 Decimal digits
		this.price = BigDecimal.valueOf(pPrice).setScale(2);
	}
	
	public BigDecimal getOrderValue() {
		BigDecimal result =
			//	 	Price		*			Quantity
			this.getPrice().multiply(	getBigDecimalFromInteger(this.getQuantity()));
		
		return result;
	}
	
}
