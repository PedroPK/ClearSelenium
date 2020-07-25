package brokerDealer.util;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PropertiesUtilsTest {
	
	@Test
	public void testIsPropertiesLoaded_inInitialization() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		boolean respose = propertiesUtils.isPropertiesLoaded();
		
		// Assert
		assertTrue(respose);
	}
	
	@Test
	public void testGetCPF_NotNull() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String cpf = propertiesUtils.getCPF();
		
		// Assert
		assertNotNull(cpf);
	}
	
	@Test
	public void testGetCPF_NotEmpty() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String cpf = propertiesUtils.getCPF();
		
		// Assert
		assertFalse(isEmpty(cpf));
	}
	
	@Test
	public void testGetCPF_NotBlank() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String cpf = propertiesUtils.getCPF();
		
		// Assert
		assertFalse(isBlank(cpf));
	}
	
	@Test
	public void testGetCPF() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String cpf = propertiesUtils.getCPF();
		
		// Assert
		assertEquals("12345678901", cpf);
	}

	@Test
	public void testGetPassword_notNull() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	password	=	propertiesUtils.getPassword();
		
		// Assert
		assertNotNull(password);
	}
	
	@Test
	public void testGetPassword_notEmpty() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	password	=	propertiesUtils.getPassword();
		
		// Assert
		assertFalse(isEmpty(password));
	}
	
	@Test
	public void testGetPassword_notBlank() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	password	=	propertiesUtils.getPassword();
		
		// Assert
		assertFalse(isBlank(password));
	}
	
	@Test
	public void testGetBirthdate_NotNull() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	birthDate	=	propertiesUtils.getBirthdate();
		
		// Assert
		assertNotNull(birthDate);
	}
	
	@Test
	public void testGetBirthdate_NotEmpty() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	birthDate	=	propertiesUtils.getBirthdate();
		
		// Assert
		assertFalse(isEmpty(birthDate));
	}
	
	@Test
	public void testGetBirthdate_NotBlank() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String	birthDate	=	propertiesUtils.getBirthdate();
		
		// Assert
		assertFalse(isBlank(birthDate));
	}

}
