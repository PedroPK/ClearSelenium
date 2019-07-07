package brokerDealer.util.math;

import java.math.BigDecimal;

public class UtilMath {
	
	public static BigDecimal getBigDecimalFromInteger(int quantity) {
		return BigDecimal.valueOf(
			quantity
		);
	}
	
}