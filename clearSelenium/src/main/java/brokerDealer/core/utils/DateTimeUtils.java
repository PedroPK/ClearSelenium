package brokerDealer.core.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeUtils {
	
	public static LocalDateTime getLocalDateTime(
		int		pYear,
		int		pMonth,
		int		pDay,
		int		pHour,
		int		pMinute,
		int		pSecond
	) {
		LocalDateTime localDateTime =
			LocalDateTime.of(
				getLocalDate(pYear, pMonth, pDay), 
				getLocalTime(pDay, pMinute, pSecond));
		
		return localDateTime;
	}

	private static LocalTime getLocalTime(int pDay, int pMinute, int pSecond) {
		return LocalTime.of(pDay, pMinute, pSecond);
	}

	private static LocalDate getLocalDate(int pYear, int pMonth, int pDay) {
		return LocalDate.of(pYear, pMonth, pDay);
	}
	
}