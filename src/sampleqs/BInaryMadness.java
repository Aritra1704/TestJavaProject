package sampleqs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BInaryMadness {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		for(int k = 0 ; k < testcase; k++) {
			BigInteger input = scanner.nextBigInteger();
			String binary = findBinary(input);
//			System.out.println(binary);
			
			findAllSubstring2(binary);
		}
	}
	
	private static void findAllSubstring(String binary) {

		int countZeroSet = 0;
		int countOneSet = 0;
		for (int i = 0; i < binary.length(); i++) {
			for (int j = i+1; j <= binary.length(); j++) {
				String sub = binary.substring(i,j);
				
				int[] count = oddNums(sub);
				if(count[0] % 2 != 0) 
					countZeroSet++;
				if(count[1] % 2 != 0) 
					countOneSet++;
			}
		}
		
		System.out.println(countZeroSet + " " + countOneSet);
	}
	
	private static void findAllSubstring2(String binary) {

		int countZeroSet = 0;
		int countOneSet = 0;
		ArrayList<String> arrSubString = new ArrayList<String>();
		for (int i = 0; i < binary.length(); i++) {
			for (int j = i+1; j <= binary.length(); j++) {
				String sub = binary.substring(i,j);
				arrSubString.add(sub);
			}
		}
		for(String sub : arrSubString) {
			int[] count = oddNums(sub);
			if(count[0] % 2 != 0) 
				countZeroSet++;
			if(count[1] % 2 != 0) 
				countOneSet++;
		}
		
		System.out.println(countZeroSet + " " + countOneSet);
	}
	
	private static int[] oddNums(String substring) {
		int countZero = 0;
		int countOne = 0;
		for(int i = 0; i < substring.length(); i++) {
			if(substring.charAt(i) == '0')
				countZero++;
			if(substring.charAt(i) == '1')
				countOne++;
		}
		
		int[] counts = new int[] {countZero, countOne};
		return counts;
	}
	
	private static String findBinary(BigInteger input) {
		
		StringBuilder strBuilder = new StringBuilder();
		BigInteger bigInput = input;
		BigInteger bigZero = new BigInteger("0");
		BigInteger bigBinary = new BigInteger("2");
		
		int a = 0;
		if(bigInput.equals(bigZero))
			strBuilder.append("0");

		while(bigInput.compareTo(bigZero) > 0) {
			strBuilder.append(bigInput.mod(bigBinary));
			bigInput = bigInput.divide(bigBinary);
        }
		return strBuilder.toString();
	}
	
	private static int findMod(String num, int modBy) {
		int a = 2;
		int res = 0; 
		  
        // One by one process all digits of 'num' 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) - '0') % a; 
  
        return res; 		
	}
}


/* TestCase
 * 25
0
1
2
10
17
32
33
127
341
455
496
992
1000
430510914326
8470634074737128636070224
9893020956
3846435266552999150
977354604222
27055031064
6702565932198233123811
427738644490
65146
89623387
3773561366613203692478122629384
256651750668965698947092 
 */
