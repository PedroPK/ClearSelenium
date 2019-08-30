package clearSelenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClearLoginExecution {
	
	private static ClearLogin clearLogin;
	
	@BeforeClass
	public static void initializeClearLogin() {
		clearLogin = ClearLogin.setSystemPropertyChromeWebDriver();
	}
	
	@Test
	public void login() {
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
	
	@AfterClass
	public static void finalizeClearLogin() {
		if ( clearLogin != null ) {
			clearLogin.close();
		}
	}
	
}
