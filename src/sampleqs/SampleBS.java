package sampleqs;

import java.util.Scanner;

public class SampleBS {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] toSort;
		int toSearch = 0;
		
		System.out.println("How many integers you want to enter?");
		Scanner s = new Scanner(System.in);
        int noOfIteration = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
        
        System.out.println("Enter the integers: ");
        toSort = new int[noOfIteration];
        for(int i = 0; i < noOfIteration; i++)
        	toSort[i] = Integer.parseInt(s.nextLine());
        
        for(int i = 0; i < noOfIteration; i++)
        	System.out.print(" " + toSort[i]);
        
        System.out.println("\nEnter the integer to search: ");
        	toSearch = Integer.parseInt(s.nextLine());     
        
        int position = binarysearchLoop(toSort, toSearch);
        int posRecur = binarysearchRecur(toSort, toSearch);
        if(position >= 0)
        	System.out.println("\nYour searched integer is at position: " + (position + 1) + " Recur: " + (posRecur + 1));
        else
        	System.out.println("\nYour searched integer is not in the array.");
        String str = "test";
        str.equalsIgnoreCase("test");
	}
	
	private static int binarysearchLoop(int[] toSort, int toSearch) {
		int end = toSort.length - 1;
		int start = 0;
		int middle;
		
		while(start <= end) {
			middle = (start + end) / 2;
			if(toSort[middle] == toSearch)
				return middle;
			else if(toSort[middle] < toSearch)
				start = middle + 1;
			else if(toSort[middle] > toSearch)
				end = middle - 1;
		}
		return -1;
	}
	
	private static int binarysearchRecur(int[] toSort, int toSearch) {
		int end = toSort.length - 1;
		int start = 0;
		int middle;
		
		return binaryRecur(toSort, toSearch, start, end);
	}
	
	private static int binaryRecur(int[] toSort, int toSearch, int start, int end) {
		if(start > end)
			return -1;
		else {
			int middle = (start + end) / 2;
			if(toSort[middle] == toSearch)
				return middle;
			else if(toSort[middle] < toSearch)
				return binaryRecur(toSort, toSearch, (middle + 1), end);
			else if(toSort[middle] > toSearch)
				return binaryRecur(toSort, toSearch, start, (middle - 1));
			else
				return -1;
		}
	}
	

}
