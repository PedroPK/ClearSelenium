package clearSelenium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.math.NumberUtils;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;
import org.junit.Ignore;
import org.junit.Test;

public class ClearLoginExecutionTest {
	
	@Test
	public void testGetCPF_notNull() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertNotNull(cpf);
	}
	
	@Test
	public void testGetCPF_notEmpty() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertFalse(cpf.isEmpty());
	}
	
	@Test
	public void testGetCP_notBlank() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertFalse(cpf.isBlank());
	}
	
	@Test
	public void testGetCP_numbersOnly() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertTrue(NumberUtils.isCreatable(cpf));
	}
	@Test
	public void testGetCPF_has_moreThan11Digits_lessThan14Digits() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertTrue(
			cpf.length() >= 11
			&&
			cpf.length() <= 14
		);
	}
	
	@Ignore
	@Test
	public void testGetCPF_hibernateValidator() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		// Assert
		assertTrue(
			cpf.length() >= 11
			&&
			cpf.length() <= 14
		);
		
		//CPFValidator cpfv = new CPFValidator();
		//cpfv.isValid(value, context)
	}
	
	@Test
	public void testGetCPF_caelumStella() {
		// Arrange + Act
		String cpf = ClearLoginExecution.getCPF();
		
		br.com.caelum.stella.validation.CPFValidator cpfValidator = 
			new br.com.caelum.stella.validation.CPFValidator(true);
		
		// Assert
		assertTrue(
			cpfValidator.isEligible(cpf)
		);
	}
	
	/**
	 * TODO 	Implement a Validation to Formatted and Unformatted CPF
	 */
	
}
