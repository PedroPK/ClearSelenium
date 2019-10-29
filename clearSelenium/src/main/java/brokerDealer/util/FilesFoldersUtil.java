package brokerDealer.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FilesFoldersUtil {
	
	public static final String TEST_XLSX_FILENAME = "test.xlsx";
	
	public static String getRelativePathToSrcTestResourceFolder() {
		String relativePath = 
			getFolderSeparator() + "src" + 
			getFolderSeparator() + "test" + 
			getFolderSeparator() + "resources" + 
			getFolderSeparator();
		return relativePath;
	}
	
	public static String getRelativePathToSrcMainResourceFolder() {
		String relativePath = 
			getFolderSeparator() + "src" + 
			getFolderSeparator()+ "main" + 
			getFolderSeparator() + "resources" + 
			getFolderSeparator();
		return relativePath;
	}
	
	public static String getFolderSeparator() {
		String folderSeparator = System.getProperty("file.separator");
		return folderSeparator;
	}
	
	public static String getPathDirectory() {
		String path = System.getProperty("user.dir");
		return path;
	}
	
	public static String getOperationalSystemName() {
		return System.getProperty("os.name");
	}
	
	public static String getFullPathToSrcTestResourceFolder() {
		String fullPath = getPathDirectory() + getRelativePathToSrcTestResourceFolder();
		return fullPath;
	}
	
	public static File createFile( String pFileName ) throws IOException {
		File file = 
			new File(
					getFullPathToSrcTestResourceFolder() + getFolderSeparator() + pFileName
			);
		
		file.createNewFile();
		
		return file;
	}
	
	public static InputStream createInputStream( String pFileName ) throws IOException {
		InputStream inputStream = 
			new FileInputStream(
				createFile(pFileName)
			);
		
		return inputStream;
	}
	
	
	
	
	
}
