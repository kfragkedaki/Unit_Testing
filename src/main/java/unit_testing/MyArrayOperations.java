package unit_testing;

public class MyArrayOperations {
	
	public int[] gradeFrequencies(String filepath, MyFileUtilities utils) {
		
		int[] freq = new int [11];
		
		for (int i=0; i<11; i++) freq[i] = 0;
		
		int[] array = utils.readFile(filepath);
		
		for (int i=0 ; i < array.length; i++) {
			freq[array[i]]++;
		}
		
		return freq; 
		
	}

}