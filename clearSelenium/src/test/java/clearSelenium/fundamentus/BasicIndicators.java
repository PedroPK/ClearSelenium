package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class BasicIndicators {
	
	/**
	 * Código da ação
	 */
	public static final		String		TICKER							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[1]/td[2]/span";
	private					BigDecimal	aTicker;
	
	public static String geTicker() {
		WebElement dividendYieldWebElement = getElementByXPath(TICKER);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * ON = Ordinária, PN = Preferencial, PNA = Pref. tipo A, etc
	 */
	public static final		String		TYPE							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/span";
	private					BigDecimal	aType;
	
	public static String geType() {
		WebElement dividendYieldWebElement = getElementByXPath(TYPE);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Nome comercial da empresa.
	 */
	public static final		String		COMPANY_NAME					=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aCompanyName;
	
	public static String geCompany() {
		WebElement dividendYieldWebElement = getElementByXPath(COMPANY_NAME);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Classificação setorial
	 */
	public static final		String		SECTOR							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[4]/td[2]/span/a";
	private					BigDecimal	aSector;
	
	public static String geSector() {
		WebElement dividendYieldWebElement = getElementByXPath(SECTOR);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Classificação por segmento de atuação.
	 */
	public static final		String		SUB_SECTOR						=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[5]/td[2]/span/a";
	private					BigDecimal	aSubSector;
	
	public static String geSubSector() {
		WebElement dividendYieldWebElement = getElementByXPath(SUB_SECTOR);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Cotação de fechamento da ação no último pregão
	 */
	public static final		String		PRICE							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[1]/td[4]/span";
	private					BigDecimal	aPrice;
	
	public static String gePrice() {
		WebElement dividendYieldWebElement = getElementByXPath(PRICE);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Data do último pregão em  que o ativo foi negociado
	 */
	public static final		String		DATE_PRICE						=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[2]/td[4]/span";
	private					BigDecimal	aDatePrice;
	
	public static String geDatePrice() {
		WebElement dividendYieldWebElement = getElementByXPath(DATE_PRICE);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Menor cotação da ação nos últimos 12 meses.
	 */
	public static final		String		MINIMUM_PRICE_LAST_52_WEEKS		=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[3]/td[4]/span";
	private					BigDecimal	aMinimumPriceLast32Weeks;
	
	public static String geMinimumPriceLast52Weeks() {
		WebElement dividendYieldWebElement = getElementByXPath(MINIMUM_PRICE_LAST_52_WEEKS);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Maior cotação da ação nos últimos 12 meses
	 */
	public static final		String		MAXIMUM_PRICE_LAST_52_WEEKS		=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[4]/td[4]/span";
	private					BigDecimal	aMaximumPriceLast32Weeks;
	
	public static String geMaximumPriceLast52Weeks() {
		WebElement dividendYieldWebElement = getElementByXPath(MAXIMUM_PRICE_LAST_52_WEEKS);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Volume médio de negociação da ação nos últimos 2 meses (R$)
	 */
	public static final		String		AVERAGE_VOLUME_LAST_2_MONTHS	=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[5]/td[4]/span";
	private					BigDecimal	aAverageVolumeLast32Weeks;
	

	public static String geMAverageVolumeLast52Weeks() {
		WebElement dividendYieldWebElement = getElementByXPath(AVERAGE_VOLUME_LAST_2_MONTHS);
		return dividendYieldWebElement.getText();
	}
	
}
