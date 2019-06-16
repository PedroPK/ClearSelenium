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
			.fillCPF("039.821.084-54")
			.fillPassword("")		// TODO Delete this value before Commit
			.fillBirthday("13/02/1983")
			.pressAccessMyAccountSubmitButton()
		;	
	}
	
	@AfterClass
	public static void finalizeClearLogin() {
		if ( clearLogin != null ) {
			clearLogin.close();
		}
	}
	
}