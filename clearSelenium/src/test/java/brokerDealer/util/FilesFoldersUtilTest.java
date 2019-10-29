package brokerDealer.util;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class FilesFoldersUtilTest {
	
	@Test
	public void testCreateFile() throws IOException {
		FilesFoldersUtil.createFile("test.xlsx");
	}
	
	@Test
	public void testCreateInputStream() throws IOException {
		FilesFoldersUtil.createInputStream("test.xlsx");
	}
	
	@Ignore
	@Test
	public void testCreateXlsxFileInputStream() {
		fail("Not yet implemented");
	}

}
