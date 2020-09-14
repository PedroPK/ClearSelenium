package clearSelenium.fundamentus.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import clearSelenium.fundamentus.BalanceSheetIndicatorsTest;
import clearSelenium.fundamentus.BasicIndicatorsTest;
import clearSelenium.fundamentus.FundamentalistIndicatorsFundamentusTest;
import clearSelenium.fundamentus.IncomeStatementResultsIndicatorsTest;
import clearSelenium.fundamentus.OscilationIndicatorsTest;

@RunWith(Suite.class)
@SuiteClasses({
	BalanceSheetIndicatorsTest.class,
	BasicIndicatorsTest.class,
	FundamentalistIndicatorsFundamentusTest.class,
	IncomeStatementResultsIndicatorsTest.class,
	OscilationIndicatorsTest.class
})
public class SuiteFundamentus {}
