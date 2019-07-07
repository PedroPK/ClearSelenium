package brokerDealer.util.math;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

public class UtilMathTest {
	
	@Test
	public void testGetBigDecimalFromInteger_Zero() {
		// Arrange
		int zero = 0;
		
		// Act
		BigDecimal result = UtilMath.getBigDecimalFromInteger(zero);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_One() {
		// Arrange
		int one = 1;
		
		// Act
		BigDecimal result = UtilMath.getBigDecimalFromInteger(one);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_Ten() {
		// Arrange
		int ten = 10;
		
		// Act
		BigDecimal result = UtilMath.getBigDecimalFromInteger(ten);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_MinusOne() {
		// Arrange
		int minusOne = -1;
		
		// Act
		BigDecimal result = UtilMath.getBigDecimalFromInteger(minusOne);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE.negate(), result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_MinusTen() {
		// Arrange
		int minusTen = -10;
		
		// Act
		BigDecimal result = UtilMath.getBigDecimalFromInteger(minusTen);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN.negate(), result);
	}
	
	@Test
	public void testDivide_10By0() {
		// Arrange
		BigDecimal	dividend	= BigDecimal.TEN;
		int			divisor		= 0;
		
		// Act
		BigDecimal result = UtilMath.divide(dividend, divisor);
		
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testDivide_10By1() {
		// Arrange
		BigDecimal	dividend	= BigDecimal.TEN;
		int			divisor		= 1;
		
		// Act
		BigDecimal result = UtilMath.divide(dividend, divisor);
		
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN, result);
	}
	
	@Test
	public void testDivide_10By10() {
		// Arrange
		BigDecimal	dividend	= BigDecimal.TEN;
		int			divisor		= 10;
		
		// Act
		BigDecimal result = UtilMath.divide(dividend, divisor);
		
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE, result);
	}
	
	@Test
	public void testDivide_10ByMinus1() {
		// Arrange
		BigDecimal	dividend	= BigDecimal.TEN;
		int			divisor		= -1;
		
		// Act
		BigDecimal result = UtilMath.divide(dividend, divisor);
		
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN.negate(), result);
	}
	
	@Test
	public void testDivide_Minus10By10() {
		// Arrange
		BigDecimal	dividend	= BigDecimal.TEN.negate();
		int			divisor		= 10;
		
		// Act
		BigDecimal result = UtilMath.divide(dividend, divisor);
		
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE.negate(), result);
	}
	
	@Test	@Ignore
	public void testMultiply() {
		// Arrange
		
		
		// Act
		
		
		// Assert
		
		
		fail("Not yet implemented");
	}

}