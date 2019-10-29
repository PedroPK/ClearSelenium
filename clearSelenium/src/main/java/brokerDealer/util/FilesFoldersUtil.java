package brokerDealer.util;

public class FilesFoldersUtil {
	
	public static String getRelativePathToSrcTestResourceFolder(String pFolderSeparator) {
		String relativePath = pFolderSeparator + "src" + pFolderSeparator + "test" + pFolderSeparator + "resources" + pFolderSeparator;
		return relativePath;
	}
	
	public static String getRelativePathToSrcMainResourceFolder(String pFolderSeparator) {
		String relativePath = pFolderSeparator + "src" + pFolderSeparator + "main" + pFolderSeparator + "resources" + pFolderSeparator;
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
	
}
