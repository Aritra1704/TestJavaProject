package practice.gcd;

public class Algorithm {

	public int gcdIteration(int num1, int num2) {
	
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		
		return num1;
	}
	
	public int gcdRecursion(int num1, int num2) {
		if(num2 == 0) return num1;
		
		return gcdRecursion(num2, num1 % num2);
	}
}
