package dataio.readingfromatextfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadingFromATextFile {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("somefile.txt"))) {
			/* pull off the header first ... */
			String header = br.readLine();
			String[] headers = header.split(",");
			Map<String,Integer> headerMap = new HashMap<>();
			for (int i = 0; i < headers.length; i++) {
				headerMap.put(headers[i], i);
			}
			
			String line;
			
			/* ... and continue with the iterator */
			while ((line = br.readLine()) != null) {
				// do something with line
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
			// print or log the offending line of the file should an exception be caught
			//System.out.println(line);
		}
	}

}
