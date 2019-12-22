package brokerDealer.util;

import static brokerDealer.util.FilesFoldersUtil.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;


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
		assertTrue(response.endsWith(CONFIG_PROPERTIES));
	}
	
	@Test
	public void testGetConfigPropertiesFilePath_EndsWithSrcMainResourcesConfigDotProperties() {
		// Arrange + Act
		String response = getConfigPropertiesFilePath();
		
		// Assert
		String correctResponse = 
			getFolderSeparator()		+		SRC						+
			getFolderSeparator()		+		MAIN					+
			getFolderSeparator()		+		RESOURCES				+
			getFolderSeparator()		+		CONFIG_PROPERTIES;
			
		assertTrue(response.endsWith(correctResponse));
	}
	
	@Test
	public void testGetConfigPropertiesFile_NotNull() {
		// Arrange + Act
		File response = getConfigPropertiesFile();
		
		// Assert
		assertNotNull(response);
	}
	
	@Test
	public void testGetConfigPropertiesFile_Path() {
		// Arrange + Act
		String response = getConfigPropertiesFile().getPath();
		
		// Assert
		assertEquals(getConfigPropertiesFilePath(), response);
	}
	
	@Test
	public void testGetConfigPropertiesFileInputStream() {
		// Arrange + Act
		FileInputStream response = getConfigPropertiesFileInputStream();
		
		// Assert
		assertNotNull(response);
	}
	
	@Test
	public void testGetPathDirectory_NotNull() {
		// Arrange + Act
		String response = getPathDirectory();
		
		// Assert
		assertNotNull(response);
	}
	
	@Test
	public void testGetFullPathToSrcMainResourceFolder() {
		// Arrange + Act
		String response = getFullPathToSrcMainResourceFolder();
		
		// Assert
		assertNotNull(response);
	}
	
	@Test
	public void testReadLineConfigProperties_NotNull() {
		// Arrange + Act
		String line = readLineConfigProperties();
		
		// Assert
		assertNotNull(line);
	}
	
	@Test
	public void testReadLineConfigProperties_NotEmpty() {
		// Arrange + Act
		String line = readLineConfigProperties();
		
		// Assert
		assertFalse(line.isEmpty());
	}
	
	@Test
	public void testReadLineConfigProperties_NotBlank() {
		// Arrange + Act
		String line = readLineConfigProperties();
		
		// Assert
		assertFalse(line.isBlank());
	}
	
	@Test
	public void testReadLineConfigProperties_FirstLine() {
		// Arrange + Act
		String line = readLineConfigProperties();
		
		// Assert
		assertEquals("FirstLine=1st", line);
	}
	
	@Test
	public void testReadLineConfigProperties_SecondLine() {
		// Arrange + Act
		String fistLine = readLineConfigProperties();
		String secondLine = readLineConfigProperties();
		
		// Assert
		assertEquals("SecondLine=2nd", secondLine);
	}
	
	@Ignore
	@Test
	public void testCreateXlsxFileInputStream() {
		fail("Not yet implemented");
	}

}
