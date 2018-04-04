package unit_testing;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayOperationsTest {
	
	MyArrayOperations mao = new MyArrayOperations();
	
	@Test
	public void test_freqArray_Mocking() throws Exception {
		
		MyFileUtilities mf = mock(MyFileUtilities.class);
		//Mock the MyFileUtilities
		when(mf.readFile("src\\test\\resources\\grades.txt")).thenReturn(new int[] {1,6,4,5,10,0,7,8,9,10});
		
		int[] testfreq = {1,1,0,0,1,1,1,1,1,1,2};
		
		Assert.assertArrayEquals(testfreq ,mao.gradeFrequencies("src\\test\\resources\\grades.txt", mf));
	}

}
