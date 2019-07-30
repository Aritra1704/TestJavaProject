package sampleqs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BInaryMadness {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int k = 0 ; k < t; k++) {
			faS(fB(s.nextBigInteger()));
		}
	}
	private static void faS(String b) {
		int cZ = 0; int cO = 0;
		int k = 0; int l = k+1;
		while(k < b.length()) {
			if(l<=b.length()) {
				int[] c = oN(b.substring(k,l));
				if(c[0] % 2 != 0) cZ++;
				if(c[1] % 2 != 0) cO++;
				l++;
			} else {
				k++;
				l=k+1;
			}
		}
		System.out.println(cZ + " " + cO);
	}
	private static int[] oN(String ss) {
		int cZ = 0; int cO = 0;
		for(int i = 0; i < ss.length(); i++) {
			if(ss.charAt(i) == '0') cZ++;
			if(ss.charAt(i) == '1') cO++;
		}
		return new int[] {cZ, cO};
	}
	private static String fB(BigInteger input) {
		StringBuilder sB = new StringBuilder();
		BigInteger bI = input, bZ, bB;
		bZ = new BigInteger("0");
		bB = new BigInteger("2");
		int a = 0;
		if(bI.equals(bZ)) sB.append("0");
		while(bI.compareTo(bZ) > 0) {
			sB.append(bI.mod(bB));
			bI = bI.divide(bB);
        }
		return sB.toString();
	}
	
	private static void findAllSubstring(String binary) {

		int countZeroSet = 0;
		int countOneSet = 0;
		for (int i = 0; i < binary.length(); i++) {
			for (int j = i+1; j <= binary.length(); j++) {
				String sub = binary.substring(i,j);
				
				int[] count = oN(sub);
				if(count[0] % 2 != 0) 
					countZeroSet++;
				if(count[1] % 2 != 0) 
					countOneSet++;
			}
		}
		
		System.out.println(countZeroSet + " " + countOneSet);
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
