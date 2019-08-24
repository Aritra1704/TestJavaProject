package sampleqs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Complete the braces function below.
    static String[] braces(String[] values) {
        String[] result = new String[values.length];
        for(int i = 0; i < values.length; i++) {
            
            if(values[i].length() % 2 != 0)
                result[i] = "NO";
            else {
                ArrayList<String> arr = new ArrayList<>();
                char first = 'z', second = 'z', third = 'z';

                int firstSum = 0, secondSum = 0, thirdSum = 0;
                for(int j = 0; j < values[i].length(); j++) {
                    if(values[i].charAt(j) == '(') {
                        arr.add(values[i].charAt(j) + "");
                        firstSum += 1;
                    }  
                    else if(values[i].charAt(j) == ')') {
                        if(arr.size() > 0 && arr.get(arr.size() - 1).equalsIgnoreCase("(")) {
                            arr.remove(arr.size() - 1);
                            firstSum -= 1;
                        } else {
                            firstSum = -1;
                            break;
                        }
                            
                    }
                    else if(values[i].charAt(j) == '{') {
                        arr.add(values[i].charAt(j) + "");
                        secondSum += 1;
                    }
                    else if(values[i].charAt(j) == '}') {
                        if(arr.size() > 0 && arr.get(arr.size() - 1).equalsIgnoreCase("{")) {
                            arr.remove(arr.size() - 1);
                            secondSum -= 1;
                        } else{
                            secondSum = -1;
                            break;
                        }
                    }
                    else if(values[i].charAt(j) == '[') {
                        arr.add(values[i].charAt(j) + "");
                        thirdSum += 1;
                    }
                    else if(values[i].charAt(j) == ']') {
                        if(arr.size() > 0 && arr.get(arr.size() - 1).equalsIgnoreCase("[")) {
                            arr.remove(arr.size() - 1);
                            thirdSum -= 1;
                        } else{
                            thirdSum = -1;
                            break;
                        }
                    }
                        
                }
                if(firstSum == 0 && secondSum == 0 && thirdSum == 0)
                    result[i] = "YES";
                else
                    result[i] = "NO";
            }
            
        }
        return result;
    }
}
