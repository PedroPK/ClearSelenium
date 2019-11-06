package clearSelenium.fundamentus;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class IncomeStatementResultsIndicators {
	
	/**
	 * Receita Líquida dos Últimos 12 Meses		-		Net Income from Last 12 Months
	 */
	public static final		String		NET_INCOME_LAST_12_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aNEtIncomeLast12Months;
	
	/**
	 * EBIT dos Últimos 12 Meses		-		EBIT from Last 12 Months
	 */
	public static final		String		EBIT_LAST_12_MONTHS_XPATH					=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[4]/td[2]/span";
	private					BigDecimal	aEbitLast12Months;
	
	/**
	 * Lucro Líquido dos Últimos 12 Meses		-		Net Profit from Last 12 Months
	 */
	public static final		String		NET_PROFIT_LAST_12_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[5]/td[2]/span";
	private 				BigDecimal	aNetProfitLast12Months;
	
	
	/**
	 * Receita Líquida dos Últimos 3 Meses		-		Net Income from Last 3 Months
	 */
	public static final		String		NET_INCOME_LAST_03_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[3]/td[4]/span";
	private 				BigDecimal	aNetIncomeLast03Months;
	
	/**
	 * EBIT dos Últimos 03 Meses		-		EBIT from Last 03 Months
	 */
	public static final		String		EBIT_LAST_03_MONTHS_XPATH					=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[4]/td[4]/span";
	private 				BigDecimal	aEbitLast03Months;
	
	/**
	 * Lucro Líquido dos Últimos 03 Meses		-		Net Profit from Last 03 Months
	 */
	public static final		String		NET_PROFIT_LAST_03_MONTHS_XPATH				=	"/html/body/div[1]/div[2]/table[5]/tbody/tr[5]/td[4]/span";
	private 				BigDecimal	aNetProfitLast03Months;
	
}