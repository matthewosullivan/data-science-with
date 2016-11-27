package dataio.readingfromatextfile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadingARemoteTextFile {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://storage.example.com/public-data/somefile.txt");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
			String line;
			while ((line = br.readLine()) != null) {
				// do something with line
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
