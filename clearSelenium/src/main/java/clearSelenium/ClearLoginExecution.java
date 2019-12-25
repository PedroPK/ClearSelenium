package clearSelenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import brokerDealer.util.FilesFoldersUtil;

public class ClearLoginExecution {
	
	private static ClearLogin clearLogin;
	
	@BeforeClass
	public static void initializeClearLogin() {
		clearLogin = ClearLogin.setSystemPropertyChromeWebDriver();
	}
	
	@Test
	public void login() {
		FilesFoldersUtil.loadProperties();
		
		clearLogin
			.fillCPF("NNN.NNN.NNN-NN")
			.fillPassword("XXXXXX")		// TODO Delete this value before Commit
			.fillBirthday("DD/MM/YYYY")
			.pressAccessMyAccountSubmitButton()
			
			.pressNewPitSpan()
			.pressMenuButton()
			.pressVariableIncomeLink()
			.pressSwingTradeLink()
			
			.clickSpanByTickerContent("KROT3F")
		;	
	}
	
	public static String getCPF() {
		String response = "123.456.789-10";
		
		return response;
	}
	
	@AfterClass
	public static void finalizeClearLogin() {
		if ( clearLogin != null ) {
			clearLogin.close();
		}
	}
	
}
