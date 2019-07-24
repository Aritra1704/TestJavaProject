package sampleqs;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		int[] tests = new int[testcase];
		for(int k = 0 ; k < testcase; k++) {
			tests[k] = scanner.nextInt();
		}
		
		System.out.println(findSpecial(tests));

	}
	
	static int findSpecial(int[] tests) {
		int count = 0;
		for(int i = 0; i < tests.length; i++) {
			if(isSpecial(i, tests))
				count++;
		}
		return count;
	}

	static boolean isSpecial(int i, int[] tests) {
		boolean result = false;
		for(int j = 0; j < tests.length; j++) {
			if(i != j && tests[i] > 0 && tests[j] > 0 && tests[i] % tests[j] == 0) {
				result = true;
				break;
			}
				
		}
		return result;
	}
}
