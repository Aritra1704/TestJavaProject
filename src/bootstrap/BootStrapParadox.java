package bootstrap;

import java.util.ArrayList;
import java.util.Scanner;

public class BootStrapParadox {

	private final static String DELIMITER = "_";
	
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
		
	}
	
	private static void checkTestCase(int m, int n, int[][] matrix) {
				
		ArrayList<String> centre = findCentres(m, n);
		
		ArrayList<String> highest = findHighest(matrix);

		if(highest.size() == 0)
			System.out.println(0);
		else if (m == n && m <= 1)
			System.out.println(0);
		else {
			int steps = 1000;
			for(int i = 0; i < highest.size(); i++) {
				int highestM = Integer.parseInt(highest.get(i).split(DELIMITER)[0]);
				int highestN = Integer.parseInt(highest.get(i).split(DELIMITER)[1]);
				
				for(int j = 0; j < centre.size(); j++) {
					int centreM = Integer.parseInt(centre.get(j).split(DELIMITER)[0]);
					int centreN = Integer.parseInt(centre.get(j).split(DELIMITER)[1]);
					
					int tempStep = Math.abs(highestM - centreM) + Math.abs(highestN - centreN);
					if(tempStep < steps)
						steps = tempStep;
				}
			}	
			System.out.println(steps);	
		}
	}
	
	private static ArrayList<String> findHighest(int[][] matrix) {
		ArrayList<String> highest = new ArrayList<String>();
		int max = 0;
		int min = 1000;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(max < matrix[i][j]) {
					max = matrix[i][j];
					highest.clear();
					highest.add(i + DELIMITER + j);
				} else if(max == matrix[i][j])
					highest.add(i + DELIMITER + j);
				
				if(min > matrix[i][j])
					min = matrix[i][j];
			}
		}
		if(min == max)
			highest.clear();
		return highest;
	}
	
	private static ArrayList<String> findCentres(int m, int n) {
		ArrayList<String> centre = new ArrayList<String>();
		
		if(m % 2 == 0 && n % 2 == 0) {
			centre.add((m/2 -1) + DELIMITER + (n/2 - 1));
			centre.add((m/2 -1) + DELIMITER + (n/2));
			centre.add((m/2) + DELIMITER + (n/2 - 1));
			centre.add((m/2) + DELIMITER + (n/2));
		} else if((m % 2 == 0) && (n % 2 != 0)) {
			centre.add((m/2 -1) + DELIMITER + (n/2));
			centre.add((m/2) + DELIMITER + (n/2));
		} else if((m % 2 != 0) && (n % 2 == 0)) {
			centre.add((m/2) + DELIMITER + (n/2 - 1));
			centre.add((m/2) + DELIMITER + (n/2));
		} else {
			centre.add((m/2) + DELIMITER + (n/2));
		}
		
		return centre;
	}
}
