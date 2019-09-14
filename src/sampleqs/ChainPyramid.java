package sampleqs;

import java.util.Scanner;

/**
 * 
 	2
	abc 6 1
	1234567890 10 -1
 * @author ARPaul
 *
 */
public class ChainPyramid {
	private static int c = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int n = 0; n < t; n++) {
            String s = sc.next();
            int h = sc.nextInt();
            int p = sc.nextInt();
            cP(s, h, p);
        }
	}
	private static void cP(String s, int h, int p) {
		StringBuilder sE = new StringBuilder();
		StringBuilder sC = new StringBuilder();
		int a = 0;
		if(p > 0) {
			for(int i = 0; i < h; i++) {
				for(int j = h - i; j > 1; j--) sE.append(" ");
				for(int j = 0; j <= i * 2; j++) sC.append(nC(s));
				pC(sE,sC, a);
				a++;
			}
		} else {
			for(int i = h; i >= 1; --i) {
				for(int j = 1; j <= h - i; ++j) sE.append(" ");
				for(int j = i; j < 2 * i - 1; ++j) sC.append(nC(s));
				for(int j = 0; j <= i - 1; ++j) sC.append(nC(s));
				pC(sE,sC, a);
				a++;
			}
		}
		c = 0;
	}
	private static void pC(StringBuilder sE, StringBuilder sC, int i) {
		if(i % 2 == 1) sC.reverse();
		System.out.println(sE.toString() + sC.toString());
		sE.setLength(0);
		sC.setLength(0);
	}
	private static String nC(String s) {
		if(c >= s.length()) c = 0;
		return s.charAt(c++) + "";
	}
}
