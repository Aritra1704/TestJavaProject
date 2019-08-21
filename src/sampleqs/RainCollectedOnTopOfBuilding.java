package sampleqs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * You are given the heights of N buildings. All the buildings are of width 1 and are adjacent to each other with no empty space in between. Assume that its raining heavily, and as such water will be accumulated on top of certain buildings. Your task is to find the total amount of water accumulated.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the number of buildings. The second line contains N elements denoting the height of the buildings. 

Constraints

30 points
1 <= T <= 1000 
1 <= N <= 1000 
1 <= a[i] <= 1000 

70 points
1 <= T <= 1000 
1 <= N <= 100000 
1 <= a[i] <= 1000 

Output Format

For each test case, print the units of water accumulated, separated by newline.

Sample Input 0

2
7
1 6 2 4 5 7 9 
5
3 2 7 4 7 
Sample Output 0

7
4
Explanation 0

Test Case 1
Water accumulated on top of Building-1 : 0
Water accumulated on top of Building-2 : 0
Water accumulated on top of Building-3 : 4
Water accumulated on top of Building-4 : 2
Water accumulated on top of Building-5 : 1
Water accumulated on top of Building-6 : 0
Water accumulated on top of Building-7 : 0
Total = 0 + 0 + 4 + 2 + 1 + 0 + 0 = 7 


Test Case 2
Water accumulated on top of Building-1 : 0
Water accumulated on top of Building-2 : 1
Water accumulated on top of Building-3 : 0
Water accumulated on top of Building-4 : 3
Water accumulated on top of Building-5 : 0
Total = 0 + 1 + 0 + 3 + 0 = 4

 * @author ARPaul
 *
 */
public class RainCollectedOnTopOfBuilding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0; i < t; i++) {
			long buildings = s.nextInt();
			
			int max = 0;
			int sum = 0;
			for(int j = 0; j < buildings; j++) {
				int height = s.nextInt();
				if(max < height) {
					max = height;
				} else {
					sum += (max - height);
				}
			}
			System.out.println(sum);
		}
	}
}
