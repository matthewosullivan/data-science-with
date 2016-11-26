package dataio.dealingwtihrealdata;

public class Nulls {

	private boolean checkNull(String value) {
		return value == null || "null".equalsIgnoreCase(value);
	}
}
