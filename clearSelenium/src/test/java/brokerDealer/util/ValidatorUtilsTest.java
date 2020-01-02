package brokerDealer.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidatorUtilsTest {
	
	private		ValidatorUtils	aValidator;
	
	@Before
	public void setUp() {
		this.aValidator = new ValidatorUtils();
	}
	
	@Test
	public void testIsValidCPF_null() {
		// Arrange
		String nullCPF = null;
		
		// Act
		boolean result = this.aValidator.isValidCPF(nullCPF);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void testIsValidCPF_empty() {
		// Arrange
		String emptyCPF = "";
		
		// Act
		boolean result = this.aValidator.isValidCPF(emptyCPF);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void testIsValidCPF_blank() {
		// Arrange
		String blankCPF = " ";
		
		// Act
		boolean result = this.aValidator.isValidCPF(blankCPF);
		
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void testIsValidCPF_validUnformated() {
		// Arrange
		String validCPF = "12190441056";
		
		// Act
		boolean result = this.aValidator.isValidCPF(validCPF);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void testIsValidCPF_validFormated() {
		// Arrange
		String validCPF = "121.904.410-56";
		
		// Act
		boolean result = this.aValidator.isValidCPF(validCPF);
		
		// Assert
		assertTrue(result);
	}

	@Test
	public void testIsValidCPFBoolean() {
		fail("Not yet implemented");
	}

}
