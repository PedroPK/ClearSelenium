package seleniumWebDriver.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CandleStick {
	
	private final BigDecimal		aOpeningValue;
	private final BigDecimal		aClosingValue;
	
	private final BigDecimal		aMinimumValue;
	private final BigDecimal		aMaximumValue;
	
	private final BigDecimal		aVolumeNegotiation;
	
	private final LocalDateTime		aBeginningLocalDateTime;
	private final LocalDateTime		aEndingLocalDateTime;
	
}