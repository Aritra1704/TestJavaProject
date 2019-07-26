package sampleqs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BootstrapPrimeCompositeMatrix {

	private final static String DELIMITER = "_";
	static int globalPrime = 0;
	static int globalComposite = 0;
	
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
			arrPos.clear();
			
//			boolean isPrime = checkPrime(matrix[0][0], matrix[0][0] / 2);
//			arrPos.add(0 + DELIMITER + 0);
//			findNewAdjacent(m, n, 0, 0, matrix, isPrime);
//			System.out.println(globalPrime + " " + globalComposite);
//			globalPrime = globalComposite = 0;
			findGangs(m, n, matrix);
//			checkTestCase(m, n, matrix);
		}
		
//		int test = 101;
//		System.out.println(checkPrime(test, test/2) + " " + checkPrimeOld(test, test / 2));
	}
	
	static ArrayList<String> arrPos = new ArrayList<>();
	
	
	private static void findAdjacent(int m, int n, int i, int j, int[][] matrix, boolean isPrime) {
		if(i < 0 || i >= m)
			return;
		if(j < 0 || j >= n)
			return;
		if(arrPos.contains(i + DELIMITER + j))
			return;
		if(checkPrime(matrix[i][j], matrix[i][j]/2) == isPrime) {
			arrPos.add(i + DELIMITER + j);
			findAdjacent(m, n, i - 1, j, matrix, isPrime);//Left
			findAdjacent(m, n, i + 1, j, matrix, isPrime);//Right
			
			findAdjacent(m, n, i, j - 1, matrix, isPrime);//Top
			findAdjacent(m, n, i, j + 1, matrix, isPrime);//Down
		}
	}
	
	private static ArrayList<Integer> arrPrimes = new ArrayList<>();
	private static ArrayList<Integer> arrComposite = new ArrayList<>();
	private static void findGangs(int m, int n, int[][] matrix) {
		int i = 0;
		int j = 0;
		int prime = 0;
		int composite = 0;
		while(arrPos.size() < (n * m)) {
			if(!arrPos.contains(i + DELIMITER + j)) {
				boolean isPrime = false;
				if (arrPrimes.contains(matrix[i][j]))  isPrime = true;
				else if(arrComposite.contains(matrix[i][j])) isPrime = false;
				else {
					isPrime = checkPrime(matrix[i][j], matrix[i][j] / 2);
					if(isPrime) arrPrimes.add(matrix[i][j]);
					else arrComposite.add(matrix[i][j]);
				}
				
				findAdjacent(m, n, i, j, matrix, isPrime);
				
				if(isPrime) prime++;
				else composite++;
			}
			if((j + 1) < n) j++;
			else if((i + 1) < m) {
				i++;
				j = 0;
			}
		}
		System.out.println(prime + " " + composite);
	}
	
	private static void checkTestCase(int m, int n, int[][] matrix) {
		int prime = 0;
		int composite = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(arrPos.contains(i + DELIMITER + j))
					continue;
				
				boolean isPrime = checkPrime(matrix[i][j], matrix[i][j] / 2);
				findAdjacent(m, n, i, j, matrix, isPrime);
				if(isPrime)
					prime++;
				else
					composite++;
			}
		}
		System.out.println(prime + " " + composite);
	}

	public static boolean checkPrime(int input, int divisor) {
		if(input < 2) return false;
		if(input == 2 || input == 3 || input == 5 || input == 7) return true;// If input is equal to 2, 3, 5 & 7
		if(input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0) return false;// If input divisible by 2, 3, 5 & 7
		if((divisor - 1) < 11) return true;// Cause input divided by 2, 3, 5 & 7 is already checked
		if(input % divisor == 0) return false;
		return checkPrime(input, divisor - 1);
	}
	
	public static boolean checkPrimeOld(int input, int divisor) {
		if(input == 2 || input == 3)
			return true;
		if(input % divisor == 0)
			return false;
		if(divisor <= 2)
			return true;
		return checkPrime(input, divisor - 1);
	}
	
//	private static void findNewAdjacent(int m, int n, int i, int j, int[][] matrix, boolean isPrime) {
//		if(arrPos.size() >= m * n) return;
//		if(i < 0 || i >= m) return;
//		if(j < 0 || j >= n) return;
//		
//		if(arrPos.contains(i + DELIMITER + j)) return;
//		else arrPos.add(i + DELIMITER + j);
//		
//		boolean isCurrentNodePrime = checkPrime(matrix[i][j], matrix[i][j]/2);
//		if(isCurrentNodePrime != isPrime) {
//			if(isCurrentNodePrime) globalPrime++;
//			else globalComposite++;
//		}
//		isPrime = isCurrentNodePrime;
//		
//		
//		findAdjacent(m, n, i - 1, j, matrix, isPrime);//Left
//		findAdjacent(m, n, i + 1, j, matrix, isPrime);//Right
//		
//		findAdjacent(m, n, i, j - 1, matrix, isPrime);//Top
//		findAdjacent(m, n, i, j + 1, matrix, isPrime);//Down
//	}
}
