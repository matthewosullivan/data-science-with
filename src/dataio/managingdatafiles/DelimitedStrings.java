package dataio.managingdatafiles;

import java.awt.image.ReplicateScaleFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DelimitedStrings {

	public static void main(String[] args) {
		List<Record> listOfRecords = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("somefile.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				Record r = new Record();
				
				String[] s = line.split(",");// tab delimited data line.split("\t")
				
				r.id = Integer.parseInt(s[0].trim());
				r.year = Integer.parseInt(s[1].trim());
				r.city = s[2].trim().replace("\"", "");
				
				listOfRecords.add(r);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
