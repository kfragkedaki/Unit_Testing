package unit_testing;

import unit_testing.MyMath;
import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {
	
	MyMath mm = new MyMath();	
	
	@Test 
	public void testDivideNumbers_normalCases() {
		int x=10;
		int y=5;
		
		double result = mm.divide(x, y);
		Assert.assertEquals( 2 , result, 0);
	}
	
	@Test 
	public void testDivideNumbers_zeroNum() {
		int x=0;
		int y=5;
		
		double result = mm.divide(x, y);
		Assert.assertEquals( 0 , result, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDivideNumbers_zeroDenomInput() {
		mm.divide(5, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDivideNumbers_zeroInputs() {
		mm.divide(0, 0);
	}
	
}