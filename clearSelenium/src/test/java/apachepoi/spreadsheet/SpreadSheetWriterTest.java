package apachepoi.spreadsheet;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import brokerDealer.util.FilesFoldersUtil;

public class SpreadSheetWriterTest {
	
	@Test
	public void testWriteIntoSpreadSheet() throws FileNotFoundException, IOException {
		// Arrange 
		Map<String, BigDecimal> mapTickerDividend = 
			new HashMap<String, BigDecimal>();
		mapTickerDividend.put("GSHP3",		new BigDecimal(348.8));
		mapTickerDividend.put("TRPN3 ",		new BigDecimal(267.9));
		mapTickerDividend.put("MMAQ4 ",		new BigDecimal(45.2));
		mapTickerDividend.put("BPAT33 ",	new BigDecimal(35.7));
		mapTickerDividend.put("BPAR3 ",		new BigDecimal(28.0));
		
		SpreadSheetWriter.writeIntoSpreadSheet(mapTickerDividend);
	}
	
	@Test
	public void testCreateWorkbookSpreadSheet() throws IOException {
		Workbook workbookSpreadsheet = 
			SpreadSheetWriter.createWorkbookSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		assertNotNull(workbookSpreadsheet);
	}
	
	@Test
	public void testCreateXlsxFileInputStream() throws FileNotFoundException, IOException {
		Workbook workbookSpreadsheet =
			SpreadSheetWriter.createXlsxSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		assertNotNull(workbookSpreadsheet);
	}

}
