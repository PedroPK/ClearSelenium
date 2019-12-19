package clearSelenium.fundamentus.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import clearSelenium.fundamentus.BalanceSheetIndicatorsTest;
import clearSelenium.fundamentus.BasicIndicatorsTest;
import clearSelenium.fundamentus.FundamentalistIndicatorsTest;
import clearSelenium.fundamentus.IncomeStatementResultsIndicatorsTest;
import clearSelenium.fundamentus.OscilationIndicatorsTest;

@RunWith(Suite.class)
@SuiteClasses({
	BalanceSheetIndicatorsTest.class,
	BasicIndicatorsTest.class,
	FundamentalistIndicatorsTest.class,
	IncomeStatementResultsIndicatorsTest.class,
	OscilationIndicatorsTest.class
})
public class SuiteFundamentus {}
