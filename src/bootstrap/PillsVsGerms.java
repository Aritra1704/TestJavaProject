package bootstrap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ARPaul
 * Pills vs Germs
You’re given a multi-layered rack in the form of a matrix with m rows and n columns. Each cell is occupied either by a red pill (marked by r), a blue pill (marked by b) or a germ (marked by x). A red pill can kill adjacent germs (if any) in horizontal, vertical and diagonal directions whereas a blue pill can kill adjacent germs (if any) in horizontal and vertical direction only. Initially the pills are inactive. Once active, they can act on adjacent germs. You need to find the count of the remaining germs in the rack once the pills are activated.

Input Format
The first line contains a single integer t, denoting the number of test cases. 
The first line of each test case contains two spare separated integers m and n denoting the number of rows and number of columns in the matrix respectively. Following m lines each contains n elements.

Output Format
For each test case print the count of remaining germs.
 */

public class PillsVsGerms {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		for(int k = 0 ; k < testcase; k++) {
			int m = scanner.nextInt();;
			int n = scanner.nextInt();;
		
			String[][] matrix = new String[m][n];
			for(int i = 0; i < m; i++) {
				String row = scanner.next();
				for(int j = 0; j < row.length(); j++) {
					matrix[i][j] = row.charAt(j) + "";
				}
			}
			visited.clear();
			checkTestCase(m, n, matrix);
		}
	}
	static HashSet<String> visited = new HashSet<>();
	private static void checkTestCase(int m, int n, String[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(!matrix[i][j].equalsIgnoreCase("x") &&
						!matrix[i][j].equalsIgnoreCase("0") &&
						!visited.contains(i + "_" + j))
					findAdjacent(m, n, i, j, matrix, matrix[i][j]);
			}
		}
		int countX = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j].equalsIgnoreCase("x"))
					countX++;
			}
		}
		System.out.println(countX);
	}
	private static void findAdjacent(int m, int n, int i, int j, String[][] matrix, String pill) {
		if((i - 1) >= 0) 
			modifySet(i - 1, j, matrix);
		if((i + 1) < m) 
			modifySet(i + 1, j, matrix);
		if((j - 1) >= 0) 
			modifySet(i, j - 1, matrix);
		if((j + 1) < n) 
			modifySet(i, j + 1, matrix);
		if(pill.equalsIgnoreCase("r")) {
			if((i - 1) >= 0 && (j - 1) >= 0)
				modifySet(i - 1, j - 1, matrix);
			if((i - 1) >= 0 && (j + 1) < n)
				modifySet(i - 1, j + 1, matrix);
			if((i + 1) < m && (j + 1) < n)
				modifySet(i + 1, j + 1, matrix);
			if((i + 1) < m && (j - 1) >= 0)
				modifySet(i + 1, j - 1, matrix);	
		}
	}
	
	private static void modifySet(int i, int j, String[][] matrix) {
		if(!visited.contains(i + "_" + j) && matrix[i][j].equalsIgnoreCase("x")) {
			matrix[i][j] = "0";
			visited.add(i + "_" + j);
		}
	}
}
