package brokerDealer.util;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Ignore;
import org.junit.Test;


public class FilesFoldersUtilTest {
	
	private static final String TEST_XLSX_FILENAME = "test.xlsx";

	@Test
	public void testCreateFile() throws IOException {
		File file =  FilesFoldersUtil.createFile(TEST_XLSX_FILENAME);
		
		assertNotNull(file);
	}
	
	@Test
	public void testCreateInputStream() throws IOException {
		InputStream inputStream = FilesFoldersUtil.createInputStream(TEST_XLSX_FILENAME);
		
		assertNotNull(inputStream);
	}
	
	@Test
	public void testCreateWorkbookSpreadSheet() throws IOException {
		Workbook workbookSpreadsheet = FilesFoldersUtil.createWorkbookSpreadSheet(Optional.of(TEST_XLSX_FILENAME));
		
		assertNotNull(workbookSpreadsheet);
	}
	
	@Ignore
	@Test
	public void testCreateXlsxFileInputStream() {
		fail("Not yet implemented");
	}

}
