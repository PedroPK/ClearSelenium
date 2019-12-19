package brokerDealer.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;

import static brokerDealer.util.FilesFoldersUtil.*;


public class FilesFoldersUtilTest {
	
	@Test
	public void testCreateFile() throws IOException {
		File file =  createFile(FilesFoldersUtil.TEST_XLSX_FILENAME);
		
		assertNotNull(file);
	}
	
	@Test
	public void testCreateInputStream() throws IOException {
		InputStream inputStream = createInputStream(FilesFoldersUtil.TEST_XLSX_FILENAME);
		
		assertNotNull(inputStream);
	}
	
	@Test
	public void testGetConfigPropertiesFilePath_IsNotNull() {
		// Arrange + Act
		String response = getConfigPropertiesFilePath();
		
		// Assert
		assertNotNull(response);
	}
	

	@Test
	public void testGetConfigPropertiesFilePath_IsNotEmpty() {
		// Arrange + Act
		String response = getConfigPropertiesFilePath();
		
		// Assert
		assertFalse(response.trim().isEmpty());
	}
	
	@Test
	public void testGetConfigPropertiesFilePath_EndsWithConfigDotProperties() {
		// Arrange + Act
		String response = getConfigPropertiesFilePath();
		
		// Assert
		assertTrue(response.endsWith("config.properties"));
	}
	
	@Test
	public void testGetConfigPropertiesFilePath_EndsWithSrcMainResourcesConfigDotProperties() {
		// Arrange + Act
		String response = getConfigPropertiesFilePath();
		
		// Assert
		assertTrue(response.endsWith("/src/main/resources/config.properties"));
	}
	
	@Ignore
	@Test
	public void testCreateXlsxFileInputStream() {
		fail("Not yet implemented");
	}

}
