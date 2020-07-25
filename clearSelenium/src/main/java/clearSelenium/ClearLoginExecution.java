package clearSelenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import brokerDealer.util.FilesFoldersUtil;
import brokerDealer.util.PropertiesUtils;

public class ClearLoginExecution {
	
	private static	ClearLogin			clearLogin;
	private			PropertiesUtils		aPropertiesUtils;
	
	@BeforeClass
	public static void initializeClearLogin() {
		clearLogin = ClearLogin.setSystemPropertyChromeWebDriver();
	}
	
	@Test
	public void login() {
		this.aPropertiesUtils	=	new		PropertiesUtils();
		
		String	cpf		=	this.aPropertiesUtils.getCPF();
		
		clearLogin
			.fillCPF(cpf)
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
