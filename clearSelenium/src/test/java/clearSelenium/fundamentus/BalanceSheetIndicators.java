package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import static brokerDealer.util.MathUtils.*;
import lombok.Data;

@Data
public class BalanceSheetIndicators {
	
	/**
	 * Ativo					-			Asset
	 */
	public static final		String		ASSET_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[2]/span";
	private					BigDecimal	aAsset;
	
	public static String getAsset() {
		WebElement dividendYieldWebElement = getElementByXPath(ASSET_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	public BigDecimal getAssetBigDecimal() {
		String asset = getAsset();
		
		String assetWithoutDots = convertBrazilianCurrencyToBigDecimalCompatible(asset);
		
		this.aAsset = new BigDecimal(assetWithoutDots);
		
		return this.aAsset;
	}
	
	/**
	 * Disponibilidades			-			Dinheiro Disponível
	 */
	public static final		String		AVAILABLE_CASH_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aAvailableCash;
	
	public static String getAvailableCash() {
		WebElement dividendYieldWebElement = getElementByXPath(AVAILABLE_CASH_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	public BigDecimal getAvailableCashBigDecimal() {
		String availableCash = getAvailableCash();
		
		String availableCashBigDecimalCompatible = convertBrazilianCurrencyToBigDecimalCompatible(availableCash);
		
		this.aAvailableCash = new BigDecimal(availableCashBigDecimalCompatible);
		
		return this.aAvailableCash;
	}
	
	/**
	 * Ativo Circulante			-			Current Assert
	 */
	public static final		String		CURRENT_ASSET_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[2]/span";
	private					BigDecimal	aCurrentAsset;
	
	public static String getCurrentAsset() {
		WebElement dividendYieldWebElement = getElementByXPath(CURRENT_ASSET_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Dívida Bruta				-			Gross Debt
	 */
	public static final		String		GROSS_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[4]/span";
	private					BigDecimal	aGrossDebt;
	
	public static String getGrossDebt() {
		WebElement dividendYieldWebElement = getElementByXPath(GROSS_DEBT_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Dívida Líquida			-			Net Debt
	 */
	public static final		String		NET_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[4]/span";
	private					BigDecimal	aNetDebt;
	
	public static String getNetDebt() {
		WebElement dividendYieldWebElement = getElementByXPath(NET_DEBT_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Patrimônio Líquido		-			Equity
	 */
	public static final		String		EQUITY_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[4]/span";
	private					BigDecimal	aEquity;
	
	public static String getEquity() {
		WebElement dividendYieldWebElement = getElementByXPath(EQUITY_XPATH);
		return dividendYieldWebElement.getText();
	}
	
}