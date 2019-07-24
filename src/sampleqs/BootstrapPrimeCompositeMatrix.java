package sampleqs;

import java.util.Scanner;

public class BootstrapPrimeCompositeMatrix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		for(int k = 0 ; k < testcase; k++) {
			int m = scanner.nextInt();;
			int n = scanner.nextInt();;
		
			int[][] matrix = new int[m][n];
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					matrix[i][j] = scanner.nextInt();;
				}
			}
			
			checkTestCase(m, n, matrix);
		}
		
//		int input = 5;
//		boolean result = checkPrime(input, input / 2);
//		System.out.println(result);
	}
	
	private static void checkTestCase(int m, int n, int[][] matrix) {
		int prime = 0;
		int composite = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				boolean isPrime = checkPrime(matrix[i][j], matrix[i][j] / 2);
				if(isPrime)
					prime++;
				else
					composite++;
			}
		}
		System.out.println(prime + " " + composite);
	}

	public static boolean checkPrime(int input, int divisor) {
		if(input == 2 || input == 3)
			return true;
		if(input % divisor == 0)
			return false;
		if(divisor <= 2)
			return true;
		return checkPrime(input, divisor - 1);
	}
}
