package brokerDealer.util;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsUtil {
	
	public static Map<String, BigDecimal> orderMapByValue(Map<String, BigDecimal> pOriginalMap) {
		Map<String, BigDecimal>		sortedMap	=	
			pOriginalMap
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(
					Collectors.toMap(
						e -> e.getKey(),
						e -> e.getValue(),
						(e1, e2) -> e2,
						LinkedHashMap::new
					)
				);
		return sortedMap;
	}
	
}
