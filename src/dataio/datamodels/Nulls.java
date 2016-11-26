package dataio.datamodels;

public class Nulls {

	private boolean checkNull(String value) {
		return value == null || "null".equalsIgnoreCase(value);
	}
}
