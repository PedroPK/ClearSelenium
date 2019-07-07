package brokerDealer.util.math;

import java.math.BigDecimal;

public class UtilMath {
	
	public static BigDecimal getBigDecimalFromInteger(int quantity) {
		return BigDecimal.valueOf(
			quantity
		);
	}
	
	public static BigDecimal divide(BigDecimal pDividend, int pDivisor) {
		return pDividend.divide(getBigDecimalFromInteger(pDivisor));
	}
	
	public static BigDecimal multiply(BigDecimal pMultiplierBigDecimal, int pMultiplierInteger) {
		return pMultiplierBigDecimal.multiply(
			getBigDecimalFromInteger(pMultiplierInteger)
		);
	}
	
}