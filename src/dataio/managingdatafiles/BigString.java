package dataio.readingfromatextfile.parsingeachline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigString {

	public static void main(String[] args) {
		Map<Integer,String> cityLookup = new HashMap<>();
		cityLookup.put(1, "New York");
		cityLookup.put(2, "Los Angeles");
		cityLookup.put(3, "San Francisco");
		
		List<Record> listOfRecords = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("somefile.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				Record r = new Record();
				
				/* String substring(start, stop) returns chars from position start up to, 
				   but not including, position stop */
				
				r.id = Integer.parseInt(line.substring(0, 4));
				r.year = Integer.parseInt(line.substring(4, 8));
				r.city = cityLookup.get(line.substring(8, 10));
				
				listOfRecords.add(r);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class Record {
	int id;
	int year;
	String city;
}
