package clearSelenium.fundamentus;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BasicIndicators {
	
	/**
	 * Código da ação
	 */
	public static final		String		TICKER							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[1]/td[2]/span";
	private					BigDecimal	aTicker;
	
	/**
	 * ON = Ordinária, PN = Preferencial, PNA = Pref. tipo A, etc
	 */
	public static final		String		TYPE							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[2]/td[2]/span";
	private					BigDecimal	aType;
	
	/**
	 * Nome comercial da empresa.
	 */
	public static final		String		COMPANY_NAME					=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[3]/td[2]/span";
	private					BigDecimal	aCompanyName;
	
	/**
	 * Classificação setorial
	 */
	public static final		String		SECTOR							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[4]/td[2]/span/a";
	private					BigDecimal	aSector;
	
	/**
	 * Classificação por segmento de atuação.
	 */
	public static final		String		SUB_SECTOR						=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[5]/td[2]/span/a";
	private					BigDecimal	aSubSector;
	
	/**
	 * Cotação de fechamento da ação no último pregão
	 */
	public static final		String		PRICE							=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[1]/td[4]/span";
	private					BigDecimal	aPrice;
	
	/**
	 * Data do último pregão em  que o ativo foi negociado
	 */
	public static final		String		DATE_PRICE						=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[2]/td[4]/span";
	private					BigDecimal	aDatePrice;
	
	/**
	 * Menor cotação da ação nos últimos 12 meses.
	 */
	public static final		String		MINIMUM_PRICE_LAST_52_WEEKS		=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[3]/td[4]/span";
	private					BigDecimal	aMinimumPriceLast32Weeks;
	
	/**
	 * Maior cotação da ação nos últimos 12 meses
	 */
	public static final		String		MAXIMUM_PRICE_LAST_52_WEEKS		=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[4]/td[4]/span";
	private					BigDecimal	aMaximumPriceLast32Weeks;
	
	/**
	 * Volume médio de negociação da ação nos últimos 2 meses (R$)
	 */
	public static final		String		AVERAGE_VOLUME_LAST_2_MONTHS	=	"/html/body/div[1]/div[2]/table[1]/tbody/tr[5]/td[4]/span";
	private					BigDecimal	aAverageVolumeLast32Weeks;
	
}
