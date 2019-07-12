package sampleqs;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FizzBuzz {
	
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
       // Writing output to STDOUT
        
     
            
        Scanner s = new Scanner(System.in);
        String noOfIteration = s.nextLine();                 // Reading input from STDIN
        String noOfN = s.nextLine();
            
        String[] values = noOfN.split(" ");
        for(int i = 0; i < Integer.parseInt(noOfIteration); i++) {
            printFizzBuzzTernary(Integer.parseInt(values[i]));
        }
            
        
    }
    
    private static void printFizzBuzzTernary(int endVal) {
        String printVal = "";
        for(int i = 1; i <= endVal; i++) {
            printVal = "";
            printVal = i % 3 == 0 ? "Fizz": "";
            printVal += i % 5 == 0 ? "Buzz": "";
            if(printVal.equalsIgnoreCase(""))
                printVal = i + "";
            
            System.out.println(printVal);
        }
    }
    
    private static void printFizzBuzz(int endVal) {
        String printVal = "";
        for(int i = 1; i <= endVal; i++) {
            printVal = i + "";
            if(i % 3 == 0 && i % 5 == 0)
                printVal = "FizzBuzz";
            else if(i % 3 == 0)
                printVal = "Fizz";
            else if(i % 5 == 0)
                printVal = "Buzz";
            
            System.out.println(printVal);
        }
    }
}
