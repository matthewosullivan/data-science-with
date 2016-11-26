package dataio.datamodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataObjects {

	public static void main(String[] args) {
		List<Record> listOfRecords = new ArrayList<>();
		Map<String,Record> mapOfRecords = new HashMap<>();
	}

}

class Record {
	int id;
	int year;
	String city;
}
