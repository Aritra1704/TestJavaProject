package practice.factorial;

public class Algorithm {

	public int getFactIteration(int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		
		return result;
	}
	
	public int getFactRecursion(int n) {
		if(n == 1)
			return 1;
		return n * getFactRecursion(n - 1);
	}
	
	public int getFactAccumulator(int accumulator, int n) {
		if(n == 1) return accumulator;
		
		return getFactAccumulator(accumulator * n, n - 1);
	}
}
