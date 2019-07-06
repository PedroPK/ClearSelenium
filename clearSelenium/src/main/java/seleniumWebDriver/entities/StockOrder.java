package seleniumWebDriver.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	
	public void setPrice(BigDecimal pPrice) {
		this.price = pPrice;
	}
	public void setPrice(double pPrice) {
		this.price = BigDecimal.valueOf(pPrice);
	}
	
}
