package sampleqs;

import java.util.Arrays;
import java.util.Scanner;

public class SampkeQuickS {

	public static void main(String[] args) {
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
        	System.out.print(" " + toSort[i] + "\n");
        
        quicksort(toSort, 0, toSort.length - 1);
        
        System.out.print(Arrays.toString(toSort));
	}
	
	private static void quicksort(int[] toSort, int start, int end) {
		if(start < end) {
			int pivot = partition(toSort, start, end);
			quicksort(toSort, start, pivot - 1);
			quicksort(toSort, pivot + 1, end);	
		}
		
	}
	
	private static int partition(int[] toSort, int start, int end) {//5 2 7 1 8 3
		int pivot = end;
		
		int i = start - 1;
		for(int j = start; j <= end - 1; j++) {
			if(toSort[j] < toSort[pivot]) {
				i++;
				swap(toSort, i, j);
			}
		}
		i++;
		swap(toSort, i, pivot);
		return i;
	}
	
	private static void swap(int[] toSort, int elementA, int elementB) {
		int temp = toSort[elementA];
		toSort[elementA] = toSort[elementB];
		toSort[elementB] = temp;
	}

}
