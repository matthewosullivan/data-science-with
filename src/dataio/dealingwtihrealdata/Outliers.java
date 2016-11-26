package dataio.dealingwtihrealdata;

import java.time.OffsetDateTime;
import java.util.Set;

public class Outliers {
	private boolean isMinValueInclusive;
	private double minValue;
	private double maxValue;
	private boolean isMaxValueInclusive;
	private Set<String> validItems;
	private OffsetDateTime minDate;
	private OffsetDateTime maxDate;

	public boolean checkRange(double value) {
		boolean minBit = (isMinValueInclusive) ? value >= minValue : value > minValue;
		boolean maxBit = (isMaxValueInclusive) ? value <= maxValue : value < maxValue;
		return minBit && maxBit;
	}
	
	private boolean checkRange(String value) {
		return validItems.contains(value);
	}
	
	private boolean checkRange(OffsetDateTime odt) {
		return odt.isAfter(minDate) && odt.isBefore(maxDate);
	}

}
