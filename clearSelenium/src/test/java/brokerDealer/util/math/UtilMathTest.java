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
	
	@Test
	public void testMultiply_NullByZero() {
		// Arrange
		BigDecimal	first = null;
		int			second = 0;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testMultiply_ZeroByZero() {
		// Arrange
		BigDecimal	first = BigDecimal.ZERO;
		int			second = 0;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testMultiply_OneByZero() {
		// Arrange
		BigDecimal	first = BigDecimal.ONE;
		int			second = 0;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testMultiply_OneByOne() {
		// Arrange
		BigDecimal	first = BigDecimal.ONE;
		int			second = 1;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE, result);
	}
	
	@Test
	public void testMultiply_OneByMinusOne() {
		// Arrange
		BigDecimal	first = BigDecimal.ONE;
		int			second = -1;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE.negate(), result);
	}
	
	@Test
	public void testMultiply_MinusOneByOne() {
		// Arrange
		BigDecimal	first = BigDecimal.ONE.negate();
		int			second = 1;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE.negate(), result);
	}
	
	@Test
	public void testMultiply_TenByOne() {
		// Arrange
		BigDecimal	first = BigDecimal.TEN;
		int			second = 1;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN, result);
	}
	
	@Test
	public void testMultiply_TenByMinusOne() {
		// Arrange
		BigDecimal	first = BigDecimal.TEN;
		int			second = -1;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN.negate(), result);
	}
	
	@Test
	public void testMultiply_TenByTen() {
		// Arrange
		BigDecimal	first = BigDecimal.TEN;
		int			second = 10;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(100), result);
	}
	
	@Test
	public void testMultiply_TenByMinusTen() {
		// Arrange
		BigDecimal	first = BigDecimal.TEN;
		int			second = -10;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(100).negate(), result);
	}
	
	@Test
	public void testMultiply_MinusTenByTen() {
		// Arrange
		BigDecimal	first = BigDecimal.TEN.negate();
		int			second = 10;
		
		// Act
		BigDecimal result = UtilMath.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(100).negate(), result);
	}

}
