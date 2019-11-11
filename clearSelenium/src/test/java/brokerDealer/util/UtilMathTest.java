package brokerDealer.util;

import static brokerDealer.util.MathUtils.removeDots;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;

public class UtilMathTest {
	
	@Test
	public void testGetBigDecimalFromInteger_Zero() {
		// Arrange
		int zero = 0;
		
		// Act
		BigDecimal result = MathUtils.getBigDecimalFromInteger(zero);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ZERO, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_One() {
		// Arrange
		int one = 1;
		
		// Act
		BigDecimal result = MathUtils.getBigDecimalFromInteger(one);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_Ten() {
		// Arrange
		int ten = 10;
		
		// Act
		BigDecimal result = MathUtils.getBigDecimalFromInteger(ten);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.TEN, result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_MinusOne() {
		// Arrange
		int minusOne = -1;
		
		// Act
		BigDecimal result = MathUtils.getBigDecimalFromInteger(minusOne);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.ONE.negate(), result);
	}
	
	@Test
	public void testGetBigDecimalFromInteger_MinusTen() {
		// Arrange
		int minusTen = -10;
		
		// Act
		BigDecimal result = MathUtils.getBigDecimalFromInteger(minusTen);
		
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
		BigDecimal result = MathUtils.divide(dividend, divisor);
		
		
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
		BigDecimal result = MathUtils.divide(dividend, divisor);
		
		
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
		BigDecimal result = MathUtils.divide(dividend, divisor);
		
		
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
		BigDecimal result = MathUtils.divide(dividend, divisor);
		
		
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
		BigDecimal result = MathUtils.divide(dividend, divisor);
		
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
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
		BigDecimal result = MathUtils.multiply(first, second);
		
		// Assert
		assertNotNull(result);
		assertEquals(BigDecimal.valueOf(100).negate(), result);
	}
	
	@Test
	public void testRemoveDotsFromNull() {
		// Arrange
		String numberWithDots = null;
		
		//Act
		String numberWithoutDots = removeDots(numberWithDots);
		
		// Assert
		assertFalse(numberWithoutDots.contains("."));
	}
	
	@Test
	public void testRemoveDotsFromEmptyString() {
		// Arrange
		String numberWithDots = "";
		
		//Act
		String numberWithoutDots = removeDots(numberWithDots);
		
		// Assert
		assertFalse(numberWithoutDots.contains("."));
	}
	
	@Test
	public void testRemoveDots() {
		// Arrange
		String numberWithDots = "6.108.130.000";
		
		//Act
		String numberWithoutDots = removeDots(numberWithDots);
		
		// Assert
		assertFalse(numberWithoutDots.contains("."));
		
		assertEquals("6108130000", numberWithoutDots);
	}
	
}