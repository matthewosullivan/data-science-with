package dataio.managingdatafiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import org.json.simple.JSONObject;

public class WritingToAFile {

	public static void main(String[] args) {
		Record record = new Record();
		
		/* for each instance Record record */
		String output = Integer.toString(record.id) + "," + Integer.toString(record.year) + "," + record.city;
		
		/* In Java 8 */
		String output2 = String.join(",", Integer.toString(record.id), Integer.toString(record.year), record.city);
		
		/* In Java 8 */
		String newString = String.join(",", "a", "b", "c");
		
		/* or feed in an iterator */
		List<String> myList = null;
		String newString2 = String.join(",", myList);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("somefile.txt"))) {
			
			List<String> myStringList = null;
			
			for (String s : myStringList) {
				
				bw.write(s);
				
				/* don't forget to append a new line! */
				bw.newLine();
			}
				
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/* setting the FileWriter append bit will keep existing data and append new data */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("somefile.txt", true))) {
			
			List<String> myStringList = null;
			
			for (String s : myStringList) {
				
				bw.write(s);
				
				/* don't forget to append a new line! */
				bw.newLine();
			}
				
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("somefile.txt")))) {
			
			List<String> myStringList = null;
			
			for (String s : myStringList) {
				
				/* adds a new line for you */
				pw.println(s);
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		JSONObject obj = null;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("somefile.txt"))) {
			bw.write(obj.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<JSONObject> dataList = null;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("somefile.txt"))) {
		
			for (JSONObject jobj : dataList) {
				bw.write(jobj.toString());
				
				bw.newLine();
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
