package dataio.managingdatafiles.parsingeachline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import dataio.managingdatafiles.Record;

public class ApacheCommonsCsvParserLibrary {

	public static void main(String[] args) {
		List<Record> listOfRecords = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("somefile.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				Record r = new Record();
				
				CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
				
				/* get columns starting at position 1 */
				for (CSVRecord cr : parser) {
					r.id = Integer.parseInt(cr.get(1));
					r.year = Integer.parseInt(cr.get(2));
					r.city = cr.get(3);
				}
				
				listOfRecords.add(r);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
