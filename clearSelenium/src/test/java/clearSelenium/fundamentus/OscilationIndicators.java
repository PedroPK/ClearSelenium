package clearSelenium.fundamentus;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class OscilationIndicators {
	
	/**
	 * Day Oscillation
	 */
	public static final		String			DAY_OSCILATION_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[2]/span/font";
	private 				BigDecimal		dayOscilation;
	/**
	 * Month Oscillation
	 */
	public static final		String			MONTH_OSCILATION_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[2]/span/font";
	private					BigDecimal		aMonthOscilation;
	
	/**
	 * 30 Days Oscillation
	 */
	public static final		String			THIRTY_DAY_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[2]/span/font";
	private					BigDecimal		aThirtyDayOscilation;
	
	/**
	 * 12 Month Oscillation
	 */
	public static final		String			TWELVE_MONTH_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[2]/span/font";
	private					BigDecimal		aTwelveDayOscilation;
	
	/**
	 * Present Year Oscillation
	 */
	public static final		String			PRESENT_YEAR_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[2]/span/font";
	private					BigDecimal		aPresentYearOscilation;
	
	/**
	 * Last Year Oscillation
	 */
	public static final		String			LAST_YEAR_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[2]/span/font";
	private					BigDecimal		aLastYearOscilation;
	
	/**
	 * Two Year Oscillation
	 */
	public static final		String			TWO_YEAR_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[2]/span/font";
	private					BigDecimal		aTwoYearOscilation;
	
	/**
	 * Three Years ago Oscillation
	 */
	public static final		String 			THREE_YEARS_AGO_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[2]/span/font";
	private					BigDecimal		aThreeYearOscilation;
	
	/**
	 * Four Years ago Oscillation
	 */
	public static final		String			FOUR_YEARS_AGO_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[2]/span/font";
	private					BigDecimal		aFourYearOscilation;
	/**
	 * Five Years ago Oscillation
	 */
	public static final		String			FIVE_YEARS_AGO_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[2]/span/font";
	private					BigDecimal		aFiveYearOscilation;
	
}