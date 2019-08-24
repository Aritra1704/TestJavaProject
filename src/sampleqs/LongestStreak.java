package sampleqs;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LongestStreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
     * Complete the 'maxStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. STRING_ARRAY data
     */

    public static int maxStreak(int m, List<String> data) {
        int longestStreak = 0;
        StringBuilder strAllemp = new StringBuilder();
        for(int i = m; i > 0;i--)
            strAllemp.append("Y");
        int tempStreak = 0;
        for(int i = data.size() - 1; i >= 0; i--) {
            if(data.get(i).equalsIgnoreCase(strAllemp.toString())) {
                if(tempStreak >0 && data.get(i+1).equalsIgnoreCase(strAllemp.toString()) )
                    tempStreak++;
                else {
                    tempStreak=1;
                }
                if(tempStreak > longestStreak)
                    longestStreak = tempStreak;
            }
        }
        return longestStreak;
    }
	
}
