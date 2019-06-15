package clearSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearLogin {
	
	/**
	 * URL's
	 */
	private static final String URL_CLEAR = "https://www.clear.com.br/pit/signin?controller=SignIn";
	
	private WebDriver aDriver;
	
	public ClearLogin( WebDriver pWebDriver ) {
		this.aDriver = pWebDriver;
	}
	
	public void accessURL() {
		this.aDriver.get(URL_CLEAR);
	}
	
	private WebElement fillInputByXPath(String pXPath, String pValue) {
		WebElement field = this.aDriver.findElement(By.xpath(pXPath));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
	private WebElement fillInputById(String pId, String pValue) {
		WebElement field = this.aDriver.findElement(By.id(pId));
		
		// Clear previously filled values
		field.clear();
		
		// Fill the Field
		field.sendKeys(pValue);
		
		return field;
	}
	
}