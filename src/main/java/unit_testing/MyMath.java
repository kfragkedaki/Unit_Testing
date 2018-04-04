package unit_testing;

public class MyMath {
	
	public double divide(int num, int denom) {
		
		if (denom == 0) {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
		
		return (double) num/denom;
	}
	
	public int reverseNumber(int number) {
		return -number;
	}

}
