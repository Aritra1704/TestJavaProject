package devengers;

import java.util.Scanner;

public class SpiralPatternPrinting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0; i < (t); i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int l = s.nextInt();
			
			String w = s.next();
//			System.out.println(m + " " + n + " " + l + " " + w);
			
			createMatrix(m, n, l, w);
		}
	}

	private static void createMatrix(int m, int n, int l, String w) {
		String[][] mat = new String[m][n];
		int i=0, j=0,k;
		while(i<m && j<n){
			for(k=j;k<n;++k){
				mat[i][k]=getNextChar(l,w);
			}
			i++;
			for(k=i;k<m;++k){
				mat[k][n - 1]=getNextChar(l,w);
			}
			n--;
			if(i<m){
				for(k=n-1;k>=i;--k){
					mat[m-1][k]=getNextChar(l,w);
				}
				m--;
			}
			if(j<n){
				for(k=m-1;k>=i;--k){
					mat[k][j]=getNextChar(l,w);
				}
				j++;
			}
		}
		printM(m,n,mat);
		count=0;
	}
	private static void printM(int m,int n,String[][] mat) {
		System.out.println("------------------");
//		int j=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]);
			}
//			System.out.println("\n");
		}
//		for(int i=0;i<m;j++){
//			System.out.print(mat[i][j]);
//			if((j+1)>=n){
//				i++;
//				j=0;
//				System.out.println("\n");
//			}
//		}
	}
	static int count = 0;
	private static String getNextChar(int l,String w) {
		if(count>=l)
			count=0;
		return (w.charAt(count++) + "");
	}
}
