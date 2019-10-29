package apachepoi.spreadsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import brokerDealer.util.FilesFoldersUtil;

public class SpreadSheetWriter {
	
	public static void writeIntoSpreadSheet( Map<String, BigDecimal> pTickerDividends ) throws FileNotFoundException, IOException {
		Workbook spreadsheet = 
			createXlsxSpreadSheet(Optional.of(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		fillSpreadsheet(spreadsheet, pTickerDividends);
		
		writeToFile(spreadsheet);
	}

	private static void writeToFile(Workbook pSpreadsheet) throws FileNotFoundException, IOException {
		FileOutputStream fileOutputStream = 
				new FileOutputStream(FilesFoldersUtil.createFile(FilesFoldersUtil.TEST_XLSX_FILENAME));
		
		pSpreadsheet.write(fileOutputStream);
		
		fileOutputStream.close();
	}
	
	public static Workbook createWorkbookSpreadSheet(Optional<String> pFileName) throws IOException {
		Workbook spreadsheet;
		if ( pFileName.get().toLowerCase().contains(".xlsx") ) {
			spreadsheet	=
				//WorkbookFactory.create(
				new XSSFWorkbook(
					//	createInputStream(	pFileName.get()		)
				);
		} else {
			if ( pFileName.get().toLowerCase().contains(".xls") ) {
				spreadsheet	=
					//WorkbookFactory.create(
					new HSSFWorkbook(
						//	createInputStream(	pFileName.get()		)
					);
			}
			else {
				throw new IllegalArgumentException("The File Extention passed was not compatible with a Excel Spreadsheet.");
			}
		}
		
		return spreadsheet;
	}
	
	public static Workbook createXlsxSpreadSheet( Optional<String> pFileName) throws FileNotFoundException, IOException {
		Workbook spreadsheet = createWorkbookSpreadSheet(pFileName);
		
		return spreadsheet;
	}

	private static void fillSpreadsheet(Workbook pSpreadsheet, Map<String, BigDecimal> pTickerDividends) {
		Sheet sheetTab = pSpreadsheet.createSheet( "Dividend Yields" );
		
		if ( 
				pTickerDividends != null &&
				!pTickerDividends.isEmpty()
		) {
			int qtRows = pTickerDividends.size() + 1;
			
			for ( int i = 0; i < qtRows; i = i + 1 ) {
				sheetTab.createRow(i);
			}
			
			// TODO		- 	Resume here
			
			Row row = sheetTab.getRow(0);
			
			Cell cell = row.createCell(0);
			
			cell.setCellValue("TICKER4");
			
			cell = row.createCell(1);
			cell.setCellValue(0.1);
		}
		
		
	}
	
}