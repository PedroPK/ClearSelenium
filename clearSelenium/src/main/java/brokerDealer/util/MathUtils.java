package brokerDealer.util;

import java.math.BigDecimal;

public class MathUtils {
	
	public static BigDecimal getBigDecimalFromInteger(int quantity) {
		return BigDecimal.valueOf(
			quantity
		);
	}
	
	public static BigDecimal divide(BigDecimal pDividend, int pDivisor) {
		BigDecimal result = BigDecimal.ZERO;
		
		if ( pDividend != null && pDivisor != 0 ) {
			result = pDividend.divide(getBigDecimalFromInteger(pDivisor));
		}
		
		return result;
	}
	
	public static BigDecimal multiply(BigDecimal pMultiplierBigDecimal, int pMultiplierInteger) {
		BigDecimal result = BigDecimal.ZERO;
		
		if ( pMultiplierBigDecimal != null ) {
			result = pMultiplierBigDecimal.multiply(
					getBigDecimalFromInteger(pMultiplierInteger)
					);
		}
		
		return result;
	}
	
}