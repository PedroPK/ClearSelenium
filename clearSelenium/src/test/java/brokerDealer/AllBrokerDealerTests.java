package brokerDealer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import brokerDealer.core.StockCalculatorTest;
import brokerDealer.repositories.StockOrderRepositoryTest;
import brokerDealer.util.MathUtilTest;

@RunWith(Suite.class)
@SuiteClasses(
	{
		StockCalculatorTest.class, 
		StockOrderRepositoryTest.class,
		MathUtilTest.class
	}
)
public class AllBrokerDealerTests {

}
