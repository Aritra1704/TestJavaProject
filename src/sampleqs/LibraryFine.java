package sampleqs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraryFine {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
        try {

            String[] d1M1Y1 = scanner.nextLine().split(" ");

            int d1 = Integer.parseInt(d1M1Y1[0]);

            int m1 = Integer.parseInt(d1M1Y1[1]);

            int y1 = Integer.parseInt(d1M1Y1[2]);

            String[] d2M2Y2 = scanner.nextLine().split(" ");

            int d2 = Integer.parseInt(d2M2Y2[0]);

            int m2 = Integer.parseInt(d2M2Y2[1]);

            int y2 = Integer.parseInt(d2M2Y2[2]);

            int result = libraryFine(d1, m1, y1, d2, m2, y2);
            
            System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
        
        scanner.close();

	}

	// Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 > y2) {
            return 10000;
        } else if(m1 > m2 && y1 >= y2) {
            return (500 * (m1 - m2));
        } else if(d1 > d2 && m1 >= m2 && y1 >= y2) {
            return (15 * (d1 - d2));
        } else
            return 0;

    }
}
