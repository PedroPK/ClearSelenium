package clearSelenium.fundamentus;

import static clearSelenium.SeleniumUtils.getElementByXPath;

import java.math.BigDecimal;

import org.openqa.selenium.WebElement;

import lombok.Data;

@Data
public class OscilationIndicators {
	
	/**
	 * Day Oscillation
	 */
	public static final		String			DAY_OSCILATION_XPATH					=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[2]/td[2]/span/font";
	private 				BigDecimal		aDayOscilation;
	
	public static String getDayOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(DAY_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Month Oscillation
	 */
	public static final		String			MONTH_OSCILATION_XPATH				=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[3]/td[2]/span/font";
	private					BigDecimal		aMonthOscilation;
	
	public static String getMonthOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(MONTH_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * 30 Days Oscillation
	 */
	public static final		String			THIRTY_DAYS_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[4]/td[2]/span/font";
	private					BigDecimal		aThirtyDayOscilation;
	
	public static String getThirtyDaysOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(THIRTY_DAYS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * 12 Month Oscillation
	 */
	public static final		String			TWELVE_MONTHS_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[5]/td[2]/span/font";
	private					BigDecimal		aTwelveDayOscilation;
	
	public static String getTwenveMonthsOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(TWELVE_MONTHS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Present Year Oscillation
	 */
	public static final		String			PRESENT_YEAR_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[6]/td[2]/span/font";
	private					BigDecimal		aPresentYearOscilation;
	
	public static String getPresentYearOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(PRESENT_YEAR_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Last Year Oscillation
	 */
	public static final		String			LAST_YEAR_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[7]/td[2]/span/font";
	private					BigDecimal		aLastYearOscilation;
	
	public static String getLastYearOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(LAST_YEAR_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Two Year Oscillation
	 */
	public static final		String			TWO_LAST_YEARS_OSCILATION_XPATH			=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[8]/td[2]/span/font";
	private					BigDecimal		aTwoYearOscilation;
	
	public static String getTwoLastYearsOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(TWO_LAST_YEARS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Three Years ago Oscillation
	 */
	public static final		String 			THREE_LAST_YEARS_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[9]/td[2]/span/font";
	private					BigDecimal		aThreeYearOscilation;
	
	public static String getThreeLastYearsOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(THREE_LAST_YEARS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	
	/**
	 * Four Years ago Oscillation
	 */
	public static final		String			FOUR_LAST_YEARS_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[10]/td[2]/span/font";
	private					BigDecimal		aFourYearOscilation;
	
	public static String getFourLastYearsOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(FOUR_LAST_YEARS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
	/**
	 * Five Years ago Oscillation
	 */
	public static final		String			FIVE_LAST_YEARS_OSCILATION_XPATH		=	"/html/body/div[1]/div[2]/table[3]/tbody/tr[11]/td[2]/span/font";
	private					BigDecimal		aFiveYearOscilation;
	
	public static String getFiveLastYearsOscilation() {
		WebElement dividendYieldWebElement = getElementByXPath(FIVE_LAST_YEARS_OSCILATION_XPATH);
		return dividendYieldWebElement.getText();
	}
	
}