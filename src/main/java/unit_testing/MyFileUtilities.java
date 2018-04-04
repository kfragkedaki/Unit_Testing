package unit_testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.Exception;
import java.io.FileNotFoundException;

public class MyFileUtilities {
	
	public int[] readFile(String filepath) {
		
		int[] array = new int[150];
		
		try {
			File file = new File(filepath);
			BufferedReader br = new BufferedReader(new FileReader(file));
	    	 
			String st;
			int i = 0;
			while ((st = br.readLine()) != null) {
			
				int input = Integer.parseInt(st);
				array[i] = input;
				i++;
			}
			
			br.close();
		} catch (Exception e) {
			throw new IllegalArgumentException("Error while reading the file");
	    }
		
		return array;
	}

}
