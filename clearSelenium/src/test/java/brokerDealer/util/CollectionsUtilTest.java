package brokerDealer.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CollectionsUtilTest {

	@Test
	public void testOrderMapByValue() {
		/* Arrange
		 * 
		 * {
		 * 		ACES3=0.0, 
		 * 		ABCB3=0.0, 
		 * 		ABEV3=1.8, 
		 * 		AEDU11=0.0, 
		 * 		ABCB4=5.9, 
		 * 		ACES4=0.0, 
		 * 		ADHM3=0.0, 
		 * 		ABYA3=0.0, 
		 * 		AEDU3=0.0, 
		 * 		AALR3=0.5}
		 */
		Map<String, BigDecimal> originalMap = new HashMap<String, BigDecimal>();
		originalMap.put("ACES3",	BigDecimal.valueOf(0.0));
		originalMap.put("ABCB3",	BigDecimal.valueOf(0.0));
		originalMap.put("ABEV3",	BigDecimal.valueOf(1.8));
		originalMap.put("AEDU11",	BigDecimal.valueOf(0.0));
		originalMap.put("ABCB4",	BigDecimal.valueOf(5.9));
		originalMap.put("ACES4",	BigDecimal.valueOf(0.0));
		originalMap.put("AALR3",	BigDecimal.valueOf(0.5));
		
		// Act
		Map<String, BigDecimal> sortedMap = CollectionsUtil.orderMapByValue(originalMap);
		
		// Expected Outcome
		Map<String, BigDecimal> expectedOutcomeMap = new HashMap<String, BigDecimal>();
		expectedOutcomeMap.put("ACES3",		BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("ABCB3",		BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("AEDU11",	BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("ACES4",		BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("AALR3",		BigDecimal.valueOf(0.5));
		expectedOutcomeMap.put("ABEV3",		BigDecimal.valueOf(1.8));
		expectedOutcomeMap.put("ABCB4",		BigDecimal.valueOf(5.9));
		
		assertEquals(expectedOutcomeMap, sortedMap);
	}

	@Test
	public void testSortMapByValueInvertedOrder() {
		/* Arrange
		 * 
		 * {
		 * 		ACES3=0.0, 
		 * 		ABCB3=0.0, 
		 * 		ABEV3=1.8, 
		 * 		AEDU11=0.0, 
		 * 		ABCB4=5.9, 
		 * 		ACES4=0.0, 
		 * 		ADHM3=0.0, 
		 * 		ABYA3=0.0, 
		 * 		AEDU3=0.0, 
		 * 		AALR3=0.5}
		 */
		Map<String, BigDecimal> originalMap = new HashMap<String, BigDecimal>();
		originalMap.put("ACES3",	BigDecimal.valueOf(0.0));
		originalMap.put("ABCB3",	BigDecimal.valueOf(0.0));
		originalMap.put("ABEV3",	BigDecimal.valueOf(1.8));
		originalMap.put("AEDU11",	BigDecimal.valueOf(0.0));
		originalMap.put("ABCB4",	BigDecimal.valueOf(5.9));
		originalMap.put("ACES4",	BigDecimal.valueOf(0.0));
		originalMap.put("AALR3",	BigDecimal.valueOf(0.5));
		
		// Act
		Map<String, BigDecimal> sortedMap = CollectionsUtil.orderMapByValue(originalMap);
		
		// Expected Outcome
		Map<String, BigDecimal> expectedOutcomeMap = new HashMap<String, BigDecimal>();
		expectedOutcomeMap.put("ABCB4",		BigDecimal.valueOf(5.9));
		expectedOutcomeMap.put("ABEV3",		BigDecimal.valueOf(1.8));
		expectedOutcomeMap.put("AALR3",		BigDecimal.valueOf(0.5));
		expectedOutcomeMap.put("ACES3",		BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("ABCB3",		BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("AEDU11",	BigDecimal.valueOf(0.0));
		expectedOutcomeMap.put("ACES4",		BigDecimal.valueOf(0.0));
		
		assertEquals(expectedOutcomeMap, sortedMap);
	}
	
}
