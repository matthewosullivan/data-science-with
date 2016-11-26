package dataio.dealingwtihrealdata;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class ParseErrors {
	public static void main(String[] args) {
		try {
			double d = Double.parseDouble("");
			// handle d
		} catch (NumberFormatException e) {
			// increment parse error counter etc...
		}
		
		try {
			OffsetDateTime odt = OffsetDateTime.parse("");
			// handle odt
		} catch (DateTimeParseException e) {
			// increment parse error counter etc...	
		}
	}
}
