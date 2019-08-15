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
			cM(m, n, l, w);
		}
	}
	private static void cM(int m, int n, int l, String w){
		String[][] mat = new String[m][n];
		int i=0, j=0,k;
		while(i<m && j<n){
			for(k=j;k<n;++k){
				mat[i][k]=gN(l,w);
			}
			i++;
			for(k=i;k<m;++k){
				mat[k][n - 1]=gN(l,w);
			}
			n--;
			if(i<m){
				for(k=n-1;k>=j;--k){
					mat[m-1][k]=gN(l,w);
				}
				m--;
			}
			if(j<n){
				for(k=m-1;k>=i;--k){
					mat[k][j]=gN(l,w);
				}
				j++;
			}
		}
		pM(mat.length,mat[0].length,mat);
		c=0;
	}
	private static void pM(int m,int n,String[][] mat){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
	}
	static int c = 0;
	private static String gN(int l,String w){
		if(c>=l) c=0;
		return (w.charAt(c++) + "");
	}
}
