package brokerDealer.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;


public class FilesFoldersUtilTest {
	
	@Test
	public void testCreateFile() throws IOException {
		File file =  FilesFoldersUtil.createFile(FilesFoldersUtil.TEST_XLSX_FILENAME);
		
		assertNotNull(file);
	}
	
	@Test
	public void testCreateInputStream() throws IOException {
		InputStream inputStream = FilesFoldersUtil.createInputStream(FilesFoldersUtil.TEST_XLSX_FILENAME);
		
		assertNotNull(inputStream);
	}
	
	@Ignore
	@Test
	public void testCreateXlsxFileInputStream() {
		fail("Not yet implemented");
	}

}
