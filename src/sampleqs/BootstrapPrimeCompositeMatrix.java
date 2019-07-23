package sampleqs;

public class BootstrapPrimeCompositeMatrix {

	public static void main(String[] args) {
		
		int input = 2;
		boolean result = checkPrime(input, input / 2);
		System.out.println(result);
	}
	
	public static boolean checkPrime(int input, int divisor) {
		if(input == 2)
			return true;
		if(input % divisor == 0)
			return false;
		if(divisor <= 2)
			return true;
		return checkPrime(input, divisor - 1);
	}
}
