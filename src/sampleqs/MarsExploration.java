package sampleqs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

	}

	static int marsExploration(String s) {
		int result = 0;
		String sos = "SOS";
		for(int i = 0; i < s.length(); i++) {
			int position = i % 3;
			if(s.charAt(i) != sos.charAt(position))
				result++;
		}
		
		return result;
    }
}
