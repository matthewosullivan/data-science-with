package dataio.managingdatafiles.parsingeachline;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFiles {

	public static void main(String[] args) {
		try {
			JSONParser parser = new JSONParser();
			
			JSONArray jArr = (JSONArray) parser.parse(new FileReader("data.json"));
			
			for (Object o : jArr) {
				JSONObject jobj = (JSONObject)o;
				// do something with jobj
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
