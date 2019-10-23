package brokerDealer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import brokerDealer.core.StockCalculatorTest;
import brokerDealer.repositories.StockOrderRepositoryTest;
import brokerDealer.util.math.UtilMathTest;

@RunWith(Suite.class)
@SuiteClasses(
	{
		StockCalculatorTest.class, 
		StockOrderRepositoryTest.class,
		UtilMathTest.class
	}
)
public class AllBrokerDealerTests {

}
