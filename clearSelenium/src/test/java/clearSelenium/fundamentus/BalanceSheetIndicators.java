package clearSelenium.fundamentus;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BalanceSheetIndicators {
	
	/**
	 * Ativo					-			Asset
	 */
	public static final		String		ASSET_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[2]/span";
	private					BigDecimal	aAsset;
	
	/**
	 * Disponibilidades			-			Dinheiro Disponível
	 */
	public static final		String		AVAILABLE_CASH_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aCash;
	
	/**
	 * Ativo Circulante			-			Current Assert
	 */
	public static final		String		CURRENT_ASSET_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[2]/span";
	private					BigDecimal	aCurrentAsset;
	
	/**
	 * Dívida Bruta				-			Gross Debt
	 */
	public static final		String		GROSS_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[4]/span";
	private					BigDecimal	aGrossDebt;
	
	/**
	 * Dívida Líquida			-			Net Debt
	 */
	public static final		String		NET_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[4]/span";
	private					BigDecimal	aNetDebt;
	
	/**
	 * Patrimônio Líquido		-			Equity
	 */
	public static final		String		EQUITY_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[4]/span";
	private					BigDecimal	aEquity;
	
}