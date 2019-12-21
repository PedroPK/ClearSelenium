package brokerDealer.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilesFoldersUtil {
	
	private static final String TEST				= "test";
	public	static final String RESOURCES			= "resources";
	public	static final String MAIN				= "main";
	public	static final String SRC					= "src";
	private static final String FILE_SEPARATOR		= "file.separator";
	private static final String OS_NAME				= "os.name";
	private static final String USER_DIR			= "user.dir";
	public	static final String TEST_XLSX_FILENAME	= "test.xlsx";
	public static final String CONFIG_PROPERTIES = "config.properties";
	
	
	public static FileInputStream getFileInputStream() {
		return null;
	}
	
	public static File getConfigPropertiesFile() {
		return new File(getConfigPropertiesFilePath());
	}
	
	public static String getConfigPropertiesFilePath() {
		return getRelativePathToSrcMainResourceFolder() + CONFIG_PROPERTIES;
	}
	
	public static String getRelativePathToSrcTestResourceFolder() {
		String relativePath = 
			getFolderSeparator()	+ SRC + 
			getFolderSeparator()	+ TEST + 
			getFolderSeparator()	+ RESOURCES + 
			getFolderSeparator();
		return relativePath;
	}
	
	public static String getRelativePathToSrcMainResourceFolder() {
		String relativePath = 
			getFolderSeparator()	+ SRC + 
			getFolderSeparator()	+ MAIN + 
			getFolderSeparator()	+ RESOURCES + 
			getFolderSeparator();
		return relativePath;
	}
	
	public static String getFolderSeparator() {
		String folderSeparator = System.getProperty(FILE_SEPARATOR);
		return folderSeparator;
	}
	
	public static String getPathDirectory() {
		String path = System.getProperty(USER_DIR);
		return path;
	}
	
	public static String getOperationalSystemName() {
		return System.getProperty(OS_NAME);
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
