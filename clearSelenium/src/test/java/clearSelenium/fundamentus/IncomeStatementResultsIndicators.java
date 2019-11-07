package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class IncomeStatementResultsIndicators {
	
	/**
	 * Receita Líquida dos Últimos 12 Meses		-		Net Income from Last 12 Months
	 */
	public static final		String		NET_INCOME_LAST_12_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aNEtIncomeLast12Months;
	
	public static String getNetIncomeLast12Months() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_INCOME_LAST_12_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * EBIT dos Últimos 12 Meses		-		EBIT from Last 12 Months
	 */
	public static final		String		EBIT_LAST_12_MONTHS_XPATH					=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[4]/td[2]/span";
	private					BigDecimal	aEbitLast12Months;
	
	public static String getEbitLast12Months() {
		WebElement dividendYieldWebElement = getElementByXPath(EBIT_LAST_12_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Lucro Líquido dos Últimos 12 Meses		-		Net Profit from Last 12 Months
	 */
	public static final		String		NET_PROFIT_LAST_12_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[5]/td[2]/span";
	private 				BigDecimal	aNetProfitLast12Months;
	
	public static String getNetProfitLast12Months() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_PROFIT_LAST_12_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Receita Líquida dos Últimos 3 Meses		-		Net Income from Last 3 Months
	 */
	public static final		String		NET_INCOME_LAST_03_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[3]/td[4]/span";
	private 				BigDecimal	aNetIncomeLast03Months;
	
	public static String getNetIncomeLast03Months() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_INCOME_LAST_03_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * EBIT dos Últimos 03 Meses		-		EBIT from Last 03 Months
	 */
	public static final		String		EBIT_LAST_03_MONTHS_XPATH					=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[4]/td[4]/span";
	private 				BigDecimal	aEbitLast03Months;
	
	public static String getEbitLast03Months() {
		WebElement dividendYieldWebElement = getElementByXPath(EBIT_LAST_03_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Lucro Líquido dos Últimos 03 Meses		-		Net Profit from Last 03 Months
	 */
	public static final		String		NET_PROFIT_LAST_03_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[5]/td[4]/span";
	private 				BigDecimal	aNetProfitLast03Months;
	
	public static String getNetProfitLast03Months() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_PROFIT_LAST_03_MONTHS_XPATH);
		return dividendYieldWebElement.getText();
	}
	
}