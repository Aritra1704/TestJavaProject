package sampleqs;

import java.util.Scanner;

public class FindHackerRank {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String s = scanner.nextLine();

		String result = hackerrankInString(s);
        System.out.println(result);
        scanner.close();
	}

	// Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int checkPos = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == hackerrank.charAt(checkPos))
                checkPos++;
        }
        if(checkPos < hackerrank.length())
            return "NO";
        return "YES";

    }
}
