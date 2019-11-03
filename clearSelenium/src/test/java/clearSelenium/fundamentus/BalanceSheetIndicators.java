package clearSelenium.fundamentus;

public class BalanceSheetIndicators {
	
	/**
	 * Ativo					-			Asset
	 */
	public static final String ASSET_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[2]/span";
	
	/**
	 * Disponibilidades			-			Dinheiro Disponível
	 */
	public static final String AVAILABLE_CASH_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[2]/span";
	
	/**
	 * Ativo Circulante			-			Current Assert
	 */
	public static final String CURRENT_ASSET_XPATH			=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[2]/span";
	
	/**
	 * Dívida Bruta				-			Gross Debt
	 */
	public static final String GROSS_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[2]/td[4]/span";
	
	/**
	 * Dívida Líquida			-			Net Debt
	 */
	public static final String NET_DEBT_XPATH				=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[3]/td[4]/span";
	
	/**
	 * Patrimônio Líquido		-			Equity
	 */
	public static final String EQUITY_XPATH					=	"/html/body/div[1]/div[2]/table[4]/tbody/tr[4]/td[4]/span";
	
}