package unit_testing;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.Exception;

public class MyFileUtilities {
	
	public int[] readFile(String filepath) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		try {
			File file = new File(filepath);
			BufferedReader br = new BufferedReader(new FileReader(file));
	    	 
			String st;
			int i = 0;
			while ((st = br.readLine()) != null) {
			
				int input = Integer.parseInt(st);
				arraylist.add(input);
				i++;
			}

			br.close();
		} catch (Exception e) {
			throw new IllegalArgumentException("Error while reading the file");
	    } 
		
		int size = arraylist.size();
		int[] array = new int[size];
		
		for (int i = 0 ; i < size; i++) {
			array[i] = arraylist.get(i);
		}
		return array;
	}

}
