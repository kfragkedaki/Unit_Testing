package unit_testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class MyFileUtilitiesTest {
	
	int[] array = new int[150];
	MyFileUtilities mf = new MyFileUtilities();
	
	@Before 
	public void initializeArray() {
		array[0] = 1;
		array[1] = 6;
		array[2] = 4;
		array[3] = 5;
		array[4] = 10;
		array[5] = 0;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
	}
	
	
	@Test 
	public void testFileReader_normalCase() {
		
	    String path = "src\\test\\resources\\grades.txt";
	    Assert.assertArrayEquals(array ,mf.readFile(path));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none(); 
	
	@Test(expected=IllegalArgumentException.class)
	public void testFileReader_NoPathInput() {
		thrown.expect(IllegalArgumentException.class);
		
		String path = "src\\test\\resources";
		mf.readFile(path);
	}

}