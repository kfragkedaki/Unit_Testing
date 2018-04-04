package unit_testing;

public class MyArrayOperations {
	
	public int[] gradeFrequencies(String filepath, MyFileUtilities utils) {
		
		int[] freq = new int [11];
		int[] array = new int [150];
		
		for (int i=0; i<11; i++) freq[i] = 0;
		
		array = utils.readFile(filepath);
		
		for (int j=0 ; j <150; j++) {
			for (int i=0; i<11; i++) {
				if (array[j] == i) freq[i]++;
			}
		}
		return freq;
	}

}