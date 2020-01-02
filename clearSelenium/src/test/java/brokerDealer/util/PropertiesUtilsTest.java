package brokerDealer.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class PropertiesUtilsTest {

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
		assertFalse(cpf.isEmpty());
	}
	
	@Test
	public void testGetCPF_NotBlank() {
		// Arrange
		PropertiesUtils propertiesUtils = new PropertiesUtils();
		
		// Act
		String cpf = propertiesUtils.getCPF();
		
		// Assert
		assertFalse(cpf.isBlank());
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
	public void testGetPassword() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetBirthdate() {
		fail("Not yet implemented");
	}

}
