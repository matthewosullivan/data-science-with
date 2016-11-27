package dataio.managingdatafiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonStrings {

	public static void main(String[] args) {
		List<Record> listOfRecords = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("somefile.txt"))) {
			
			String line;
			
			JSONParser parser = new JSONParser();
			
			while ((line = br.readLine()) != null) {
				
				Record r = new Record();
				
				JSONObject obj = (JSONObject)parser.parse(line);
				
				r.id = Integer.parseInt(obj.get("id").toString());
				r.year = Integer.parseInt(obj.get("year").toString());
				r.city = obj.get("city").toString();
				
				listOfRecords.add(r);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
