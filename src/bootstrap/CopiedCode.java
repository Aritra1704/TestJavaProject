package bootstrap;

import java.util.Arrays;
import java.util.Scanner;

public class CopiedCode {
	private static boolean[] pS = new boolean[10001];
	public static void main(String[] args) {
		gPs( pS , pS.length);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ( t!= 0){
            int m= in.nextInt();
            int n= in.nextInt();
            int d[][] = new int[m][n];

            for (int i=0; i<m; i++){
                for (int j=0; j<n; j++){
                    d[i][j] = in.nextInt();
                }
            }
            System.out.println(aG(d, true)+" "+aG(d.clone(), false));
        }
	}
	private static int aG(int[][] d, boolean iP) {
        boolean [][] v = new boolean[d.length][d[0].length]; int gC = 0;
        for (int i=0;i< d.length;i++)
            for (int j=0; j<d[0].length;j++){
            	boolean cP;
            	if(iP) cP = isP(d[i][j]);
            	else cP = isC(d[i][j]);
                if ( cP && !v[i][j]){
                    dfs(d, i, j, d.length, d[0].length, v, iP);
                    ++gC;
                }
            }
        return gC;
    }
    private static void dfs(int[][] d, int r, int c, int rL, int cL, boolean[][] v, boolean iP) {
        int rNo[] = {-1, 1, 0, 0};
        int cNo[] = {0, 0, 1, -1};
        v[r][c] = true;
        for (int k = 0; k < 4; ++k) {
        	if(iP) {
        		if (wG(d, r + rNo[k], c + cNo[k], rL, cL, v, iP)) dfs(d, r + rNo[k], c + cNo[k], rL, cL, v, iP);
        	} else {
        		if (wG(d, r + rNo[k], c + cNo[k], rL, cL, v, iP)) dfs(d, r + rNo[k], c + cNo[k], rL, cL, v, iP);
        	}
        }
    }
    private static boolean wG(int[][] d, int r, int c, int rL, int cL, boolean[][] v, boolean iP) {
    	if(iP) return (r >= 0) && (r < rL) && (c >= 0) && (c < cL) && (isP(d[r][c]) && !v[r][c]);
    	else return (r >= 0) && (r < rL) && (c >= 0) && (c < cL) && (isC(d[r][c]) && !v[r][c]);
    }
    
    private static void gPs(boolean[] pS, int l) {
        Arrays.fill(pS, true);
        pS[0]= pS[1] = false;
        for ( int p=2; p<= 10000/p; p++) if ( pS[p] == true) for ( int i= p*p; i<= 10000; i+=p ) pS[i] = false;
    }
    private static boolean isP(int x){
        return pS[x];
    }
    private static boolean isC( int x){
        return !pS[x];
    }
}
